// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: IfDoorControlConfiguration.proto

package com.intellif.ifai.config;

public interface DoorInfraredConfigurationOrBuilder extends
    // @@protoc_insertion_point(interface_extends:Ifaipb.DoorInfraredConfiguration)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * 红外温度报警开关
   * </pre>
   *
   * <code>bool infrared_temperature_switch = 1;</code>
   */
  boolean getInfraredTemperatureSwitch();

  /**
   * <pre>
   * 红外温度报警阈值最小值
   * </pre>
   *
   * <code>float infrared_temperature_minimum = 2;</code>
   */
  float getInfraredTemperatureMinimum();

  /**
   * <pre>
   * 红外温度报警阈值最大值
   * </pre>
   *
   * <code>float infrared_temperature_maximum = 3;</code>
   */
  float getInfraredTemperatureMaximum();

  /**
   * <pre>
   * 红外温度修正参数
   * </pre>
   *
   * <code>float infrared_temperature_adjust = 4;</code>
   */
  float getInfraredTemperatureAdjust();
}