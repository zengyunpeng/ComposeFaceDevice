// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: IfMeeting.proto

package com.intellif.ifai.meeting;

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
    internal_static_Ifaipb_AddMeetingRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Ifaipb_AddMeetingRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Ifaipb_AddMeetingResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Ifaipb_AddMeetingResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Ifaipb_UpdateMeetingRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Ifaipb_UpdateMeetingRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Ifaipb_UpdateMeetingResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Ifaipb_UpdateMeetingResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Ifaipb_AddMeetingPersonRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Ifaipb_AddMeetingPersonRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Ifaipb_AddMeetingPersonResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Ifaipb_AddMeetingPersonResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Ifaipb_CancelMeetingRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Ifaipb_CancelMeetingRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Ifaipb_CancelMeetingResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Ifaipb_CancelMeetingResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Ifaipb_CancelMeetingPersonRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Ifaipb_CancelMeetingPersonRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Ifaipb_CancelMeetingPersonResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Ifaipb_CancelMeetingPersonResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\017IfMeeting.proto\022\006Ifaipb\032\022IfCommonType." +
      "proto\"\304\001\n\021AddMeetingRequest\022\022\n\nmeeting_i" +
      "d\030\001 \001(\003\022\024\n\014meeting_name\030\002 \001(\t\022\031\n\021meeting" +
      "_room_name\030\003 \001(\t\022\037\n\005start\030\004 \001(\0132\020.Ifaipb" +
      ".DateTime\022\036\n\004stop\030\005 \001(\0132\020.Ifaipb.DateTim" +
      "e\022\022\n\nattend_num\030\006 \001(\005\022\025\n\rpromoter_name\030\007" +
      " \001(\t\"\024\n\022AddMeetingResponse\"\307\001\n\024UpdateMee" +
      "tingRequest\022\022\n\nmeeting_id\030\001 \001(\003\022\024\n\014meeti" +
      "ng_name\030\002 \001(\t\022\031\n\021meeting_room_name\030\003 \001(\t" +
      "\022\037\n\005start\030\004 \001(\0132\020.Ifaipb.DateTime\022\036\n\004sto" +
      "p\030\005 \001(\0132\020.Ifaipb.DateTime\022\022\n\nattend_num\030" +
      "\006 \001(\005\022\025\n\rpromoter_name\030\007 \001(\t\"\027\n\025UpdateMe" +
      "etingResponse\"V\n\027AddMeetingPersonRequest" +
      "\022\023\n\013person_type\030\001 \001(\005\022\022\n\nmeeting_id\030\002 \001(" +
      "\003\022\022\n\nperson_ids\030\003 \003(\t\"\032\n\030AddMeetingPerso" +
      "nResponse\"*\n\024CancelMeetingRequest\022\022\n\nmee" +
      "ting_id\030\001 \001(\003\"\027\n\025CancelMeetingResponse\"Y" +
      "\n\032CancelMeetingPersonRequest\022\023\n\013person_t" +
      "ype\030\001 \001(\005\022\022\n\nmeeting_id\030\002 \001(\003\022\022\n\nperson_" +
      "ids\030\003 \003(\t\"\035\n\033CancelMeetingPersonResponse" +
      "2\250\003\n\016MeetingService\022C\n\nAddMeeting\022\031.Ifai" +
      "pb.AddMeetingRequest\032\032.Ifaipb.AddMeeting" +
      "Response\022U\n\020AddMeetingPerson\022\037.Ifaipb.Ad" +
      "dMeetingPersonRequest\032 .Ifaipb.AddMeetin" +
      "gPersonResponse\022L\n\rUpdateMeeting\022\034.Ifaip" +
      "b.UpdateMeetingRequest\032\035.Ifaipb.UpdateMe" +
      "etingResponse\022L\n\rCancelMeeting\022\034.Ifaipb." +
      "CancelMeetingRequest\032\035.Ifaipb.CancelMeet" +
      "ingResponse\022^\n\023CancelMeetingPerson\022\".Ifa" +
      "ipb.CancelMeetingPersonRequest\032#.Ifaipb." +
      "CancelMeetingPersonResponseB*\n\031com.intel" +
      "lif.ifai.meetingB\004IfaiP\001\242\002\004Ifaib\006proto3"
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
    internal_static_Ifaipb_AddMeetingRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_Ifaipb_AddMeetingRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Ifaipb_AddMeetingRequest_descriptor,
        new java.lang.String[] { "MeetingId", "MeetingName", "MeetingRoomName", "Start", "Stop", "AttendNum", "PromoterName", });
    internal_static_Ifaipb_AddMeetingResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_Ifaipb_AddMeetingResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Ifaipb_AddMeetingResponse_descriptor,
        new java.lang.String[] { });
    internal_static_Ifaipb_UpdateMeetingRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_Ifaipb_UpdateMeetingRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Ifaipb_UpdateMeetingRequest_descriptor,
        new java.lang.String[] { "MeetingId", "MeetingName", "MeetingRoomName", "Start", "Stop", "AttendNum", "PromoterName", });
    internal_static_Ifaipb_UpdateMeetingResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_Ifaipb_UpdateMeetingResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Ifaipb_UpdateMeetingResponse_descriptor,
        new java.lang.String[] { });
    internal_static_Ifaipb_AddMeetingPersonRequest_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_Ifaipb_AddMeetingPersonRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Ifaipb_AddMeetingPersonRequest_descriptor,
        new java.lang.String[] { "PersonType", "MeetingId", "PersonIds", });
    internal_static_Ifaipb_AddMeetingPersonResponse_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_Ifaipb_AddMeetingPersonResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Ifaipb_AddMeetingPersonResponse_descriptor,
        new java.lang.String[] { });
    internal_static_Ifaipb_CancelMeetingRequest_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_Ifaipb_CancelMeetingRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Ifaipb_CancelMeetingRequest_descriptor,
        new java.lang.String[] { "MeetingId", });
    internal_static_Ifaipb_CancelMeetingResponse_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_Ifaipb_CancelMeetingResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Ifaipb_CancelMeetingResponse_descriptor,
        new java.lang.String[] { });
    internal_static_Ifaipb_CancelMeetingPersonRequest_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_Ifaipb_CancelMeetingPersonRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Ifaipb_CancelMeetingPersonRequest_descriptor,
        new java.lang.String[] { "PersonType", "MeetingId", "PersonIds", });
    internal_static_Ifaipb_CancelMeetingPersonResponse_descriptor =
      getDescriptor().getMessageTypes().get(9);
    internal_static_Ifaipb_CancelMeetingPersonResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Ifaipb_CancelMeetingPersonResponse_descriptor,
        new java.lang.String[] { });
    com.intellif.ifai.common.Ifai.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
