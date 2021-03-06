// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: IfVideoIntercom.proto

package com.intellif.ifai.videoIntercom;

public interface HangUpRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:Ifaipb.HangUpRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   *呼叫房号id
   * </pre>
   *
   * <code>string room_id = 1;</code>
   */
  String getRoomId();
  /**
   * <pre>
   *呼叫房号id
   * </pre>
   *
   * <code>string room_id = 1;</code>
   */
  com.google.protobuf.ByteString
      getRoomIdBytes();

  /**
   * <pre>
   *抓拍图片
   * </pre>
   *
   * <code>.Ifaipb.Image image = 2;</code>
   */
  boolean hasImage();
  /**
   * <pre>
   *抓拍图片
   * </pre>
   *
   * <code>.Ifaipb.Image image = 2;</code>
   */
  com.intellif.ifai.common.Image getImage();
  /**
   * <pre>
   *抓拍图片
   * </pre>
   *
   * <code>.Ifaipb.Image image = 2;</code>
   */
  com.intellif.ifai.common.ImageOrBuilder getImageOrBuilder();

  /**
   * <pre>
   *记录id
   * </pre>
   *
   * <code>.Ifaipb.CommonInt record_id = 3;</code>
   */
  boolean hasRecordId();
  /**
   * <pre>
   *记录id
   * </pre>
   *
   * <code>.Ifaipb.CommonInt record_id = 3;</code>
   */
  com.intellif.ifai.common.CommonInt getRecordId();
  /**
   * <pre>
   *记录id
   * </pre>
   *
   * <code>.Ifaipb.CommonInt record_id = 3;</code>
   */
  com.intellif.ifai.common.CommonIntOrBuilder getRecordIdOrBuilder();
}
