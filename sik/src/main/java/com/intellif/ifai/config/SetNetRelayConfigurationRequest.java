// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: IfDoorControlConfiguration.proto

package com.intellif.ifai.config;

/**
 * <pre>
 *门禁网络继电器 20201022
 * </pre>
 *
 * Protobuf type {@code Ifaipb.SetNetRelayConfigurationRequest}
 */
public  final class SetNetRelayConfigurationRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:Ifaipb.SetNetRelayConfigurationRequest)
    SetNetRelayConfigurationRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use SetNetRelayConfigurationRequest.newBuilder() to construct.
  private SetNetRelayConfigurationRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SetNetRelayConfigurationRequest() {
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private SetNetRelayConfigurationRequest(
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
            com.intellif.ifai.config.NetRelayConfiguration.Builder subBuilder = null;
            if (netRelayCfg_ != null) {
              subBuilder = netRelayCfg_.toBuilder();
            }
            netRelayCfg_ = input.readMessage(com.intellif.ifai.config.NetRelayConfiguration.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(netRelayCfg_);
              netRelayCfg_ = subBuilder.buildPartial();
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
    return com.intellif.ifai.config.Ifai.internal_static_Ifaipb_SetNetRelayConfigurationRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.intellif.ifai.config.Ifai.internal_static_Ifaipb_SetNetRelayConfigurationRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.intellif.ifai.config.SetNetRelayConfigurationRequest.class, com.intellif.ifai.config.SetNetRelayConfigurationRequest.Builder.class);
  }

  public static final int NETRELAYCFG_FIELD_NUMBER = 1;
  private com.intellif.ifai.config.NetRelayConfiguration netRelayCfg_;
  /**
   * <pre>
   *网络继电器配置  
   * </pre>
   *
   * <code>.Ifaipb.NetRelayConfiguration netRelayCfg = 1;</code>
   */
  public boolean hasNetRelayCfg() {
    return netRelayCfg_ != null;
  }
  /**
   * <pre>
   *网络继电器配置  
   * </pre>
   *
   * <code>.Ifaipb.NetRelayConfiguration netRelayCfg = 1;</code>
   */
  public com.intellif.ifai.config.NetRelayConfiguration getNetRelayCfg() {
    return netRelayCfg_ == null ? com.intellif.ifai.config.NetRelayConfiguration.getDefaultInstance() : netRelayCfg_;
  }
  /**
   * <pre>
   *网络继电器配置  
   * </pre>
   *
   * <code>.Ifaipb.NetRelayConfiguration netRelayCfg = 1;</code>
   */
  public com.intellif.ifai.config.NetRelayConfigurationOrBuilder getNetRelayCfgOrBuilder() {
    return getNetRelayCfg();
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
    if (netRelayCfg_ != null) {
      output.writeMessage(1, getNetRelayCfg());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (netRelayCfg_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getNetRelayCfg());
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
    if (!(obj instanceof com.intellif.ifai.config.SetNetRelayConfigurationRequest)) {
      return super.equals(obj);
    }
    com.intellif.ifai.config.SetNetRelayConfigurationRequest other = (com.intellif.ifai.config.SetNetRelayConfigurationRequest) obj;

    boolean result = true;
    result = result && (hasNetRelayCfg() == other.hasNetRelayCfg());
    if (hasNetRelayCfg()) {
      result = result && getNetRelayCfg()
          .equals(other.getNetRelayCfg());
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
    if (hasNetRelayCfg()) {
      hash = (37 * hash) + NETRELAYCFG_FIELD_NUMBER;
      hash = (53 * hash) + getNetRelayCfg().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.intellif.ifai.config.SetNetRelayConfigurationRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.intellif.ifai.config.SetNetRelayConfigurationRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.intellif.ifai.config.SetNetRelayConfigurationRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.intellif.ifai.config.SetNetRelayConfigurationRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.intellif.ifai.config.SetNetRelayConfigurationRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.intellif.ifai.config.SetNetRelayConfigurationRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.intellif.ifai.config.SetNetRelayConfigurationRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.intellif.ifai.config.SetNetRelayConfigurationRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.intellif.ifai.config.SetNetRelayConfigurationRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.intellif.ifai.config.SetNetRelayConfigurationRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.intellif.ifai.config.SetNetRelayConfigurationRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.intellif.ifai.config.SetNetRelayConfigurationRequest parseFrom(
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
  public static Builder newBuilder(com.intellif.ifai.config.SetNetRelayConfigurationRequest prototype) {
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
   *门禁网络继电器 20201022
   * </pre>
   *
   * Protobuf type {@code Ifaipb.SetNetRelayConfigurationRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:Ifaipb.SetNetRelayConfigurationRequest)
      com.intellif.ifai.config.SetNetRelayConfigurationRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.intellif.ifai.config.Ifai.internal_static_Ifaipb_SetNetRelayConfigurationRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.intellif.ifai.config.Ifai.internal_static_Ifaipb_SetNetRelayConfigurationRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.intellif.ifai.config.SetNetRelayConfigurationRequest.class, com.intellif.ifai.config.SetNetRelayConfigurationRequest.Builder.class);
    }

    // Construct using com.intellif.ifai.config.SetNetRelayConfigurationRequest.newBuilder()
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
      if (netRelayCfgBuilder_ == null) {
        netRelayCfg_ = null;
      } else {
        netRelayCfg_ = null;
        netRelayCfgBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.intellif.ifai.config.Ifai.internal_static_Ifaipb_SetNetRelayConfigurationRequest_descriptor;
    }

    @java.lang.Override
    public com.intellif.ifai.config.SetNetRelayConfigurationRequest getDefaultInstanceForType() {
      return com.intellif.ifai.config.SetNetRelayConfigurationRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.intellif.ifai.config.SetNetRelayConfigurationRequest build() {
      com.intellif.ifai.config.SetNetRelayConfigurationRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.intellif.ifai.config.SetNetRelayConfigurationRequest buildPartial() {
      com.intellif.ifai.config.SetNetRelayConfigurationRequest result = new com.intellif.ifai.config.SetNetRelayConfigurationRequest(this);
      if (netRelayCfgBuilder_ == null) {
        result.netRelayCfg_ = netRelayCfg_;
      } else {
        result.netRelayCfg_ = netRelayCfgBuilder_.build();
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
      if (other instanceof com.intellif.ifai.config.SetNetRelayConfigurationRequest) {
        return mergeFrom((com.intellif.ifai.config.SetNetRelayConfigurationRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.intellif.ifai.config.SetNetRelayConfigurationRequest other) {
      if (other == com.intellif.ifai.config.SetNetRelayConfigurationRequest.getDefaultInstance()) return this;
      if (other.hasNetRelayCfg()) {
        mergeNetRelayCfg(other.getNetRelayCfg());
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
      com.intellif.ifai.config.SetNetRelayConfigurationRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.intellif.ifai.config.SetNetRelayConfigurationRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.intellif.ifai.config.NetRelayConfiguration netRelayCfg_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.intellif.ifai.config.NetRelayConfiguration, com.intellif.ifai.config.NetRelayConfiguration.Builder, com.intellif.ifai.config.NetRelayConfigurationOrBuilder> netRelayCfgBuilder_;
    /**
     * <pre>
     *网络继电器配置  
     * </pre>
     *
     * <code>.Ifaipb.NetRelayConfiguration netRelayCfg = 1;</code>
     */
    public boolean hasNetRelayCfg() {
      return netRelayCfgBuilder_ != null || netRelayCfg_ != null;
    }
    /**
     * <pre>
     *网络继电器配置  
     * </pre>
     *
     * <code>.Ifaipb.NetRelayConfiguration netRelayCfg = 1;</code>
     */
    public com.intellif.ifai.config.NetRelayConfiguration getNetRelayCfg() {
      if (netRelayCfgBuilder_ == null) {
        return netRelayCfg_ == null ? com.intellif.ifai.config.NetRelayConfiguration.getDefaultInstance() : netRelayCfg_;
      } else {
        return netRelayCfgBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     *网络继电器配置  
     * </pre>
     *
     * <code>.Ifaipb.NetRelayConfiguration netRelayCfg = 1;</code>
     */
    public Builder setNetRelayCfg(com.intellif.ifai.config.NetRelayConfiguration value) {
      if (netRelayCfgBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        netRelayCfg_ = value;
        onChanged();
      } else {
        netRelayCfgBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     *网络继电器配置  
     * </pre>
     *
     * <code>.Ifaipb.NetRelayConfiguration netRelayCfg = 1;</code>
     */
    public Builder setNetRelayCfg(
        com.intellif.ifai.config.NetRelayConfiguration.Builder builderForValue) {
      if (netRelayCfgBuilder_ == null) {
        netRelayCfg_ = builderForValue.build();
        onChanged();
      } else {
        netRelayCfgBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     *网络继电器配置  
     * </pre>
     *
     * <code>.Ifaipb.NetRelayConfiguration netRelayCfg = 1;</code>
     */
    public Builder mergeNetRelayCfg(com.intellif.ifai.config.NetRelayConfiguration value) {
      if (netRelayCfgBuilder_ == null) {
        if (netRelayCfg_ != null) {
          netRelayCfg_ =
            com.intellif.ifai.config.NetRelayConfiguration.newBuilder(netRelayCfg_).mergeFrom(value).buildPartial();
        } else {
          netRelayCfg_ = value;
        }
        onChanged();
      } else {
        netRelayCfgBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     *网络继电器配置  
     * </pre>
     *
     * <code>.Ifaipb.NetRelayConfiguration netRelayCfg = 1;</code>
     */
    public Builder clearNetRelayCfg() {
      if (netRelayCfgBuilder_ == null) {
        netRelayCfg_ = null;
        onChanged();
      } else {
        netRelayCfg_ = null;
        netRelayCfgBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     *网络继电器配置  
     * </pre>
     *
     * <code>.Ifaipb.NetRelayConfiguration netRelayCfg = 1;</code>
     */
    public com.intellif.ifai.config.NetRelayConfiguration.Builder getNetRelayCfgBuilder() {
      
      onChanged();
      return getNetRelayCfgFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     *网络继电器配置  
     * </pre>
     *
     * <code>.Ifaipb.NetRelayConfiguration netRelayCfg = 1;</code>
     */
    public com.intellif.ifai.config.NetRelayConfigurationOrBuilder getNetRelayCfgOrBuilder() {
      if (netRelayCfgBuilder_ != null) {
        return netRelayCfgBuilder_.getMessageOrBuilder();
      } else {
        return netRelayCfg_ == null ?
            com.intellif.ifai.config.NetRelayConfiguration.getDefaultInstance() : netRelayCfg_;
      }
    }
    /**
     * <pre>
     *网络继电器配置  
     * </pre>
     *
     * <code>.Ifaipb.NetRelayConfiguration netRelayCfg = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.intellif.ifai.config.NetRelayConfiguration, com.intellif.ifai.config.NetRelayConfiguration.Builder, com.intellif.ifai.config.NetRelayConfigurationOrBuilder> 
        getNetRelayCfgFieldBuilder() {
      if (netRelayCfgBuilder_ == null) {
        netRelayCfgBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.intellif.ifai.config.NetRelayConfiguration, com.intellif.ifai.config.NetRelayConfiguration.Builder, com.intellif.ifai.config.NetRelayConfigurationOrBuilder>(
                getNetRelayCfg(),
                getParentForChildren(),
                isClean());
        netRelayCfg_ = null;
      }
      return netRelayCfgBuilder_;
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


    // @@protoc_insertion_point(builder_scope:Ifaipb.SetNetRelayConfigurationRequest)
  }

  // @@protoc_insertion_point(class_scope:Ifaipb.SetNetRelayConfigurationRequest)
  private static final com.intellif.ifai.config.SetNetRelayConfigurationRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.intellif.ifai.config.SetNetRelayConfigurationRequest();
  }

  public static com.intellif.ifai.config.SetNetRelayConfigurationRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SetNetRelayConfigurationRequest>
      PARSER = new com.google.protobuf.AbstractParser<SetNetRelayConfigurationRequest>() {
    @java.lang.Override
    public SetNetRelayConfigurationRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new SetNetRelayConfigurationRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<SetNetRelayConfigurationRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SetNetRelayConfigurationRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.intellif.ifai.config.SetNetRelayConfigurationRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
