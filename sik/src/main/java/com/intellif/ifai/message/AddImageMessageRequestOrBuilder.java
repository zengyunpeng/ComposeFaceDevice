// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: IfMessage.proto

package com.intellif.ifai.message;

public interface AddImageMessageRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:Ifaipb.AddImageMessageRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   *推送资源id
   * </pre>
   *
   * <code>int64 resource_id = 1;</code>
   */
  long getResourceId();

  /**
   * <pre>
   *播放开始时间
   * </pre>
   *
   * <code>.Ifaipb.DateTime start = 2;</code>
   */
  boolean hasStart();
  /**
   * <pre>
   *播放开始时间
   * </pre>
   *
   * <code>.Ifaipb.DateTime start = 2;</code>
   */
  com.intellif.ifai.common.DateTime getStart();
  /**
   * <pre>
   *播放开始时间
   * </pre>
   *
   * <code>.Ifaipb.DateTime start = 2;</code>
   */
  com.intellif.ifai.common.DateTimeOrBuilder getStartOrBuilder();

  /**
   * <pre>
   *播放结束时间
   * </pre>
   *
   * <code>.Ifaipb.DateTime stop = 3;</code>
   */
  boolean hasStop();
  /**
   * <pre>
   *播放结束时间
   * </pre>
   *
   * <code>.Ifaipb.DateTime stop = 3;</code>
   */
  com.intellif.ifai.common.DateTime getStop();
  /**
   * <pre>
   *播放结束时间
   * </pre>
   *
   * <code>.Ifaipb.DateTime stop = 3;</code>
   */
  com.intellif.ifai.common.DateTimeOrBuilder getStopOrBuilder();

  /**
   * <pre>
   *轮播间隔（默认10s）
   * </pre>
   *
   * <code>int32 interval = 4;</code>
   */
  int getInterval();

  /**
   * <pre>
   * 推送图片（限制最多5张）
   * </pre>
   *
   * <code>repeated .Ifaipb.Image images = 5;</code>
   */
  java.util.List<com.intellif.ifai.common.Image> 
      getImagesList();
  /**
   * <pre>
   * 推送图片（限制最多5张）
   * </pre>
   *
   * <code>repeated .Ifaipb.Image images = 5;</code>
   */
  com.intellif.ifai.common.Image getImages(int index);
  /**
   * <pre>
   * 推送图片（限制最多5张）
   * </pre>
   *
   * <code>repeated .Ifaipb.Image images = 5;</code>
   */
  int getImagesCount();
  /**
   * <pre>
   * 推送图片（限制最多5张）
   * </pre>
   *
   * <code>repeated .Ifaipb.Image images = 5;</code>
   */
  java.util.List<? extends com.intellif.ifai.common.ImageOrBuilder> 
      getImagesOrBuilderList();
  /**
   * <pre>
   * 推送图片（限制最多5张）
   * </pre>
   *
   * <code>repeated .Ifaipb.Image images = 5;</code>
   */
  com.intellif.ifai.common.ImageOrBuilder getImagesOrBuilder(
      int index);
}
