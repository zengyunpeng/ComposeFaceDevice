// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: IfScanDevice.proto

package com.intellif.ifai.devscan;

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
    internal_static_Ifaipb_ScanDeviceRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Ifaipb_ScanDeviceRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Ifaipb_ScanDeviceResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Ifaipb_ScanDeviceResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\022IfScanDevice.proto\022\006Ifaipb\"\023\n\021ScanDevi" +
      "ceRequest\"\205\001\n\022ScanDeviceResponse\022\n\n\002ip\030\001" +
      " \001(\t\022\014\n\004port\030\002 \001(\t\022\023\n\013device_name\030\003 \001(\t\022" +
      "\025\n\rdevice_serial\030\004 \001(\t\022\023\n\013device_info\030\005 " +
      "\001(\t\022\024\n\014device_model\030\006 \001(\tB*\n\031com.intelli" +
      "f.ifai.devscanB\004IfaiP\001\242\002\004Ifaib\006proto3"
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
        }, assigner);
    internal_static_Ifaipb_ScanDeviceRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_Ifaipb_ScanDeviceRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Ifaipb_ScanDeviceRequest_descriptor,
        new java.lang.String[] { });
    internal_static_Ifaipb_ScanDeviceResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_Ifaipb_ScanDeviceResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Ifaipb_ScanDeviceResponse_descriptor,
        new java.lang.String[] { "Ip", "Port", "DeviceName", "DeviceSerial", "DeviceInfo", "DeviceModel", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}