// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: IfAnalytics.proto

package com.intellif.ifai.face;

public interface InitEntryAreaRuleResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:Ifaipb.InitEntryAreaRuleResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>int32 rule_id = 1;</code>
   */
  int getRuleId();

  /**
   * <code>.Ifaipb.EntryArea entry = 2;</code>
   */
  boolean hasEntry();
  /**
   * <code>.Ifaipb.EntryArea entry = 2;</code>
   */
  com.intellif.ifai.face.EntryArea getEntry();
  /**
   * <code>.Ifaipb.EntryArea entry = 2;</code>
   */
  com.intellif.ifai.face.EntryAreaOrBuilder getEntryOrBuilder();

  /**
   * <code>repeated .Ifaipb.Point disappear = 3;</code>
   */
  java.util.List<com.intellif.ifai.common.Point> 
      getDisappearList();
  /**
   * <code>repeated .Ifaipb.Point disappear = 3;</code>
   */
  com.intellif.ifai.common.Point getDisappear(int index);
  /**
   * <code>repeated .Ifaipb.Point disappear = 3;</code>
   */
  int getDisappearCount();
  /**
   * <code>repeated .Ifaipb.Point disappear = 3;</code>
   */
  java.util.List<? extends com.intellif.ifai.common.PointOrBuilder> 
      getDisappearOrBuilderList();
  /**
   * <code>repeated .Ifaipb.Point disappear = 3;</code>
   */
  com.intellif.ifai.common.PointOrBuilder getDisappearOrBuilder(
      int index);

  /**
   * <pre>
   *id
   * </pre>
   *
   * <code>int32 width_disappear = 4;</code>
   */
  int getWidthDisappear();

  /**
   * <pre>
   *a宽度
   * </pre>
   *
   * <code>int32 width_a = 5;</code>
   */
  int getWidthA();

  /**
   * <pre>
   *b宽度
   * </pre>
   *
   * <code>int32 width_b = 6;</code>
   */
  int getWidthB();
}
