package com.intellif.composefacedevice.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;

import com.intellif.arctern.base.ArcternRect;
import com.intellif.composefacedevice.R;

import java.util.Set;


public class FaceView extends View {
    private static final String TAG = FaceView.class.getSimpleName();
    private Context mContext;
    private Paint mLinePaint;
    private Paint mLinePaint_rec;
    private Paint mTextPaint;
    private RectF mRect = new RectF();
    private DrawRect[] mFaces;
    private int cmeraId; //前后摄像头对应id
    private int height; //图片宽度
    private int width; //图片高度
    private int view_width; //控件宽度
    private int view_height; //控件高度
    private Set<Long> setRecogize;
    private int rectF_left;
    private int rectF_right;
    private int rectF_top;
    private int rectF_bottom;

    private int rectF_buffer;
    private Bitmap bitmapw;
    private Bitmap bitmapg;
    private Rect mSrcRectBitmapW;
    private Rect mSrcRectBitmapG;

    public FaceView(Context context, AttributeSet attrs) {
        super(context, attrs);
        // TODO Auto-generated constructor stub
        initPaint();
        mContext = context;

        bitmapw = BitmapFactory.decodeResource(context.getResources(), R.mipmap.icon_whitek);
        bitmapg = BitmapFactory.decodeResource(context.getResources(), R.mipmap.icon_greenk);
        mSrcRectBitmapW = new Rect(0, 0, bitmapw.getWidth(), bitmapw.getHeight());
        mSrcRectBitmapG = new Rect(0, 0, bitmapg.getWidth(), bitmapg.getHeight());
    }

    /**
     * 设置宽高
     *
     * @param faces
     * @param width
     * @param height
     * @param view_width
     * @param view_height
     */
    public void setFaces(DrawRect[] faces, int width, int height, int view_width, int view_height, Set<Long> setRecogize) {
        if (faces == null)
            return;
        this.mFaces = faces;
        this.width = width;
        this.height = height;
        this.view_width = view_width;
        this.view_height = view_height;
        this.setRecogize = setRecogize;
        invalidate();
    }

    public void setFaces(Set<Long> setRecogize) {
        this.setRecogize = setRecogize;
        invalidate();
    }

    public void setFaces(DrawRect[] faces) {
        this.mFaces = faces;
        invalidate();
    }

    public void clearFaces() {
        mFaces = null;
        invalidate();
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        // TODO Auto-generated method stub
        if (mFaces == null || mFaces.length < 1) {
            return;
        }
        Matrix matrix = new Matrix();
        matrix.postScale(-1, 1);
        canvas.save();
        canvas.rotate(-0);   //Canvas.rotate()默认是逆时针
        for (int i = 0; i < mFaces.length; i++) {
            rectF_left = mFaces[i].getRectLeft();
            rectF_right = mFaces[i].getRectRight();
            rectF_top = mFaces[i].getRectTop();
            rectF_bottom = mFaces[i].getRectBottom();
            mRect.set((rectF_left) * view_width / (float) width,
                    (rectF_top) * view_height / (float) height,
                    (rectF_right) * view_width / (float) width,
                    (rectF_bottom) * view_height / (float) height);
            if (setRecogize.contains(mFaces[i].trackId)) {
                canvas.drawBitmap(bitmapg, mSrcRectBitmapG, mRect, mLinePaint);
            } else {
                canvas.drawBitmap(bitmapw, mSrcRectBitmapW, mRect, mLinePaint);
            }
        }
        canvas.restore();
    }

    private void initPaint() {
        DisplayMetrics metrics = getResources().getDisplayMetrics();
        int stroke = (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 5, metrics);
        mLinePaint = new Paint();
        mLinePaint.setAntiAlias(true);
        mLinePaint.setDither(true);
        mLinePaint.setColor(Color.WHITE);
        mLinePaint.setStrokeWidth(stroke);
        mLinePaint.setStyle(Style.STROKE);

        mLinePaint_rec = new Paint();
        mLinePaint_rec.setAntiAlias(true);
        mLinePaint_rec.setDither(true);
        mLinePaint_rec.setColor(Color.GREEN);
        mLinePaint_rec.setStrokeWidth(stroke);
        mLinePaint_rec.setStyle(Style.STROKE);

        mTextPaint = new Paint();
        mTextPaint.setAntiAlias(true);
        mTextPaint.setDither(true);
        int size = (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 8, metrics);
        mTextPaint.setTextSize(size);
        mTextPaint.setColor(Color.RED);
        mTextPaint.setStyle(Style.FILL);
    }


    private int mWidth = -1;
    private int mHeight = -1;

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (-1 == mWidth || -1 == mHeight) {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        } else {
            Log.i("宽高", "setMeasuredDimension: " + mWidth + "*" + mHeight);
            setMeasuredDimension(mWidth, mHeight);
        }
    }

//    public void resize() {
//        int previewWidth = MainDevice.LAST_PREVIEW_WIDTH;
//        int previewHeight = MainDevice.LAST_PREVIEW_HEIGHT;
//
//        int screenWidth = MainDevice.SCREEN_WIDTH;
//        int screenHeight = MainDevice.SCREEN_HEIGHT;
//
//        float widthRiot = ((float) screenWidth) / previewWidth;
//        float heightRiot = ((float) screenHeight) / previewHeight;
//
//        int viewWidth;
//        int viewHeight;
//        if (widthRiot > heightRiot) {
//            viewWidth = screenWidth;
//            viewHeight = (int) (previewHeight * widthRiot + 0.5f);
//        } else {
//            viewHeight = screenHeight;
//            viewWidth = (int) (previewWidth * heightRiot + 0.5f);
//        }
//        mWidth = viewWidth;
//        mHeight = viewHeight;
//
////        setTranslationX((screenWidth - mWidth) / 2f);
////        setTranslationY((screenHeight - mHeight) / 2f);
//
//        RelativeLayout.LayoutParams lp = new RelativeLayout.LayoutParams(getLayoutParams());
//        if (mWidth > screenWidth) {
//            lp.setMargins(-(mWidth - screenWidth) / 2, 0, -(mWidth - screenWidth) / 2, 0);
//        } else if (mHeight > screenHeight) {
//            lp.setMargins(0, -(mHeight - screenHeight) / 2, 0, -(mHeight - screenHeight) / 2);
//        }
//        setLayoutParams(lp);
//
//
//        requestLayout();
//        invalidate();
//
//    }

    public static class DrawRect {
        public Long trackId;
        public int x;
        public int y;
        public int width;
        public int height;

        /**
         * 获取人脸框矩形左边框的横轴坐标
         *
         * @return x
         */
        public int getRectLeft() {
            return x;
        }

        /**
         * 获取人脸框矩形右边框的横轴坐标
         *
         * @return x + width
         */
        public int getRectRight() {
            return x + width;
        }

        /**
         * 获取人脸框矩形上边框的纵轴坐标
         *
         * @return y
         */
        public int getRectTop() {
            return y;
        }

        /**
         * 获取人脸框矩形下边框的纵轴坐标
         *
         * @return y + height
         */
        public int getRectBottom() {
            return y + height;
        }
    }

    public static DrawRect[] ArcternRectToDrawRect(ArcternRect[] rects, long[] trackids) {
        DrawRect[] drawRects = new DrawRect[rects.length];
        for (int i = 0; i < rects.length; i++) {
            DrawRect rect = new DrawRect();
            rect.trackId = trackids[i];
            rect.x = rects[i].x;
            rect.y = rects[i].y;
            rect.width = rects[i].width;
            rect.height = rects[i].height;
            drawRects[i] = rect;
        }
        return drawRects;
    }
}
