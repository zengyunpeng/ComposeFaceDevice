// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: IfCommonType.proto

package com.intellif.ifai.common;

/**
 * Protobuf type {@code Ifaipb.Resolution}
 */
public  final class Resolution extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:Ifaipb.Resolution)
    ResolutionOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Resolution.newBuilder() to construct.
  private Resolution(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Resolution() {
    width_ = 0;
    height_ = 0;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private Resolution(
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

            width_ = input.readInt32();
            break;
          }
          case 16: {

            height_ = input.readInt32();
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
    return com.intellif.ifai.common.Ifai.internal_static_Ifaipb_Resolution_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.intellif.ifai.common.Ifai.internal_static_Ifaipb_Resolution_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.intellif.ifai.common.Resolution.class, com.intellif.ifai.common.Resolution.Builder.class);
  }

  public static final int WIDTH_FIELD_NUMBER = 1;
  private int width_;
  /**
   * <code>int32 width = 1;</code>
   */
  public int getWidth() {
    return width_;
  }

  public static final int HEIGHT_FIELD_NUMBER = 2;
  private int height_;
  /**
   * <code>int32 height = 2;</code>
   */
  public int getHeight() {
    return height_;
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
    if (width_ != 0) {
      output.writeInt32(1, width_);
    }
    if (height_ != 0) {
      output.writeInt32(2, height_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (width_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, width_);
    }
    if (height_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, height_);
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
    if (!(obj instanceof com.intellif.ifai.common.Resolution)) {
      return super.equals(obj);
    }
    com.intellif.ifai.common.Resolution other = (com.intellif.ifai.common.Resolution) obj;

    boolean result = true;
    result = result && (getWidth()
        == other.getWidth());
    result = result && (getHeight()
        == other.getHeight());
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
    hash = (37 * hash) + WIDTH_FIELD_NUMBER;
    hash = (53 * hash) + getWidth();
    hash = (37 * hash) + HEIGHT_FIELD_NUMBER;
    hash = (53 * hash) + getHeight();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.intellif.ifai.common.Resolution parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.intellif.ifai.common.Resolution parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.intellif.ifai.common.Resolution parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.intellif.ifai.common.Resolution parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.intellif.ifai.common.Resolution parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.intellif.ifai.common.Resolution parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.intellif.ifai.common.Resolution parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.intellif.ifai.common.Resolution parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.intellif.ifai.common.Resolution parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.intellif.ifai.common.Resolution parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.intellif.ifai.common.Resolution parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.intellif.ifai.common.Resolution parseFrom(
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
  public static Builder newBuilder(com.intellif.ifai.common.Resolution prototype) {
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
   * Protobuf type {@code Ifaipb.Resolution}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:Ifaipb.Resolution)
      com.intellif.ifai.common.ResolutionOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.intellif.ifai.common.Ifai.internal_static_Ifaipb_Resolution_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.intellif.ifai.common.Ifai.internal_static_Ifaipb_Resolution_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.intellif.ifai.common.Resolution.class, com.intellif.ifai.common.Resolution.Builder.class);
    }

    // Construct using com.intellif.ifai.common.Resolution.newBuilder()
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
      width_ = 0;

      height_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.intellif.ifai.common.Ifai.internal_static_Ifaipb_Resolution_descriptor;
    }

    @java.lang.Override
    public com.intellif.ifai.common.Resolution getDefaultInstanceForType() {
      return com.intellif.ifai.common.Resolution.getDefaultInstance();
    }

    @java.lang.Override
    public com.intellif.ifai.common.Resolution build() {
      com.intellif.ifai.common.Resolution result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.intellif.ifai.common.Resolution buildPartial() {
      com.intellif.ifai.common.Resolution result = new com.intellif.ifai.common.Resolution(this);
      result.width_ = width_;
      result.height_ = height_;
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
      if (other instanceof com.intellif.ifai.common.Resolution) {
        return mergeFrom((com.intellif.ifai.common.Resolution)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.intellif.ifai.common.Resolution other) {
      if (other == com.intellif.ifai.common.Resolution.getDefaultInstance()) return this;
      if (other.getWidth() != 0) {
        setWidth(other.getWidth());
      }
      if (other.getHeight() != 0) {
        setHeight(other.getHeight());
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
      com.intellif.ifai.common.Resolution parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.intellif.ifai.common.Resolution) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int width_ ;
    /**
     * <code>int32 width = 1;</code>
     */
    public int getWidth() {
      return width_;
    }
    /**
     * <code>int32 width = 1;</code>
     */
    public Builder setWidth(int value) {
      
      width_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 width = 1;</code>
     */
    public Builder clearWidth() {
      
      width_ = 0;
      onChanged();
      return this;
    }

    private int height_ ;
    /**
     * <code>int32 height = 2;</code>
     */
    public int getHeight() {
      return height_;
    }
    /**
     * <code>int32 height = 2;</code>
     */
    public Builder setHeight(int value) {
      
      height_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 height = 2;</code>
     */
    public Builder clearHeight() {
      
      height_ = 0;
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


    // @@protoc_insertion_point(builder_scope:Ifaipb.Resolution)
  }

  // @@protoc_insertion_point(class_scope:Ifaipb.Resolution)
  private static final com.intellif.ifai.common.Resolution DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.intellif.ifai.common.Resolution();
  }

  public static com.intellif.ifai.common.Resolution getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Resolution>
      PARSER = new com.google.protobuf.AbstractParser<Resolution>() {
    @java.lang.Override
    public Resolution parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new Resolution(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Resolution> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Resolution> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.intellif.ifai.common.Resolution getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

