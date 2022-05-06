package com.intellif.utils;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.widget.Toast;

public class ToastUtil {
    /**
     * 之前显示的内容
     */
    private static String oldMsg;
    /**
     * Toast对象
     */
    private static Toast toast = null;
    /**
     * 第一次时间
     */
    private static long oneTime = 0;
    /**
     * 第二次时间
     */
    private static long twoTime = 0;
    public static Handler mainHandler;

    static {
        mainHandler = new Handler(Looper.getMainLooper());
    }


    /**
     * 显示Toast
     *
     * @param context
     * @param message
     */
    public static void showToast(Context context, String message) {
        showToast(context, message, Toast.LENGTH_SHORT);
    }

    public static void showLong(Context context, String message) {
        showToast(context, message, Toast.LENGTH_LONG);
    }

    public static void showToast(String message) {
        showToast(AppGlobals.getApplication(), message, Toast.LENGTH_SHORT);
    }

    public static void showToast(Context context, String message, int duration) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            if (toast == null) {
                toast = Toast.makeText(context, message, duration);
                toast.show();
                oneTime = System.currentTimeMillis();
            } else {
                twoTime = System.currentTimeMillis();
                if (message.equals(oldMsg)) {
                    if (twoTime - oneTime > duration) {
                        toast.show();
                    }
                } else {
                    oldMsg = message;
                    toast.setText(message);
                    toast.show();
                }
            }
            oneTime = twoTime;
        } else {
            mainHandler.post(new Runnable() {
                @Override
                public void run() {
                    if (toast == null) {
                        toast = Toast.makeText(context, message, duration);
                        toast.show();
                        oneTime = System.currentTimeMillis();
                    } else {
                        twoTime = System.currentTimeMillis();
                        if (message.equals(oldMsg)) {
                            if (twoTime - oneTime > duration) {
                                toast.show();
                            }
                        } else {
                            oldMsg = message;
                            toast.setText(message);
                            toast.show();
                        }
                    }
                    oneTime = twoTime;
                }
            });
        }

    }

}
