// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: IfFaceDatabase.proto

package com.intellif.ifai.facedb;

public interface PullFaceResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:Ifaipb.PullFaceResponse)
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
   * 本次拉取是否结束
   * </pre>
   *
   * <code>bool pull_finished = 2;</code>
   */
  boolean getPullFinished();

  /**
   * <pre>
   * 下一次拉取开始位置
   * </pre>
   *
   * <code>int32 pull_next_begin = 3;</code>
   */
  int getPullNextBegin();

  /**
   * <pre>
   * 拉取命令
   * </pre>
   *
   * <code>repeated .Ifaipb.FaceCommand commands = 4;</code>
   */
  java.util.List<com.intellif.ifai.facedb.FaceCommand> 
      getCommandsList();
  /**
   * <pre>
   * 拉取命令
   * </pre>
   *
   * <code>repeated .Ifaipb.FaceCommand commands = 4;</code>
   */
  com.intellif.ifai.facedb.FaceCommand getCommands(int index);
  /**
   * <pre>
   * 拉取命令
   * </pre>
   *
   * <code>repeated .Ifaipb.FaceCommand commands = 4;</code>
   */
  int getCommandsCount();
  /**
   * <pre>
   * 拉取命令
   * </pre>
   *
   * <code>repeated .Ifaipb.FaceCommand commands = 4;</code>
   */
  java.util.List<? extends com.intellif.ifai.facedb.FaceCommandOrBuilder> 
      getCommandsOrBuilderList();
  /**
   * <pre>
   * 拉取命令
   * </pre>
   *
   * <code>repeated .Ifaipb.FaceCommand commands = 4;</code>
   */
  com.intellif.ifai.facedb.FaceCommandOrBuilder getCommandsOrBuilder(
      int index);
}
