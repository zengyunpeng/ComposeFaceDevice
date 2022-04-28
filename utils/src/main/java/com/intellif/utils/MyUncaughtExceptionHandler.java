//package com.intellif.utils;
//
//import android.app.ActivityManager;
//import android.app.AlarmManager;
//import android.app.Application;
//import android.app.PendingIntent;
//import android.content.Context;
//import android.content.Intent;
//import android.content.pm.PackageInfo;
//import android.content.pm.PackageManager;
//import android.os.Build;
//import android.os.Environment;
//import android.os.Looper;
//import android.os.SystemClock;
//import android.widget.Toast;
//
//import com.intellif.utils.BuildConfig;
//
//import java.io.BufferedWriter;
//import java.io.File;
//import java.io.FileWriter;
//import java.io.PrintWriter;
//import java.text.SimpleDateFormat;
//import java.util.Date;
//
///**
// * Created by yangshuai in the 10:53 of 2016.01.05 .
// */
//public class MyUncaughtExceptionHandler implements Thread.UncaughtExceptionHandler {
//
//    //文件名
//    private static final String FILE_NAME = "crash";
//    //文件名后缀
//    private static final String FILE_NAME_SUFFIX = ".txt";
//
//    private Thread.UncaughtExceptionHandler mUncaughtExceptionHandler;
//    private Application mApplication;
//
//    public MyUncaughtExceptionHandler(Application context) {
//        mApplication = context;
//        mUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
//    }
//
//    @Override
//    public void uncaughtException(Thread thread, Throwable ex) {
//        if(ex!=null){
//            toastSorry();
//            dumpExceptionToSDCard(ex);;
//            //restart();
//        }
//
//        if(mUncaughtExceptionHandler != null){
//            mUncaughtExceptionHandler.uncaughtException(thread, ex);
//        }else{
//            android.os.Process.killProcess(android.os.Process.myPid());
//        }
//    }
//
//    private void toastSorry() {
//        new Thread(){
//            @Override
//            public void run() {
//                Looper.prepare();
//                Toast.makeText(
//                        mApplication.getApplicationContext(),
//                        "很抱歉，应用崩溃了，请联系厂商",
//                        Toast.LENGTH_SHORT).show();
//                Looper.loop();
//            }
//        }.start();
//    }
//
//    /**
//     * 导出异常信息到SD卡
//     *
//     * @param ex
//     */
//    private void dumpExceptionToSDCard(Throwable ex) {
//        if (!Environment.getExternalStorageState().equals(Environment.MEDIA_MOUNTED)) {
//            return;
//        }
//        //创建文件夹
//        File dir = new File(Constants.CRASH_PATH);
//        if (!dir.exists()) {
//            dir.mkdirs();
//        }
//        //获取当前时间
//        long current = System.currentTimeMillis();
//        String time = new SimpleDateFormat("_yyyyMMdd_HHmmss").format(new Date(current));
//        //以当前时间创建log文件
//        String name = FILE_NAME + time + FILE_NAME_SUFFIX;
//        File file = new File(Constants.CRASH_PATH + File.separator + name);
//        try {
//            //输出流操作
//            PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(file)));
//            //导出手机信息和异常信息
//            PackageManager pm = mApplication.getPackageManager();
//            PackageInfo pi = pm.getPackageInfo(mApplication.getPackageName(), PackageManager.GET_ACTIVITIES);
//            pw.println("发生异常时间：" + time);
//            pw.println("应用版本：" + pi.versionName);
//            pw.println("应用版本号：" + pi.versionCode);
//            pw.println("android版本号：" + Build.VERSION.RELEASE);
//            pw.println("android版本号API：" + Build.VERSION.SDK_INT);
//            pw.println("手机制造商:" + Build.MANUFACTURER);
//            pw.println("手机型号：" + Build.MODEL);
//            ex.printStackTrace(pw);
//            //关闭输出流
//            pw.close();
//        } catch (Exception e) {
//        }
//    }
//
//    public static String getProcessName(Context appContext) {
//        String currentProcessName = "";
//        int pid = android.os.Process.myPid();
//        ActivityManager manager = (ActivityManager) appContext.getSystemService(Context.ACTIVITY_SERVICE);
//        for (ActivityManager.RunningAppProcessInfo processInfo : manager.getRunningAppProcesses()) {
//            if (processInfo.pid == pid) {
//                currentProcessName = processInfo.processName;
//                break;
//            }
//        }
//        return currentProcessName;
//    }
//
//    /* 重启应用 */
//    private void restart() {
//        SystemClock.sleep(2000);
//        Intent intent = mApplication.getPackageManager().getLaunchIntentForPackage(BuildConfig.APPLICATION_ID);
//        PendingIntent restartIntent = PendingIntent.getActivity(
//                mApplication.getApplicationContext(), 0, intent,
//                0);
//        AlarmManager mgr = (AlarmManager) mApplication.getSystemService(Context.ALARM_SERVICE);
//        mgr.set(AlarmManager.RTC, System.currentTimeMillis() + 100,
//                restartIntent); // 1秒钟后重启应用
//
//    }
//}