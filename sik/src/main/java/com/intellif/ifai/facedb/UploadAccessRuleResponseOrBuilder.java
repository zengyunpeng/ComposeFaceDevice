// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: IfFaceDatabase.proto

package com.intellif.ifai.facedb;

public interface UploadAccessRuleResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:Ifaipb.UploadAccessRuleResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   *新增的规则
   * </pre>
   *
   * <code>repeated .Ifaipb.AccessRule add_access_rule = 1;</code>
   */
  java.util.List<com.intellif.ifai.common.AccessRule> 
      getAddAccessRuleList();
  /**
   * <pre>
   *新增的规则
   * </pre>
   *
   * <code>repeated .Ifaipb.AccessRule add_access_rule = 1;</code>
   */
  com.intellif.ifai.common.AccessRule getAddAccessRule(int index);
  /**
   * <pre>
   *新增的规则
   * </pre>
   *
   * <code>repeated .Ifaipb.AccessRule add_access_rule = 1;</code>
   */
  int getAddAccessRuleCount();
  /**
   * <pre>
   *新增的规则
   * </pre>
   *
   * <code>repeated .Ifaipb.AccessRule add_access_rule = 1;</code>
   */
  java.util.List<? extends com.intellif.ifai.common.AccessRuleOrBuilder> 
      getAddAccessRuleOrBuilderList();
  /**
   * <pre>
   *新增的规则
   * </pre>
   *
   * <code>repeated .Ifaipb.AccessRule add_access_rule = 1;</code>
   */
  com.intellif.ifai.common.AccessRuleOrBuilder getAddAccessRuleOrBuilder(
      int index);

  /**
   * <pre>
   *修改的规则
   * </pre>
   *
   * <code>repeated .Ifaipb.AccessRule modify_access_rule = 2;</code>
   */
  java.util.List<com.intellif.ifai.common.AccessRule> 
      getModifyAccessRuleList();
  /**
   * <pre>
   *修改的规则
   * </pre>
   *
   * <code>repeated .Ifaipb.AccessRule modify_access_rule = 2;</code>
   */
  com.intellif.ifai.common.AccessRule getModifyAccessRule(int index);
  /**
   * <pre>
   *修改的规则
   * </pre>
   *
   * <code>repeated .Ifaipb.AccessRule modify_access_rule = 2;</code>
   */
  int getModifyAccessRuleCount();
  /**
   * <pre>
   *修改的规则
   * </pre>
   *
   * <code>repeated .Ifaipb.AccessRule modify_access_rule = 2;</code>
   */
  java.util.List<? extends com.intellif.ifai.common.AccessRuleOrBuilder> 
      getModifyAccessRuleOrBuilderList();
  /**
   * <pre>
   *修改的规则
   * </pre>
   *
   * <code>repeated .Ifaipb.AccessRule modify_access_rule = 2;</code>
   */
  com.intellif.ifai.common.AccessRuleOrBuilder getModifyAccessRuleOrBuilder(
      int index);

  /**
   * <pre>
   *删除的规则
   * </pre>
   *
   * <code>repeated int32 rule_ids = 3;</code>
   */
  java.util.List<java.lang.Integer> getRuleIdsList();
  /**
   * <pre>
   *删除的规则
   * </pre>
   *
   * <code>repeated int32 rule_ids = 3;</code>
   */
  int getRuleIdsCount();
  /**
   * <pre>
   *删除的规则
   * </pre>
   *
   * <code>repeated int32 rule_ids = 3;</code>
   */
  int getRuleIds(int index);
}
