// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: IfFaceDatabase.proto

package com.intellif.ifai.facedb;

public interface FaceDetectionRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:Ifaipb.FaceDetectionRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * 人脸图片
   * </pre>
   *
   * <code>.Ifaipb.Image face_image = 1;</code>
   */
  boolean hasFaceImage();
  /**
   * <pre>
   * 人脸图片
   * </pre>
   *
   * <code>.Ifaipb.Image face_image = 1;</code>
   */
  com.intellif.ifai.common.Image getFaceImage();
  /**
   * <pre>
   * 人脸图片
   * </pre>
   *
   * <code>.Ifaipb.Image face_image = 1;</code>
   */
  com.intellif.ifai.common.ImageOrBuilder getFaceImageOrBuilder();
}
