// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: IfAnalytics.proto

package com.intellif.ifai.face;

public interface SmartAreaRuleOrBuilder extends
    // @@protoc_insertion_point(interface_extends:Ifaipb.SmartAreaRule)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   *id
   * </pre>
   *
   * <code>int32 rule_id = 1;</code>
   */
  int getRuleId();

  /**
   * <pre>
   *名称
   * </pre>
   *
   * <code>.Ifaipb.CommonString rule_name = 2;</code>
   */
  boolean hasRuleName();
  /**
   * <pre>
   *名称
   * </pre>
   *
   * <code>.Ifaipb.CommonString rule_name = 2;</code>
   */
  com.intellif.ifai.common.CommonString getRuleName();
  /**
   * <pre>
   *名称
   * </pre>
   *
   * <code>.Ifaipb.CommonString rule_name = 2;</code>
   */
  com.intellif.ifai.common.CommonStringOrBuilder getRuleNameOrBuilder();

  /**
   * <code>.Ifaipb.EntryArea entry = 3;</code>
   */
  boolean hasEntry();
  /**
   * <code>.Ifaipb.EntryArea entry = 3;</code>
   */
  com.intellif.ifai.face.EntryArea getEntry();
  /**
   * <code>.Ifaipb.EntryArea entry = 3;</code>
   */
  com.intellif.ifai.face.EntryAreaOrBuilder getEntryOrBuilder();

  /**
   * <code>repeated .Ifaipb.Point pass = 4;</code>
   */
  java.util.List<com.intellif.ifai.common.Point> 
      getPassList();
  /**
   * <code>repeated .Ifaipb.Point pass = 4;</code>
   */
  com.intellif.ifai.common.Point getPass(int index);
  /**
   * <code>repeated .Ifaipb.Point pass = 4;</code>
   */
  int getPassCount();
  /**
   * <code>repeated .Ifaipb.Point pass = 4;</code>
   */
  java.util.List<? extends com.intellif.ifai.common.PointOrBuilder> 
      getPassOrBuilderList();
  /**
   * <code>repeated .Ifaipb.Point pass = 4;</code>
   */
  com.intellif.ifai.common.PointOrBuilder getPassOrBuilder(
      int index);

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

  /**
   * <code>int32 width_disappear = 7;</code>
   */
  int getWidthDisappear();

  /**
   * <code>repeated .Ifaipb.Point disappear = 8;</code>
   */
  java.util.List<com.intellif.ifai.common.Point> 
      getDisappearList();
  /**
   * <code>repeated .Ifaipb.Point disappear = 8;</code>
   */
  com.intellif.ifai.common.Point getDisappear(int index);
  /**
   * <code>repeated .Ifaipb.Point disappear = 8;</code>
   */
  int getDisappearCount();
  /**
   * <code>repeated .Ifaipb.Point disappear = 8;</code>
   */
  java.util.List<? extends com.intellif.ifai.common.PointOrBuilder> 
      getDisappearOrBuilderList();
  /**
   * <code>repeated .Ifaipb.Point disappear = 8;</code>
   */
  com.intellif.ifai.common.PointOrBuilder getDisappearOrBuilder(
      int index);

  /**
   * <pre>
   *门店两个点
   * </pre>
   *
   * <code>repeated .Ifaipb.Point door = 9;</code>
   */
  java.util.List<com.intellif.ifai.common.Point> 
      getDoorList();
  /**
   * <pre>
   *门店两个点
   * </pre>
   *
   * <code>repeated .Ifaipb.Point door = 9;</code>
   */
  com.intellif.ifai.common.Point getDoor(int index);
  /**
   * <pre>
   *门店两个点
   * </pre>
   *
   * <code>repeated .Ifaipb.Point door = 9;</code>
   */
  int getDoorCount();
  /**
   * <pre>
   *门店两个点
   * </pre>
   *
   * <code>repeated .Ifaipb.Point door = 9;</code>
   */
  java.util.List<? extends com.intellif.ifai.common.PointOrBuilder> 
      getDoorOrBuilderList();
  /**
   * <pre>
   *门店两个点
   * </pre>
   *
   * <code>repeated .Ifaipb.Point door = 9;</code>
   */
  com.intellif.ifai.common.PointOrBuilder getDoorOrBuilder(
      int index);

  /**
   * <code>int32 reverse_flag = 10;</code>
   */
  int getReverseFlag();
}
