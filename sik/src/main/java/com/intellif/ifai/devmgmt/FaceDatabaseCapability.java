// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: IfDeviceManagment.proto

package com.intellif.ifai.devmgmt;

/**
 * Protobuf type {@code Ifaipb.FaceDatabaseCapability}
 */
public  final class FaceDatabaseCapability extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:Ifaipb.FaceDatabaseCapability)
    FaceDatabaseCapabilityOrBuilder {
private static final long serialVersionUID = 0L;
  // Use FaceDatabaseCapability.newBuilder() to construct.
  private FaceDatabaseCapability(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private FaceDatabaseCapability() {
    maxFaceCount_ = 0;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private FaceDatabaseCapability(
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
          case 24: {

            maxFaceCount_ = input.readInt32();
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
    return com.intellif.ifai.devmgmt.Ifai.internal_static_Ifaipb_FaceDatabaseCapability_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.intellif.ifai.devmgmt.Ifai.internal_static_Ifaipb_FaceDatabaseCapability_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.intellif.ifai.devmgmt.FaceDatabaseCapability.class, com.intellif.ifai.devmgmt.FaceDatabaseCapability.Builder.class);
  }

  public static final int MAX_FACE_COUNT_FIELD_NUMBER = 3;
  private int maxFaceCount_;
  /**
   * <pre>
   *最大人脸数目,如果不提供或者或等于0，则说明不支持人脸库
   * </pre>
   *
   * <code>int32 max_face_count = 3;</code>
   */
  public int getMaxFaceCount() {
    return maxFaceCount_;
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
    if (maxFaceCount_ != 0) {
      output.writeInt32(3, maxFaceCount_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (maxFaceCount_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(3, maxFaceCount_);
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
    if (!(obj instanceof com.intellif.ifai.devmgmt.FaceDatabaseCapability)) {
      return super.equals(obj);
    }
    com.intellif.ifai.devmgmt.FaceDatabaseCapability other = (com.intellif.ifai.devmgmt.FaceDatabaseCapability) obj;

    boolean result = true;
    result = result && (getMaxFaceCount()
        == other.getMaxFaceCount());
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
    hash = (37 * hash) + MAX_FACE_COUNT_FIELD_NUMBER;
    hash = (53 * hash) + getMaxFaceCount();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.intellif.ifai.devmgmt.FaceDatabaseCapability parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.intellif.ifai.devmgmt.FaceDatabaseCapability parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.intellif.ifai.devmgmt.FaceDatabaseCapability parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.intellif.ifai.devmgmt.FaceDatabaseCapability parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.intellif.ifai.devmgmt.FaceDatabaseCapability parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.intellif.ifai.devmgmt.FaceDatabaseCapability parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.intellif.ifai.devmgmt.FaceDatabaseCapability parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.intellif.ifai.devmgmt.FaceDatabaseCapability parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.intellif.ifai.devmgmt.FaceDatabaseCapability parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.intellif.ifai.devmgmt.FaceDatabaseCapability parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.intellif.ifai.devmgmt.FaceDatabaseCapability parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.intellif.ifai.devmgmt.FaceDatabaseCapability parseFrom(
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
  public static Builder newBuilder(com.intellif.ifai.devmgmt.FaceDatabaseCapability prototype) {
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
   * Protobuf type {@code Ifaipb.FaceDatabaseCapability}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:Ifaipb.FaceDatabaseCapability)
      com.intellif.ifai.devmgmt.FaceDatabaseCapabilityOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.intellif.ifai.devmgmt.Ifai.internal_static_Ifaipb_FaceDatabaseCapability_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.intellif.ifai.devmgmt.Ifai.internal_static_Ifaipb_FaceDatabaseCapability_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.intellif.ifai.devmgmt.FaceDatabaseCapability.class, com.intellif.ifai.devmgmt.FaceDatabaseCapability.Builder.class);
    }

    // Construct using com.intellif.ifai.devmgmt.FaceDatabaseCapability.newBuilder()
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
      maxFaceCount_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.intellif.ifai.devmgmt.Ifai.internal_static_Ifaipb_FaceDatabaseCapability_descriptor;
    }

    @java.lang.Override
    public com.intellif.ifai.devmgmt.FaceDatabaseCapability getDefaultInstanceForType() {
      return com.intellif.ifai.devmgmt.FaceDatabaseCapability.getDefaultInstance();
    }

    @java.lang.Override
    public com.intellif.ifai.devmgmt.FaceDatabaseCapability build() {
      com.intellif.ifai.devmgmt.FaceDatabaseCapability result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.intellif.ifai.devmgmt.FaceDatabaseCapability buildPartial() {
      com.intellif.ifai.devmgmt.FaceDatabaseCapability result = new com.intellif.ifai.devmgmt.FaceDatabaseCapability(this);
      result.maxFaceCount_ = maxFaceCount_;
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
      if (other instanceof com.intellif.ifai.devmgmt.FaceDatabaseCapability) {
        return mergeFrom((com.intellif.ifai.devmgmt.FaceDatabaseCapability)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.intellif.ifai.devmgmt.FaceDatabaseCapability other) {
      if (other == com.intellif.ifai.devmgmt.FaceDatabaseCapability.getDefaultInstance()) return this;
      if (other.getMaxFaceCount() != 0) {
        setMaxFaceCount(other.getMaxFaceCount());
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
      com.intellif.ifai.devmgmt.FaceDatabaseCapability parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.intellif.ifai.devmgmt.FaceDatabaseCapability) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int maxFaceCount_ ;
    /**
     * <pre>
     *最大人脸数目,如果不提供或者或等于0，则说明不支持人脸库
     * </pre>
     *
     * <code>int32 max_face_count = 3;</code>
     */
    public int getMaxFaceCount() {
      return maxFaceCount_;
    }
    /**
     * <pre>
     *最大人脸数目,如果不提供或者或等于0，则说明不支持人脸库
     * </pre>
     *
     * <code>int32 max_face_count = 3;</code>
     */
    public Builder setMaxFaceCount(int value) {
      
      maxFaceCount_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     *最大人脸数目,如果不提供或者或等于0，则说明不支持人脸库
     * </pre>
     *
     * <code>int32 max_face_count = 3;</code>
     */
    public Builder clearMaxFaceCount() {
      
      maxFaceCount_ = 0;
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


    // @@protoc_insertion_point(builder_scope:Ifaipb.FaceDatabaseCapability)
  }

  // @@protoc_insertion_point(class_scope:Ifaipb.FaceDatabaseCapability)
  private static final com.intellif.ifai.devmgmt.FaceDatabaseCapability DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.intellif.ifai.devmgmt.FaceDatabaseCapability();
  }

  public static com.intellif.ifai.devmgmt.FaceDatabaseCapability getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<FaceDatabaseCapability>
      PARSER = new com.google.protobuf.AbstractParser<FaceDatabaseCapability>() {
    @java.lang.Override
    public FaceDatabaseCapability parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new FaceDatabaseCapability(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<FaceDatabaseCapability> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<FaceDatabaseCapability> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.intellif.ifai.devmgmt.FaceDatabaseCapability getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

