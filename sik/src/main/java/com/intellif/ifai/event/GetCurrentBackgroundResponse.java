// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: IfEvent.proto

package com.intellif.ifai.event;

/**
 * Protobuf type {@code Ifaipb.GetCurrentBackgroundResponse}
 */
public  final class GetCurrentBackgroundResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:Ifaipb.GetCurrentBackgroundResponse)
    GetCurrentBackgroundResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GetCurrentBackgroundResponse.newBuilder() to construct.
  private GetCurrentBackgroundResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GetCurrentBackgroundResponse() {
    timestamp_ = 0L;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private GetCurrentBackgroundResponse(
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
            com.intellif.ifai.common.Image.Builder subBuilder = null;
            if (image_ != null) {
              subBuilder = image_.toBuilder();
            }
            image_ = input.readMessage(com.intellif.ifai.common.Image.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(image_);
              image_ = subBuilder.buildPartial();
            }

            break;
          }
          case 16: {

            timestamp_ = input.readInt64();
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
    return com.intellif.ifai.event.Ifai.internal_static_Ifaipb_GetCurrentBackgroundResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.intellif.ifai.event.Ifai.internal_static_Ifaipb_GetCurrentBackgroundResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.intellif.ifai.event.GetCurrentBackgroundResponse.class, com.intellif.ifai.event.GetCurrentBackgroundResponse.Builder.class);
  }

  public static final int IMAGE_FIELD_NUMBER = 1;
  private com.intellif.ifai.common.Image image_;
  /**
   * <pre>
   *????????????
   * </pre>
   *
   * <code>.Ifaipb.Image image = 1;</code>
   */
  public boolean hasImage() {
    return image_ != null;
  }
  /**
   * <pre>
   *????????????
   * </pre>
   *
   * <code>.Ifaipb.Image image = 1;</code>
   */
  public com.intellif.ifai.common.Image getImage() {
    return image_ == null ? com.intellif.ifai.common.Image.getDefaultInstance() : image_;
  }
  /**
   * <pre>
   *????????????
   * </pre>
   *
   * <code>.Ifaipb.Image image = 1;</code>
   */
  public com.intellif.ifai.common.ImageOrBuilder getImageOrBuilder() {
    return getImage();
  }

  public static final int TIMESTAMP_FIELD_NUMBER = 2;
  private long timestamp_;
  /**
   * <pre>
   *????????????
   * </pre>
   *
   * <code>int64 timestamp = 2;</code>
   */
  public long getTimestamp() {
    return timestamp_;
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
    if (image_ != null) {
      output.writeMessage(1, getImage());
    }
    if (timestamp_ != 0L) {
      output.writeInt64(2, timestamp_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (image_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getImage());
    }
    if (timestamp_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(2, timestamp_);
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
    if (!(obj instanceof com.intellif.ifai.event.GetCurrentBackgroundResponse)) {
      return super.equals(obj);
    }
    com.intellif.ifai.event.GetCurrentBackgroundResponse other = (com.intellif.ifai.event.GetCurrentBackgroundResponse) obj;

    boolean result = true;
    result = result && (hasImage() == other.hasImage());
    if (hasImage()) {
      result = result && getImage()
          .equals(other.getImage());
    }
    result = result && (getTimestamp()
        == other.getTimestamp());
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
    if (hasImage()) {
      hash = (37 * hash) + IMAGE_FIELD_NUMBER;
      hash = (53 * hash) + getImage().hashCode();
    }
    hash = (37 * hash) + TIMESTAMP_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getTimestamp());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.intellif.ifai.event.GetCurrentBackgroundResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.intellif.ifai.event.GetCurrentBackgroundResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.intellif.ifai.event.GetCurrentBackgroundResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.intellif.ifai.event.GetCurrentBackgroundResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.intellif.ifai.event.GetCurrentBackgroundResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.intellif.ifai.event.GetCurrentBackgroundResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.intellif.ifai.event.GetCurrentBackgroundResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.intellif.ifai.event.GetCurrentBackgroundResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.intellif.ifai.event.GetCurrentBackgroundResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.intellif.ifai.event.GetCurrentBackgroundResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.intellif.ifai.event.GetCurrentBackgroundResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.intellif.ifai.event.GetCurrentBackgroundResponse parseFrom(
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
  public static Builder newBuilder(com.intellif.ifai.event.GetCurrentBackgroundResponse prototype) {
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
   * Protobuf type {@code Ifaipb.GetCurrentBackgroundResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:Ifaipb.GetCurrentBackgroundResponse)
      com.intellif.ifai.event.GetCurrentBackgroundResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.intellif.ifai.event.Ifai.internal_static_Ifaipb_GetCurrentBackgroundResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.intellif.ifai.event.Ifai.internal_static_Ifaipb_GetCurrentBackgroundResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.intellif.ifai.event.GetCurrentBackgroundResponse.class, com.intellif.ifai.event.GetCurrentBackgroundResponse.Builder.class);
    }

    // Construct using com.intellif.ifai.event.GetCurrentBackgroundResponse.newBuilder()
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
      if (imageBuilder_ == null) {
        image_ = null;
      } else {
        image_ = null;
        imageBuilder_ = null;
      }
      timestamp_ = 0L;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.intellif.ifai.event.Ifai.internal_static_Ifaipb_GetCurrentBackgroundResponse_descriptor;
    }

    @java.lang.Override
    public com.intellif.ifai.event.GetCurrentBackgroundResponse getDefaultInstanceForType() {
      return com.intellif.ifai.event.GetCurrentBackgroundResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.intellif.ifai.event.GetCurrentBackgroundResponse build() {
      com.intellif.ifai.event.GetCurrentBackgroundResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.intellif.ifai.event.GetCurrentBackgroundResponse buildPartial() {
      com.intellif.ifai.event.GetCurrentBackgroundResponse result = new com.intellif.ifai.event.GetCurrentBackgroundResponse(this);
      if (imageBuilder_ == null) {
        result.image_ = image_;
      } else {
        result.image_ = imageBuilder_.build();
      }
      result.timestamp_ = timestamp_;
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
      if (other instanceof com.intellif.ifai.event.GetCurrentBackgroundResponse) {
        return mergeFrom((com.intellif.ifai.event.GetCurrentBackgroundResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.intellif.ifai.event.GetCurrentBackgroundResponse other) {
      if (other == com.intellif.ifai.event.GetCurrentBackgroundResponse.getDefaultInstance()) return this;
      if (other.hasImage()) {
        mergeImage(other.getImage());
      }
      if (other.getTimestamp() != 0L) {
        setTimestamp(other.getTimestamp());
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
      com.intellif.ifai.event.GetCurrentBackgroundResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.intellif.ifai.event.GetCurrentBackgroundResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.intellif.ifai.common.Image image_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.intellif.ifai.common.Image, com.intellif.ifai.common.Image.Builder, com.intellif.ifai.common.ImageOrBuilder> imageBuilder_;
    /**
     * <pre>
     *????????????
     * </pre>
     *
     * <code>.Ifaipb.Image image = 1;</code>
     */
    public boolean hasImage() {
      return imageBuilder_ != null || image_ != null;
    }
    /**
     * <pre>
     *????????????
     * </pre>
     *
     * <code>.Ifaipb.Image image = 1;</code>
     */
    public com.intellif.ifai.common.Image getImage() {
      if (imageBuilder_ == null) {
        return image_ == null ? com.intellif.ifai.common.Image.getDefaultInstance() : image_;
      } else {
        return imageBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     *????????????
     * </pre>
     *
     * <code>.Ifaipb.Image image = 1;</code>
     */
    public Builder setImage(com.intellif.ifai.common.Image value) {
      if (imageBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        image_ = value;
        onChanged();
      } else {
        imageBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     *????????????
     * </pre>
     *
     * <code>.Ifaipb.Image image = 1;</code>
     */
    public Builder setImage(
        com.intellif.ifai.common.Image.Builder builderForValue) {
      if (imageBuilder_ == null) {
        image_ = builderForValue.build();
        onChanged();
      } else {
        imageBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     *????????????
     * </pre>
     *
     * <code>.Ifaipb.Image image = 1;</code>
     */
    public Builder mergeImage(com.intellif.ifai.common.Image value) {
      if (imageBuilder_ == null) {
        if (image_ != null) {
          image_ =
            com.intellif.ifai.common.Image.newBuilder(image_).mergeFrom(value).buildPartial();
        } else {
          image_ = value;
        }
        onChanged();
      } else {
        imageBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     *????????????
     * </pre>
     *
     * <code>.Ifaipb.Image image = 1;</code>
     */
    public Builder clearImage() {
      if (imageBuilder_ == null) {
        image_ = null;
        onChanged();
      } else {
        image_ = null;
        imageBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     *????????????
     * </pre>
     *
     * <code>.Ifaipb.Image image = 1;</code>
     */
    public com.intellif.ifai.common.Image.Builder getImageBuilder() {
      
      onChanged();
      return getImageFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     *????????????
     * </pre>
     *
     * <code>.Ifaipb.Image image = 1;</code>
     */
    public com.intellif.ifai.common.ImageOrBuilder getImageOrBuilder() {
      if (imageBuilder_ != null) {
        return imageBuilder_.getMessageOrBuilder();
      } else {
        return image_ == null ?
            com.intellif.ifai.common.Image.getDefaultInstance() : image_;
      }
    }
    /**
     * <pre>
     *????????????
     * </pre>
     *
     * <code>.Ifaipb.Image image = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.intellif.ifai.common.Image, com.intellif.ifai.common.Image.Builder, com.intellif.ifai.common.ImageOrBuilder> 
        getImageFieldBuilder() {
      if (imageBuilder_ == null) {
        imageBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.intellif.ifai.common.Image, com.intellif.ifai.common.Image.Builder, com.intellif.ifai.common.ImageOrBuilder>(
                getImage(),
                getParentForChildren(),
                isClean());
        image_ = null;
      }
      return imageBuilder_;
    }

    private long timestamp_ ;
    /**
     * <pre>
     *????????????
     * </pre>
     *
     * <code>int64 timestamp = 2;</code>
     */
    public long getTimestamp() {
      return timestamp_;
    }
    /**
     * <pre>
     *????????????
     * </pre>
     *
     * <code>int64 timestamp = 2;</code>
     */
    public Builder setTimestamp(long value) {
      
      timestamp_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     *????????????
     * </pre>
     *
     * <code>int64 timestamp = 2;</code>
     */
    public Builder clearTimestamp() {
      
      timestamp_ = 0L;
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


    // @@protoc_insertion_point(builder_scope:Ifaipb.GetCurrentBackgroundResponse)
  }

  // @@protoc_insertion_point(class_scope:Ifaipb.GetCurrentBackgroundResponse)
  private static final com.intellif.ifai.event.GetCurrentBackgroundResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.intellif.ifai.event.GetCurrentBackgroundResponse();
  }

  public static com.intellif.ifai.event.GetCurrentBackgroundResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetCurrentBackgroundResponse>
      PARSER = new com.google.protobuf.AbstractParser<GetCurrentBackgroundResponse>() {
    @java.lang.Override
    public GetCurrentBackgroundResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new GetCurrentBackgroundResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<GetCurrentBackgroundResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetCurrentBackgroundResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.intellif.ifai.event.GetCurrentBackgroundResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

