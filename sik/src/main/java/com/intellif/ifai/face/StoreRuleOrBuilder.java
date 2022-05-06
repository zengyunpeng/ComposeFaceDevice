// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: IfAnalytics.proto

package com.intellif.ifai.face;

public interface StoreRuleOrBuilder extends
    // @@protoc_insertion_point(interface_extends:Ifaipb.StoreRule)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>int32 store_id = 1;</code>
   */
  int getStoreId();

  /**
   * <code>string store_color = 2;</code>
   */
  java.lang.String getStoreColor();
  /**
   * <code>string store_color = 2;</code>
   */
  com.google.protobuf.ByteString
      getStoreColorBytes();

  /**
   * <pre>
   *门店名称
   * </pre>
   *
   * <code>.Ifaipb.CommonString store_name = 3;</code>
   */
  boolean hasStoreName();
  /**
   * <pre>
   *门店名称
   * </pre>
   *
   * <code>.Ifaipb.CommonString store_name = 3;</code>
   */
  com.intellif.ifai.common.CommonString getStoreName();
  /**
   * <pre>
   *门店名称
   * </pre>
   *
   * <code>.Ifaipb.CommonString store_name = 3;</code>
   */
  com.intellif.ifai.common.CommonStringOrBuilder getStoreNameOrBuilder();

  /**
   * <pre>
   *规则
   * </pre>
   *
   * <code>repeated .Ifaipb.SmartAreaRule rules = 4;</code>
   */
  java.util.List<com.intellif.ifai.face.SmartAreaRule> 
      getRulesList();
  /**
   * <pre>
   *规则
   * </pre>
   *
   * <code>repeated .Ifaipb.SmartAreaRule rules = 4;</code>
   */
  com.intellif.ifai.face.SmartAreaRule getRules(int index);
  /**
   * <pre>
   *规则
   * </pre>
   *
   * <code>repeated .Ifaipb.SmartAreaRule rules = 4;</code>
   */
  int getRulesCount();
  /**
   * <pre>
   *规则
   * </pre>
   *
   * <code>repeated .Ifaipb.SmartAreaRule rules = 4;</code>
   */
  java.util.List<? extends com.intellif.ifai.face.SmartAreaRuleOrBuilder> 
      getRulesOrBuilderList();
  /**
   * <pre>
   *规则
   * </pre>
   *
   * <code>repeated .Ifaipb.SmartAreaRule rules = 4;</code>
   */
  com.intellif.ifai.face.SmartAreaRuleOrBuilder getRulesOrBuilder(
      int index);
}