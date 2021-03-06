// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: IfDeviceManagment.proto

package com.intellif.ifai.devmgmt;

public interface GetCapabilityResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:Ifaipb.GetCapabilityResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   *人脸库能力，是否支持人脸库存在以及人脸库容量等能力
   * </pre>
   *
   * <code>.Ifaipb.FaceDatabaseCapability face_database_capability = 1;</code>
   */
  boolean hasFaceDatabaseCapability();
  /**
   * <pre>
   *人脸库能力，是否支持人脸库存在以及人脸库容量等能力
   * </pre>
   *
   * <code>.Ifaipb.FaceDatabaseCapability face_database_capability = 1;</code>
   */
  com.intellif.ifai.devmgmt.FaceDatabaseCapability getFaceDatabaseCapability();
  /**
   * <pre>
   *人脸库能力，是否支持人脸库存在以及人脸库容量等能力
   * </pre>
   *
   * <code>.Ifaipb.FaceDatabaseCapability face_database_capability = 1;</code>
   */
  com.intellif.ifai.devmgmt.FaceDatabaseCapabilityOrBuilder getFaceDatabaseCapabilityOrBuilder();

  /**
   * <pre>
   *人脸检测能力，是否支持人脸检测、性别、年龄检测等能力
   * </pre>
   *
   * <code>.Ifaipb.FaceCaptureCapability face_capture_capability = 2;</code>
   */
  boolean hasFaceCaptureCapability();
  /**
   * <pre>
   *人脸检测能力，是否支持人脸检测、性别、年龄检测等能力
   * </pre>
   *
   * <code>.Ifaipb.FaceCaptureCapability face_capture_capability = 2;</code>
   */
  com.intellif.ifai.devmgmt.FaceCaptureCapability getFaceCaptureCapability();
  /**
   * <pre>
   *人脸检测能力，是否支持人脸检测、性别、年龄检测等能力
   * </pre>
   *
   * <code>.Ifaipb.FaceCaptureCapability face_capture_capability = 2;</code>
   */
  com.intellif.ifai.devmgmt.FaceCaptureCapabilityOrBuilder getFaceCaptureCapabilityOrBuilder();
}
