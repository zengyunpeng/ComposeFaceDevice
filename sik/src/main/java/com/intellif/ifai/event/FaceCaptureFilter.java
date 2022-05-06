// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: IfEvent.proto

package com.intellif.ifai.event;

/**
 * <pre>
 *&#47;////////////////////////////////////
 *人脸检测结果过滤
 * </pre>
 *
 * Protobuf type {@code Ifaipb.FaceCaptureFilter}
 */
public  final class FaceCaptureFilter extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:Ifaipb.FaceCaptureFilter)
    FaceCaptureFilterOrBuilder {
private static final long serialVersionUID = 0L;
  // Use FaceCaptureFilter.newBuilder() to construct.
  private FaceCaptureFilter(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private FaceCaptureFilter() {
    backgroundImage_ = false;
    faceImage_ = false;
    faceRegister_ = false;
    bodyImage_ = false;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private FaceCaptureFilter(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 8: {

            backgroundImage_ = input.readBool();
            break;
          }
          case 16: {

            faceImage_ = input.readBool();
            break;
          }
          case 24: {

            faceRegister_ = input.readBool();
            break;
          }
          case 32: {

            bodyImage_ = input.readBool();
            break;
          }
          default: {
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.intellif.ifai.event.Ifai.internal_static_Ifaipb_FaceCaptureFilter_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.intellif.ifai.event.Ifai.internal_static_Ifaipb_FaceCaptureFilter_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.intellif.ifai.event.FaceCaptureFilter.class, com.intellif.ifai.event.FaceCaptureFilter.Builder.class);
  }

  public static final int BACKGROUND_IMAGE_FIELD_NUMBER = 1;
  private boolean backgroundImage_;
  /**
   * <pre>
   * 是否上传背景图
   * </pre>
   *
   * <code>bool background_image = 1;</code>
   */
  public boolean getBackgroundImage() {
    return backgroundImage_;
  }

  public static final int FACE_IMAGE_FIELD_NUMBER = 2;
  private boolean faceImage_;
  /**
   * <pre>
   * 是否上传人脸图
   * </pre>
   *
   * <code>bool face_image = 2;</code>
   */
  public boolean getFaceImage() {
    return faceImage_;
  }

  public static final int FACE_REGISTER_FIELD_NUMBER = 3;
  private boolean faceRegister_;
  /**
   * <pre>
   * 是否上传注册人脸
   * </pre>
   *
   * <code>bool face_register = 3;</code>
   */
  public boolean getFaceRegister() {
    return faceRegister_;
  }

  public static final int BODY_IMAGE_FIELD_NUMBER = 4;
  private boolean bodyImage_;
  /**
   * <pre>
   * 是否上传人体图
   * </pre>
   *
   * <code>bool body_image = 4;</code>
   */
  public boolean getBodyImage() {
    return bodyImage_;
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (backgroundImage_ != false) {
      output.writeBool(1, backgroundImage_);
    }
    if (faceImage_ != false) {
      output.writeBool(2, faceImage_);
    }
    if (faceRegister_ != false) {
      output.writeBool(3, faceRegister_);
    }
    if (bodyImage_ != false) {
      output.writeBool(4, bodyImage_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (backgroundImage_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(1, backgroundImage_);
    }
    if (faceImage_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(2, faceImage_);
    }
    if (faceRegister_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(3, faceRegister_);
    }
    if (bodyImage_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(4, bodyImage_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.intellif.ifai.event.FaceCaptureFilter)) {
      return super.equals(obj);
    }
    com.intellif.ifai.event.FaceCaptureFilter other = (com.intellif.ifai.event.FaceCaptureFilter) obj;

    boolean result = true;
    result = result && (getBackgroundImage()
        == other.getBackgroundImage());
    result = result && (getFaceImage()
        == other.getFaceImage());
    result = result && (getFaceRegister()
        == other.getFaceRegister());
    result = result && (getBodyImage()
        == other.getBodyImage());
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + BACKGROUND_IMAGE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getBackgroundImage());
    hash = (37 * hash) + FACE_IMAGE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getFaceImage());
    hash = (37 * hash) + FACE_REGISTER_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getFaceRegister());
    hash = (37 * hash) + BODY_IMAGE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getBodyImage());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.intellif.ifai.event.FaceCaptureFilter parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.intellif.ifai.event.FaceCaptureFilter parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.intellif.ifai.event.FaceCaptureFilter parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.intellif.ifai.event.FaceCaptureFilter parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.intellif.ifai.event.FaceCaptureFilter parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.intellif.ifai.event.FaceCaptureFilter parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.intellif.ifai.event.FaceCaptureFilter parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.intellif.ifai.event.FaceCaptureFilter parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.intellif.ifai.event.FaceCaptureFilter parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.intellif.ifai.event.FaceCaptureFilter parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.intellif.ifai.event.FaceCaptureFilter parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.intellif.ifai.event.FaceCaptureFilter parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.intellif.ifai.event.FaceCaptureFilter prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * <pre>
   *&#47;////////////////////////////////////
   *人脸检测结果过滤
   * </pre>
   *
   * Protobuf type {@code Ifaipb.FaceCaptureFilter}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:Ifaipb.FaceCaptureFilter)
      com.intellif.ifai.event.FaceCaptureFilterOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.intellif.ifai.event.Ifai.internal_static_Ifaipb_FaceCaptureFilter_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.intellif.ifai.event.Ifai.internal_static_Ifaipb_FaceCaptureFilter_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.intellif.ifai.event.FaceCaptureFilter.class, com.intellif.ifai.event.FaceCaptureFilter.Builder.class);
    }

    // Construct using com.intellif.ifai.event.FaceCaptureFilter.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      backgroundImage_ = false;

      faceImage_ = false;

      faceRegister_ = false;

      bodyImage_ = false;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.intellif.ifai.event.Ifai.internal_static_Ifaipb_FaceCaptureFilter_descriptor;
    }

    @java.lang.Override
    public com.intellif.ifai.event.FaceCaptureFilter getDefaultInstanceForType() {
      return com.intellif.ifai.event.FaceCaptureFilter.getDefaultInstance();
    }

    @java.lang.Override
    public com.intellif.ifai.event.FaceCaptureFilter build() {
      com.intellif.ifai.event.FaceCaptureFilter result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.intellif.ifai.event.FaceCaptureFilter buildPartial() {
      com.intellif.ifai.event.FaceCaptureFilter result = new com.intellif.ifai.event.FaceCaptureFilter(this);
      result.backgroundImage_ = backgroundImage_;
      result.faceImage_ = faceImage_;
      result.faceRegister_ = faceRegister_;
      result.bodyImage_ = bodyImage_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return (Builder) super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.intellif.ifai.event.FaceCaptureFilter) {
        return mergeFrom((com.intellif.ifai.event.FaceCaptureFilter)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.intellif.ifai.event.FaceCaptureFilter other) {
      if (other == com.intellif.ifai.event.FaceCaptureFilter.getDefaultInstance()) return this;
      if (other.getBackgroundImage() != false) {
        setBackgroundImage(other.getBackgroundImage());
      }
      if (other.getFaceImage() != false) {
        setFaceImage(other.getFaceImage());
      }
      if (other.getFaceRegister() != false) {
        setFaceRegister(other.getFaceRegister());
      }
      if (other.getBodyImage() != false) {
        setBodyImage(other.getBodyImage());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.intellif.ifai.event.FaceCaptureFilter parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.intellif.ifai.event.FaceCaptureFilter) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private boolean backgroundImage_ ;
    /**
     * <pre>
     * 是否上传背景图
     * </pre>
     *
     * <code>bool background_image = 1;</code>
     */
    public boolean getBackgroundImage() {
      return backgroundImage_;
    }
    /**
     * <pre>
     * 是否上传背景图
     * </pre>
     *
     * <code>bool background_image = 1;</code>
     */
    public Builder setBackgroundImage(boolean value) {
      
      backgroundImage_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 是否上传背景图
     * </pre>
     *
     * <code>bool background_image = 1;</code>
     */
    public Builder clearBackgroundImage() {
      
      backgroundImage_ = false;
      onChanged();
      return this;
    }

    private boolean faceImage_ ;
    /**
     * <pre>
     * 是否上传人脸图
     * </pre>
     *
     * <code>bool face_image = 2;</code>
     */
    public boolean getFaceImage() {
      return faceImage_;
    }
    /**
     * <pre>
     * 是否上传人脸图
     * </pre>
     *
     * <code>bool face_image = 2;</code>
     */
    public Builder setFaceImage(boolean value) {
      
      faceImage_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 是否上传人脸图
     * </pre>
     *
     * <code>bool face_image = 2;</code>
     */
    public Builder clearFaceImage() {
      
      faceImage_ = false;
      onChanged();
      return this;
    }

    private boolean faceRegister_ ;
    /**
     * <pre>
     * 是否上传注册人脸
     * </pre>
     *
     * <code>bool face_register = 3;</code>
     */
    public boolean getFaceRegister() {
      return faceRegister_;
    }
    /**
     * <pre>
     * 是否上传注册人脸
     * </pre>
     *
     * <code>bool face_register = 3;</code>
     */
    public Builder setFaceRegister(boolean value) {
      
      faceRegister_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 是否上传注册人脸
     * </pre>
     *
     * <code>bool face_register = 3;</code>
     */
    public Builder clearFaceRegister() {
      
      faceRegister_ = false;
      onChanged();
      return this;
    }

    private boolean bodyImage_ ;
    /**
     * <pre>
     * 是否上传人体图
     * </pre>
     *
     * <code>bool body_image = 4;</code>
     */
    public boolean getBodyImage() {
      return bodyImage_;
    }
    /**
     * <pre>
     * 是否上传人体图
     * </pre>
     *
     * <code>bool body_image = 4;</code>
     */
    public Builder setBodyImage(boolean value) {
      
      bodyImage_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 是否上传人体图
     * </pre>
     *
     * <code>bool body_image = 4;</code>
     */
    public Builder clearBodyImage() {
      
      bodyImage_ = false;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:Ifaipb.FaceCaptureFilter)
  }

  // @@protoc_insertion_point(class_scope:Ifaipb.FaceCaptureFilter)
  private static final com.intellif.ifai.event.FaceCaptureFilter DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.intellif.ifai.event.FaceCaptureFilter();
  }

  public static com.intellif.ifai.event.FaceCaptureFilter getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<FaceCaptureFilter>
      PARSER = new com.google.protobuf.AbstractParser<FaceCaptureFilter>() {
    @java.lang.Override
    public FaceCaptureFilter parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new FaceCaptureFilter(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<FaceCaptureFilter> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<FaceCaptureFilter> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.intellif.ifai.event.FaceCaptureFilter getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

