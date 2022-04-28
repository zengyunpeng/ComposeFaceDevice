package com.intellif.utils;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.provider.MediaStore;
import android.util.Log;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.Arrays;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSession;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;

public class DownloadManager {
    public static int downloadFile(String urlPath, String targetPath, String targetName) {
        int error_code = 0;
        //File file = null;
        try {
            // 统一资源
            URL url = new URL(urlPath);
            // 连接类的父类，抽象类
            URLConnection urlConnection = url.openConnection();
            // http的连接类
            HttpURLConnection httpURLConnection = (HttpURLConnection) urlConnection;
            // 设置字符编码
            httpURLConnection.setRequestProperty("Charset", "UTF-8");
            // 打开到此 URL 引用的资源的通信链接（如果尚未建立这样的连接）。
            httpURLConnection.connect();
            // 文件大小
            int fileLength = httpURLConnection.getContentLength();

            // 文件名
            //String filePathUrl = httpURLConnection.getURL().getFile();
            //String fileFullName = filePathUrl.substring(filePathUrl.lastIndexOf(File.separatorChar) + 1);

            //System.out.println("file length---->" + fileLength);

            //URLConnection con = url.openConnection();
            // BufferedInputStream bin = new BufferedInputStream(httpURLConnection.getInputStream());
            if (fileLength == 0) {
                error_code = 105;
            } else {
                File resultFile = write2SDFromInput(httpURLConnection.getInputStream(), targetPath, targetName);
                if (resultFile == null) {
                    error_code = 150;
                } else {
                    error_code = 200;
                }
            }
        } catch (MalformedURLException e) {
            error_code = 104;
        } catch (IOException e) {
            error_code = 105;
        } finally {
            return error_code;
        }

    }



    public static int downloadFile(String urlPath, String targetPath) {
        int error_code = 0;
        //File file = null;
        try {
            // 统一资源
            Log.e("TAG_1054", "downloadFile: " + 1);
            URL url = new URL(urlPath);
            // 连接类的父类，抽象类
            URLConnection urlConnection = url.openConnection();
            // http的连接类
            HttpURLConnection httpURLConnection = (HttpURLConnection) urlConnection;
            // 设置字符编码
            httpURLConnection.setRequestProperty("Charset", "UTF-8");
            // 打开到此 URL 引用的资源的通信链接（如果尚未建立这样的连接）。
            httpURLConnection.connect();
            // 文件大小
            int fileLength = httpURLConnection.getContentLength();
            Log.e("TAG_1054", "downloadFile: " + 2);
            // 文件名
            //String filePathUrl = httpURLConnection.getURL().getFile();
            //String fileFullName = filePathUrl.substring(filePathUrl.lastIndexOf(File.separatorChar) + 1);

            //System.out.println("file length---->" + fileLength);

            //URLConnection con = url.openConnection();
            // BufferedInputStream bin = new BufferedInputStream(httpURLConnection.getInputStream());
            if (fileLength == 0) {
                Log.e("TAG_1054", "downloadFile: " + 3);
                error_code = 105;
            } else {
                Log.e("TAG_1054", "downloadFile: " + 4);
                File resultFile = write2SDFromInput(httpURLConnection.getInputStream(), targetPath);
                Log.e("TAG_1054", "写入文件: " + resultFile);
                if (resultFile == null) {
                    Log.e("TAG_1054", "downloadFile: " + 5);
                    error_code = 150;
                } else {
                    Log.e("TAG_1054", "downloadFile: " + 6);
                    error_code = 200;
                }
            }
        } catch (MalformedURLException e) {
            e.printStackTrace();
            error_code = 104;
        } catch (IOException e) {
            e.printStackTrace();
            error_code = 105;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            return error_code;
        }

    }

    public static String getRealPathFromURI(Context context, Uri contentURI) {
        String result;
        Cursor cursor = context.getContentResolver().query(contentURI,
                new String[]{MediaStore.Images.ImageColumns.DATA},//
                null, null, null);
        if (cursor == null) result = contentURI.getPath();
        else {
            cursor.moveToFirst();
            int index = cursor.getColumnIndex(MediaStore.Images.ImageColumns.DATA);
            result = cursor.getString(index);
            cursor.close();
        }
        return result;
    }

