// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: IfFaceDatabase.proto

package com.intellif.ifai.facedb;

/**
 * Protobuf type {@code Ifaipb.FaceDetectionResponse}
 */
public  final class FaceDetectionResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:Ifaipb.FaceDetectionResponse)
    FaceDetectionResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use FaceDetectionResponse.newBuilder() to construct.
  private FaceDetectionResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private FaceDetectionResponse() {
    version_ = "";
    state_ = 0;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private FaceDetectionResponse(
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
          case 10: {
            com.intellif.ifai.common.Rectangle.Builder subBuilder = null;
            if (rectangle_ != null) {
              subBuilder = rectangle_.toBuilder();
            }
            rectangle_ = input.readMessage(com.intellif.ifai.common.Rectangle.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(rectangle_);
              rectangle_ = subBuilder.buildPartial();
            }

            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            version_ = s;
            break;
          }
          case 24: {
            int rawValue = input.readEnum();

            state_ = rawValue;
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
    return com.intellif.ifai.facedb.Ifai.internal_static_Ifaipb_FaceDetectionResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.intellif.ifai.facedb.Ifai.internal_static_Ifaipb_FaceDetectionResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.intellif.ifai.facedb.FaceDetectionResponse.class, com.intellif.ifai.facedb.FaceDetectionResponse.Builder.class);
  }

  public static final int RECTANGLE_FIELD_NUMBER = 1;
  private com.intellif.ifai.common.Rectangle rectangle_;
  /**
   * <pre>
   * 人脸坐标
   * </pre>
   *
   * <code>.Ifaipb.Rectangle rectangle = 1;</code>
   */
  public boolean hasRectangle() {
    return rectangle_ != null;
  }
  /**
   * <pre>
   * 人脸坐标
   * </pre>
   *
   * <code>.Ifaipb.Rectangle rectangle = 1;</code>
   */
  public com.intellif.ifai.common.Rectangle getRectangle() {
    return rectangle_ == null ? com.intellif.ifai.common.Rectangle.getDefaultInstance() : rectangle_;
  }
  /**
   * <pre>
   * 人脸坐标
   * </pre>
   *
   * <code>.Ifaipb.Rectangle rectangle = 1;</code>
   */
  public com.intellif.ifai.common.RectangleOrBuilder getRectangleOrBuilder() {
    return getRectangle();
  }

  public static final int VERSION_FIELD_NUMBER = 2;
  private volatile java.lang.Object version_;
  /**
   * <pre>
   * 检测算法版本
   * </pre>
   *
   * <code>string version = 2;</code>
   */
  public java.lang.String getVersion() {
    java.lang.Object ref = version_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      version_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * 检测算法版本
   * </pre>
   *
   * <code>string version = 2;</code>
   */
  public com.google.protobuf.ByteString
      getVersionBytes() {
    java.lang.Object ref = version_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      version_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int STATE_FIELD_NUMBER = 3;
  private int state_;
  /**
   * <pre>
   * 状态
   * </pre>
   *
   * <code>.Ifaipb.AddPersonState state = 3;</code>
   */
  public int getStateValue() {
    return state_;
  }
  /**
   * <pre>
   * 状态
   * </pre>
   *
   * <code>.Ifaipb.AddPersonState state = 3;</code>
   */
  public com.intellif.ifai.facedb.AddPersonState getState() {
    @SuppressWarnings("deprecation")
    com.intellif.ifai.facedb.AddPersonState result = com.intellif.ifai.facedb.AddPersonState.valueOf(state_);
    return result == null ? com.intellif.ifai.facedb.AddPersonState.UNRECOGNIZED : result;
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
    if (rectangle_ != null) {
      output.writeMessage(1, getRectangle());
    }
    if (!getVersionBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, version_);
    }
    if (state_ != com.intellif.ifai.facedb.AddPersonState.AddPersonState_OK.getNumber()) {
      output.writeEnum(3, state_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (rectangle_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getRectangle());
    }
    if (!getVersionBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, version_);
    }
    if (state_ != com.intellif.ifai.facedb.AddPersonState.AddPersonState_OK.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(3, state_);
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
    if (!(obj instanceof com.intellif.ifai.facedb.FaceDetectionResponse)) {
      return super.equals(obj);
    }
    com.intellif.ifai.facedb.FaceDetectionResponse other = (com.intellif.ifai.facedb.FaceDetectionResponse) obj;

    boolean result = true;
    result = result && (hasRectangle() == other.hasRectangle());
    if (hasRectangle()) {
      result = result && getRectangle()
          .equals(other.getRectangle());
    }
    result = result && getVersion()
        .equals(other.getVersion());
    result = result && state_ == other.state_;
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
    if (hasRectangle()) {
      hash = (37 * hash) + RECTANGLE_FIELD_NUMBER;
      hash = (53 * hash) + getRectangle().hashCode();
    }
    hash = (37 * hash) + VERSION_FIELD_NUMBER;
    hash = (53 * hash) + getVersion().hashCode();
    hash = (37 * hash) + STATE_FIELD_NUMBER;
    hash = (53 * hash) + state_;
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.intellif.ifai.facedb.FaceDetectionResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.intellif.ifai.facedb.FaceDetectionResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.intellif.ifai.facedb.FaceDetectionResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.intellif.ifai.facedb.FaceDetectionResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.intellif.ifai.facedb.FaceDetectionResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.intellif.ifai.facedb.FaceDetectionResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.intellif.ifai.facedb.FaceDetectionResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.intellif.ifai.facedb.FaceDetectionResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.intellif.ifai.facedb.FaceDetectionResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.intellif.ifai.facedb.FaceDetectionResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.intellif.ifai.facedb.FaceDetectionResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.intellif.ifai.facedb.FaceDetectionResponse parseFrom(
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
  public static Builder newBuilder(com.intellif.ifai.facedb.FaceDetectionResponse prototype) {
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
   * Protobuf type {@code Ifaipb.FaceDetectionResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:Ifaipb.FaceDetectionResponse)
      com.intellif.ifai.facedb.FaceDetectionResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.intellif.ifai.facedb.Ifai.internal_static_Ifaipb_FaceDetectionResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.intellif.ifai.facedb.Ifai.internal_static_Ifaipb_FaceDetectionResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.intellif.ifai.facedb.FaceDetectionResponse.class, com.intellif.ifai.facedb.FaceDetectionResponse.Builder.class);
    }

    // Construct using com.intellif.ifai.facedb.FaceDetectionResponse.newBuilder()
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
      if (rectangleBuilder_ == null) {
        rectangle_ = null;
      } else {
        rectangle_ = null;
        rectangleBuilder_ = null;
      }
      version_ = "";

      state_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.intellif.ifai.facedb.Ifai.internal_static_Ifaipb_FaceDetectionResponse_descriptor;
    }

    @java.lang.Override
    public com.intellif.ifai.facedb.FaceDetectionResponse getDefaultInstanceForType() {
      return com.intellif.ifai.facedb.FaceDetectionResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.intellif.ifai.facedb.FaceDetectionResponse build() {
      com.intellif.ifai.facedb.FaceDetectionResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.intellif.ifai.facedb.FaceDetectionResponse buildPartial() {
      com.intellif.ifai.facedb.FaceDetectionResponse result = new com.intellif.ifai.facedb.FaceDetectionResponse(this);
      if (rectangleBuilder_ == null) {
        result.rectangle_ = rectangle_;
      } else {
        result.rectangle_ = rectangleBuilder_.build();
      }
      result.version_ = version_;
      result.state_ = state_;
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
      if (other instanceof com.intellif.ifai.facedb.FaceDetectionResponse) {
        return mergeFrom((com.intellif.ifai.facedb.FaceDetectionResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.intellif.ifai.facedb.FaceDetectionResponse other) {
      if (other == com.intellif.ifai.facedb.FaceDetectionResponse.getDefaultInstance()) return this;
      if (other.hasRectangle()) {
        mergeRectangle(other.getRectangle());
      }
      if (!other.getVersion().isEmpty()) {
        version_ = other.version_;
        onChanged();
      }
      if (other.state_ != 0) {
        setStateValue(other.getStateValue());
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
      com.intellif.ifai.facedb.FaceDetectionResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.intellif.ifai.facedb.FaceDetectionResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.intellif.ifai.common.Rectangle rectangle_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.intellif.ifai.common.Rectangle, com.intellif.ifai.common.Rectangle.Builder, com.intellif.ifai.common.RectangleOrBuilder> rectangleBuilder_;
    /**
     * <pre>
     * 人脸坐标
     * </pre>
     *
     * <code>.Ifaipb.Rectangle rectangle = 1;</code>
     */
    public boolean hasRectangle() {
      return rectangleBuilder_ != null || rectangle_ != null;
    }
    /**
     * <pre>
     * 人脸坐标
     * </pre>
     *
     * <code>.Ifaipb.Rectangle rectangle = 1;</code>
     */
    public com.intellif.ifai.common.Rectangle getRectangle() {
      if (rectangleBuilder_ == null) {
        return rectangle_ == null ? com.intellif.ifai.common.Rectangle.getDefaultInstance() : rectangle_;
      } else {
        return rectangleBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * 人脸坐标
     * </pre>
     *
     * <code>.Ifaipb.Rectangle rectangle = 1;</code>
     */
    public Builder setRectangle(com.intellif.ifai.common.Rectangle value) {
      if (rectangleBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        rectangle_ = value;
        onChanged();
      } else {
        rectangleBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * 人脸坐标
     * </pre>
     *
     * <code>.Ifaipb.Rectangle rectangle = 1;</code>
     */
    public Builder setRectangle(
        com.intellif.ifai.common.Rectangle.Builder builderForValue) {
      if (rectangleBuilder_ == null) {
        rectangle_ = builderForValue.build();
        onChanged();
      } else {
        rectangleBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * 人脸坐标
     * </pre>
     *
     * <code>.Ifaipb.Rectangle rectangle = 1;</code>
     */
    public Builder mergeRectangle(com.intellif.ifai.common.Rectangle value) {
      if (rectangleBuilder_ == null) {
        if (rectangle_ != null) {
          rectangle_ =
            com.intellif.ifai.common.Rectangle.newBuilder(rectangle_).mergeFrom(value).buildPartial();
        } else {
          rectangle_ = value;
        }
        onChanged();
      } else {
        rectangleBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * 人脸坐标
     * </pre>
     *
     * <code>.Ifaipb.Rectangle rectangle = 1;</code>
     */
    public Builder clearRectangle() {
      if (rectangleBuilder_ == null) {
        rectangle_ = null;
        onChanged();
      } else {
        rectangle_ = null;
        rectangleBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * 人脸坐标
     * </pre>
     *
     * <code>.Ifaipb.Rectangle rectangle = 1;</code>
     */
    public com.intellif.ifai.common.Rectangle.Builder getRectangleBuilder() {
      
      onChanged();
      return getRectangleFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * 人脸坐标
     * </pre>
     *
     * <code>.Ifaipb.Rectangle rectangle = 1;</code>
     */
    public com.intellif.ifai.common.RectangleOrBuilder getRectangleOrBuilder() {
      if (rectangleBuilder_ != null) {
        return rectangleBuilder_.getMessageOrBuilder();
      } else {
        return rectangle_ == null ?
            com.intellif.ifai.common.Rectangle.getDefaultInstance() : rectangle_;
      }
    }
    /**
     * <pre>
     * 人脸坐标
     * </pre>
     *
     * <code>.Ifaipb.Rectangle rectangle = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.intellif.ifai.common.Rectangle, com.intellif.ifai.common.Rectangle.Builder, com.intellif.ifai.common.RectangleOrBuilder> 
        getRectangleFieldBuilder() {
      if (rectangleBuilder_ == null) {
        rectangleBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.intellif.ifai.common.Rectangle, com.intellif.ifai.common.Rectangle.Builder, com.intellif.ifai.common.RectangleOrBuilder>(
                getRectangle(),
                getParentForChildren(),
                isClean());
        rectangle_ = null;
      }
      return rectangleBuilder_;
    }

    private java.lang.Object version_ = "";
    /**
     * <pre>
     * 检测算法版本
     * </pre>
     *
     * <code>string version = 2;</code>
     */
    public java.lang.String getVersion() {
      java.lang.Object ref = version_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        version_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * 检测算法版本
     * </pre>
     *
     * <code>string version = 2;</code>
     */
    public com.google.protobuf.ByteString
        getVersionBytes() {
      java.lang.Object ref = version_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        version_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * 检测算法版本
     * </pre>
     *
     * <code>string version = 2;</code>
     */
    public Builder setVersion(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      version_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 检测算法版本
     * </pre>
     *
     * <code>string version = 2;</code>
     */
    public Builder clearVersion() {
      
      version_ = getDefaultInstance().getVersion();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 检测算法版本
     * </pre>
     *
     * <code>string version = 2;</code>
     */
    public Builder setVersionBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      version_ = value;
      onChanged();
      return this;
    }

    private int state_ = 0;
    /**
     * <pre>
     * 状态
     * </pre>
     *
     * <code>.Ifaipb.AddPersonState state = 3;</code>
     */
    public int getStateValue() {
      return state_;
    }
    /**
     * <pre>
     * 状态
     * </pre>
     *
     * <code>.Ifaipb.AddPersonState state = 3;</code>
     */
    public Builder setStateValue(int value) {
      state_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 状态
     * </pre>
     *
     * <code>.Ifaipb.AddPersonState state = 3;</code>
     */
    public com.intellif.ifai.facedb.AddPersonState getState() {
      @SuppressWarnings("deprecation")
      com.intellif.ifai.facedb.AddPersonState result = com.intellif.ifai.facedb.AddPersonState.valueOf(state_);
      return result == null ? com.intellif.ifai.facedb.AddPersonState.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     * 状态
     * </pre>
     *
     * <code>.Ifaipb.AddPersonState state = 3;</code>
     */
    public Builder setState(com.intellif.ifai.facedb.AddPersonState value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      state_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 状态
     * </pre>
     *
     * <code>.Ifaipb.AddPersonState state = 3;</code>
     */
    public Builder clearState() {
      
      state_ = 0;
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


    // @@protoc_insertion_point(builder_scope:Ifaipb.FaceDetectionResponse)
  }

  // @@protoc_insertion_point(class_scope:Ifaipb.FaceDetectionResponse)
  private static final com.intellif.ifai.facedb.FaceDetectionResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.intellif.ifai.facedb.FaceDetectionResponse();
  }

  public static com.intellif.ifai.facedb.FaceDetectionResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<FaceDetectionResponse>
      PARSER = new com.google.protobuf.AbstractParser<FaceDetectionResponse>() {
    @java.lang.Override
    public FaceDetectionResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new FaceDetectionResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<FaceDetectionResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<FaceDetectionResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.intellif.ifai.facedb.FaceDetectionResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
