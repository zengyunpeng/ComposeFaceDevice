// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: IfCommonType.proto

package com.intellif.ifai.common;

public interface WeekdayTimePeriodOrBuilder extends
    // @@protoc_insertion_point(interface_extends:Ifaipb.WeekdayTimePeriod)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.Ifaipb.Weekday day = 1;</code>
   */
  int getDayValue();
  /**
   * <code>.Ifaipb.Weekday day = 1;</code>
   */
  com.intellif.ifai.common.Weekday getDay();

  /**
   * <code>repeated .Ifaipb.TimePeriod period = 2;</code>
   */
  java.util.List<com.intellif.ifai.common.TimePeriod> 
      getPeriodList();
  /**
   * <code>repeated .Ifaipb.TimePeriod period = 2;</code>
   */
  com.intellif.ifai.common.TimePeriod getPeriod(int index);
  /**
   * <code>repeated .Ifaipb.TimePeriod period = 2;</code>
   */
  int getPeriodCount();
  /**
   * <code>repeated .Ifaipb.TimePeriod period = 2;</code>
   */
  java.util.List<? extends com.intellif.ifai.common.TimePeriodOrBuilder> 
      getPeriodOrBuilderList();
  /**
   * <code>repeated .Ifaipb.TimePeriod period = 2;</code>
   */
  com.intellif.ifai.common.TimePeriodOrBuilder getPeriodOrBuilder(
      int index);
}