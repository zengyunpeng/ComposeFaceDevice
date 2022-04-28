//package com.intellif.utils;
//
//import android.util.Log;
//
//
//import java.io.File;
//
//
//public class LogUtil {
//    public static final String TAG = "Intellif";
//
//    public static final int VERBOSE = 1;
//    public static final int DEBUG = 2;
//    public static final int INFO = 3;
//    public static final int WARN = 4;
//    public static final int ERROR = 5;
//    public static final int ASSERT = 6;
//    public static final int NOTHING = 7;
//
//    public static int level = VERBOSE;
//    public static int loggerLevel = VERBOSE;
//    public static int LOGGER_MAX_NUM = 100;
//
//    public static boolean noDebug = !BuildConfig.DEBUG;
//
//    public static void initLogger() {
//        FormatStrategy formatStrategy = CsvFormatStrategy.newBuilder()
//                .tag(TAG)
//                .build();
//        Logger.addLogAdapter(new DiskLogAdapter(formatStrategy));
//        /*FormatStrategy formatStrategy = PrettyFormatStrategy.newBuilder()
//                .showThreadInfo(false)  // (Optional) Whether to show thread info or not. Default true
//                .methodCount(1)
//                .methodOffset(1)
//                .tag(TAG)
//                .build();*/
//        //Logger.addLogAdapter(new AndroidLogAdapter(formatStrategy));
//    }
//
//    /**
//     * 超过100个Logger日志文件清空日志
//     */
//    public static void clearLoggerDir() {
//        File file = new File(Constants.LOGGER_PATH);
//        String[] strings = file.list();
//        if (strings != null) {
//            LogUtil.i("clearLoggerDir num=" + strings.length);
//            if (strings.length > LOGGER_MAX_NUM) {
//                FileUtils.delete(file);
//            }
//        }
//    }
//
//    public static void v(String msg) {
//        if (noDebug) return;
//        msg = getTargetClassName() + msg;
//        if (loggerLevel <= VERBOSE) {
//            Logger.v(msg);
//        }
//        v(TAG, msg);
//    }
//
//    public static void d(String msg) {
//        if (noDebug) return;
//        msg = getTargetClassName() + msg;
//        if (loggerLevel <= DEBUG) {
//            Logger.d(msg);
//        }
//        d(TAG, msg);
//    }
//
//    public static void i(String msg) {
//        if (noDebug) return;
//        msg = getTargetClassName() + msg;
//        if (loggerLevel <= INFO) {
//            Logger.i(msg);
//        }
//        i(TAG, msg);
//    }
//
//    public static void w(String msg) {
//        if (noDebug) return;
//        msg = getTargetClassName() + msg;
//        if (loggerLevel <= WARN) {
//            Logger.w(msg);
//        }
//        w(TAG, msg);
//    }
//
//    public static void e(String msg) {
//        if (noDebug) return;
//        msg = getTargetClassName() + msg;
//        if (loggerLevel <= ERROR) {
//            Logger.e(msg);
//        }
//        e(TAG, msg);
//    }
//
//    public static void e(String msg, Throwable tr) {
//        if (noDebug) return;
//        msg = getTargetClassName() + msg;
//        if (loggerLevel <= ERROR) {
//            Logger.e(tr, msg);
//        }
//        e(TAG, msg, tr);
//    }
//
//    public static void wtf(String msg) {
//        if (noDebug) return;
//        msg = getTargetClassName() + msg;
//        if (loggerLevel <= ASSERT) {
//            Logger.wtf(msg);
//        }
//        wtf(TAG, msg);
//    }
//
//    /**
//     * --------------------------------------------------------------
//     * -------------------------------------------------------------
//     * -------------------------------------------------------------
//     */
//    public static void v(String tag, String msg) {
//        if (noDebug) return;
//        if (level <= VERBOSE) {
//            Log.v(tag, msg);
//        }
//    }
//
//    public static void v(String tag, String msg, Throwable tr) {
//        if (noDebug) return;
//        if (level <= VERBOSE) {
//            Log.v(tag, msg, tr);
//        }
//    }
//
//    public static void d(String tag, String msg) {
//        if (noDebug) return;
//        if (level <= DEBUG) {
//            Log.d(tag, msg);
//        }
//    }
//
//    public static void d(String tag, String msg, Throwable tr) {
//        if (noDebug) return;
//        if (level <= DEBUG) {
//            Log.d(tag, msg, tr);
//        }
//    }
//
//    public static void i(String tag, String msg) {
//        if (noDebug) return;
//        if (level <= INFO) {
//            Log.i(tag, msg);
//        }
//    }
//
//    public static void i(String tag, String msg, Throwable tr) {
//        if (noDebug) return;
//        if (level <= INFO) {
//            Log.i(tag, msg, tr);
//        }
//    }
//
//    public static void w(String tag, String msg) {
//        if (noDebug) return;
//        if (level <= WARN) {
//            Log.w(tag, msg);
//        }
//    }
//
//    public static void w(String tag, Throwable tr) {
//        if (noDebug) return;
//        if (level <= WARN) {
//            Log.w(tag, tr);
//        }
//    }
//
//    public static void w(String tag, String msg, Throwable tr) {
//        if (noDebug) return;
//        if (level <= WARN) {
//            Log.w(tag, msg, tr);
//        }
//    }
//
//    public static void e(String tag, String msg) {
//        if (noDebug) return;
//        if (level <= ERROR) {
//            Log.e(tag, msg);
//        }
//    }
//
//    public static void e(String tag, String msg, Throwable tr) {
//        if (noDebug) return;
//        if (level <= ERROR) {
//            Log.e(tag, msg, tr);
//        }
//    }
//
//    public static void wtf(String tag, String msg) {
//        if (noDebug) return;
//        if (level <= ASSERT) {
//            Log.wtf(tag, msg);
//        }
//    }
//
//    public static void wtf(String tag, Throwable tr) {
//        if (noDebug) return;
//        if (level <= ASSERT) {
//            Log.wtf(tag, tr);
//        }
//    }
//
//    public static void wtf(String tag, String msg, Throwable tr) {
//        if (noDebug) return;
//        if (level <= ASSERT) {
//            Log.wtf(tag, msg, tr);
//        }
//    }
//
//    private static String getTargetClassName() {
//        StackTraceElement[] elements = Thread.currentThread().getStackTrace();
//        String trace = "";
//        StackTraceElement targetElement;
//        // 和MyLog相同的下一个栈帧为MyLog调用的栈帧信息
//        for (int i = 0; i < elements.length; i++) {
//            //Log.v("LogUtil", elements[i].getClassName());
//            if (elements[i].getClassName().equals(LogUtil.class.getName())) {
//                targetElement = elements[i + 2];
//                trace = "(" + targetElement.getFileName() + ":" + targetElement.getLineNumber() + ") ";
//                break;
//            }
//        }
//        return trace;
//    }
//
//    public static String formatJson(String strJson) {
//        // 计数tab的个数
//        int tabNum = 0;
//        StringBuffer jsonFormat = new StringBuffer();
//        int length = strJson.length();
//
//        char last = 0;
//        for (int i = 0; i < length; i++) {
//            char c = strJson.charAt(i);
//            if (c == '{') {
//                tabNum++;
//                jsonFormat.append(c + "\n");
//                jsonFormat.append(getSpaceOrTab(tabNum));
//            } else if (c == '}') {
//                tabNum--;
//                jsonFormat.append("\n");
//                jsonFormat.append(getSpaceOrTab(tabNum));
//                jsonFormat.append(c);
//            } else if (c == ',') {
//                jsonFormat.append(c + "\n");
//                jsonFormat.append(getSpaceOrTab(tabNum));
//            } else if (c == ':') {
//                jsonFormat.append(c + " ");
//            } else if (c == '[') {
//                tabNum++;
//                char next = strJson.charAt(i + 1);
//                if (next == ']') {
//                    jsonFormat.append(c);
//                } else {
//                    jsonFormat.append(c + "\n");
//                    jsonFormat.append(getSpaceOrTab(tabNum));
//                }
//            } else if (c == ']') {
//                tabNum--;
//                if (last == '[') {
//                    jsonFormat.append(c);
//                } else {
//                    jsonFormat.append("\n" + getSpaceOrTab(tabNum) + c);
//                }
//            } else {
//                jsonFormat.append(c);
//            }
//            last = c;
//        }
//        return jsonFormat.toString();
//    }
//
//    private static String getSpaceOrTab(int tabNum) {
//        StringBuffer sbTab = new StringBuffer();
//        for (int i = 0; i < tabNum; i++) {
//            sbTab.append('\t');
//        }
//        return sbTab.toString();
//    }
//}
