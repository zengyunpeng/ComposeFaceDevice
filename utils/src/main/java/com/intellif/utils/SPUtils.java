//package com.intellif.utils;
//
//import android.content.Context;
//
//
///**
// * Created by intellif on 2018/4/20.
// */
//
//public class SPUtils {
//
//    private static final String SUBSCRIPTION_ID = "SubscriptionId";
//    private static final String TEMP_CORRECTION = "Temperature_Correction";
//    private static final String VERSION_CODE = "VersionCode";
//    private static final String TEMPERATURE_MIN = "Temperature_Min";
//    private static final String TEMPERATURE_MAX = "Temperature_Max";
//    private static final String TEMPERATURE_SWITCH = "Temperature_Switch";
//    private static final String FLASK_SWITCH = "falsk_switch";
//    private static final String WQJ_SWITCH = "wqj_switch";
//    public static final String REMOTE_SERVER_IP = "Remote_Server_Url";
//    public static final String HEART_BEAT_INTERVAL_SEC = "Heart_Beat_Interval_Sec";
//    public static final String VOICE_PROMPT = "voice_prompt";
//    private static final String DEFAULT_PASSWORD = "888888";
//    private static final String PASSWORD = "password";
//    private static final String LIVE_SWITCH = "live_switch";
//    private static final String LOGO_SWITCH = "logo_switch";
//    private static final String LOGO_PATH = "logo_path";
//    private static final String NAME_SECRET = "name_secret";
//    private static final String DEVICE_NAME = "device_name";
//    private static final String STAND_MODE = "stand_mode";
//    private static final String DEVICE_RESTART = "device_restart";
//    private static final String LIGHT = "light";
//    private static final String VOICE = "voice";
//    private static final String DOOR_OPEN = "door_open";
//    private static final String OUTLINE = "outline";
//    private static final String LOGO = "logo";
//    private static final String REMOTE_PORT = "remote_port";
//    private static final String AD = "ad";
//    private static final String AD_SWITCH = "ad_switch";
//    private static final String MIN_FACE_SIZE = "min_face_size";//最小人脸像素
//    private static final String MAX_FACE_SIZE = "max_face_size";//最小人脸像素
//    private static final String FACE_POSTION = "face_postion";
//
//
//    private static final String BUILD_NUM = "build_num";
//    private static final String SELF_NUM = "self_num";
//
//
//    public static final String PLATFORM_ACCOUNT = "platform_account";
//    public static final String PLATFORM_PWD = "platform_pwd";
//    private static final String SAVE_OFF_LINE = "save_off_line";
//    private static final String OPEN_PWD = "open_pwd";
//    private static final String TOP_MENU_SWITCH = "TOP_MENU_SWITCH";
//    private static final String BOTTOM_MENU_SWITCH = "BOTTOM_MENU_SWITCH";
//    private static final String PASSWORD_OPEN = "PASSWORD_OPEN";
//    private static final String VIDEO_TALK = "VIDEO_TALK";
//    private static final String PASS_MODEL = "PASS_MODEL";
//    public static final int MODEL_STANDARD = 1;
//    public static final int MODEL_NO_DISTURB = 2;
//    public static final int MODEL_SELF_OPEN = 3;
//    public static final int DEFAULT_FACE_SIZE = 90;
//    public static final int DEFAULT_MAX_FACE_SIZE = 270;
//
//
//    public static final String LEE_LIN_SERVER_IP = "lee_lin_server_ip";
//    public static final String PWD_OPEN_DOOR = "pwd_open_door";
//
//    public static void setPwdOpenDoor(boolean pwdOpenDoor) {
//        SharedPreferencesUtils.setParam(AppGlobals.getApplication(), PWD_OPEN_DOOR, pwdOpenDoor);
//    }
//
//    public static boolean getPwdOpenDoor() {
//        return (boolean) SharedPreferencesUtils.getParam(AppGlobals.getApplication(), PWD_OPEN_DOOR, false);
//    }
//
//
//    public static void setLeeLinServerIp(String buildingNum) {
//        SharedPreferencesUtils.setParam(AppGlobals.getApplication(), LEE_LIN_SERVER_IP, buildingNum);
//    }
//
//    public static String getLeeLinServerIp() {
//        return (String) SharedPreferencesUtils.getParam(AppGlobals.getApplication(), LEE_LIN_SERVER_IP, "192.168.1.1");
//    }
//
//
//    public static void setBuildingNum(String buildingNum) {
//        SharedPreferencesUtils.setParam(AppGlobals.getApplication(), BUILD_NUM, buildingNum);
//    }
//
//    public static String getBuildingNum() {
//        return (String) SharedPreferencesUtils.getParam(AppGlobals.getApplication(), BUILD_NUM, "");
//    }
//
//
//    public static void setSelfNum(String buildingNum) {
//        SharedPreferencesUtils.setParam(AppGlobals.getApplication(), SELF_NUM, buildingNum);
//    }
//
//    public static String getSelfNum() {
//        return (String) SharedPreferencesUtils.getParam(AppGlobals.getApplication(), SELF_NUM, "");
//    }
//
//
//    public static void setPassModel(int model) {
//        SharedPreferencesUtils.setParam(AppGlobals.getApplication(), PASS_MODEL, model);
//    }
//
//    public static int getPassModel() {
//        return (int) SharedPreferencesUtils.getParam(AppGlobals.getApplication(), PASS_MODEL, 1);
//    }
//
//
//    public static void setSaveOffLine(boolean b) {
//        SharedPreferencesUtils.setParam(AppGlobals.getApplication(), SAVE_OFF_LINE, b);
//    }
//
//    public static boolean getSaveOffLine() {
//        return (boolean) SharedPreferencesUtils.getParam(AppGlobals.getApplication(), SAVE_OFF_LINE, true);
//    }
//
//    public static void setMinFaceSize(int faceSize) {
//        SharedPreferencesUtils.setParam(AppGlobals.getApplication(), MIN_FACE_SIZE, faceSize);
//    }
//
//    public static int getMinFaceSize() {
//        return (int) SharedPreferencesUtils.getParam(AppGlobals.getApplication(), MIN_FACE_SIZE, DEFAULT_FACE_SIZE);
//    }
//
//    public static void setMaxFaceSize(int faceSize) {
//        SharedPreferencesUtils.setParam(AppGlobals.getApplication(), MAX_FACE_SIZE, faceSize);
//    }
//
//    public static int getMaxFaceSize() {
//        return (int) SharedPreferencesUtils.getParam(AppGlobals.getApplication(), MAX_FACE_SIZE, DEFAULT_MAX_FACE_SIZE);
//    }
//
//
//    public static void writePassword(Context context, String newPassword) {
//        SharedPreferencesUtils.setParam(context, PASSWORD, newPassword);
//    }
//
//    public static String getPassword(Context context) {
//        String message = (String) SharedPreferencesUtils.getParam(context, PASSWORD, DEFAULT_PASSWORD);
//        return message;
//    }
//
//    public static void setFacePostion(boolean b) {
//        SharedPreferencesUtils.setParam(AppGlobals.getApplication(), FACE_POSTION, b);
//    }
//
//    public static boolean getFacePostion() {
//        return (boolean) SharedPreferencesUtils.getParam(AppGlobals.getApplication(), FACE_POSTION, false);
//    }
//
//    public static void writeLogo(Context context, byte[] bitmap) {
//        SharedPreferencesUtils.setParam(context, LOGO, bitmap);
//    }
//
//    public static byte[] getLogo(Context context) {
//        return (byte[]) SharedPreferencesUtils.getParam(context, LOGO, null);
//    }
//
//    public static void writeAd(Context context, String Path) {
//        SharedPreferencesUtils.setParam(context, AD, Path);
//    }
//
//    public static String getAd(Context context) {
//        return (String) SharedPreferencesUtils.getParam(context, AD, "");
//    }
//
//
//    public static void writeRemoteServerIP(Context context, String ip) {
//        SharedPreferencesUtils.setParam(context, REMOTE_SERVER_IP, ip);
//    }
//
//
//    public static String getRemoteServerIP(Context context) {
//        return (String) SharedPreferencesUtils.getParam(context, REMOTE_SERVER_IP, Constants.REMOTE_SERVER_IP);
//    }
//
//    public static void writeRemoteServerPort(Context context, String Port) {
//        SharedPreferencesUtils.setParam(context, REMOTE_PORT, Port);
//    }
//
//    public static String getRemoteServerPort(Context context) {
//        return (String) SharedPreferencesUtils.getParam(context, REMOTE_PORT, Constants.REMOTE_SERVER_PORT);
//    }
//
//    public static void writeSubscriptionId(Context context, int subscriptionId) {
//        SharedPreferencesUtils.setParam(context, SUBSCRIPTION_ID, subscriptionId);
//    }
//
//    public static int getSubscriptionId(Context context) {
//        return (int) SharedPreferencesUtils.getParam(context, SUBSCRIPTION_ID, 1);
//    }
//
//
//    public static void writeVersionCode(Context context, int versionCode) {
//        SharedPreferencesUtils.setParam(context, VERSION_CODE, versionCode);
//    }
//
//    public static int getVersionCode(Context context) {
//        return (int) SharedPreferencesUtils.getParam(context, VERSION_CODE, 0);
//    }
//
//    public static final String MODEL_VERSION_CODE = "MODEL_VERSION_CODE";//模型对应的版本号
//
//    public static void setModelVersionCode(int versionCode) {
//        SharedPreferencesUtils.setParam(AppGlobals.getApplication(), VERSION_CODE, versionCode);
//    }
//
//    public static int getModelVersionCode() {
//        return (int) SharedPreferencesUtils.getParam(AppGlobals.getApplication(), VERSION_CODE, 0);
//    }
//
//
//    public static void writeHeartBeatIntervalSec(Context context, int intervalSec) {
//        SharedPreferencesUtils.setParam(context, HEART_BEAT_INTERVAL_SEC, intervalSec);
//    }
//
//    public static int getHeartBeatIntervalSec(Context context) {
//        return (int) SharedPreferencesUtils.getParam(context, HEART_BEAT_INTERVAL_SEC, 10);
//    }
//
//
//    public static void writeLogoSwitch(Context context, boolean isOpen) {
//        SharedPreferencesUtils.setParam(context, LOGO_SWITCH, isOpen);
//    }
//
//    public static boolean getLogoSwitch(Context context) {
//        return (boolean) SharedPreferencesUtils.getParam(context, LOGO_SWITCH, true);
//    }
//
//
//    public static void setLogoPath(String logoPath) {
//        SharedPreferencesUtils.setParam(AppGlobals.getApplication(), LOGO_PATH, logoPath);
//    }
//
//    public static String getLogoPath() {
//        return (String) SharedPreferencesUtils.getParam(AppGlobals.getApplication(), LOGO_PATH, "0");
//    }
//
//
//    public static void writeNameSecretSwitch(Context context, boolean isOpen) {
//        SharedPreferencesUtils.setParam(context, NAME_SECRET, isOpen);
//    }
//
//    public static boolean getNameSecretSwitch(Context context) {
//        return (boolean) SharedPreferencesUtils.getParam(context, NAME_SECRET, false);
//    }
//
//    public static void writeDeviceNameSwitch(Context context, String deviceName) {
//        SharedPreferencesUtils.setParam(context, DEVICE_NAME, deviceName);
//    }
//
//    public static String getDeviceNameSwitch(Context context) {
//        return (String) SharedPreferencesUtils.getParam(context, DEVICE_NAME, "");
//    }
//
//    public static void writeAdSwitch(Context context, boolean isopen) {
//        SharedPreferencesUtils.setParam(context, AD_SWITCH, isopen);
//    }
//
//    public static boolean getAdSwitch(Context context) {
//        return (boolean) SharedPreferencesUtils.getParam(context, AD_SWITCH, true);//非触屏模式默认打开广告播放  TODO
//    }
//
//
//    public static void writeDeviceRestartSwitch(Context context, boolean isOpen) {
//        SharedPreferencesUtils.setParam(context, DEVICE_RESTART, isOpen);
//    }
//
//    public static boolean getDeviceRestartSwitch(Context context) {
//        return (boolean) SharedPreferencesUtils.getParam(context, DEVICE_RESTART, true);
//    }
//
//
//    public static void writeDoorOpenSwitch(Context context, boolean isOpen) {
//        SharedPreferencesUtils.setParam(context, DOOR_OPEN, isOpen);
//    }
//
//    public static boolean getDoorOpenSwitch(Context context) {
//        return (boolean) SharedPreferencesUtils.getParam(context, DOOR_OPEN, false);
//    }
//
//    public static void writeLightSwitch(Context context, boolean isOpen) {
//        SharedPreferencesUtils.setParam(context, LIGHT, isOpen);
//    }
//
//    public static boolean getLightSwitch(Context context) {
//        return (boolean) SharedPreferencesUtils.getParam(context, LIGHT, false);
//    }
//
//    public static void writeOutlineSwitch(Context context, boolean isOpen) {
//        SharedPreferencesUtils.setParam(context, OUTLINE, isOpen);
//    }
//
//    public static boolean getOutlineSwitch(Context context) {
//        return (boolean) SharedPreferencesUtils.getParam(context, OUTLINE, false);
//    }
//
//
//    public static String getPlatformAccount() {
//        return (String) SharedPreferencesUtils.getParam(AppGlobals.getApplication(), PLATFORM_ACCOUNT, Constants.PLATFORM_ACCOUNT);
//    }
//
//    public static void setPlatformAccount(String platformAccount) {
//        SharedPreferencesUtils.setParam(AppGlobals.getApplication(), PLATFORM_ACCOUNT, platformAccount);
//    }
//
//    public static String getPlatformPwd() {
//        return (String) SharedPreferencesUtils.getParam(AppGlobals.getApplication(), PLATFORM_PWD, Constants.PLATFORM_PWD);
//    }
//
//    public static void setPlatformPwd(String platformAccount) {
//        SharedPreferencesUtils.setParam(AppGlobals.getApplication(), PLATFORM_PWD, platformAccount);
//    }
//
//    public static void clearSp() {
//        SharedPreferencesUtils.clearSp(AppGlobals.getApplication());
//
//    }
//
//
//    /*------------------原SettingBean里抽出来的配置项 start--------------*/
//    private static final String DOOR_CONTROL_MODEL = "DOOR_CONTROL_MODEL";
//    private static final String QUALITY_SCORE_THRESHOLD = "QUALITY_SCORE_THRESHOLD";
//    private static final String QUALITY_THRESHOLD = "QUALITY_THRESHOLD";
//    private static final String SIGNAL_DURATION = "signal_duration";
//    private static final String SIMILARITY_SCORE_THRESHOLD = "SIMILARITY_SCORE_THRESHOLD";
//
//    public static void setDoorControlModel(int platformAccount) {
//        SharedPreferencesUtils.setParam(AppGlobals.getApplication(), DOOR_CONTROL_MODEL, platformAccount);
//    }
//
//    public static int getDoorControlModel() {
//        return (int) SharedPreferencesUtils.getParam(AppGlobals.getApplication(), DOOR_CONTROL_MODEL, 0);
//    }
//
//    public static void writeLiveSwitch(boolean isOpen) {
//        SharedPreferencesUtils.setParam(AppGlobals.getApplication(), LIVE_SWITCH, isOpen);
//    }
//
//    public static boolean getLiveSwitch() {
//        return (boolean) SharedPreferencesUtils.getParam(AppGlobals.getApplication(), LIVE_SWITCH, false);
//    }
//
//
//    public static void writeTempCorrection(float tempCorrection) {
//        SharedPreferencesUtils.setParam(AppGlobals.getApplication(), TEMP_CORRECTION, tempCorrection);
//    }
//
//    public static float getTempCorrection() {
//        return (float) SharedPreferencesUtils.getParam(AppGlobals.getApplication(), TEMP_CORRECTION, 0.0f);
//    }
//
//    public static void writeTemperatureMAX(float temperature) {
//        if (temperature == 0.0)
//            SharedPreferencesUtils.setParam(AppGlobals.getApplication(), TEMPERATURE_MAX, 42.0f);
//        else
//            SharedPreferencesUtils.setParam(AppGlobals.getApplication(), TEMPERATURE_MAX, temperature);
//    }
//
//    public static float getTemperatureMAX() {
//        return (float) SharedPreferencesUtils.getParam(AppGlobals.getApplication(), TEMPERATURE_MAX, 42.0f);
//    }
//
//
//    public static void writeTemperatureMIN(float temperature) {
//        if (temperature == 0.0f)
//            SharedPreferencesUtils.setParam(AppGlobals.getApplication(), TEMPERATURE_MIN, 37.5f);
//        else
//            SharedPreferencesUtils.setParam(AppGlobals.getApplication(), TEMPERATURE_MIN, temperature);
//    }
//
//    public static float getTemperatureMIN() {
//        return (float) SharedPreferencesUtils.getParam(AppGlobals.getApplication(), TEMPERATURE_MIN, 37.5f);
//    }
//
//    public static void writeTemperatureSwitch(boolean isOpen) {
//        SharedPreferencesUtils.setParam(AppGlobals.getApplication(), TEMPERATURE_SWITCH, isOpen);
//    }
//
//    public static boolean getTemperatureSwitch() {
//        return (boolean) SharedPreferencesUtils.getParam(AppGlobals.getApplication(), TEMPERATURE_SWITCH, false);
//    }
//
//
//    public static void setQualityScoreThreshold(float platformAccount) {
//        SharedPreferencesUtils.setParam(AppGlobals.getApplication(), QUALITY_SCORE_THRESHOLD, platformAccount);
//    }
//
//    public static float getQualityScoreThreshold() {
//        return (float) SharedPreferencesUtils.getParam(AppGlobals.getApplication(), QUALITY_SCORE_THRESHOLD, 0.15f);
//    }
//
//
//    public static void setQualityThreshold(float platformAccount) {
//        SharedPreferencesUtils.setParam(AppGlobals.getApplication(), QUALITY_THRESHOLD, platformAccount);
//    }
//
//    public static float getQualityThreshold() {
//        return (float) SharedPreferencesUtils.getParam(AppGlobals.getApplication(), QUALITY_THRESHOLD, 0.15f);
//    }
//
//
//    public static void setSignalDuration(int platformAccount) {
//        SharedPreferencesUtils.setParam(AppGlobals.getApplication(), SIGNAL_DURATION, platformAccount);
//    }
//
//    public static int getSignalDuration() {
//        return (int) SharedPreferencesUtils.getParam(AppGlobals.getApplication(), SIGNAL_DURATION, 0);
//    }
//
//    public static void setSimilarityScoreThreshold(float platformAccount) {
//        if (platformAccount < 0.7f) {//如果服务器端返回0等数值就不写入
//            return;
//        }
//        SharedPreferencesUtils.setParam(AppGlobals.getApplication(), SIMILARITY_SCORE_THRESHOLD, platformAccount);
//    }
//
//    public static float getSimilarityScoreThreshold() {
//        return (float) SharedPreferencesUtils.getParam(AppGlobals.getApplication(), SIMILARITY_SCORE_THRESHOLD, 0.9f);
//    }
//
//    public static void writeVoicePrompt(boolean isOpen) {
//        SharedPreferencesUtils.setParam(AppGlobals.getApplication(), VOICE_PROMPT, isOpen);
//    }
//
//    public static boolean getVoicePrompt() {
//        return (boolean) SharedPreferencesUtils.getParam(AppGlobals.getApplication(), VOICE_PROMPT, true);
//    }
//
//
//    public static void writeFlaskSwitch(boolean isOpen) {
//        SharedPreferencesUtils.setParam(AppGlobals.getApplication(), FLASK_SWITCH, isOpen);
//    }
//
//    public static boolean getFlaskSwitch() {
//        return (boolean) SharedPreferencesUtils.getParam(AppGlobals.getApplication(), FLASK_SWITCH, false);
//    }
//
//
//    public static void writeWqjSwitch(boolean isOpen) {
//        SharedPreferencesUtils.setParam(AppGlobals.getApplication(), WQJ_SWITCH, isOpen);
//    }
//
//    public static boolean getWqjFlaskSwitch() {
//        return (boolean) SharedPreferencesUtils.getParam(AppGlobals.getApplication(), WQJ_SWITCH, false);
//    }
//
//
//    public static final String LIVE_THRESHOLD = "live_threshold";
//
//    public static float getLiveThreshold() {
//        return (float) SharedPreferencesUtils.getParam(AppGlobals.getApplication(), LIVE_THRESHOLD, 0.5f);
//    }
//
//    public static void setLiveThreshold(float liveThreshold) {
//        SharedPreferencesUtils.setParam(AppGlobals.getApplication(), LIVE_THRESHOLD, liveThreshold);
//    }
//
//    //断网续传
////    public static boolean getResumeUpload() {
////        return (boolean) SharedPreferencesUtils.getParam(AppGlobals.getApplication(), RESUME_UPLOAD, true);
////    }
////
////    public static void setResumeUpload(boolean liveThreshold) {
////        SharedPreferencesUtils.setParam(AppGlobals.getApplication(), RESUME_UPLOAD, liveThreshold);
////    }
//
//
//    //上传类型     "不传数据", 0
//    //            "通行记录", 1
//    //            "人脸图数据", 2
//    //            "背景图数据", 3
//    //            "人脸+背景图数据" 4
////    public static final String UPLOAD_DATA_TYPE = "upload_data_type";
//
////    public static void setUploadDataType(int uploadDataType) {
////        SharedPreferencesUtils.setParam(AppGlobals.getApplication(), UPLOAD_DATA_TYPE, uploadDataType);
////    }
//////
//////
////    public static int getUploadDataType() {
////        return (int) SharedPreferencesUtils.getParam(AppGlobals.getApplication(), UPLOAD_DATA_TYPE, 0);
////    }
//
//
//    //图片显示样式  0 不显示 1显示抓拍照  2 显示地库照
//
//    public static final String IMAGE_SHOW_TYPE = "image_show_type";
//
//
//    public static void setImageShowType(int uploadDataType) {
//        SharedPreferencesUtils.setParam(AppGlobals.getApplication(), IMAGE_SHOW_TYPE, uploadDataType);
//    }
//
//
//    public static int getImageShowType() {
//        return (int) SharedPreferencesUtils.getParam(AppGlobals.getApplication(), IMAGE_SHOW_TYPE, 0);
//    }
//
//
//    /*------------------原SettingBean里抽出来的配置项 start--------------*/
//
//    public static final String IP_SWITCH = "ip_switch";
//    public static final String PEOPLE_NUM_SWITCH = "people_num_switch";
//    public static final String RESUME_UPLOAD = "resume_upload";//断网续传功能
//    public static final String UPLOAD_IMAGE_TYPE = "upload_image_type";//图片上报类型 0-不上传 1-人脸图 2-背景图 3-人脸+背景
//    public static final String NUMBER_OF_STRANGER_JUDGMENTS = "number_of_stranger_judgments";//陌生人识别次数
//    public static final String RECOGNITION_INTERVAL = "recognition_interval";//陌生人识别次数
//    public static final String NAME_SHOW_STYLE = "name_show_style";//姓名展示样式 隐藏姓氏0 全显1 隐藏名字2
//    public static final String MSG_SHOW_STYLE = "msg_show_style";//姓名展示样式 0只显示名字 1显示姓名+工号+部门
//    public static final String DELAYED_OPENING_TIME = "delayed_opening_time";//延迟开门时间
//    public static final String VOLUME_OF_SOUND = "volume_of_sound";//陌生人识别次数
//    public static final String ENTER_SCREEN_SLEEP_TIME = "enter_screen_sleep_time";//进入熄屏时间
//    public static final String LIGHT_CONTROL_TYPE = "light_control_type";//补光灯模式 0-人脸控制 1-时间控制  2-常关
//    public static final String LIGHT_OPEN_TIME = "light_open_time";//补光灯开启时间 格式 10:00:00~12:00:00
//    public static final String RESTART_TIME = "restart_time";//定时重启时间
//    public static final String FACE_REC_VISIBLE = "face_rec_visible";//定时重启时间
//    public static final String DOOR_OPEN_WAY = "door_open_way";//开门方式 0 继电器 1 韦根26  2 韦根32  3 RS485
//    public static final String PERSON_PULL_ID = "person_pull_id";//拉取人脸操作的id
//    public static final String PERSON_PULL_START_POSITION = "person_pull_start_position";//拉取到的位置
//    public static final String SHOULD_STOP_PULL_FACE = "should_stop_pull_face";//是否需要停止拉取
//
//
//    public static boolean getShouldStopPullFace() {
//        return (boolean) SharedPreferencesUtils.getParam(AppGlobals.getApplication(), SHOULD_STOP_PULL_FACE, false);
//    }
//
//    public static void setShouldStopPullFace(boolean shouldStopPull) {
//        SharedPreferencesUtils.setParam(AppGlobals.getApplication(), SHOULD_STOP_PULL_FACE, shouldStopPull);
//    }
//
//
//    public static int getPersonPullId() {
//        int param = (int) SharedPreferencesUtils.getParam(AppGlobals.getApplication(), PERSON_PULL_ID, 0);
//        if (param == 0) {
//            param = getSecondTimestamp();
//            SPUtils.setPersonPullId(param);
//        }
//        return param;
//    }
//
//    public static int getPersonPullIdPure() {
//        return (int) SharedPreferencesUtils.getParam(AppGlobals.getApplication(), PERSON_PULL_ID, 0);
//    }
//
//
//    public static void setPersonPullId(int pullId) {
//        SharedPreferencesUtils.setParam(AppGlobals.getApplication(), PERSON_PULL_ID, pullId);
//    }
//
//    public static void setNextPullPosition(int nextPullPosition) {
//        SharedPreferencesUtils.setParam(AppGlobals.getApplication(), PERSON_PULL_START_POSITION, nextPullPosition);
//    }
//
//    public static int getNextPullPosition() {
//        return (int) SharedPreferencesUtils.getParam(AppGlobals.getApplication(), PERSON_PULL_START_POSITION, 0);
//    }
//
//
//    public static int getSecondTimestamp() {
//        String timestamp = String.valueOf(System.currentTimeMillis() / 1000);
//        return Integer.valueOf(timestamp);
//    }
//
//
//    public static void setDoorOpenWay(int doorOpenWay) {
//        SharedPreferencesUtils.setParam(AppGlobals.getApplication(), DOOR_OPEN_WAY, doorOpenWay);
//    }
//
//    public static int getDoorOpenWay() {
//        return (int) SharedPreferencesUtils.getParam(AppGlobals.getApplication(), DOOR_OPEN_WAY, 0);
//    }
//
//
//    public static void setIPSwitch(boolean isOpen) {
//        SharedPreferencesUtils.setParam(AppGlobals.getApplication(), IP_SWITCH, isOpen);
//    }
//
//    public static boolean getIPSwitch() {
//        return (boolean) SharedPreferencesUtils.getParam(AppGlobals.getApplication(), IP_SWITCH, true);
//    }
//
//    public static void setPeopleNumSwitch(boolean isOpen) {
//        SharedPreferencesUtils.setParam(AppGlobals.getApplication(), PEOPLE_NUM_SWITCH, isOpen);
//    }
//
//    public static boolean getPeopleNumSwitch() {
//        return (boolean) SharedPreferencesUtils.getParam(AppGlobals.getApplication(), PEOPLE_NUM_SWITCH, true);
//    }
//
//    public static void setUploadImageType(int type) {
//        SharedPreferencesUtils.setParam(AppGlobals.getApplication(), UPLOAD_IMAGE_TYPE, type);
//    }
//
//    public static int getUploadImageType() {
//        return (int) SharedPreferencesUtils.getParam(AppGlobals.getApplication(), UPLOAD_IMAGE_TYPE, 2);
//    }
//
//    public static void setNumberOfStrangerJudgments(int number) {
//        if (number < 1)
//            return;
//        SharedPreferencesUtils.setParam(AppGlobals.getApplication(), NUMBER_OF_STRANGER_JUDGMENTS, number);
//    }
//
//    public static int getNumberOfStrangerJudgments() {
//        return (int) SharedPreferencesUtils.getParam(AppGlobals.getApplication(), NUMBER_OF_STRANGER_JUDGMENTS, 1);
//    }
//
//    public static void setRecognitionInterval(int number) {
//        SharedPreferencesUtils.setParam(AppGlobals.getApplication(), RECOGNITION_INTERVAL, number);
//    }
//
//    public static int getRecognitionInterval() {
//        return (int) SharedPreferencesUtils.getParam(AppGlobals.getApplication(), RECOGNITION_INTERVAL, 5);
//    }
//
//    public static void setPersonMsgStyle(int i) {
//        SharedPreferencesUtils.setParam(AppGlobals.getApplication(), MSG_SHOW_STYLE, i);
//    }
//
//    public static int getPersonMsgStyle() {
//        return (int) SharedPreferencesUtils.getParam(AppGlobals.getApplication(), MSG_SHOW_STYLE, 0);
//    }
//
//    public static void setNameShowStyle(int i) {
//        SharedPreferencesUtils.setParam(AppGlobals.getApplication(), NAME_SHOW_STYLE, i);
//    }
//
//    public static int getNameShowStyle() {
//        return (int) SharedPreferencesUtils.getParam(AppGlobals.getApplication(), NAME_SHOW_STYLE, 1);
//    }
//
//    public static void setDelayedOpeningTime(int i) {
//        SharedPreferencesUtils.setParam(AppGlobals.getApplication(), DELAYED_OPENING_TIME, i);
//    }
//
//    public static int getDelayedOpeningTime() {
//        return (int) SharedPreferencesUtils.getParam(AppGlobals.getApplication(), DELAYED_OPENING_TIME, 0);
//    }
//
//    public static int getVolumeOfSound() {
//        return (int) SharedPreferencesUtils.getParam(AppGlobals.getApplication(), VOLUME_OF_SOUND, 4);
//    }
//
//
//    public static void setVolumeOfSound(int volume) {
//        SharedPreferencesUtils.setParam(AppGlobals.getApplication(), VOLUME_OF_SOUND, volume);
//    }
//
//    public static void setEnterScreenSleepTime(int time) {
//        if (time < 1)
//            return;
//        SharedPreferencesUtils.setParam(AppGlobals.getApplication(), ENTER_SCREEN_SLEEP_TIME, time);
//    }
//
//
//    public static int getEnterScreenSleepTime() {
//        return (int) SharedPreferencesUtils.getParam(AppGlobals.getApplication(), ENTER_SCREEN_SLEEP_TIME, 3);
//    }
//
//
//    public static int getLightControlType() {
//        return (int) SharedPreferencesUtils.getParam(AppGlobals.getApplication(), LIGHT_CONTROL_TYPE, 0);
//    }
//
//    public static void setLightControlType(int type) {
//        SharedPreferencesUtils.setParam(AppGlobals.getApplication(), LIGHT_CONTROL_TYPE, type);
//    }
//
//    public static String getLightOpenTime() {
//        return (String) SharedPreferencesUtils.getParam(AppGlobals.getApplication(), LIGHT_OPEN_TIME, "");
//    }
//
//    public static void setLightOpenTime(String type) {
//        SharedPreferencesUtils.setParam(AppGlobals.getApplication(), LIGHT_OPEN_TIME, type);
//    }
//
//    public static String getRestartTime() {
//        return (String) SharedPreferencesUtils.getParam(AppGlobals.getApplication(), RESTART_TIME, "03:00");
//    }
//
//    public static void setRestartTime(String str) {
//        SharedPreferencesUtils.setParam(AppGlobals.getApplication(), RESTART_TIME, str);
//    }
//
//    public static String getOpenPwd() {
//        return (String) SharedPreferencesUtils.getParam(AppGlobals.getApplication(), OPEN_PWD, "000000");
//    }
//
//    public static void setOpenPwd(String str) {
//        SharedPreferencesUtils.setParam(AppGlobals.getApplication(), OPEN_PWD, str);
//    }
//
//    public static void setFaceRecVisible(boolean b) {
//        SharedPreferencesUtils.setParam(AppGlobals.getApplication(), FACE_REC_VISIBLE, b);
//    }
//
//    public static boolean getFaceRecVisible() {
//        return (boolean) SharedPreferencesUtils.getParam(AppGlobals.getApplication(), FACE_REC_VISIBLE, true);
//    }
//
//    /*核验模式相关*/
//    public static final String SUPPORT_FACE_REC = "support_face_rec";//是否支持人脸比对通过,默认是
//
//    public static boolean getSupportFaceRec() {
//        return (boolean) SharedPreferencesUtils.getParam(AppGlobals.getApplication(), SUPPORT_FACE_REC, true);
//    }
//
//    public static void setSupportFaceRec(boolean supportFaceRec) {
//        SharedPreferencesUtils.setParam(AppGlobals.getApplication(), SUPPORT_FACE_REC, supportFaceRec);
//    }
//
//    public static final String SUPPORT_SWEEP_CARD = "support_sweep_card";//是否支持刷卡通过,默认否
//
//    public static boolean getSupportSweepCard() {
//        return (boolean) SharedPreferencesUtils.getParam(AppGlobals.getApplication(), SUPPORT_SWEEP_CARD, false);
//    }
//
//    public static void setSupportSweepCard(boolean supportFaceRec) {
//        SharedPreferencesUtils.setParam(AppGlobals.getApplication(), SUPPORT_SWEEP_CARD, supportFaceRec);
//    }
//
//    public static final String SUPPORT_FACE_CARD_REC = "support_face_card_rec";//是否支持刷卡通过,默认否
//
//    public static boolean getSupportFaceCardRec() {
//        return (boolean) SharedPreferencesUtils.getParam(AppGlobals.getApplication(), SUPPORT_FACE_CARD_REC, false);
//    }
//
//    public static void setSupportFaceCardRec(boolean supportFaceRec) {
//        SharedPreferencesUtils.setParam(AppGlobals.getApplication(), SUPPORT_FACE_CARD_REC, supportFaceRec);
//    }
//
//    //这个需求暂缓
//    public static final String SUPPORT_FACE_CARD_INNER_DB_REC = "support_face_card_inner_db_rec";//是否支持刷卡通过,后库内识别,默认否
//
//    public static boolean getSupportFaceCardInnerDbRec() {
//        return (boolean) SharedPreferencesUtils.getParam(AppGlobals.getApplication(), SUPPORT_FACE_CARD_INNER_DB_REC, false);
//    }
//
//    public static void setSupportFaceCardInnerDbRec(boolean supportFaceRec) {
//        SharedPreferencesUtils.setParam(AppGlobals.getApplication(), SUPPORT_FACE_CARD_INNER_DB_REC, supportFaceRec);
//    }
//
//
//    public static final String SUPPORT_SWEEP_IC_CARD = "support_sweep_ic_card";
//
//    public static boolean getSupportSweepIcCard() {
//        return (boolean) SharedPreferencesUtils.getParam(AppGlobals.getApplication(), SUPPORT_SWEEP_IC_CARD, false);
//    }
//
//    public static void setupportSweepIcCard(boolean supportFaceRec) {
//        SharedPreferencesUtils.setParam(AppGlobals.getApplication(), SUPPORT_SWEEP_IC_CARD, supportFaceRec);
//    }
//
//
//    public static final String SUPPORT_SWEEP_IC_CARD_121 = "support_sweep_ic_card121";
//
//    public static boolean getSupportSweepIcCard121() {
//        return (boolean) SharedPreferencesUtils.getParam(AppGlobals.getApplication(), SUPPORT_SWEEP_IC_CARD_121, false);
//    }
//
//    public static void setSupportSweepIcCard121(boolean supportFaceRec) {
//        SharedPreferencesUtils.setParam(AppGlobals.getApplication(), SUPPORT_SWEEP_IC_CARD_121, supportFaceRec);
//    }
//
//
//    public static boolean getTopMenuSwitch() {
//        return (boolean) SharedPreferencesUtils.getParam(AppGlobals.getApplication(), TOP_MENU_SWITCH, false);
//    }
//
//    public static void setTopMenuSwitch(boolean result) {
//        SharedPreferencesUtils.setParam(AppGlobals.getApplication(), TOP_MENU_SWITCH, result);
//    }
//
//    public static boolean getBottomMenuSwitch() {
//        return (boolean) SharedPreferencesUtils.getParam(AppGlobals.getApplication(), BOTTOM_MENU_SWITCH, false);
//    }
//
//    public static void setBottomMenuSwitch(boolean result) {
//        SharedPreferencesUtils.setParam(AppGlobals.getApplication(), BOTTOM_MENU_SWITCH, result);
//    }
//
//    public static boolean getPasswordOpenSwitch() {
//        return (boolean) SharedPreferencesUtils.getParam(AppGlobals.getApplication(), PASSWORD_OPEN, false);
//    }
//
//    public static void setPasswordOpenSwitch(boolean result) {
//        SharedPreferencesUtils.setParam(AppGlobals.getApplication(), PASSWORD_OPEN, result);
//    }
//
//    public static boolean getVideoTalkSwitch() {
//        return (boolean) SharedPreferencesUtils.getParam(AppGlobals.getApplication(), VIDEO_TALK, false);
//    }
//
//    public static void setVideoTalkSwitch(boolean result) {
//        SharedPreferencesUtils.setParam(AppGlobals.getApplication(), VIDEO_TALK, result);
//    }
//
//}
