// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: IfAnalytics.proto

package com.intellif.ifai.face;

public interface setRulePassRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:Ifaipb.setRulePassRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>int32 rule_id = 1;</code>
   */
  int getRuleId();

  /**
   * <code>repeated .Ifaipb.Point pass = 2;</code>
   */
  java.util.List<com.intellif.ifai.common.Point> 
      getPassList();
  /**
   * <code>repeated .Ifaipb.Point pass = 2;</code>
   */
  com.intellif.ifai.common.Point getPass(int index);
  /**
   * <code>repeated .Ifaipb.Point pass = 2;</code>
   */
  int getPassCount();
  /**
   * <code>repeated .Ifaipb.Point pass = 2;</code>
   */
  java.util.List<? extends com.intellif.ifai.common.PointOrBuilder> 
      getPassOrBuilderList();
  /**
   * <code>repeated .Ifaipb.Point pass = 2;</code>
   */
  com.intellif.ifai.common.PointOrBuilder getPassOrBuilder(
      int index);
}
