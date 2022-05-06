// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: IfFaceDatabase.proto

package com.intellif.ifai.facedb;

public interface StartFaceDatabaseImportRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:Ifaipb.StartFaceDatabaseImportRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   *文件总大小
   * </pre>
   *
   * <code>int32 total_size = 1;</code>
   */
  int getTotalSize();

  /**
   * <pre>
   *分包个数
   * </pre>
   *
   * <code>int32 total_packet_count = 2;</code>
   */
  int getTotalPacketCount();

  /**
   * <pre>
   *分包大小
   * </pre>
   *
   * <code>int32 per_packet_size = 3;</code>
   */
  int getPerPacketSize();

  /**
   * <pre>
   *人脸库解密密码，如果不提供，则表示人脸库没有加密
   * </pre>
   *
   * <code>string password = 4;</code>
   */
  java.lang.String getPassword();
  /**
   * <pre>
   *人脸库解密密码，如果不提供，则表示人脸库没有加密
   * </pre>
   *
   * <code>string password = 4;</code>
   */
  com.google.protobuf.ByteString
      getPasswordBytes();
}