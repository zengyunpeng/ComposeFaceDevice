package com.intellif.composefacedevice.view.preview;

import android.Manifest;
import android.app.Activity;
import android.content.Context;
import android.hardware.Camera;
import android.util.Log;
import android.view.SurfaceHolder;

import com.intellif.arctern.base.ArcternImage;
import com.intellif.composefacedevice.utils.MatrixYuvUtils;

import java.io.IOException;
import java.util.List;

public class LivingInterface1 implements Camera.PreviewCallback {
    private static final String TAG = LivingInterface1.class.getSimpleName();
    private static final int REQUEST_EXTERNAL_STORAGE = 1;
    private static final int REQUEST_CAMERA = 2;
    private static String[] PERMISSIONS_STORAGE = {
            Manifest.permission.READ_EXTERNAL_STORAGE,
            Manifest.permission.WRITE_EXTERNAL_STORAGE};
    private Context mContext;
    private Camera mCamera;
    private Camera.Parameters mParams;
    private int mCameraId = -1;
    private Activity mActivity;
    private int mHandle = 0;
    private static LivingInterface1 mCameraInterface;//用来首页预览
    private static LivingInterface1 mCameraInterface2;//用来拍照
    private int mDisplayRotation;
    private int mDisplayOrientation;
    private int previewWidth;
    private int previewHeight;
    private int prevSettingWidth;
    private int prevSettingHeight;
    private int ratio = 1280;
    private LivingListener livingListener;

    private LivingInterface1() {
    }

    public static synchronized LivingInterface1 getInstance() {
        if (mCameraInterface == null) {
            mCameraInterface = new LivingInterface1();
        }
        return mCameraInterface;
    }


    public static LivingInterface1 getINSTANCE() {
        if (mCameraInterface2 == null) {
            mCameraInterface2 = new LivingInterface1();
        }
        return mCameraInterface2;
    }

    public void init(Activity activity) {
        this.mActivity = activity;
    }

    public void initRatio(int ratio) {
        this.ratio = ratio;
    }

    public void setLivingCallBack(LivingListener listener) {
        this.livingListener = listener;
    }

    public void changeCamera(int cameraId, SurfaceHolder holder) throws IOException {
        mCamera.stopPreview();
        mCamera.release();
        mCamera.stopPreview();//停掉原来摄像头的预览
        mCamera.release();//释放资源
        mCamera = null;//取消原来摄像头
        mCamera = Camera.open(cameraId);//打开当前选中的摄像头
        try {
            mCamera.setPreviewDisplay(holder);//通过surfaceview显示取景画面
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        mCamera.startPreview();//开始预览
    }

    public void openCamera(SurfaceHolder surfaceHolder) {

        this.mCameraId = 0;

        Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
        mCamera = Camera.open(this.mCameraId);
        Camera.getCameraInfo(this.mCameraId, cameraInfo);
        try {
            mCamera.setPreviewDisplay(surfaceHolder);
        } catch (Exception e) {
            Log.e(TAG, "Could not preview the image.", e);
        }
    }

    public void startPreview(SurfaceHolder surfaceHolder, int width, int height) {
        if (surfaceHolder.getSurface() == null) {
            return;
        }
        try {
            mCamera.stopPreview();
        } catch (Exception e) {
        }

        configureCamera(width, height);
        setDisplayOrientation();
        startPreview();
    }

    // 停止预览，释放Camera
    public void stopCamera() {
        if (null != mCamera) {
            mCamera.setPreviewCallbackWithBuffer(null);
            mCamera.setErrorCallback(null);
            mCamera.stopPreview();
            mCamera.release();
            mCamera = null;
        }
    }

    private void configureCamera(int width, int height) {
        Camera.Parameters parameters = mCamera.getParameters();
        setOptimalPreviewSize(parameters);
//        parameters.set("preview-flip", "flip-h");
        mCamera.setParameters(parameters);
    }


    private void setOptimalPreviewSize(Camera.Parameters cameraParameters) {
        previewWidth = 640;
        previewHeight = 480;
        List<Camera.Size> previewSizes = cameraParameters.getSupportedPreviewSizes();
        int length = previewSizes.size();
        for (int i = 0; i < length; i++) {
            Log.e("SupportedPreviewSizes", "SupportedPreviewSizes : " + previewSizes.get(i).width + "x" + previewSizes.get(i).height);
        }
        cameraParameters.setPreviewSize(previewWidth, previewHeight);
    }

    public int getRotation() {
        return rotation;
    }

    int rotation;

    private void setDisplayOrientation() {
        rotation = 90;
        mCamera.setDisplayOrientation(rotation);
    }

    public void startPreview() {
        if (mCamera != null) {
            mCamera.startPreview();
            mCamera.setPreviewCallback(this);
        }
    }

    public int getCameraId() {
        return mCameraId;
    }

    ArcternImage arcternImage;
    long frameId = 0;
    long frameTime = 0l;

    @Override
    public void onPreviewFrame(byte[] _data, Camera camera) {
//        if(System.currentTimeMillis()-frameTime >66.6){
        if (System.currentTimeMillis() - frameTime > 100) {
            frameTime = System.currentTimeMillis();
            arcternImage = new ArcternImage();
            arcternImage.gdata = MatrixYuvUtils.rotateYUV420Degree90(_data, 640, 480);
            arcternImage.width = 480;
            arcternImage.height = 640;
            arcternImage.image_format = ArcternImage.ARCTERN_IMAGE_FORMAT_NV21;
            arcternImage.frame_id = frameId;
            if (livingListener != null) {
                livingListener.livingData(arcternImage);
            }
            frameId++;
        }
    }

    public void takePic(Camera.PictureCallback pictureCallback) {
        mCamera.takePicture(null, null, pictureCallback);
    }

    //开启预览
    public void startPreview(SurfaceHolder holder) {
        if (mCamera != null) {
            try {
                mCamera.setPreviewDisplay(holder);
            } catch (IOException e) {
                e.printStackTrace();
            }
            mCamera.startPreview();
        }
    }

}
