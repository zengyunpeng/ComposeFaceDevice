package com.intellif.utils;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

public class AssetsUtil {
    private static final String TAG = AssetsUtil.class.getSimpleName();
    public static final String SETTING_NAME = "if_prop.txt";

    /**
     * 导出model、license到本地
     */
    public static void exportInitData() {
        copyDirFromAssets(AppGlobals.getApplication(), Constants.INTELLIF_NAME, Constants.SDK_PATH);
    }

    /**
     * 从assets目录下拷贝文件
     *
     * @param context            上下文
     * @param assetsFilePath     文件的路径名如：model/config
     * @param targetFileFullPath 目标文件路径如：/sdcard/model
     * @param targetName         目标文件名
     */
    public static void copyFileFromAssets(Context context, String assetsFilePath, String targetFileFullPath, String targetName) {
        InputStream assestsFileImputStream;
        try {
            assestsFileImputStream = context.getAssets().open(assetsFilePath);
            copyFile(assestsFileImputStream, targetFileFullPath, targetName);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void copyDirFromAssets(Context context, String assetsDirPath, String targetFileFullPath) {
        try {
            String[] fileList = context.getAssets().list(assetsDirPath);
            if (fileList != null && fileList.length > 0) {
                for (String fileName : fileList) {
                    String path = assetsDirPath + File.separator + fileName;
                    String[] childFiles = context.getAssets().list(path);
                    if (childFiles != null && childFiles.length > 0) {
                        copyDirFromAssets(context, path, targetFileFullPath + File.separator + fileName);
                    } else {
                        copyFileFromAssets(context, assetsDirPath + File.separator + fileName, targetFileFullPath, fileName);
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void copyFile(InputStream in, String targetPath, String targetName) {
        FileOutputStream fos = null;

        try {
            File file = new File(targetPath);
            if (!file.exists()) {
                file.mkdirs();
            }
            fos = new FileOutputStream(file + "/" + targetName);
            byte[] buffer = new byte[4096];
            int byteCount;
            while ((byteCount = in.read(buffer)) != -1) {// 循环从输入流读取
                // buffer字节
                fos.write(buffer, 0, byteCount);// 将读取的输入流写入到输出流
            }
            fos.flush();// 刷新缓冲区
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fos != null) {
                    fos.close();
                }
                if (in != null) {
                    in.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

    public static boolean deleteFile(File dirFile) {
        // 如果dir对应的文件不存在，则退出
        if (!dirFile.exists()) {
            return false;
        }

        if (dirFile.isFile()) {
            return dirFile.delete();
        } else {
            for (File file : dirFile.listFiles()) {
                deleteFile(file);
            }
        }
        return true;
    }

    public static File saveImageToSDCard(Context context, Bitmap bmp, String bitmapName) {
        File dirFile = new File(Constants.IMAGE_SAVE_PATH);
        if (!dirFile.exists()) {
            dirFile.mkdirs();
        }
        File file = null;
        try {
            file = new File(dirFile, bitmapName + ".jpg"); //formatter.format(new Date())
            FileOutputStream fos = new FileOutputStream(file);
            bmp.compress(Bitmap.CompressFormat.JPEG, 100, fos);
            fos.flush();
            fos.close();
            context.sendBroadcast(
                    new Intent(Intent.ACTION_MEDIA_SCANNER_SCAN_FILE, Uri.fromFile(file)));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return file;

    }

    public static void writeRootPath(String filename, String content) {

        try {
            File dir = new File(Constants.ROOT_PATH);

            if (!dir.exists()) {
                dir.mkdirs();
            }

            filename = dir.getAbsolutePath() + File.separator + filename;

            //打开文件输出流
            FileOutputStream outputStream = new FileOutputStream(filename);

            //写数据到文件中
            outputStream.write(content.getBytes());
            outputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String readRootFile(String filename) {
        FileInputStream fis = null;
        String result = null;

        try {
            filename = Constants.ROOT_PATH + File.separator + filename;

            File file = new File(filename);
            if (!file.exists()) {
                return null;
            }
            fis = new FileInputStream(file);

            byte[] buffer = new byte[fis.available()];
            fis.read(buffer);
            fis.close();

            result = new String(buffer, "UTF-8");

        } catch (Exception ex) {
            ex.printStackTrace();
            try {
                if (fis != null) {
                    fis.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        return result;
    }
}
