// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: IfPay.proto

package com.intellif.ifai.pay;

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
    internal_static_Ifaipb_OrderRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Ifaipb_OrderRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Ifaipb_OrderResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Ifaipb_OrderResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Ifaipb_OrderRecognitionRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Ifaipb_OrderRecognitionRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Ifaipb_OrderRecognitionResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Ifaipb_OrderRecognitionResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Ifaipb_OrderPayResultRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Ifaipb_OrderPayResultRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Ifaipb_OrderPayResultResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Ifaipb_OrderPayResultResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\013IfPay.proto\022\006Ifaipb\032\rIfEvent.proto\"L\n\014" +
      "OrderRequest\022\020\n\010order_id\030\001 \001(\t\022\024\n\014order_" +
      "amount\030\002 \001(\002\022\024\n\014order_expire\030\003 \001(\005\"\017\n\rOr" +
      "derResponse\"\235\001\n\027OrderRecognitionRequest\022" +
      "\020\n\010order_id\030\001 \001(\t\0221\n\014face_capture\030\002 \001(\0132" +
      "\031.Ifaipb.FaceCaptureResultH\000\0223\n\nerror_in" +
      "fo\030\003 \001(\0162\035.Ifaipb.OrderRecognitionErrorH" +
      "\000B\010\n\006result\"\032\n\030OrderRecognitionResponse\"" +
      "?\n\025OrderPayResultRequest\022\020\n\010order_id\030\001 \001" +
      "(\t\022\024\n\014order_result\030\002 \001(\t\"\030\n\026OrderPayResu" +
      "ltResponse*`\n\025OrderRecognitionError\022\013\n\007N" +
      "O_FACE\020\000\022\016\n\nMULTI_FACE\020\001\022\020\n\014STRANGE_FACE" +
      "\020\002\022\030\n\024ILLEGAL_PHONE_NUMBER\020\0032\360\001\n\nPayServ" +
      "ice\0227\n\010PayOrder\022\024.Ifaipb.OrderRequest\032\025." +
      "Ifaipb.OrderResponse\022X\n\023PayOrderRecognit" +
      "ion\022\037.Ifaipb.OrderRecognitionRequest\032 .I" +
      "faipb.OrderRecognitionResponse\022O\n\016PayOrd" +
      "erResult\022\035.Ifaipb.OrderPayResultRequest\032" +
      "\036.Ifaipb.OrderPayResultResponseB&\n\025com.i" +
      "ntellif.ifai.payB\004IfaiP\001\242\002\004Ifaib\006proto3"
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
          com.intellif.ifai.event.Ifai.getDescriptor(),
        }, assigner);
    internal_static_Ifaipb_OrderRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_Ifaipb_OrderRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Ifaipb_OrderRequest_descriptor,
        new java.lang.String[] { "OrderId", "OrderAmount", "OrderExpire", });
    internal_static_Ifaipb_OrderResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_Ifaipb_OrderResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Ifaipb_OrderResponse_descriptor,
        new java.lang.String[] { });
    internal_static_Ifaipb_OrderRecognitionRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_Ifaipb_OrderRecognitionRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Ifaipb_OrderRecognitionRequest_descriptor,
        new java.lang.String[] { "OrderId", "FaceCapture", "ErrorInfo", "Result", });
    internal_static_Ifaipb_OrderRecognitionResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_Ifaipb_OrderRecognitionResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Ifaipb_OrderRecognitionResponse_descriptor,
        new java.lang.String[] { });
    internal_static_Ifaipb_OrderPayResultRequest_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_Ifaipb_OrderPayResultRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Ifaipb_OrderPayResultRequest_descriptor,
        new java.lang.String[] { "OrderId", "OrderResult", });
    internal_static_Ifaipb_OrderPayResultResponse_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_Ifaipb_OrderPayResultResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Ifaipb_OrderPayResultResponse_descriptor,
        new java.lang.String[] { });
    com.intellif.ifai.event.Ifai.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
