// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: IfDoorControlConfiguration.proto

package com.intellif.ifai.config;

public interface DoorControlConfigurationOrBuilder extends
    // @@protoc_insertion_point(interface_extends:Ifaipb.DoorControlConfiguration)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * 人员通过模式
   * </pre>
   *
   * <code>.Ifaipb.PassThroughModel pass_through_model = 1;</code>
   */
  boolean hasPassThroughModel();
  /**
   * <pre>
   * 人员通过模式
   * </pre>
   *
   * <code>.Ifaipb.PassThroughModel pass_through_model = 1;</code>
   */
  com.intellif.ifai.common.PassThroughModel getPassThroughModel();
  /**
   * <pre>
   * 人员通过模式
   * </pre>
   *
   * <code>.Ifaipb.PassThroughModel pass_through_model = 1;</code>
   */
  com.intellif.ifai.common.PassThroughModelOrBuilder getPassThroughModelOrBuilder();

  /**
   * <pre>
   * 开门信号模式
   * </pre>
   *
   * <code>.Ifaipb.DoorControlModel door_control_model = 2;</code>
   */
  int getDoorControlModelValue();
  /**
   * <pre>
   * 开门信号模式
   * </pre>
   *
   * <code>.Ifaipb.DoorControlModel door_control_model = 2;</code>
   */
  com.intellif.ifai.common.DoorControlModel getDoorControlModel();

  /**
   * <pre>
   * 开门信号持续时间（毫秒）
   * </pre>
   *
   * <code>int32 signal_duration = 3;</code>
   */
  int getSignalDuration();

  /**
   * <pre>
   * 语音提示开关
   * </pre>
   *
   * <code>bool voice_prompt = 4;</code>
   */
  boolean getVoicePrompt();

  /**
   * <pre>
   * 固定提示语
   * </pre>
   *
   * <code>string fixed_prompt = 5;</code>
   */
  java.lang.String getFixedPrompt();
  /**
   * <pre>
   * 固定提示语
   * </pre>
   *
   * <code>string fixed_prompt = 5;</code>
   */
  com.google.protobuf.ByteString
      getFixedPromptBytes();

  /**
   * <pre>
   * 设备logo
   * </pre>
   *
   * <code>.Ifaipb.Image logo = 6;</code>
   */
  boolean hasLogo();
  /**
   * <pre>
   * 设备logo
   * </pre>
   *
   * <code>.Ifaipb.Image logo = 6;</code>
   */
  com.intellif.ifai.common.Image getLogo();
  /**
   * <pre>
   * 设备logo
   * </pre>
   *
   * <code>.Ifaipb.Image logo = 6;</code>
   */
  com.intellif.ifai.common.ImageOrBuilder getLogoOrBuilder();

  /**
   * <pre>
   * 语音提示文件
   * </pre>
   *
   * <code>bytes voice_file = 7;</code>
   */
  com.google.protobuf.ByteString getVoiceFile();

  /**
   * <pre>
   *开门密码
   * </pre>
   *
   * <code>string password = 8;</code>
   */
  java.lang.String getPassword();
  /**
   * <pre>
   *开门密码
   * </pre>
   *
   * <code>string password = 8;</code>
   */
  com.google.protobuf.ByteString
      getPasswordBytes();

  /**
   * <pre>
   *呼叫超时时长
   * </pre>
   *
   * <code>int32 over_time = 9;</code>
   */
  int getOverTime();

  /**
   * <code>bool enabled_pwd = 10;</code>
   */
  boolean getEnabledPwd();
}