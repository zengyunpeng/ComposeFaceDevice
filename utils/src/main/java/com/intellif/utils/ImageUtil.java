package com.intellif.utils;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;

public class ImageUtil {
    public static int calculateInSampleSize(BitmapFactory.Options options,
                                            int reqWidth, int reqHeight) {
        // 源图片的高度和宽度
        final int height = options.outHeight;
        final int width = options.outWidth;
        int inSampleSize = 1;
        if (height > reqHeight || width > reqWidth) {
            // 计算出实际宽高和目标宽高的比率
            final int heightRatio = Math.round((float) height / (float) reqHeight);
            final int widthRatio = Math.round((float) width / (float) reqWidth);
            // 选择宽和高中最小的比率作为inSampleSize的值，这样可以保证最终图片的宽和高
            // 一定都会大于等于目标的宽和高。
            inSampleSize = heightRatio < widthRatio ? heightRatio : widthRatio;
        }
        return inSampleSize;
    }

    public static Bitmap decodeSampledBitmap(Resources res, int resId,
                                             int reqWidth, int reqHeight) {
        // 第一次解析将inJustDecodeBounds设置为true，来获取图片大小
        final BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeResource(res, resId, options);
        // 调用上面定义的方法计算inSampleSize值
        options.inSampleSize = calculateInSampleSize(options, reqWidth, reqHeight);
        // 使用获取到的inSampleSize值再次解析图片
        options.inJustDecodeBounds = false;
        return BitmapFactory.decodeResource(res, resId, options);
    }

    public static Bitmap decodeSampledBitmap(InputStream inputStream, int reqWidth, int reqHeight) {
        // 第一次解析将inJustDecodeBounds设置为true，来获取图片大小
        final BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeStream(inputStream, null, options);
        // 调用上面定义的方法计算inSampleSize值
        options.inSampleSize = calculateInSampleSize(options, reqWidth, reqHeight);
        // 使用获取到的inSampleSize值再次解析图片
        options.inJustDecodeBounds = false;
        Bitmap bitmap = BitmapFactory.decodeStream(inputStream, null, options);
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return bitmap;
    }

    /**
     * 压缩读取图片
     *
     * @param picturePath 图片路径
     * @param reqWidth    图片宽
     * @param reqHeight   图片高
     * @return
     */
    public static Bitmap decodeSampledBitmap(String picturePath, int reqWidth, int reqHeight) {
        // 第一次解析将inJustDecodeBounds设置为true，来获取图片大小
        final BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(picturePath, options);
        // 调用上面定义的方法计算inSampleSize值
        options.inSampleSize = calculateInSampleSize(options, reqWidth, reqHeight);
        // 使用获取到的inSampleSize值再次解析图片
        options.inJustDecodeBounds = false;
        Bitmap bitmap = BitmapFactory.decodeFile(picturePath, options);
        return bitmap;
    }

    /**
     * @param
     * @param bytes
     * @param opts
     * @return Bitmap
     */
    public static Bitmap getBitmapFromBytes(byte[] bytes, BitmapFactory.Options opts) {
        if (bytes != null) {
            if (opts != null) {
                return BitmapFactory.decodeByteArray(bytes, 0, bytes.length, opts);
            } else {
                return BitmapFactory.decodeByteArray(bytes, 0, bytes.length);
            }
        }
        return null;
    }

    public static boolean isImage(File file) {
        if (!file.exists() || file.isDirectory()) {
            return false;
        }
        String name = file.getName().toLowerCase();
        String type = name.substring(name.lastIndexOf('.') + 1);
        if ("jpg".equals(type) || "png".equals(type)) {
            return true;
        }
        return false;
    }

    public static boolean isImage(String name) {
        if (name.isEmpty()) {
            return false;
        }
        String type = name.toLowerCase().substring(name.lastIndexOf('.') + 1);
        if ("jpg".equals(type) || "png".equals(type)) {
            return true;
        }
        return false;
    }


    public static void yuvToNv21(byte[] y, byte[] u, byte[] v, byte[] nv21, int stride, int height) {
        System.arraycopy(y, 0, nv21, 0, y.length);
        // 注意，若length值为 y.length * 3 / 2 会有数组越界的风险，需使用真实数据长度计算
        int length = y.length + u.length / 2 + v.length / 2;
        int uIndex = 0, vIndex = 0;
        for (int i = stride * height; i < length; i += 2) {
            nv21[i] = v[vIndex];
            nv21[i + 1] = u[uIndex];
            vIndex += 2;
            uIndex += 2;
        }
    }
//滴滴 小问题
//

    public static byte[] nv21_rotate_to_90(byte[] nv21_data, byte[] nv21_rotated, int width, int height) {
        int y_size = width * height;
        int buffser_size = y_size * 3 / 2;

        // Rotate the Y luma
        int i = 0;
        int startPos = (height - 1) * width;
        for (int x = 0; x < width; x++) {
            int offset = startPos;
            for (int y = height - 1; y >= 0; y--) {
                nv21_rotated[i] = nv21_data[offset + x];
                i++;
                offset -= width;
            }
        }
        // Rotate the U and V color components
        i = buffser_size - 1;
        for (int x = width - 1; x > 0; x = x - 2) {
            int offset = y_size;
            for (int y = 0; y < height / 2; y++) {
                nv21_rotated[i] = nv21_data[offset + x];
                i--;
                nv21_rotated[i] = nv21_data[offset + (x - 1)];
                i--;
                offset += width;
            }
        }
        return nv21_rotated;
    }



    //3/2    2   1
    public static byte[] nv21toNV12(byte[] nv21, byte[] nv12) {
        int size = nv21.length;
        nv12 = new byte[size];
        int len = size * 2 / 3;
        System.arraycopy(nv21, 0, nv12, 0, len);

        int i = len;
        while (i < size - 1) {
            nv12[i] = nv21[i + 1];
            nv12[i + 1] = nv21[i];
            i += 2;
        }
        return nv12;
    }


    public static byte[] rotateYUV420Degree90(byte[] data, int imageWidth, int imageHeight) {

        byte[] yuv = new byte[imageWidth * imageHeight * 3 / 2];

        int i = 0;

        for (int x = 0; x < imageWidth; x++) {

            for (int y = imageHeight - 1; y >= 0; y--) {

                yuv[i] = data[y * imageWidth + x];

                i++;

            }

        }

        i = imageWidth * imageHeight * 3 / 2 - 1;

        for (int x = imageWidth - 1; x > 0; x = x - 2) {

            for (int y = 0; y < imageHeight / 2; y++) {

                yuv[i] = data[(imageWidth * imageHeight) + (y * imageWidth) + x];

                i--;

                yuv[i] = data[(imageWidth * imageHeight) + (y * imageWidth)

                        + (x - 1)];

                i--;

            }

        }

        return yuv;

    }


}
