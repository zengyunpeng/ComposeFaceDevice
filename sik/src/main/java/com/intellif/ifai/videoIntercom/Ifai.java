// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: IfVideoIntercom.proto

package com.intellif.ifai.videoIntercom;

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
    internal_static_Ifaipb_CallRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Ifaipb_CallRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Ifaipb_CallResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Ifaipb_CallResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Ifaipb_CallCancelRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Ifaipb_CallCancelRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Ifaipb_CallCancelResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Ifaipb_CallCancelResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Ifaipb_CallTimeOutRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Ifaipb_CallTimeOutRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Ifaipb_CallTimeOutResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Ifaipb_CallTimeOutResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Ifaipb_HangUpRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Ifaipb_HangUpRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Ifaipb_HangUpResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Ifaipb_HangUpResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Ifaipb_CallStateRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Ifaipb_CallStateRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Ifaipb_CallStateResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Ifaipb_CallStateResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Ifaipb_OneClickCallRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Ifaipb_OneClickCallRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Ifaipb_OneClickCallResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Ifaipb_OneClickCallResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Ifaipb_OneClickCallCancelRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Ifaipb_OneClickCallCancelRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Ifaipb_OneClickCallCancelResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Ifaipb_OneClickCallCancelResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Ifaipb_OneClickCallHangUpRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Ifaipb_OneClickCallHangUpRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Ifaipb_OneClickCallHangUpResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Ifaipb_OneClickCallHangUpResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    String[] descriptorData = {
      "\n\025IfVideoIntercom.proto\022\006Ifaipb\032\022IfCommo" +
      "nType.proto\"<\n\013CallRequest\022\017\n\007room_id\030\001 " +
      "\001(\t\022\034\n\005image\030\002 \001(\0132\r.Ifaipb.Image\"Y\n\014Cal" +
      "lResponse\022$\n\trecord_id\030\001 \001(\0132\021.Ifaipb.Co" +
      "mmonInt\022#\n\tcall_code\030\002 \001(\0162\020.Ifaipb.Call" +
      "Code\"h\n\021CallCancelRequest\022\017\n\007room_id\030\001 \001" +
      "(\t\022\034\n\005image\030\002 \001(\0132\r.Ifaipb.Image\022$\n\treco" +
      "rd_id\030\003 \001(\0132\021.Ifaipb.CommonInt\"9\n\022CallCa" +
      "ncelResponse\022#\n\tcall_code\030\001 \001(\0162\020.Ifaipb" +
      ".CallCode\"i\n\022CallTimeOutRequest\022\017\n\007room_" +
      "id\030\001 \001(\t\022\034\n\005image\030\002 \001(\0132\r.Ifaipb.Image\022$" +
      "\n\trecord_id\030\003 \001(\0132\021.Ifaipb.CommonInt\":\n\023" +
      "CallTimeOutResponse\022#\n\tcall_code\030\001 \001(\0162\020" +
      ".Ifaipb.CallCode\"d\n\rHangUpRequest\022\017\n\007roo" +
      "m_id\030\001 \001(\t\022\034\n\005image\030\002 \001(\0132\r.Ifaipb.Image" +
      "\022$\n\trecord_id\030\003 \001(\0132\021.Ifaipb.CommonInt\"5" +
      "\n\016HangUpResponse\022#\n\tcall_code\030\001 \001(\0162\020.If" +
      "aipb.CallCode\"7\n\020CallStateRequest\022#\n\tcal" +
      "l_code\030\001 \001(\0162\020.Ifaipb.CallCode\"\023\n\021CallSt" +
      "ateResponse\"E\n\023OneClickCallRequest\022\020\n\010de" +
      "viceId\030\001 \001(\t\022\034\n\005image\030\002 \001(\0132\r.Ifaipb.Ima" +
      "ge\"u\n\024OneClickCallResponse\022$\n\trecord_id\030" +
      "\001 \001(\0132\021.Ifaipb.CommonInt\022\020\n\010roomName\030\002 \001" +
      "(\t\022%\n\013result_code\030\003 \001(\0162\020.Ifaipb.CallCod" +
      "e\"q\n\031OneClickCallCancelRequest\022\020\n\010device" +
      "Id\030\001 \001(\t\022$\n\trecord_id\030\002 \001(\0132\021.Ifaipb.Com" +
      "monInt\022\034\n\005image\030\003 \001(\0132\r.Ifaipb.Image\"C\n\032" +
      "OneClickCallCancelResponse\022%\n\013result_cod" +
      "e\030\001 \001(\0162\020.Ifaipb.CallCode\"q\n\031OneClickCal" +
      "lHangUpRequest\022\020\n\010deviceId\030\001 \001(\t\022$\n\treco" +
      "rd_id\030\002 \001(\0132\021.Ifaipb.CommonInt\022\034\n\005image\030" +
      "\003 \001(\0132\r.Ifaipb.Image\"C\n\032OneClickCallHang" +
      "UpResponse\022%\n\013result_code\030\001 \001(\0162\020.Ifaipb" +
      ".CallCode*\311\001\n\010CallCode\022\013\n\007Success\020\000\022\n\n\006R" +
      "efuse\020\001\022\024\n\020CallServiceError\020\002\022\030\n\024Platfor" +
      "mServiceError\020\003\022\017\n\013NotFindRoom\020\004\022\013\n\007Call" +
      "ing\020\005\022\022\n\016DeviceNotExits\020\006\022\024\n\020RelationNot" +
      "Exits\020\007\022\022\n\016PersonNotExits\020\010\022\030\n\024RecordSta" +
      "teException\020\tB0\n\037com.intellif.ifai.video" +
      "IntercomB\004IfaiP\001\242\002\004Ifaib\006proto3"
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
    internal_static_Ifaipb_CallRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_Ifaipb_CallRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Ifaipb_CallRequest_descriptor,
        new String[] { "RoomId", "Image", });
    internal_static_Ifaipb_CallResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_Ifaipb_CallResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Ifaipb_CallResponse_descriptor,
        new String[] { "RecordId", "CallCode", });
    internal_static_Ifaipb_CallCancelRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_Ifaipb_CallCancelRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Ifaipb_CallCancelRequest_descriptor,
        new String[] { "RoomId", "Image", "RecordId", });
    internal_static_Ifaipb_CallCancelResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_Ifaipb_CallCancelResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Ifaipb_CallCancelResponse_descriptor,
        new String[] { "CallCode", });
    internal_static_Ifaipb_CallTimeOutRequest_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_Ifaipb_CallTimeOutRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Ifaipb_CallTimeOutRequest_descriptor,
        new String[] { "RoomId", "Image", "RecordId", });
    internal_static_Ifaipb_CallTimeOutResponse_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_Ifaipb_CallTimeOutResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Ifaipb_CallTimeOutResponse_descriptor,
        new String[] { "CallCode", });
    internal_static_Ifaipb_HangUpRequest_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_Ifaipb_HangUpRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Ifaipb_HangUpRequest_descriptor,
        new String[] { "RoomId", "Image", "RecordId", });
    internal_static_Ifaipb_HangUpResponse_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_Ifaipb_HangUpResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Ifaipb_HangUpResponse_descriptor,
        new String[] { "CallCode", });
    internal_static_Ifaipb_CallStateRequest_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_Ifaipb_CallStateRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Ifaipb_CallStateRequest_descriptor,
        new String[] { "CallCode", });
    internal_static_Ifaipb_CallStateResponse_descriptor =
      getDescriptor().getMessageTypes().get(9);
    internal_static_Ifaipb_CallStateResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Ifaipb_CallStateResponse_descriptor,
        new String[] { });
    internal_static_Ifaipb_OneClickCallRequest_descriptor =
      getDescriptor().getMessageTypes().get(10);
    internal_static_Ifaipb_OneClickCallRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Ifaipb_OneClickCallRequest_descriptor,
        new String[] { "DeviceId", "Image", });
    internal_static_Ifaipb_OneClickCallResponse_descriptor =
      getDescriptor().getMessageTypes().get(11);
    internal_static_Ifaipb_OneClickCallResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Ifaipb_OneClickCallResponse_descriptor,
        new String[] { "RecordId", "RoomName", "ResultCode", });
    internal_static_Ifaipb_OneClickCallCancelRequest_descriptor =
      getDescriptor().getMessageTypes().get(12);
    internal_static_Ifaipb_OneClickCallCancelRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Ifaipb_OneClickCallCancelRequest_descriptor,
        new String[] { "DeviceId", "RecordId", "Image", });
    internal_static_Ifaipb_OneClickCallCancelResponse_descriptor =
      getDescriptor().getMessageTypes().get(13);
    internal_static_Ifaipb_OneClickCallCancelResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Ifaipb_OneClickCallCancelResponse_descriptor,
        new String[] { "ResultCode", });
    internal_static_Ifaipb_OneClickCallHangUpRequest_descriptor =
      getDescriptor().getMessageTypes().get(14);
    internal_static_Ifaipb_OneClickCallHangUpRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Ifaipb_OneClickCallHangUpRequest_descriptor,
        new String[] { "DeviceId", "RecordId", "Image", });
    internal_static_Ifaipb_OneClickCallHangUpResponse_descriptor =
      getDescriptor().getMessageTypes().get(15);
    internal_static_Ifaipb_OneClickCallHangUpResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Ifaipb_OneClickCallHangUpResponse_descriptor,
        new String[] { "ResultCode", });
    com.intellif.ifai.common.Ifai.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
