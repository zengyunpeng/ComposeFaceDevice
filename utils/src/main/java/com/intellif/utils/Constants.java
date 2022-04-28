package com.intellif.utils;

import android.os.Environment;

import java.io.File;

public class Constants {
    public static final int CHINA_lanugage = 1;
    public static final int EN_lanugage = 2;
    public static final String LICENSE_API_KEY = "D1dmxJeD47iGARq5";
    public static final String LICENSE_API_SECRET = "kuA5wFWUO6Z26dunkBBsinuuRXOl2s";

//    public static final String LICENSE_API_KEY = "BAieHWW7DEgzqHBf";
//    public static final String LICENSE_API_SECRET = "okJU81SzY8Q5DRtPftJhzkAmus9UQz";

    public static final String REMOTE_SERVER_IP = "ifaiserver.campus.vesionbook.com";
    //    public static final String REMOTE_SERVER_IP = "192.168.18.186";
    //    public static final String REMOTE_SERVER_PORT = "30803";
//    public static final String REMOTE_SERVER_IP = "192.168.34.190";
//    public static final String REMOTE_SERVER_PORT = "30802";
    //    public static final String REMOTE_SERVER_IP = "ifaiserver.campus.vesionbook.com";
    //    public static final String REMOTE_SERVER_IP = "47.106.29.17";
    public static final String REMOTE_SERVER_PORT = "30803";
    //    public static final String REMOTE_SERVER_IP = "192.168.34.190";
//    public static final String REMOTE_SERVER_PORT = "8802";
    public static final String PLATFORM_ACCOUNT = "guard_pass";
    public static final String PLATFORM_PWD = "intellifusion";
    //预发布环境
//    public static final String REMOTE_SERVER_IP = "ifaiserver.pre-campus.vesionbook.com";
//    public static final String REMOTE_SERVER_PORT = "30805";


    public static final String ZIPFILE_NAME = "mengjing.zip";
    public static final String UPGRADE_APK_NAME = "mengjing.apk";
    public static final String APP_SETTING_NAME = "AppSetting.json";
    public static final String APP_CONFIG_NAME = "AppConfig.json";
    public static final String JPG_LOGO_MAIN = "mainLogo.jpg";
    public static final String JPG_LOGO_SECOND = "secondLogo.jpg";

    public static final String SIGNATURE_NAME = "signature";
    public static final String MODEL_NAME = "models";
    public static final String LICENSE_NAME = "license";
    public static final String CONFIG_NAME = "config.json";
    public static final String INTELLIF_NAME = "Intellif";
    public static final String INTELLIF_DATA_NAME = "Intellif_Data";
    public static final String CALL_RECORD_IMAGE = "CallRecordImage";
    public static final String IMAGE_SAVE_NAME = "ImageSave";
    public static final String IMAGE_CACHE_NAME = "ImageCache";
    public static final String DATA_NAME = "data";
    public static final String APK_NAME = "Apk";
    public static final String CRASH_NAME = "crash";
    public static final String LOGGER_NAME = "logger";

    public static final int faceSize = 90;
    public static final int roiLeft_nei = 114;
    public static final int roiTop_nei = 172;
    public static final int roiRight_nei = 380;
    public static final int roiBottom_nei = 450;
    public static final int roiLeft_wai = 30;
    public static final int roiTop_wai = 100;
    public static final int roiRight_wai = 445;
    public static final int roiBottom_wai = 600;
    public static long PC_LAST_MESSAGE_TIME = System.currentTimeMillis();
    public static long SERVER_LAST_MESSAGE_TIME = System.currentTimeMillis();
    public static long MAX_IDENTIFY_NUM = 5000;


    public static final String ROOT_PATH = Environment.getExternalStorageDirectory().getAbsolutePath();

    public static final String APP_PATH = ROOT_PATH + File.separatorChar + INTELLIF_DATA_NAME;
    public static final String CALL_RECORD_IMAGE_PATH = ROOT_PATH + File.separatorChar + INTELLIF_DATA_NAME+File.separatorChar+CALL_RECORD_IMAGE;
    public static final String SDK_PATH = ROOT_PATH + File.separatorChar + INTELLIF_NAME;
    public static final String MODEL_PATH = SDK_PATH + File.separatorChar + MODEL_NAME;
    public static final String LICENSE_PATH = SDK_PATH + File.separatorChar + LICENSE_NAME;

    public static final String FILE_LICENSE_PATH = LICENSE_PATH + File.separatorChar + LICENSE_NAME;
    public static final String FILE_SIGNATURE_PATH = LICENSE_PATH + File.separatorChar + SIGNATURE_NAME;
    public static final String FILE_CONFIG_PATH = SDK_PATH + File.separatorChar + CONFIG_NAME;
    public static final String FILE_APPSETTING_PATH = APP_PATH + File.separatorChar + DATA_NAME + File.separatorChar + APP_SETTING_NAME;
    public static final String FILE_APPCONFIG_PATH = APP_PATH + File.separatorChar + DATA_NAME + File.separatorChar + APP_CONFIG_NAME;

    public static final String LOGGER_PATH = ROOT_PATH + File.separatorChar + LOGGER_NAME;

    public static final String IMAGE_SAVE_PATH = APP_PATH + File.separatorChar + IMAGE_SAVE_NAME;
    public static final String IMAGE_CACHE_PATH = APP_PATH + File.separatorChar + IMAGE_CACHE_NAME;
    public static final String DATA_PATH = APP_PATH + File.separatorChar + DATA_NAME;

    public static final String APK_PATH = ROOT_PATH + File.separatorChar + APK_NAME;
    public static final String DOWNLOAD_ZIP_PATH = APK_PATH + File.separatorChar + ZIPFILE_NAME;
    public static final String UPGRADE_APK_PATH = APK_PATH + File.separatorChar + UPGRADE_APK_NAME;

    public static final String CRASH_PATH = APP_PATH + File.separatorChar + CRASH_NAME;
    public static final String LOGO_PATH = Constants.SDK_PATH + "/logo.png";
    public static String EXPORT_NAME_Prefix = "IntellifExportData";


    public static boolean createDirectory(String url) {
        File file = new File(url);
        if (!file.exists()) {
            return file.mkdirs();
        }
        return false;
    }

    /**
     * 协议定义的人员类型
     */
    public interface PersonType {
        int PersonType_ALL_VALUE = -2;//自己定义的所有的身份的总和
        //协议定义的几种身份类型
        int PersonType_Unrecognized_VALUE = -1;//陌生人
        int PersonType_Visitor_VALUE = 0;
        int PersonType_Permanent_VALUE = 1;
        int PersonType_BlackList_VALUE = 2;
        int PersonType_VIP_VALUE = 3;
        int PersonType_Teacher = 4;
        int PersonType_Student = 5;
        int PersonType_RedList = 6;
    }

}
