// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: IfDoorControlConfiguration.proto

package com.intellif.ifai.config;

public interface SetDoorControlFeatureConfigurationRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:Ifaipb.SetDoorControlFeatureConfigurationRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * 门禁算法配置
   * </pre>
   *
   * <code>.Ifaipb.DoorControlAlgFeatureConfiguration door_control_alg_configuration = 1;</code>
   */
  boolean hasDoorControlAlgConfiguration();
  /**
   * <pre>
   * 门禁算法配置
   * </pre>
   *
   * <code>.Ifaipb.DoorControlAlgFeatureConfiguration door_control_alg_configuration = 1;</code>
   */
  com.intellif.ifai.config.DoorControlAlgFeatureConfiguration getDoorControlAlgConfiguration();
  /**
   * <pre>
   * 门禁算法配置
   * </pre>
   *
   * <code>.Ifaipb.DoorControlAlgFeatureConfiguration door_control_alg_configuration = 1;</code>
   */
  com.intellif.ifai.config.DoorControlAlgFeatureConfigurationOrBuilder getDoorControlAlgConfigurationOrBuilder();

  /**
   * <pre>
   * 门禁基本配置
   * </pre>
   *
   * <code>.Ifaipb.DoorControlFeatureConfiguration door_control_configuration = 2;</code>
   */
  boolean hasDoorControlConfiguration();
  /**
   * <pre>
   * 门禁基本配置
   * </pre>
   *
   * <code>.Ifaipb.DoorControlFeatureConfiguration door_control_configuration = 2;</code>
   */
  com.intellif.ifai.config.DoorControlFeatureConfiguration getDoorControlConfiguration();
  /**
   * <pre>
   * 门禁基本配置
   * </pre>
   *
   * <code>.Ifaipb.DoorControlFeatureConfiguration door_control_configuration = 2;</code>
   */
  com.intellif.ifai.config.DoorControlFeatureConfigurationOrBuilder getDoorControlConfigurationOrBuilder();

  /**
   * <pre>
   * 门禁红外配置
   * </pre>
   *
   * <code>.Ifaipb.DoorInfraredFeatureConfiguration door_infrared_configuration = 3;</code>
   */
  boolean hasDoorInfraredConfiguration();
  /**
   * <pre>
   * 门禁红外配置
   * </pre>
   *
   * <code>.Ifaipb.DoorInfraredFeatureConfiguration door_infrared_configuration = 3;</code>
   */
  com.intellif.ifai.config.DoorInfraredFeatureConfiguration getDoorInfraredConfiguration();
  /**
   * <pre>
   * 门禁红外配置
   * </pre>
   *
   * <code>.Ifaipb.DoorInfraredFeatureConfiguration door_infrared_configuration = 3;</code>
   */
  com.intellif.ifai.config.DoorInfraredFeatureConfigurationOrBuilder getDoorInfraredConfigurationOrBuilder();
}
