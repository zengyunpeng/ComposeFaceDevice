// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: IfVideoIntercom.proto

package com.intellif.ifai.videoIntercom;

public interface OneClickCallResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:Ifaipb.OneClickCallResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   *通话记录id
   * </pre>
   *
   * <code>.Ifaipb.CommonInt record_id = 1;</code>
   */
  boolean hasRecordId();
  /**
   * <pre>
   *通话记录id
   * </pre>
   *
   * <code>.Ifaipb.CommonInt record_id = 1;</code>
   */
  com.intellif.ifai.common.CommonInt getRecordId();
  /**
   * <pre>
   *通话记录id
   * </pre>
   *
   * <code>.Ifaipb.CommonInt record_id = 1;</code>
   */
  com.intellif.ifai.common.CommonIntOrBuilder getRecordIdOrBuilder();

  /**
   * <pre>
   *领导办公室名称
   * </pre>
   *
   * <code>string roomName = 2;</code>
   */
  String getRoomName();
  /**
   * <pre>
   *领导办公室名称
   * </pre>
   *
   * <code>string roomName = 2;</code>
   */
  com.google.protobuf.ByteString
      getRoomNameBytes();

  /**
   * <pre>
   *操作结果返回码
   * </pre>
   *
   * <code>.Ifaipb.CallCode result_code = 3;</code>
   */
  int getResultCodeValue();
  /**
   * <pre>
   *操作结果返回码
   * </pre>
   *
   * <code>.Ifaipb.CallCode result_code = 3;</code>
   */
  CallCode getResultCode();
}