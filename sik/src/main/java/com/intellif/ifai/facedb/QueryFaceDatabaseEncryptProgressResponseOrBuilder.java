// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: IfFaceDatabase.proto

package com.intellif.ifai.facedb;

public interface QueryFaceDatabaseEncryptProgressResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:Ifaipb.QueryFaceDatabaseEncryptProgressResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   *加密进度，如果加密未完成，则total_size无效
   * </pre>
   *
   * <code>int32 progress = 1;</code>
   */
  int getProgress();

  /**
   * <pre>
   *人脸库文件总大小
   * </pre>
   *
   * <code>int32 total_size = 2;</code>
   */
  int getTotalSize();
}
