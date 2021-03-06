// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: IfAnalytics.proto

package com.intellif.ifai.face;

/**
 * <pre>
 *增加设置经过区域
 * </pre>
 *
 * Protobuf type {@code Ifaipb.setRulePassRequest}
 */
public  final class setRulePassRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:Ifaipb.setRulePassRequest)
    setRulePassRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use setRulePassRequest.newBuilder() to construct.
  private setRulePassRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private setRulePassRequest() {
    ruleId_ = 0;
    pass_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private setRulePassRequest(
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

            ruleId_ = input.readInt32();
            break;
          }
          case 18: {
            if (!((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
              pass_ = new java.util.ArrayList<com.intellif.ifai.common.Point>();
              mutable_bitField0_ |= 0x00000002;
            }
            pass_.add(
                input.readMessage(com.intellif.ifai.common.Point.parser(), extensionRegistry));
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
      if (((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
        pass_ = java.util.Collections.unmodifiableList(pass_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.intellif.ifai.face.Ifai.internal_static_Ifaipb_setRulePassRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.intellif.ifai.face.Ifai.internal_static_Ifaipb_setRulePassRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.intellif.ifai.face.setRulePassRequest.class, com.intellif.ifai.face.setRulePassRequest.Builder.class);
  }

  private int bitField0_;
  public static final int RULE_ID_FIELD_NUMBER = 1;
  private int ruleId_;
  /**
   * <code>int32 rule_id = 1;</code>
   */
  public int getRuleId() {
    return ruleId_;
  }

  public static final int PASS_FIELD_NUMBER = 2;
  private java.util.List<com.intellif.ifai.common.Point> pass_;
  /**
   * <code>repeated .Ifaipb.Point pass = 2;</code>
   */
  public java.util.List<com.intellif.ifai.common.Point> getPassList() {
    return pass_;
  }
  /**
   * <code>repeated .Ifaipb.Point pass = 2;</code>
   */
  public java.util.List<? extends com.intellif.ifai.common.PointOrBuilder> 
      getPassOrBuilderList() {
    return pass_;
  }
  /**
   * <code>repeated .Ifaipb.Point pass = 2;</code>
   */
  public int getPassCount() {
    return pass_.size();
  }
  /**
   * <code>repeated .Ifaipb.Point pass = 2;</code>
   */
  public com.intellif.ifai.common.Point getPass(int index) {
    return pass_.get(index);
  }
  /**
   * <code>repeated .Ifaipb.Point pass = 2;</code>
   */
  public com.intellif.ifai.common.PointOrBuilder getPassOrBuilder(
      int index) {
    return pass_.get(index);
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
    if (ruleId_ != 0) {
      output.writeInt32(1, ruleId_);
    }
    for (int i = 0; i < pass_.size(); i++) {
      output.writeMessage(2, pass_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (ruleId_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, ruleId_);
    }
    for (int i = 0; i < pass_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, pass_.get(i));
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
    if (!(obj instanceof com.intellif.ifai.face.setRulePassRequest)) {
      return super.equals(obj);
    }
    com.intellif.ifai.face.setRulePassRequest other = (com.intellif.ifai.face.setRulePassRequest) obj;

    boolean result = true;
    result = result && (getRuleId()
        == other.getRuleId());
    result = result && getPassList()
        .equals(other.getPassList());
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
    hash = (37 * hash) + RULE_ID_FIELD_NUMBER;
    hash = (53 * hash) + getRuleId();
    if (getPassCount() > 0) {
      hash = (37 * hash) + PASS_FIELD_NUMBER;
      hash = (53 * hash) + getPassList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.intellif.ifai.face.setRulePassRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.intellif.ifai.face.setRulePassRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.intellif.ifai.face.setRulePassRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.intellif.ifai.face.setRulePassRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.intellif.ifai.face.setRulePassRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.intellif.ifai.face.setRulePassRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.intellif.ifai.face.setRulePassRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.intellif.ifai.face.setRulePassRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.intellif.ifai.face.setRulePassRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.intellif.ifai.face.setRulePassRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.intellif.ifai.face.setRulePassRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.intellif.ifai.face.setRulePassRequest parseFrom(
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
  public static Builder newBuilder(com.intellif.ifai.face.setRulePassRequest prototype) {
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
   *增加设置经过区域
   * </pre>
   *
   * Protobuf type {@code Ifaipb.setRulePassRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:Ifaipb.setRulePassRequest)
      com.intellif.ifai.face.setRulePassRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.intellif.ifai.face.Ifai.internal_static_Ifaipb_setRulePassRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.intellif.ifai.face.Ifai.internal_static_Ifaipb_setRulePassRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.intellif.ifai.face.setRulePassRequest.class, com.intellif.ifai.face.setRulePassRequest.Builder.class);
    }

    // Construct using com.intellif.ifai.face.setRulePassRequest.newBuilder()
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
        getPassFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      ruleId_ = 0;

      if (passBuilder_ == null) {
        pass_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
      } else {
        passBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.intellif.ifai.face.Ifai.internal_static_Ifaipb_setRulePassRequest_descriptor;
    }

    @java.lang.Override
    public com.intellif.ifai.face.setRulePassRequest getDefaultInstanceForType() {
      return com.intellif.ifai.face.setRulePassRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.intellif.ifai.face.setRulePassRequest build() {
      com.intellif.ifai.face.setRulePassRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.intellif.ifai.face.setRulePassRequest buildPartial() {
      com.intellif.ifai.face.setRulePassRequest result = new com.intellif.ifai.face.setRulePassRequest(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      result.ruleId_ = ruleId_;
      if (passBuilder_ == null) {
        if (((bitField0_ & 0x00000002) == 0x00000002)) {
          pass_ = java.util.Collections.unmodifiableList(pass_);
          bitField0_ = (bitField0_ & ~0x00000002);
        }
        result.pass_ = pass_;
      } else {
        result.pass_ = passBuilder_.build();
      }
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
      if (other instanceof com.intellif.ifai.face.setRulePassRequest) {
        return mergeFrom((com.intellif.ifai.face.setRulePassRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.intellif.ifai.face.setRulePassRequest other) {
      if (other == com.intellif.ifai.face.setRulePassRequest.getDefaultInstance()) return this;
      if (other.getRuleId() != 0) {
        setRuleId(other.getRuleId());
      }
      if (passBuilder_ == null) {
        if (!other.pass_.isEmpty()) {
          if (pass_.isEmpty()) {
            pass_ = other.pass_;
            bitField0_ = (bitField0_ & ~0x00000002);
          } else {
            ensurePassIsMutable();
            pass_.addAll(other.pass_);
          }
          onChanged();
        }
      } else {
        if (!other.pass_.isEmpty()) {
          if (passBuilder_.isEmpty()) {
            passBuilder_.dispose();
            passBuilder_ = null;
            pass_ = other.pass_;
            bitField0_ = (bitField0_ & ~0x00000002);
            passBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getPassFieldBuilder() : null;
          } else {
            passBuilder_.addAllMessages(other.pass_);
          }
        }
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
      com.intellif.ifai.face.setRulePassRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.intellif.ifai.face.setRulePassRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private int ruleId_ ;
    /**
     * <code>int32 rule_id = 1;</code>
     */
    public int getRuleId() {
      return ruleId_;
    }
    /**
     * <code>int32 rule_id = 1;</code>
     */
    public Builder setRuleId(int value) {
      
      ruleId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 rule_id = 1;</code>
     */
    public Builder clearRuleId() {
      
      ruleId_ = 0;
      onChanged();
      return this;
    }

    private java.util.List<com.intellif.ifai.common.Point> pass_ =
      java.util.Collections.emptyList();
    private void ensurePassIsMutable() {
      if (!((bitField0_ & 0x00000002) == 0x00000002)) {
        pass_ = new java.util.ArrayList<com.intellif.ifai.common.Point>(pass_);
        bitField0_ |= 0x00000002;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.intellif.ifai.common.Point, com.intellif.ifai.common.Point.Builder, com.intellif.ifai.common.PointOrBuilder> passBuilder_;

    /**
     * <code>repeated .Ifaipb.Point pass = 2;</code>
     */
    public java.util.List<com.intellif.ifai.common.Point> getPassList() {
      if (passBuilder_ == null) {
        return java.util.Collections.unmodifiableList(pass_);
      } else {
        return passBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .Ifaipb.Point pass = 2;</code>
     */
    public int getPassCount() {
      if (passBuilder_ == null) {
        return pass_.size();
      } else {
        return passBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .Ifaipb.Point pass = 2;</code>
     */
    public com.intellif.ifai.common.Point getPass(int index) {
      if (passBuilder_ == null) {
        return pass_.get(index);
      } else {
        return passBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .Ifaipb.Point pass = 2;</code>
     */
    public Builder setPass(
        int index, com.intellif.ifai.common.Point value) {
      if (passBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePassIsMutable();
        pass_.set(index, value);
        onChanged();
      } else {
        passBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .Ifaipb.Point pass = 2;</code>
     */
    public Builder setPass(
        int index, com.intellif.ifai.common.Point.Builder builderForValue) {
      if (passBuilder_ == null) {
        ensurePassIsMutable();
        pass_.set(index, builderForValue.build());
        onChanged();
      } else {
        passBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .Ifaipb.Point pass = 2;</code>
     */
    public Builder addPass(com.intellif.ifai.common.Point value) {
      if (passBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePassIsMutable();
        pass_.add(value);
        onChanged();
      } else {
        passBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .Ifaipb.Point pass = 2;</code>
     */
    public Builder addPass(
        int index, com.intellif.ifai.common.Point value) {
      if (passBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePassIsMutable();
        pass_.add(index, value);
        onChanged();
      } else {
        passBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .Ifaipb.Point pass = 2;</code>
     */
    public Builder addPass(
        com.intellif.ifai.common.Point.Builder builderForValue) {
      if (passBuilder_ == null) {
        ensurePassIsMutable();
        pass_.add(builderForValue.build());
        onChanged();
      } else {
        passBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .Ifaipb.Point pass = 2;</code>
     */
    public Builder addPass(
        int index, com.intellif.ifai.common.Point.Builder builderForValue) {
      if (passBuilder_ == null) {
        ensurePassIsMutable();
        pass_.add(index, builderForValue.build());
        onChanged();
      } else {
        passBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .Ifaipb.Point pass = 2;</code>
     */
    public Builder addAllPass(
        java.lang.Iterable<? extends com.intellif.ifai.common.Point> values) {
      if (passBuilder_ == null) {
        ensurePassIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, pass_);
        onChanged();
      } else {
        passBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .Ifaipb.Point pass = 2;</code>
     */
    public Builder clearPass() {
      if (passBuilder_ == null) {
        pass_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
      } else {
        passBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .Ifaipb.Point pass = 2;</code>
     */
    public Builder removePass(int index) {
      if (passBuilder_ == null) {
        ensurePassIsMutable();
        pass_.remove(index);
        onChanged();
      } else {
        passBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .Ifaipb.Point pass = 2;</code>
     */
    public com.intellif.ifai.common.Point.Builder getPassBuilder(
        int index) {
      return getPassFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .Ifaipb.Point pass = 2;</code>
     */
    public com.intellif.ifai.common.PointOrBuilder getPassOrBuilder(
        int index) {
      if (passBuilder_ == null) {
        return pass_.get(index);  } else {
        return passBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .Ifaipb.Point pass = 2;</code>
     */
    public java.util.List<? extends com.intellif.ifai.common.PointOrBuilder> 
         getPassOrBuilderList() {
      if (passBuilder_ != null) {
        return passBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(pass_);
      }
    }
    /**
     * <code>repeated .Ifaipb.Point pass = 2;</code>
     */
    public com.intellif.ifai.common.Point.Builder addPassBuilder() {
      return getPassFieldBuilder().addBuilder(
          com.intellif.ifai.common.Point.getDefaultInstance());
    }
    /**
     * <code>repeated .Ifaipb.Point pass = 2;</code>
     */
    public com.intellif.ifai.common.Point.Builder addPassBuilder(
        int index) {
      return getPassFieldBuilder().addBuilder(
          index, com.intellif.ifai.common.Point.getDefaultInstance());
    }
    /**
     * <code>repeated .Ifaipb.Point pass = 2;</code>
     */
    public java.util.List<com.intellif.ifai.common.Point.Builder> 
         getPassBuilderList() {
      return getPassFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.intellif.ifai.common.Point, com.intellif.ifai.common.Point.Builder, com.intellif.ifai.common.PointOrBuilder> 
        getPassFieldBuilder() {
      if (passBuilder_ == null) {
        passBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.intellif.ifai.common.Point, com.intellif.ifai.common.Point.Builder, com.intellif.ifai.common.PointOrBuilder>(
                pass_,
                ((bitField0_ & 0x00000002) == 0x00000002),
                getParentForChildren(),
                isClean());
        pass_ = null;
      }
      return passBuilder_;
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


    // @@protoc_insertion_point(builder_scope:Ifaipb.setRulePassRequest)
  }

  // @@protoc_insertion_point(class_scope:Ifaipb.setRulePassRequest)
  private static final com.intellif.ifai.face.setRulePassRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.intellif.ifai.face.setRulePassRequest();
  }

  public static com.intellif.ifai.face.setRulePassRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<setRulePassRequest>
      PARSER = new com.google.protobuf.AbstractParser<setRulePassRequest>() {
    @java.lang.Override
    public setRulePassRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new setRulePassRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<setRulePassRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<setRulePassRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.intellif.ifai.face.setRulePassRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

