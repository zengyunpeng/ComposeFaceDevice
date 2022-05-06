// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: IfThirdVideoIntercom.proto

package com.intellif.ifai.thirdVideoIntercom;

public final class Ifai {
  private Ifai() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Ifaipb_CallRecordRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Ifaipb_CallRecordRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Ifaipb_CallRecordResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Ifaipb_CallRecordResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    String[] descriptorData = {
      "\n\032IfThirdVideoIntercom.proto\022\006Ifaipb\032\022If" +
      "CommonType.proto\"\206\002\n\021CallRecordRequest\022\017" +
      "\n\007call_no\030\001 \001(\t\022\023\n\013door_device\030\002 \001(\t\022!\n\n" +
      "call_image\030\003 \001(\0132\r.Ifaipb.Image\022#\n\014cance" +
      "l_image\030\004 \001(\0132\r.Ifaipb.Image\022\'\n\013answer_t" +
      "ype\030\005 \001(\0162\022.Ifaipb.AnswerType\022 \n\005state\030\006" +
      " \001(\0162\021.Ifaipb.CallState\022\023\n\013answer_time\030\007" +
      " \001(\003\022\020\n\010end_time\030\010 \001(\003\022\021\n\topen_time\030\t \001(" +
      "\003\"\024\n\022CallRecordResponse*\265\001\n\tCallState\022\021\n" +
      "\rUN_KNOW_STATE\020\000\022\017\n\013CALL_CANCEL\020\002\022\020\n\014CAL" +
      "L_TIMEOUT\020\003\022\022\n\016CALL_EXCEPTION\020\004\022\027\n\023CONVE" +
      "RSATION_CANCEL\020\006\022\030\n\024CONVERSATION_TIMEOUT" +
      "\020\007\022\032\n\026CONVERSATION_EXCEPTION\020\010\022\017\n\013CALL_R" +
      "EFUSE\020\t*C\n\nAnswerType\022\020\n\014UN_KNOW_TYPE\020\000\022" +
      "\007\n\003APP\020\001\022\007\n\003WEB\020\002\022\007\n\003PAD\020\003\022\010\n\004ROOM\020\004B5\n$" +
      "com.intellif.ifai.thirdVideoIntercomB\004If" +
      "aiP\001\242\002\004Ifaib\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.intellif.ifai.common.Ifai.getDescriptor(),
        }, assigner);
    internal_static_Ifaipb_CallRecordRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_Ifaipb_CallRecordRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Ifaipb_CallRecordRequest_descriptor,
        new String[] { "CallNo", "DoorDevice", "CallImage", "CancelImage", "AnswerType", "State", "AnswerTime", "EndTime", "OpenTime", });
    internal_static_Ifaipb_CallRecordResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_Ifaipb_CallRecordResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Ifaipb_CallRecordResponse_descriptor,
        new String[] { });
    com.intellif.ifai.common.Ifai.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
