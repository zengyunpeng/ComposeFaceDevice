// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: IfFaceDatabase.proto

package com.intellif.ifai.facedb;

public interface PullFaceRespRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:Ifaipb.PullFaceRespRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * 拉取id
   * </pre>
   *
   * <code>int32 pull_id = 1;</code>
   */
  int getPullId();

  /**
   * <pre>
   * 设备处理结果
   * </pre>
   *
   * <code>repeated .Ifaipb.FaceCommandResponse result = 2;</code>
   */
  java.util.List<com.intellif.ifai.facedb.FaceCommandResponse> 
      getResultList();
  /**
   * <pre>
   * 设备处理结果
   * </pre>
   *
   * <code>repeated .Ifaipb.FaceCommandResponse result = 2;</code>
   */
  com.intellif.ifai.facedb.FaceCommandResponse getResult(int index);
  /**
   * <pre>
   * 设备处理结果
   * </pre>
   *
   * <code>repeated .Ifaipb.FaceCommandResponse result = 2;</code>
   */
  int getResultCount();
  /**
   * <pre>
   * 设备处理结果
   * </pre>
   *
   * <code>repeated .Ifaipb.FaceCommandResponse result = 2;</code>
   */
  java.util.List<? extends com.intellif.ifai.facedb.FaceCommandResponseOrBuilder> 
      getResultOrBuilderList();
  /**
   * <pre>
   * 设备处理结果
   * </pre>
   *
   * <code>repeated .Ifaipb.FaceCommandResponse result = 2;</code>
   */
  com.intellif.ifai.facedb.FaceCommandResponseOrBuilder getResultOrBuilder(
      int index);
}
