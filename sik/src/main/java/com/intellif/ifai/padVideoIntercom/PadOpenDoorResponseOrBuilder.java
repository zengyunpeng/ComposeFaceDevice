// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: IfPadVideoIntercom.proto

package com.intellif.ifai.padVideoIntercom;

public interface PadOpenDoorResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:Ifaipb.PadOpenDoorResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   *记录id
   * </pre>
   *
   * <code>.Ifaipb.CommonInt record_id = 1;</code>
   */
  boolean hasRecordId();
  /**
   * <pre>
   *记录id
   * </pre>
   *
   * <code>.Ifaipb.CommonInt record_id = 1;</code>
   */
  com.intellif.ifai.common.CommonInt getRecordId();
  /**
   * <pre>
   *记录id
   * </pre>
   *
   * <code>.Ifaipb.CommonInt record_id = 1;</code>
   */
  com.intellif.ifai.common.CommonIntOrBuilder getRecordIdOrBuilder();

  /**
   * <pre>
   *操作结果返回码
   * </pre>
   *
   * <code>.Ifaipb.ResultCode result_code = 2;</code>
   */
  int getResultCodeValue();
  /**
   * <pre>
   *操作结果返回码
   * </pre>
   *
   * <code>.Ifaipb.ResultCode result_code = 2;</code>
   */
  ResultCode getResultCode();
}
