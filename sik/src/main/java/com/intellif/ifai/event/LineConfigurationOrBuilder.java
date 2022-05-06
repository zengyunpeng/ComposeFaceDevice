// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: IfEvent.proto

package com.intellif.ifai.event;

public interface LineConfigurationOrBuilder extends
    // @@protoc_insertion_point(interface_extends:Ifaipb.LineConfiguration)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   *起点x坐标
   * </pre>
   *
   * <code>int32 x_l = 1;</code>
   */
  int getXL();

  /**
   * <pre>
   *起点y坐标
   * </pre>
   *
   * <code>int32 y_l = 2;</code>
   */
  int getYL();

  /**
   * <pre>
   *终点x坐标
   * </pre>
   *
   * <code>int32 x_r = 3;</code>
   */
  int getXR();

  /**
   * <pre>
   *终点y坐标
   * </pre>
   *
   * <code>int32 y_r = 4;</code>
   */
  int getYR();

  /**
   * <pre>
   *唯一Id
   * </pre>
   *
   * <code>int32 id = 5;</code>
   */
  int getId();

  /**
   * <pre>
   *正向是否计数，默认不计数，
   * </pre>
   *
   * <code>bool forward_direction = 6;</code>
   */
  boolean getForwardDirection();

  /**
   * <pre>
   *反向是否计数，默认不计数
   * </pre>
   *
   * <code>bool reverse_direction = 7;</code>
   */
  boolean getReverseDirection();
}