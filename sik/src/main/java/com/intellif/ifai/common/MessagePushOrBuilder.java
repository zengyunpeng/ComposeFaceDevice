// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: IfCommonType.proto

package com.intellif.ifai.common;

public interface MessagePushOrBuilder extends
    // @@protoc_insertion_point(interface_extends:Ifaipb.MessagePush)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   *推送消息类型
   * </pre>
   *
   * <code>.Ifaipb.MessagePushType type = 1;</code>
   */
  int getTypeValue();
  /**
   * <pre>
   *推送消息类型
   * </pre>
   *
   * <code>.Ifaipb.MessagePushType type = 1;</code>
   */
  com.intellif.ifai.common.MessagePushType getType();

  /**
   * <pre>
   *推送生效起始时间，如没有，则立即生效
   * </pre>
   *
   * <code>.Ifaipb.DateTime start = 2;</code>
   */
  boolean hasStart();
  /**
   * <pre>
   *推送生效起始时间，如没有，则立即生效
   * </pre>
   *
   * <code>.Ifaipb.DateTime start = 2;</code>
   */
  com.intellif.ifai.common.DateTime getStart();
  /**
   * <pre>
   *推送生效起始时间，如没有，则立即生效
   * </pre>
   *
   * <code>.Ifaipb.DateTime start = 2;</code>
   */
  com.intellif.ifai.common.DateTimeOrBuilder getStartOrBuilder();

  /**
   * <pre>
   *推送失效时间，如没有，则永久有效
   * </pre>
   *
   * <code>.Ifaipb.DateTime stop = 3;</code>
   */
  boolean hasStop();
  /**
   * <pre>
   *推送失效时间，如没有，则永久有效
   * </pre>
   *
   * <code>.Ifaipb.DateTime stop = 3;</code>
   */
  com.intellif.ifai.common.DateTime getStop();
  /**
   * <pre>
   *推送失效时间，如没有，则永久有效
   * </pre>
   *
   * <code>.Ifaipb.DateTime stop = 3;</code>
   */
  com.intellif.ifai.common.DateTimeOrBuilder getStopOrBuilder();

  /**
   * <pre>
   *推送显示的文字内容
   * </pre>
   *
   * <code>string message_content = 4;</code>
   */
  java.lang.String getMessageContent();
  /**
   * <pre>
   *推送显示的文字内容
   * </pre>
   *
   * <code>string message_content = 4;</code>
   */
  com.google.protobuf.ByteString
      getMessageContentBytes();
}
