// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: IfFaceDatabase.proto

package com.intellif.ifai.facedb;

public interface AddPersonResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:Ifaipb.AddPersonResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   *人员ID，如身份证号码
   * </pre>
   *
   * <code>string person_id = 1;</code>
   */
  java.lang.String getPersonId();
  /**
   * <pre>
   *人员ID，如身份证号码
   * </pre>
   *
   * <code>string person_id = 1;</code>
   */
  com.google.protobuf.ByteString
      getPersonIdBytes();

  /**
   * <pre>
   *人脸ID
   * </pre>
   *
   * <code>int32 face_id = 2;</code>
   */
  int getFaceId();

  /**
   * <pre>
   *人脸在照片中的位置
   * </pre>
   *
   * <code>.Ifaipb.Rectangle face_rectangle = 3;</code>
   */
  boolean hasFaceRectangle();
  /**
   * <pre>
   *人脸在照片中的位置
   * </pre>
   *
   * <code>.Ifaipb.Rectangle face_rectangle = 3;</code>
   */
  com.intellif.ifai.common.Rectangle getFaceRectangle();
  /**
   * <pre>
   *人脸在照片中的位置
   * </pre>
   *
   * <code>.Ifaipb.Rectangle face_rectangle = 3;</code>
   */
  com.intellif.ifai.common.RectangleOrBuilder getFaceRectangleOrBuilder();

  /**
   * <pre>
   *姓名
   * </pre>
   *
   * <code>string name = 4;</code>
   */
  java.lang.String getName();
  /**
   * <pre>
   *姓名
   * </pre>
   *
   * <code>string name = 4;</code>
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   *用户自定义Id
   * </pre>
   *
   * <code>string customer_id = 5;</code>
   */
  java.lang.String getCustomerId();
  /**
   * <pre>
   *用户自定义Id
   * </pre>
   *
   * <code>string customer_id = 5;</code>
   */
  com.google.protobuf.ByteString
      getCustomerIdBytes();

  /**
   * <pre>
   *添加状态，只有当state=AddPersonState_OK时，上述参数有效
   * </pre>
   *
   * <code>.Ifaipb.AddPersonState state = 6;</code>
   */
  int getStateValue();
  /**
   * <pre>
   *添加状态，只有当state=AddPersonState_OK时，上述参数有效
   * </pre>
   *
   * <code>.Ifaipb.AddPersonState state = 6;</code>
   */
  com.intellif.ifai.facedb.AddPersonState getState();
}
