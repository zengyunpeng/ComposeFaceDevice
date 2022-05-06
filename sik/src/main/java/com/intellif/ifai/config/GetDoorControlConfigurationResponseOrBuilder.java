// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: IfDoorControlConfiguration.proto

package com.intellif.ifai.config;

public interface GetDoorControlConfigurationResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:Ifaipb.GetDoorControlConfigurationResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * 门禁算法配置
   * </pre>
   *
   * <code>.Ifaipb.DoorControlAlgConfiguration door_control_alg_configuration = 1;</code>
   */
  boolean hasDoorControlAlgConfiguration();
  /**
   * <pre>
   * 门禁算法配置
   * </pre>
   *
   * <code>.Ifaipb.DoorControlAlgConfiguration door_control_alg_configuration = 1;</code>
   */
  com.intellif.ifai.config.DoorControlAlgConfiguration getDoorControlAlgConfiguration();
  /**
   * <pre>
   * 门禁算法配置
   * </pre>
   *
   * <code>.Ifaipb.DoorControlAlgConfiguration door_control_alg_configuration = 1;</code>
   */
  com.intellif.ifai.config.DoorControlAlgConfigurationOrBuilder getDoorControlAlgConfigurationOrBuilder();

  /**
   * <pre>
   * 门禁基本配置
   * </pre>
   *
   * <code>.Ifaipb.DoorControlConfiguration door_control_configuration = 2;</code>
   */
  boolean hasDoorControlConfiguration();
  /**
   * <pre>
   * 门禁基本配置
   * </pre>
   *
   * <code>.Ifaipb.DoorControlConfiguration door_control_configuration = 2;</code>
   */
  com.intellif.ifai.config.DoorControlConfiguration getDoorControlConfiguration();
  /**
   * <pre>
   * 门禁基本配置
   * </pre>
   *
   * <code>.Ifaipb.DoorControlConfiguration door_control_configuration = 2;</code>
   */
  com.intellif.ifai.config.DoorControlConfigurationOrBuilder getDoorControlConfigurationOrBuilder();

  /**
   * <pre>
   * 门禁红外配置
   * </pre>
   *
   * <code>.Ifaipb.DoorInfraredConfiguration door_infrared_configuration = 3;</code>
   */
  boolean hasDoorInfraredConfiguration();
  /**
   * <pre>
   * 门禁红外配置
   * </pre>
   *
   * <code>.Ifaipb.DoorInfraredConfiguration door_infrared_configuration = 3;</code>
   */
  com.intellif.ifai.config.DoorInfraredConfiguration getDoorInfraredConfiguration();
  /**
   * <pre>
   * 门禁红外配置
   * </pre>
   *
   * <code>.Ifaipb.DoorInfraredConfiguration door_infrared_configuration = 3;</code>
   */
  com.intellif.ifai.config.DoorInfraredConfigurationOrBuilder getDoorInfraredConfigurationOrBuilder();
}
