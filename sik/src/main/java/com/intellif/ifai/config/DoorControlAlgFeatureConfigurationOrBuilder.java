// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: IfDoorControlConfiguration.proto

package com.intellif.ifai.config;

public interface DoorControlAlgFeatureConfigurationOrBuilder extends
    // @@protoc_insertion_point(interface_extends:Ifaipb.DoorControlAlgFeatureConfiguration)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * 红外活体开关
   * </pre>
   *
   * <code>.Ifaipb.CommonBool infrared_living = 1;</code>
   */
  boolean hasInfraredLiving();
  /**
   * <pre>
   * 红外活体开关
   * </pre>
   *
   * <code>.Ifaipb.CommonBool infrared_living = 1;</code>
   */
  com.intellif.ifai.common.CommonBool getInfraredLiving();
  /**
   * <pre>
   * 红外活体开关
   * </pre>
   *
   * <code>.Ifaipb.CommonBool infrared_living = 1;</code>
   */
  com.intellif.ifai.common.CommonBoolOrBuilder getInfraredLivingOrBuilder();

  /**
   * <pre>
   * rgb活体开关
   * </pre>
   *
   * <code>.Ifaipb.CommonBool rgb_living = 2;</code>
   */
  boolean hasRgbLiving();
  /**
   * <pre>
   * rgb活体开关
   * </pre>
   *
   * <code>.Ifaipb.CommonBool rgb_living = 2;</code>
   */
  com.intellif.ifai.common.CommonBool getRgbLiving();
  /**
   * <pre>
   * rgb活体开关
   * </pre>
   *
   * <code>.Ifaipb.CommonBool rgb_living = 2;</code>
   */
  com.intellif.ifai.common.CommonBoolOrBuilder getRgbLivingOrBuilder();

  /**
   * <pre>
   * 相似度得分阈值
   * </pre>
   *
   * <code>.Ifaipb.CommonFloat similarity_score_threshold = 3;</code>
   */
  boolean hasSimilarityScoreThreshold();
  /**
   * <pre>
   * 相似度得分阈值
   * </pre>
   *
   * <code>.Ifaipb.CommonFloat similarity_score_threshold = 3;</code>
   */
  com.intellif.ifai.common.CommonFloat getSimilarityScoreThreshold();
  /**
   * <pre>
   * 相似度得分阈值
   * </pre>
   *
   * <code>.Ifaipb.CommonFloat similarity_score_threshold = 3;</code>
   */
  com.intellif.ifai.common.CommonFloatOrBuilder getSimilarityScoreThresholdOrBuilder();

  /**
   * <pre>
   * 质量得分阈值
   * </pre>
   *
   * <code>.Ifaipb.CommonFloat quality_score_threshold = 4;</code>
   */
  boolean hasQualityScoreThreshold();
  /**
   * <pre>
   * 质量得分阈值
   * </pre>
   *
   * <code>.Ifaipb.CommonFloat quality_score_threshold = 4;</code>
   */
  com.intellif.ifai.common.CommonFloat getQualityScoreThreshold();
  /**
   * <pre>
   * 质量得分阈值
   * </pre>
   *
   * <code>.Ifaipb.CommonFloat quality_score_threshold = 4;</code>
   */
  com.intellif.ifai.common.CommonFloatOrBuilder getQualityScoreThresholdOrBuilder();

  /**
   * <pre>
   * 点头抬头角度
   * </pre>
   *
   * <code>.Ifaipb.IntRange pitch = 5;</code>
   */
  boolean hasPitch();
  /**
   * <pre>
   * 点头抬头角度
   * </pre>
   *
   * <code>.Ifaipb.IntRange pitch = 5;</code>
   */
  com.intellif.ifai.common.IntRange getPitch();
  /**
   * <pre>
   * 点头抬头角度
   * </pre>
   *
   * <code>.Ifaipb.IntRange pitch = 5;</code>
   */
  com.intellif.ifai.common.IntRangeOrBuilder getPitchOrBuilder();

  /**
   * <pre>
   * 左右摇头角度
   * </pre>
   *
   * <code>.Ifaipb.IntRange yaw = 6;</code>
   */
  boolean hasYaw();
  /**
   * <pre>
   * 左右摇头角度
   * </pre>
   *
   * <code>.Ifaipb.IntRange yaw = 6;</code>
   */
  com.intellif.ifai.common.IntRange getYaw();
  /**
   * <pre>
   * 左右摇头角度
   * </pre>
   *
   * <code>.Ifaipb.IntRange yaw = 6;</code>
   */
  com.intellif.ifai.common.IntRangeOrBuilder getYawOrBuilder();

  /**
   * <pre>
   * 左右偏头角度
   * </pre>
   *
   * <code>.Ifaipb.IntRange roll = 7;</code>
   */
  boolean hasRoll();
  /**
   * <pre>
   * 左右偏头角度
   * </pre>
   *
   * <code>.Ifaipb.IntRange roll = 7;</code>
   */
  com.intellif.ifai.common.IntRange getRoll();
  /**
   * <pre>
   * 左右偏头角度
   * </pre>
   *
   * <code>.Ifaipb.IntRange roll = 7;</code>
   */
  com.intellif.ifai.common.IntRangeOrBuilder getRollOrBuilder();

  /**
   * <pre>
   * 口罩识别开关
   * </pre>
   *
   * <code>.Ifaipb.CommonBool respirator_switch = 8;</code>
   */
  boolean hasRespiratorSwitch();
  /**
   * <pre>
   * 口罩识别开关
   * </pre>
   *
   * <code>.Ifaipb.CommonBool respirator_switch = 8;</code>
   */
  com.intellif.ifai.common.CommonBool getRespiratorSwitch();
  /**
   * <pre>
   * 口罩识别开关
   * </pre>
   *
   * <code>.Ifaipb.CommonBool respirator_switch = 8;</code>
   */
  com.intellif.ifai.common.CommonBoolOrBuilder getRespiratorSwitchOrBuilder();
}
