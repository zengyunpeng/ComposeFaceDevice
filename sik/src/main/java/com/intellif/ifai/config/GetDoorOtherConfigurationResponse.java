// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: IfDoorControlConfiguration.proto

package com.intellif.ifai.config;

/**
 * Protobuf type {@code Ifaipb.GetDoorOtherConfigurationResponse}
 */
public  final class GetDoorOtherConfigurationResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:Ifaipb.GetDoorOtherConfigurationResponse)
    GetDoorOtherConfigurationResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GetDoorOtherConfigurationResponse.newBuilder() to construct.
  private GetDoorOtherConfigurationResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GetDoorOtherConfigurationResponse() {
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private GetDoorOtherConfigurationResponse(
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
            com.intellif.ifai.config.DoorOtherConfiguration.Builder subBuilder = null;
            if (doorOtherConfiguration_ != null) {
              subBuilder = doorOtherConfiguration_.toBuilder();
            }
            doorOtherConfiguration_ = input.readMessage(com.intellif.ifai.config.DoorOtherConfiguration.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(doorOtherConfiguration_);
              doorOtherConfiguration_ = subBuilder.buildPartial();
            }

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
    return com.intellif.ifai.config.Ifai.internal_static_Ifaipb_GetDoorOtherConfigurationResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.intellif.ifai.config.Ifai.internal_static_Ifaipb_GetDoorOtherConfigurationResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.intellif.ifai.config.GetDoorOtherConfigurationResponse.class, com.intellif.ifai.config.GetDoorOtherConfigurationResponse.Builder.class);
  }

  public static final int DOOR_OTHER_CONFIGURATION_FIELD_NUMBER = 1;
  private com.intellif.ifai.config.DoorOtherConfiguration doorOtherConfiguration_;
  /**
   * <pre>
   *门禁其他配置 20200515 test 
   * </pre>
   *
   * <code>.Ifaipb.DoorOtherConfiguration door_other_configuration = 1;</code>
   */
  public boolean hasDoorOtherConfiguration() {
    return doorOtherConfiguration_ != null;
  }
  /**
   * <pre>
   *门禁其他配置 20200515 test 
   * </pre>
   *
   * <code>.Ifaipb.DoorOtherConfiguration door_other_configuration = 1;</code>
   */
  public com.intellif.ifai.config.DoorOtherConfiguration getDoorOtherConfiguration() {
    return doorOtherConfiguration_ == null ? com.intellif.ifai.config.DoorOtherConfiguration.getDefaultInstance() : doorOtherConfiguration_;
  }
  /**
   * <pre>
   *门禁其他配置 20200515 test 
   * </pre>
   *
   * <code>.Ifaipb.DoorOtherConfiguration door_other_configuration = 1;</code>
   */
  public com.intellif.ifai.config.DoorOtherConfigurationOrBuilder getDoorOtherConfigurationOrBuilder() {
    return getDoorOtherConfiguration();
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
    if (doorOtherConfiguration_ != null) {
      output.writeMessage(1, getDoorOtherConfiguration());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (doorOtherConfiguration_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getDoorOtherConfiguration());
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
    if (!(obj instanceof com.intellif.ifai.config.GetDoorOtherConfigurationResponse)) {
      return super.equals(obj);
    }
    com.intellif.ifai.config.GetDoorOtherConfigurationResponse other = (com.intellif.ifai.config.GetDoorOtherConfigurationResponse) obj;

    boolean result = true;
    result = result && (hasDoorOtherConfiguration() == other.hasDoorOtherConfiguration());
    if (hasDoorOtherConfiguration()) {
      result = result && getDoorOtherConfiguration()
          .equals(other.getDoorOtherConfiguration());
    }
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
    if (hasDoorOtherConfiguration()) {
      hash = (37 * hash) + DOOR_OTHER_CONFIGURATION_FIELD_NUMBER;
      hash = (53 * hash) + getDoorOtherConfiguration().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.intellif.ifai.config.GetDoorOtherConfigurationResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.intellif.ifai.config.GetDoorOtherConfigurationResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.intellif.ifai.config.GetDoorOtherConfigurationResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.intellif.ifai.config.GetDoorOtherConfigurationResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.intellif.ifai.config.GetDoorOtherConfigurationResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.intellif.ifai.config.GetDoorOtherConfigurationResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.intellif.ifai.config.GetDoorOtherConfigurationResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.intellif.ifai.config.GetDoorOtherConfigurationResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.intellif.ifai.config.GetDoorOtherConfigurationResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.intellif.ifai.config.GetDoorOtherConfigurationResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.intellif.ifai.config.GetDoorOtherConfigurationResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.intellif.ifai.config.GetDoorOtherConfigurationResponse parseFrom(
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
  public static Builder newBuilder(com.intellif.ifai.config.GetDoorOtherConfigurationResponse prototype) {
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
   * Protobuf type {@code Ifaipb.GetDoorOtherConfigurationResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:Ifaipb.GetDoorOtherConfigurationResponse)
      com.intellif.ifai.config.GetDoorOtherConfigurationResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.intellif.ifai.config.Ifai.internal_static_Ifaipb_GetDoorOtherConfigurationResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.intellif.ifai.config.Ifai.internal_static_Ifaipb_GetDoorOtherConfigurationResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.intellif.ifai.config.GetDoorOtherConfigurationResponse.class, com.intellif.ifai.config.GetDoorOtherConfigurationResponse.Builder.class);
    }

    // Construct using com.intellif.ifai.config.GetDoorOtherConfigurationResponse.newBuilder()
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
      if (doorOtherConfigurationBuilder_ == null) {
        doorOtherConfiguration_ = null;
      } else {
        doorOtherConfiguration_ = null;
        doorOtherConfigurationBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.intellif.ifai.config.Ifai.internal_static_Ifaipb_GetDoorOtherConfigurationResponse_descriptor;
    }

    @java.lang.Override
    public com.intellif.ifai.config.GetDoorOtherConfigurationResponse getDefaultInstanceForType() {
      return com.intellif.ifai.config.GetDoorOtherConfigurationResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.intellif.ifai.config.GetDoorOtherConfigurationResponse build() {
      com.intellif.ifai.config.GetDoorOtherConfigurationResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.intellif.ifai.config.GetDoorOtherConfigurationResponse buildPartial() {
      com.intellif.ifai.config.GetDoorOtherConfigurationResponse result = new com.intellif.ifai.config.GetDoorOtherConfigurationResponse(this);
      if (doorOtherConfigurationBuilder_ == null) {
        result.doorOtherConfiguration_ = doorOtherConfiguration_;
      } else {
        result.doorOtherConfiguration_ = doorOtherConfigurationBuilder_.build();
      }
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
      if (other instanceof com.intellif.ifai.config.GetDoorOtherConfigurationResponse) {
        return mergeFrom((com.intellif.ifai.config.GetDoorOtherConfigurationResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.intellif.ifai.config.GetDoorOtherConfigurationResponse other) {
      if (other == com.intellif.ifai.config.GetDoorOtherConfigurationResponse.getDefaultInstance()) return this;
      if (other.hasDoorOtherConfiguration()) {
        mergeDoorOtherConfiguration(other.getDoorOtherConfiguration());
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
      com.intellif.ifai.config.GetDoorOtherConfigurationResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.intellif.ifai.config.GetDoorOtherConfigurationResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.intellif.ifai.config.DoorOtherConfiguration doorOtherConfiguration_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.intellif.ifai.config.DoorOtherConfiguration, com.intellif.ifai.config.DoorOtherConfiguration.Builder, com.intellif.ifai.config.DoorOtherConfigurationOrBuilder> doorOtherConfigurationBuilder_;
    /**
     * <pre>
     *门禁其他配置 20200515 test 
     * </pre>
     *
     * <code>.Ifaipb.DoorOtherConfiguration door_other_configuration = 1;</code>
     */
    public boolean hasDoorOtherConfiguration() {
      return doorOtherConfigurationBuilder_ != null || doorOtherConfiguration_ != null;
    }
    /**
     * <pre>
     *门禁其他配置 20200515 test 
     * </pre>
     *
     * <code>.Ifaipb.DoorOtherConfiguration door_other_configuration = 1;</code>
     */
    public com.intellif.ifai.config.DoorOtherConfiguration getDoorOtherConfiguration() {
      if (doorOtherConfigurationBuilder_ == null) {
        return doorOtherConfiguration_ == null ? com.intellif.ifai.config.DoorOtherConfiguration.getDefaultInstance() : doorOtherConfiguration_;
      } else {
        return doorOtherConfigurationBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     *门禁其他配置 20200515 test 
     * </pre>
     *
     * <code>.Ifaipb.DoorOtherConfiguration door_other_configuration = 1;</code>
     */
    public Builder setDoorOtherConfiguration(com.intellif.ifai.config.DoorOtherConfiguration value) {
      if (doorOtherConfigurationBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        doorOtherConfiguration_ = value;
        onChanged();
      } else {
        doorOtherConfigurationBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     *门禁其他配置 20200515 test 
     * </pre>
     *
     * <code>.Ifaipb.DoorOtherConfiguration door_other_configuration = 1;</code>
     */
    public Builder setDoorOtherConfiguration(
        com.intellif.ifai.config.DoorOtherConfiguration.Builder builderForValue) {
      if (doorOtherConfigurationBuilder_ == null) {
        doorOtherConfiguration_ = builderForValue.build();
        onChanged();
      } else {
        doorOtherConfigurationBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     *门禁其他配置 20200515 test 
     * </pre>
     *
     * <code>.Ifaipb.DoorOtherConfiguration door_other_configuration = 1;</code>
     */
    public Builder mergeDoorOtherConfiguration(com.intellif.ifai.config.DoorOtherConfiguration value) {
      if (doorOtherConfigurationBuilder_ == null) {
        if (doorOtherConfiguration_ != null) {
          doorOtherConfiguration_ =
            com.intellif.ifai.config.DoorOtherConfiguration.newBuilder(doorOtherConfiguration_).mergeFrom(value).buildPartial();
        } else {
          doorOtherConfiguration_ = value;
        }
        onChanged();
      } else {
        doorOtherConfigurationBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     *门禁其他配置 20200515 test 
     * </pre>
     *
     * <code>.Ifaipb.DoorOtherConfiguration door_other_configuration = 1;</code>
     */
    public Builder clearDoorOtherConfiguration() {
      if (doorOtherConfigurationBuilder_ == null) {
        doorOtherConfiguration_ = null;
        onChanged();
      } else {
        doorOtherConfiguration_ = null;
        doorOtherConfigurationBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     *门禁其他配置 20200515 test 
     * </pre>
     *
     * <code>.Ifaipb.DoorOtherConfiguration door_other_configuration = 1;</code>
     */
    public com.intellif.ifai.config.DoorOtherConfiguration.Builder getDoorOtherConfigurationBuilder() {
      
      onChanged();
      return getDoorOtherConfigurationFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     *门禁其他配置 20200515 test 
     * </pre>
     *
     * <code>.Ifaipb.DoorOtherConfiguration door_other_configuration = 1;</code>
     */
    public com.intellif.ifai.config.DoorOtherConfigurationOrBuilder getDoorOtherConfigurationOrBuilder() {
      if (doorOtherConfigurationBuilder_ != null) {
        return doorOtherConfigurationBuilder_.getMessageOrBuilder();
      } else {
        return doorOtherConfiguration_ == null ?
            com.intellif.ifai.config.DoorOtherConfiguration.getDefaultInstance() : doorOtherConfiguration_;
      }
    }
    /**
     * <pre>
     *门禁其他配置 20200515 test 
     * </pre>
     *
     * <code>.Ifaipb.DoorOtherConfiguration door_other_configuration = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.intellif.ifai.config.DoorOtherConfiguration, com.intellif.ifai.config.DoorOtherConfiguration.Builder, com.intellif.ifai.config.DoorOtherConfigurationOrBuilder> 
        getDoorOtherConfigurationFieldBuilder() {
      if (doorOtherConfigurationBuilder_ == null) {
        doorOtherConfigurationBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.intellif.ifai.config.DoorOtherConfiguration, com.intellif.ifai.config.DoorOtherConfiguration.Builder, com.intellif.ifai.config.DoorOtherConfigurationOrBuilder>(
                getDoorOtherConfiguration(),
                getParentForChildren(),
                isClean());
        doorOtherConfiguration_ = null;
      }
      return doorOtherConfigurationBuilder_;
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


    // @@protoc_insertion_point(builder_scope:Ifaipb.GetDoorOtherConfigurationResponse)
  }

  // @@protoc_insertion_point(class_scope:Ifaipb.GetDoorOtherConfigurationResponse)
  private static final com.intellif.ifai.config.GetDoorOtherConfigurationResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.intellif.ifai.config.GetDoorOtherConfigurationResponse();
  }

  public static com.intellif.ifai.config.GetDoorOtherConfigurationResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetDoorOtherConfigurationResponse>
      PARSER = new com.google.protobuf.AbstractParser<GetDoorOtherConfigurationResponse>() {
    @java.lang.Override
    public GetDoorOtherConfigurationResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new GetDoorOtherConfigurationResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<GetDoorOtherConfigurationResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetDoorOtherConfigurationResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.intellif.ifai.config.GetDoorOtherConfigurationResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
