// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: IfAnalytics.proto

package com.intellif.ifai.face;

public interface ModifyDisappearResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:Ifaipb.ModifyDisappearResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>int32 rule_id = 1;</code>
   */
  int getRuleId();

  /**
   * <code>repeated .Ifaipb.Point disappear = 2;</code>
   */
  java.util.List<com.intellif.ifai.common.Point> 
      getDisappearList();
  /**
   * <code>repeated .Ifaipb.Point disappear = 2;</code>
   */
  com.intellif.ifai.common.Point getDisappear(int index);
  /**
   * <code>repeated .Ifaipb.Point disappear = 2;</code>
   */
  int getDisappearCount();
  /**
   * <code>repeated .Ifaipb.Point disappear = 2;</code>
   */
  java.util.List<? extends com.intellif.ifai.common.PointOrBuilder> 
      getDisappearOrBuilderList();
  /**
   * <code>repeated .Ifaipb.Point disappear = 2;</code>
   */
  com.intellif.ifai.common.PointOrBuilder getDisappearOrBuilder(
      int index);
}