    private static final int FILESIZE = 4 * 1024;

    /**
     * 将一个InputStream里面的数据写入到SD卡中
     *
     * @param input
     * @param targetPath
     * @param targetName
     * @return
     */
    public static File write2SDFromInput(InputStream input, String targetPath, String targetName) {
        File file = null;
        OutputStream output = null;
        try {
            file = new File(targetPath, targetName);
            if (!file.exists()) {
                file.createNewFile();
            }
            output = new FileOutputStream(file);
            byte[] buffer = new byte[FILESIZE];

            /*真机测试，这段可能有问题，请采用下面网友提供的
                            while((input.read(buffer)) != -1){
                output.write(buffer);
            }
                            */

            /* 网友提供 begin */
            int length;
            while ((length = (input.read(buffer))) > 0) {
                output.write(buffer, 0, length);
            }
            /* 网友提供 end */

            output.flush();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                output.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return file;
    }


    public static File write2SDFromInput(InputStream input, String targetPath) {
        File file = null;
        OutputStream output = null;
        try {
            file = new File(targetPath);
            if (!file.exists()) {
                if (!file.getParentFile().exists()) {
                    file.getParentFile().mkdir();
                }
                boolean newFile = file.createNewFile();
            } else {
            }

            output = new FileOutputStream(file);
            byte[] buffer = new byte[FILESIZE];

            /*真机测试，这段可能有问题，请采用下面网友提供的
                            while((input.read(buffer)) != -1){
                output.write(buffer);
            }
                            */

            /* 网友提供 begin */
            int length;
            while ((length = (input.read(buffer))) > 0) {
                output.write(buffer, 0, length);
            }
            /* 网友提供 end */

            output.flush();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                output.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return file;
    }






    public static int downfile(String urlStr,String path)
    {
//        FileUtils1 fileUtils=new FileUtils1();
//        if(fileUtils.isFileExist(path+fileName))
//        {return 1;}
//        else{
            try {
                InputStream input=null;
                input = getInputStream(urlStr);
                File resultFile=write2SDFromInput(input, path);
                if(resultFile==null)
                {
                    return -1;
                }
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
                return -2;
            }

//        }
        return 200;
    }
    //由于得到一个InputStream对象是所有文件处理前必须的操作，所以将这个操作封装成了一个方法
    public static InputStream getInputStream(String urlStr) throws IOException
    {
        InputStream is=null;
        URL url=new URL(urlStr);
        trustAllHosts(); // 开启全部证书信任
        HttpURLConnection urlConn=(HttpURLConnection)url.openConnection();
        is=urlConn.getInputStream();


        return is;
    }

    final static HostnameVerifier DO_NOT_VERIFY = new HostnameVerifier() {

        public boolean verify(String hostname, SSLSession session) {
            return true;
        }
    };

    /**
     * Trust every server - dont check for any certificate
     */
    private static void trustAllHosts() {
        final String TAG = "trustAllHosts";
        // Create a trust manager that does not validate certificate chains
        TrustManager[] trustAllCerts = new TrustManager[] {
                new X509TrustManager() {
                    public X509Certificate[] getAcceptedIssuers() {
                        return new X509Certificate[] {};
                    }

                    public void checkClientTrusted(X509Certificate[] chain, String authType) throws CertificateException {
                        Log.i(TAG, "checkClientTrusted");
                    }

                    public void checkServerTrusted(X509Certificate[] chain, String authType) throws CertificateException {
                        Log.i(TAG, "checkServerTrusted");
                    }
                }

        };

        // Install the all-trusting trust manager
        try {
            SSLContext sc = SSLContext.getInstance("TLS");
            sc.init(null, trustAllCerts, new java.security.SecureRandom());
            HttpsURLConnection.setDefaultSSLSocketFactory(sc.getSocketFactory());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}
