// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: IfDoorControlConfiguration.proto

package com.intellif.ifai.config;

public interface OpenDoorSignalExRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:Ifaipb.OpenDoorSignalExRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * 开门标志
   * </pre>
   *
   * <code>int32 open_door = 1;</code>
   */
  int getOpenDoor();

  /**
   * <code>.Ifaipb.OpenDoorSignalExRequest.TemperatureInformation temperature = 2;</code>
   */
  boolean hasTemperature();
  /**
   * <code>.Ifaipb.OpenDoorSignalExRequest.TemperatureInformation temperature = 2;</code>
   */
  com.intellif.ifai.config.OpenDoorSignalExRequest.TemperatureInformation getTemperature();
  /**
   * <code>.Ifaipb.OpenDoorSignalExRequest.TemperatureInformation temperature = 2;</code>
   */
  com.intellif.ifai.config.OpenDoorSignalExRequest.TemperatureInformationOrBuilder getTemperatureOrBuilder();

  /**
   * <pre>
   * 姓名
   * </pre>
   *
   * <code>string name = 3;</code>
   */
  java.lang.String getName();
  /**
   * <pre>
   * 姓名
   * </pre>
   *
   * <code>string name = 3;</code>
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * 工牌号码
   * </pre>
   *
   * <code>string work_number = 4;</code>
   */
  java.lang.String getWorkNumber();
  /**
   * <pre>
   * 工牌号码
   * </pre>
   *
   * <code>string work_number = 4;</code>
   */
  com.google.protobuf.ByteString
      getWorkNumberBytes();

  /**
   * <pre>
   * 提示语
   * </pre>
   *
   * <code>string tip = 5;</code>
   */
  java.lang.String getTip();
  /**
   * <pre>
   * 提示语
   * </pre>
   *
   * <code>string tip = 5;</code>
   */
  com.google.protobuf.ByteString
      getTipBytes();

  /**
   * <pre>
   * 图片
   * </pre>
   *
   * <code>.Ifaipb.Image image = 6;</code>
   */
  boolean hasImage();
  /**
   * <pre>
   * 图片
   * </pre>
   *
   * <code>.Ifaipb.Image image = 6;</code>
   */
  com.intellif.ifai.common.Image getImage();
  /**
   * <pre>
   * 图片
   * </pre>
   *
   * <code>.Ifaipb.Image image = 6;</code>
   */
  com.intellif.ifai.common.ImageOrBuilder getImageOrBuilder();

  /**
   * <pre>
   * 图片地址
   * </pre>
   *
   * <code>string image_url = 7;</code>
   */
  java.lang.String getImageUrl();
  /**
   * <pre>
   * 图片地址
   * </pre>
   *
   * <code>string image_url = 7;</code>
   */
  com.google.protobuf.ByteString
      getImageUrlBytes();

  public com.intellif.ifai.config.OpenDoorSignalExRequest.ImageTypeCase getImageTypeCase();
}
