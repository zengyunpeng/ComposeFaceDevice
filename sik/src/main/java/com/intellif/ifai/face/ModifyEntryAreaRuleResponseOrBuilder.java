// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: IfAnalytics.proto

package com.intellif.ifai.face;

public interface ModifyEntryAreaRuleResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:Ifaipb.ModifyEntryAreaRuleResponse)
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
}
