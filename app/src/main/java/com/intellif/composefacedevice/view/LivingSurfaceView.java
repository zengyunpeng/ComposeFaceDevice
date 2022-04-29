package com.intellif.composefacedevice.view;

import android.content.Context;
import android.graphics.PixelFormat;
import android.util.AttributeSet;
import android.util.Log;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.widget.RelativeLayout;

import com.intellif.composefacedevice.view.preview.LivingInterface1;


/**
 * Created by intellif on 2017/3/13.
 */
public class LivingSurfaceView extends SurfaceView implements SurfaceHolder.Callback {
    private static final String TAG = LivingSurfaceView.class.getSimpleName();
    private SurfaceHolder mSurfaceHolder;

    public LivingSurfaceView(Context context, AttributeSet attrs) {
        super(context, attrs);
        mSurfaceHolder = getHolder();
        mSurfaceHolder.setFormat(PixelFormat.TRANSPARENT);//translucent半透明 transparent透明
        mSurfaceHolder.setType(SurfaceHolder.SURFACE_TYPE_PUSH_BUFFERS);
        mSurfaceHolder.addCallback(this);
    }

    @Override
    public void surfaceCreated(SurfaceHolder surfaceHolder) {
        LivingInterface1.getInstance().openCamera(surfaceHolder);
    }

    @Override
    public void surfaceChanged(SurfaceHolder surfaceHolder, int format, int width, int height) {
        LivingInterface1.getInstance().startPreview(surfaceHolder, width, height);
    }

    @Override
    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        LivingInterface1.getInstance().stopCamera();
    }

    public int getCameraId() {
        return LivingInterface1.getInstance().getCameraId();
    }

    public SurfaceHolder getSurfaceHolder() {
        return mSurfaceHolder;
    }

    private int mWidth = -1;
    private int mHeight = -1;


    public void resize() {
        int previewWidth = 800;
        int previewHeight = 1280;
        int screenWidth = 800;
        int screenHeight = 1280;

        float widthRiot = ((float) screenWidth) / previewWidth;
        float heightRiot = ((float) screenHeight) / previewHeight;

        int viewWidth;
        int viewHeight;
        if (widthRiot > heightRiot) {
            viewWidth = screenWidth;
            viewHeight = (int) (previewHeight * widthRiot + 0.5f);
        } else {
            viewHeight = screenHeight;
            viewWidth = (int) (previewWidth * heightRiot + 0.5f);
        }
        mWidth = viewWidth;
        mHeight = viewHeight;

        RelativeLayout.LayoutParams lp = new RelativeLayout.LayoutParams(getLayoutParams());
        if (mWidth > screenWidth) {
            lp.setMargins(-(mWidth - screenWidth) / 2, 0, -(mWidth - screenWidth) / 2, 0);
        } else if (mHeight > screenHeight) {
            lp.setMargins(0, -(mHeight - screenHeight) / 2, 0, -(mHeight - screenHeight) / 2);
        }
        setLayoutParams(lp);
        getHolder().setFixedSize(viewWidth, viewHeight);
        requestLayout();
        invalidate();

    }

    //
    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (-1 == mWidth || -1 == mHeight) {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        } else {
            Log.i("宽高", "setMeasuredDimension: " + mWidth + "*" + mHeight);
            setMeasuredDimension(mWidth, mHeight);
        }
    }


}
