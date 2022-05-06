// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: IfEvent.proto

package com.intellif.ifai.event;

/**
 * Protobuf type {@code Ifaipb.GetPassengerFlowConfigurationResponse}
 */
public  final class GetPassengerFlowConfigurationResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:Ifaipb.GetPassengerFlowConfigurationResponse)
    GetPassengerFlowConfigurationResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GetPassengerFlowConfigurationResponse.newBuilder() to construct.
  private GetPassengerFlowConfigurationResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GetPassengerFlowConfigurationResponse() {
    lineConfiguration_ = java.util.Collections.emptyList();
    interval_ = 0;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private GetPassengerFlowConfigurationResponse(
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
            if (!((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
              lineConfiguration_ = new java.util.ArrayList<com.intellif.ifai.event.LineConfiguration>();
              mutable_bitField0_ |= 0x00000001;
            }
            lineConfiguration_.add(
                input.readMessage(com.intellif.ifai.event.LineConfiguration.parser(), extensionRegistry));
            break;
          }
          case 16: {

            interval_ = input.readInt32();
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
      if (((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
        lineConfiguration_ = java.util.Collections.unmodifiableList(lineConfiguration_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.intellif.ifai.event.Ifai.internal_static_Ifaipb_GetPassengerFlowConfigurationResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.intellif.ifai.event.Ifai.internal_static_Ifaipb_GetPassengerFlowConfigurationResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.intellif.ifai.event.GetPassengerFlowConfigurationResponse.class, com.intellif.ifai.event.GetPassengerFlowConfigurationResponse.Builder.class);
  }

  private int bitField0_;
  public static final int LINE_CONFIGURATION_FIELD_NUMBER = 1;
  private java.util.List<com.intellif.ifai.event.LineConfiguration> lineConfiguration_;
  /**
   * <code>repeated .Ifaipb.LineConfiguration line_configuration = 1;</code>
   */
  public java.util.List<com.intellif.ifai.event.LineConfiguration> getLineConfigurationList() {
    return lineConfiguration_;
  }
  /**
   * <code>repeated .Ifaipb.LineConfiguration line_configuration = 1;</code>
   */
  public java.util.List<? extends com.intellif.ifai.event.LineConfigurationOrBuilder> 
      getLineConfigurationOrBuilderList() {
    return lineConfiguration_;
  }
  /**
   * <code>repeated .Ifaipb.LineConfiguration line_configuration = 1;</code>
   */
  public int getLineConfigurationCount() {
    return lineConfiguration_.size();
  }
  /**
   * <code>repeated .Ifaipb.LineConfiguration line_configuration = 1;</code>
   */
  public com.intellif.ifai.event.LineConfiguration getLineConfiguration(int index) {
    return lineConfiguration_.get(index);
  }
  /**
   * <code>repeated .Ifaipb.LineConfiguration line_configuration = 1;</code>
   */
  public com.intellif.ifai.event.LineConfigurationOrBuilder getLineConfigurationOrBuilder(
      int index) {
    return lineConfiguration_.get(index);
  }

  public static final int INTERVAL_FIELD_NUMBER = 2;
  private int interval_;
  /**
   * <code>int32 interval = 2;</code>
   */
  public int getInterval() {
    return interval_;
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
    for (int i = 0; i < lineConfiguration_.size(); i++) {
      output.writeMessage(1, lineConfiguration_.get(i));
    }
    if (interval_ != 0) {
      output.writeInt32(2, interval_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < lineConfiguration_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, lineConfiguration_.get(i));
    }
    if (interval_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, interval_);
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
    if (!(obj instanceof com.intellif.ifai.event.GetPassengerFlowConfigurationResponse)) {
      return super.equals(obj);
    }
    com.intellif.ifai.event.GetPassengerFlowConfigurationResponse other = (com.intellif.ifai.event.GetPassengerFlowConfigurationResponse) obj;

    boolean result = true;
    result = result && getLineConfigurationList()
        .equals(other.getLineConfigurationList());
    result = result && (getInterval()
        == other.getInterval());
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
    if (getLineConfigurationCount() > 0) {
      hash = (37 * hash) + LINE_CONFIGURATION_FIELD_NUMBER;
      hash = (53 * hash) + getLineConfigurationList().hashCode();
    }
    hash = (37 * hash) + INTERVAL_FIELD_NUMBER;
    hash = (53 * hash) + getInterval();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.intellif.ifai.event.GetPassengerFlowConfigurationResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.intellif.ifai.event.GetPassengerFlowConfigurationResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.intellif.ifai.event.GetPassengerFlowConfigurationResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.intellif.ifai.event.GetPassengerFlowConfigurationResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.intellif.ifai.event.GetPassengerFlowConfigurationResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.intellif.ifai.event.GetPassengerFlowConfigurationResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.intellif.ifai.event.GetPassengerFlowConfigurationResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.intellif.ifai.event.GetPassengerFlowConfigurationResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.intellif.ifai.event.GetPassengerFlowConfigurationResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.intellif.ifai.event.GetPassengerFlowConfigurationResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.intellif.ifai.event.GetPassengerFlowConfigurationResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.intellif.ifai.event.GetPassengerFlowConfigurationResponse parseFrom(
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
  public static Builder newBuilder(com.intellif.ifai.event.GetPassengerFlowConfigurationResponse prototype) {
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
   * Protobuf type {@code Ifaipb.GetPassengerFlowConfigurationResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:Ifaipb.GetPassengerFlowConfigurationResponse)
      com.intellif.ifai.event.GetPassengerFlowConfigurationResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.intellif.ifai.event.Ifai.internal_static_Ifaipb_GetPassengerFlowConfigurationResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.intellif.ifai.event.Ifai.internal_static_Ifaipb_GetPassengerFlowConfigurationResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.intellif.ifai.event.GetPassengerFlowConfigurationResponse.class, com.intellif.ifai.event.GetPassengerFlowConfigurationResponse.Builder.class);
    }

    // Construct using com.intellif.ifai.event.GetPassengerFlowConfigurationResponse.newBuilder()
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
        getLineConfigurationFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (lineConfigurationBuilder_ == null) {
        lineConfiguration_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        lineConfigurationBuilder_.clear();
      }
      interval_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.intellif.ifai.event.Ifai.internal_static_Ifaipb_GetPassengerFlowConfigurationResponse_descriptor;
    }

    @java.lang.Override
    public com.intellif.ifai.event.GetPassengerFlowConfigurationResponse getDefaultInstanceForType() {
      return com.intellif.ifai.event.GetPassengerFlowConfigurationResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.intellif.ifai.event.GetPassengerFlowConfigurationResponse build() {
      com.intellif.ifai.event.GetPassengerFlowConfigurationResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.intellif.ifai.event.GetPassengerFlowConfigurationResponse buildPartial() {
      com.intellif.ifai.event.GetPassengerFlowConfigurationResponse result = new com.intellif.ifai.event.GetPassengerFlowConfigurationResponse(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (lineConfigurationBuilder_ == null) {
        if (((bitField0_ & 0x00000001) == 0x00000001)) {
          lineConfiguration_ = java.util.Collections.unmodifiableList(lineConfiguration_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.lineConfiguration_ = lineConfiguration_;
      } else {
        result.lineConfiguration_ = lineConfigurationBuilder_.build();
      }
      result.interval_ = interval_;
      result.bitField0_ = to_bitField0_;
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
      if (other instanceof com.intellif.ifai.event.GetPassengerFlowConfigurationResponse) {
        return mergeFrom((com.intellif.ifai.event.GetPassengerFlowConfigurationResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.intellif.ifai.event.GetPassengerFlowConfigurationResponse other) {
      if (other == com.intellif.ifai.event.GetPassengerFlowConfigurationResponse.getDefaultInstance()) return this;
      if (lineConfigurationBuilder_ == null) {
        if (!other.lineConfiguration_.isEmpty()) {
          if (lineConfiguration_.isEmpty()) {
            lineConfiguration_ = other.lineConfiguration_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureLineConfigurationIsMutable();
            lineConfiguration_.addAll(other.lineConfiguration_);
          }
          onChanged();
        }
      } else {
        if (!other.lineConfiguration_.isEmpty()) {
          if (lineConfigurationBuilder_.isEmpty()) {
            lineConfigurationBuilder_.dispose();
            lineConfigurationBuilder_ = null;
            lineConfiguration_ = other.lineConfiguration_;
            bitField0_ = (bitField0_ & ~0x00000001);
            lineConfigurationBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getLineConfigurationFieldBuilder() : null;
          } else {
            lineConfigurationBuilder_.addAllMessages(other.lineConfiguration_);
          }
        }
      }
      if (other.getInterval() != 0) {
        setInterval(other.getInterval());
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
      com.intellif.ifai.event.GetPassengerFlowConfigurationResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.intellif.ifai.event.GetPassengerFlowConfigurationResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<com.intellif.ifai.event.LineConfiguration> lineConfiguration_ =
      java.util.Collections.emptyList();
    private void ensureLineConfigurationIsMutable() {
      if (!((bitField0_ & 0x00000001) == 0x00000001)) {
        lineConfiguration_ = new java.util.ArrayList<com.intellif.ifai.event.LineConfiguration>(lineConfiguration_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.intellif.ifai.event.LineConfiguration, com.intellif.ifai.event.LineConfiguration.Builder, com.intellif.ifai.event.LineConfigurationOrBuilder> lineConfigurationBuilder_;

    /**
     * <code>repeated .Ifaipb.LineConfiguration line_configuration = 1;</code>
     */
    public java.util.List<com.intellif.ifai.event.LineConfiguration> getLineConfigurationList() {
      if (lineConfigurationBuilder_ == null) {
        return java.util.Collections.unmodifiableList(lineConfiguration_);
      } else {
        return lineConfigurationBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .Ifaipb.LineConfiguration line_configuration = 1;</code>
     */
    public int getLineConfigurationCount() {
      if (lineConfigurationBuilder_ == null) {
        return lineConfiguration_.size();
      } else {
        return lineConfigurationBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .Ifaipb.LineConfiguration line_configuration = 1;</code>
     */
    public com.intellif.ifai.event.LineConfiguration getLineConfiguration(int index) {
      if (lineConfigurationBuilder_ == null) {
        return lineConfiguration_.get(index);
      } else {
        return lineConfigurationBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .Ifaipb.LineConfiguration line_configuration = 1;</code>
     */
    public Builder setLineConfiguration(
        int index, com.intellif.ifai.event.LineConfiguration value) {
      if (lineConfigurationBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureLineConfigurationIsMutable();
        lineConfiguration_.set(index, value);
        onChanged();
      } else {
        lineConfigurationBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .Ifaipb.LineConfiguration line_configuration = 1;</code>
     */
    public Builder setLineConfiguration(
        int index, com.intellif.ifai.event.LineConfiguration.Builder builderForValue) {
      if (lineConfigurationBuilder_ == null) {
        ensureLineConfigurationIsMutable();
        lineConfiguration_.set(index, builderForValue.build());
        onChanged();
      } else {
        lineConfigurationBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .Ifaipb.LineConfiguration line_configuration = 1;</code>
     */
    public Builder addLineConfiguration(com.intellif.ifai.event.LineConfiguration value) {
      if (lineConfigurationBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureLineConfigurationIsMutable();
        lineConfiguration_.add(value);
        onChanged();
      } else {
        lineConfigurationBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .Ifaipb.LineConfiguration line_configuration = 1;</code>
     */
    public Builder addLineConfiguration(
        int index, com.intellif.ifai.event.LineConfiguration value) {
      if (lineConfigurationBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureLineConfigurationIsMutable();
        lineConfiguration_.add(index, value);
        onChanged();
      } else {
        lineConfigurationBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .Ifaipb.LineConfiguration line_configuration = 1;</code>
     */
    public Builder addLineConfiguration(
        com.intellif.ifai.event.LineConfiguration.Builder builderForValue) {
      if (lineConfigurationBuilder_ == null) {
        ensureLineConfigurationIsMutable();
        lineConfiguration_.add(builderForValue.build());
        onChanged();
      } else {
        lineConfigurationBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .Ifaipb.LineConfiguration line_configuration = 1;</code>
     */
    public Builder addLineConfiguration(
        int index, com.intellif.ifai.event.LineConfiguration.Builder builderForValue) {
      if (lineConfigurationBuilder_ == null) {
        ensureLineConfigurationIsMutable();
        lineConfiguration_.add(index, builderForValue.build());
        onChanged();
      } else {
        lineConfigurationBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .Ifaipb.LineConfiguration line_configuration = 1;</code>
     */
    public Builder addAllLineConfiguration(
        java.lang.Iterable<? extends com.intellif.ifai.event.LineConfiguration> values) {
      if (lineConfigurationBuilder_ == null) {
        ensureLineConfigurationIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, lineConfiguration_);
        onChanged();
      } else {
        lineConfigurationBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .Ifaipb.LineConfiguration line_configuration = 1;</code>
     */
    public Builder clearLineConfiguration() {
      if (lineConfigurationBuilder_ == null) {
        lineConfiguration_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        lineConfigurationBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .Ifaipb.LineConfiguration line_configuration = 1;</code>
     */
    public Builder removeLineConfiguration(int index) {
      if (lineConfigurationBuilder_ == null) {
        ensureLineConfigurationIsMutable();
        lineConfiguration_.remove(index);
        onChanged();
      } else {
        lineConfigurationBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .Ifaipb.LineConfiguration line_configuration = 1;</code>
     */
    public com.intellif.ifai.event.LineConfiguration.Builder getLineConfigurationBuilder(
        int index) {
      return getLineConfigurationFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .Ifaipb.LineConfiguration line_configuration = 1;</code>
     */
    public com.intellif.ifai.event.LineConfigurationOrBuilder getLineConfigurationOrBuilder(
        int index) {
      if (lineConfigurationBuilder_ == null) {
        return lineConfiguration_.get(index);  } else {
        return lineConfigurationBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .Ifaipb.LineConfiguration line_configuration = 1;</code>
     */
    public java.util.List<? extends com.intellif.ifai.event.LineConfigurationOrBuilder> 
         getLineConfigurationOrBuilderList() {
      if (lineConfigurationBuilder_ != null) {
        return lineConfigurationBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(lineConfiguration_);
      }
    }
    /**
     * <code>repeated .Ifaipb.LineConfiguration line_configuration = 1;</code>
     */
    public com.intellif.ifai.event.LineConfiguration.Builder addLineConfigurationBuilder() {
      return getLineConfigurationFieldBuilder().addBuilder(
          com.intellif.ifai.event.LineConfiguration.getDefaultInstance());
    }
    /**
     * <code>repeated .Ifaipb.LineConfiguration line_configuration = 1;</code>
     */
    public com.intellif.ifai.event.LineConfiguration.Builder addLineConfigurationBuilder(
        int index) {
      return getLineConfigurationFieldBuilder().addBuilder(
          index, com.intellif.ifai.event.LineConfiguration.getDefaultInstance());
    }
    /**
     * <code>repeated .Ifaipb.LineConfiguration line_configuration = 1;</code>
     */
    public java.util.List<com.intellif.ifai.event.LineConfiguration.Builder> 
         getLineConfigurationBuilderList() {
      return getLineConfigurationFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.intellif.ifai.event.LineConfiguration, com.intellif.ifai.event.LineConfiguration.Builder, com.intellif.ifai.event.LineConfigurationOrBuilder> 
        getLineConfigurationFieldBuilder() {
      if (lineConfigurationBuilder_ == null) {
        lineConfigurationBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.intellif.ifai.event.LineConfiguration, com.intellif.ifai.event.LineConfiguration.Builder, com.intellif.ifai.event.LineConfigurationOrBuilder>(
                lineConfiguration_,
                ((bitField0_ & 0x00000001) == 0x00000001),
                getParentForChildren(),
                isClean());
        lineConfiguration_ = null;
      }
      return lineConfigurationBuilder_;
    }

    private int interval_ ;
    /**
     * <code>int32 interval = 2;</code>
     */
    public int getInterval() {
      return interval_;
    }
    /**
     * <code>int32 interval = 2;</code>
     */
    public Builder setInterval(int value) {
      
      interval_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 interval = 2;</code>
     */
    public Builder clearInterval() {
      
      interval_ = 0;
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


    // @@protoc_insertion_point(builder_scope:Ifaipb.GetPassengerFlowConfigurationResponse)
  }

  // @@protoc_insertion_point(class_scope:Ifaipb.GetPassengerFlowConfigurationResponse)
  private static final com.intellif.ifai.event.GetPassengerFlowConfigurationResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.intellif.ifai.event.GetPassengerFlowConfigurationResponse();
  }

  public static com.intellif.ifai.event.GetPassengerFlowConfigurationResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetPassengerFlowConfigurationResponse>
      PARSER = new com.google.protobuf.AbstractParser<GetPassengerFlowConfigurationResponse>() {
    @java.lang.Override
    public GetPassengerFlowConfigurationResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new GetPassengerFlowConfigurationResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<GetPassengerFlowConfigurationResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetPassengerFlowConfigurationResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.intellif.ifai.event.GetPassengerFlowConfigurationResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

