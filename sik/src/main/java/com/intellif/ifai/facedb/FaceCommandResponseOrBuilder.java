// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: IfFaceDatabase.proto

package com.intellif.ifai.facedb;

public interface FaceCommandResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:Ifaipb.FaceCommandResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * 目标ID
   * </pre>
   *
   * <code>int32 id = 1;</code>
   */
  int getId();

  /**
   * <code>.Ifaipb.AddPersonByFeatureResponse feature_response = 2;</code>
   */
  boolean hasFeatureResponse();
  /**
   * <code>.Ifaipb.AddPersonByFeatureResponse feature_response = 2;</code>
   */
  com.intellif.ifai.facedb.AddPersonByFeatureResponse getFeatureResponse();
  /**
   * <code>.Ifaipb.AddPersonByFeatureResponse feature_response = 2;</code>
   */
  com.intellif.ifai.facedb.AddPersonByFeatureResponseOrBuilder getFeatureResponseOrBuilder();

  /**
   * <code>.Ifaipb.DeletePersonResponse deletion_response = 3;</code>
   */
  boolean hasDeletionResponse();
  /**
   * <code>.Ifaipb.DeletePersonResponse deletion_response = 3;</code>
   */
  com.intellif.ifai.facedb.DeletePersonResponse getDeletionResponse();
  /**
   * <code>.Ifaipb.DeletePersonResponse deletion_response = 3;</code>
   */
  com.intellif.ifai.facedb.DeletePersonResponseOrBuilder getDeletionResponseOrBuilder();

  /**
   * <code>.Ifaipb.SetPersonResponse modification_response = 4;</code>
   */
  boolean hasModificationResponse();
  /**
   * <code>.Ifaipb.SetPersonResponse modification_response = 4;</code>
   */
  com.intellif.ifai.facedb.SetPersonResponse getModificationResponse();
  /**
   * <code>.Ifaipb.SetPersonResponse modification_response = 4;</code>
   */
  com.intellif.ifai.facedb.SetPersonResponseOrBuilder getModificationResponseOrBuilder();

  /**
   * <code>.Ifaipb.AddPersonResponse image_response = 5;</code>
   */
  boolean hasImageResponse();
  /**
   * <code>.Ifaipb.AddPersonResponse image_response = 5;</code>
   */
  com.intellif.ifai.facedb.AddPersonResponse getImageResponse();
  /**
   * <code>.Ifaipb.AddPersonResponse image_response = 5;</code>
   */
  com.intellif.ifai.facedb.AddPersonResponseOrBuilder getImageResponseOrBuilder();

  public com.intellif.ifai.facedb.FaceCommandResponse.ResponseCase getResponseCase();
}
