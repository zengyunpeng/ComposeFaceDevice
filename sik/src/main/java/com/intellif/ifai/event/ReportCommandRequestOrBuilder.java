// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: IfEvent.proto

package com.intellif.ifai.event;

public interface ReportCommandRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:Ifaipb.ReportCommandRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .Ifaipb.ReportCommandRequest.CommandDescribe commands = 1;</code>
   */
  java.util.List<com.intellif.ifai.event.ReportCommandRequest.CommandDescribe> 
      getCommandsList();
  /**
   * <code>repeated .Ifaipb.ReportCommandRequest.CommandDescribe commands = 1;</code>
   */
  com.intellif.ifai.event.ReportCommandRequest.CommandDescribe getCommands(int index);
  /**
   * <code>repeated .Ifaipb.ReportCommandRequest.CommandDescribe commands = 1;</code>
   */
  int getCommandsCount();
  /**
   * <code>repeated .Ifaipb.ReportCommandRequest.CommandDescribe commands = 1;</code>
   */
  java.util.List<? extends com.intellif.ifai.event.ReportCommandRequest.CommandDescribeOrBuilder> 
      getCommandsOrBuilderList();
  /**
   * <code>repeated .Ifaipb.ReportCommandRequest.CommandDescribe commands = 1;</code>
   */
  com.intellif.ifai.event.ReportCommandRequest.CommandDescribeOrBuilder getCommandsOrBuilder(
      int index);

  /**
   * <code>int64 last_command_id = 2;</code>
   */
  long getLastCommandId();
}