// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: IfDoorControlConfiguration.proto

package com.intellif.ifai.config;

public interface DoorOtherConfigurationOrBuilder extends
    // @@protoc_insertion_point(interface_extends:Ifaipb.DoorOtherConfiguration)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   *补光灯模式 1-人脸控制 2-时间控制
   * </pre>
   *
   * <code>int32 whiteLight_mode = 1;</code>
   */
  int getWhiteLightMode();

  /**
   * <pre>
   *补光灯开启关闭时间
   * </pre>
   *
   * <code>.Ifaipb.TimePeriod whiteLight_time = 2;</code>
   */
  boolean hasWhiteLightTime();
  /**
   * <pre>
   *补光灯开启关闭时间
   * </pre>
   *
   * <code>.Ifaipb.TimePeriod whiteLight_time = 2;</code>
   */
  com.intellif.ifai.common.TimePeriod getWhiteLightTime();
  /**
   * <pre>
   *补光灯开启关闭时间
   * </pre>
   *
   * <code>.Ifaipb.TimePeriod whiteLight_time = 2;</code>
   */
  com.intellif.ifai.common.TimePeriodOrBuilder getWhiteLightTimeOrBuilder();

  /**
   * <pre>
   *音量 0-255
   * </pre>
   *
   * <code>int32 volume = 3;</code>
   */
  int getVolume();

  /**
   * <pre>
   *活体阈值
   * </pre>
   *
   * <code>float liveness_threshold = 4;</code>
   */
  float getLivenessThreshold();

  /**
   * <pre>
   *质量阈值
   * </pre>
   *
   * <code>float quality_threshold = 5;</code>
   */
  float getQualityThreshold();

  /**
   * <pre>
   *最小人脸像素
   * </pre>
   *
   * <code>int32 minFaceSize = 6;</code>
   */
  int getMinFaceSize();

  /**
   * <pre>
   *最大人脸像素
   * </pre>
   *
   * <code>int32 maxFaceSize = 7;</code>
   */
  int getMaxFaceSize();

  /**
   * <pre>
   *识别间隔 
   * </pre>
   *
   * <code>int32 recogInterval = 8;</code>
   */
  int getRecogInterval();

  /**
   * <pre>
   *陌生人比对次数
   * </pre>
   *
   * <code>int32 strangerTimes = 9;</code>
   */
  int getStrangerTimes();

  /**
   * <pre>
   *离线保存开关
   * </pre>
   *
   * <code>bool saveOffline = 10;</code>
   */
  boolean getSaveOffline();

  /**
   * <pre>
   *图片上报类型 0-不上传 1-人脸图 2-背景图 3-人脸+背景
   * </pre>
   *
   * <code>int32 picUploadType = 11;</code>
   */
  int getPicUploadType();

  /**
   * <pre>
   *水平扩展系数 0-10
   * </pre>
   *
   * <code>int32 hExpandCoff = 12;</code>
   */
  int getHExpandCoff();

  /**
   * <pre>
   *垂直扩展系数 0-10
   * </pre>
   *
   * <code>int32 vExpandCoff = 13;</code>
   */
  int getVExpandCoff();

  /**
   * <pre>
   *图片编码质量 1-100
   * </pre>
   *
   * <code>int32 picQuality = 14;</code>
   */
  int getPicQuality();

  /**
   * <pre>
   *0-**字 1-全名 2-字字* 20200702
   * </pre>
   *
   * <code>int32 nameShowWay = 15;</code>
   */
  int getNameShowWay();

  /**
   * <pre>
   *wifi账号
   * </pre>
   *
   * <code>string wifi_account = 16;</code>
   */
  java.lang.String getWifiAccount();
  /**
   * <pre>
   *wifi账号
   * </pre>
   *
   * <code>string wifi_account = 16;</code>
   */
  com.google.protobuf.ByteString
      getWifiAccountBytes();

  /**
   * <pre>
   *wifi密码
   * </pre>
   *
   * <code>string wifi_passwd = 17;</code>
   */
  java.lang.String getWifiPasswd();
  /**
   * <pre>
   *wifi密码
   * </pre>
   *
   * <code>string wifi_passwd = 17;</code>
   */
  com.google.protobuf.ByteString
      getWifiPasswdBytes();

  /**
   * <pre>
   *设备语言 0-中文 1-英文 20200724 
   * </pre>
   *
   * <code>int32 language = 18;</code>
   */
  int getLanguage();

  /**
   * <pre>
   *0代表摄像头，1 2 3代表模块,1-牛图，2- 塞伯羅斯,3-微光互联，
   * </pre>
   *
   * <code>int32 qrCodeDeviceType = 19;</code>
   */
  int getQrCodeDeviceType();

  /**
   * <pre>
   *鉴权通过后的语言播报类型
   * </pre>
   *
   * <code>int32 successVoiceStyle = 20;</code>
   */
  int getSuccessVoiceStyle();

  /**
   * <pre>
   *鉴权通过后显示的类型
   * </pre>
   *
   * <code>int32 successShowStyle = 21;</code>
   */
  int getSuccessShowStyle();

  /**
   * <pre>
   *人脸框显示比例-海康测温模组使用 20201014
   * </pre>
   *
   * <code>int32 faceRectRate = 22;</code>
   */
  int getFaceRectRate();

  /**
   * <pre>
   *噪声检测开关，默认开 20201021 
   * </pre>
   *
   * <code>bool picNoiseDet = 23;</code>
   */
  boolean getPicNoiseDet();

  /**
   * <pre>
   *人脸角度检测开关，默认开 20201021
   * </pre>
   *
   * <code>bool facePoseDet = 24;</code>
   */
  boolean getFacePoseDet();

  /**
   * <pre>
   *摘口罩识别，默认关 20201021
   * </pre>
   *
   * <code>bool regWithNoMask = 25;</code>
   */
  boolean getRegWithNoMask();
}
