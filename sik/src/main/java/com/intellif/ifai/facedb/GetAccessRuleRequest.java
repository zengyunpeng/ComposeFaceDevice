// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: IfFaceDatabase.proto

package com.intellif.ifai.facedb;

/**
 * <pre>
 *新增查询通行规则请求
 * </pre>
 *
 * Protobuf type {@code Ifaipb.GetAccessRuleRequest}
 */
public  final class GetAccessRuleRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:Ifaipb.GetAccessRuleRequest)
    GetAccessRuleRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GetAccessRuleRequest.newBuilder() to construct.
  private GetAccessRuleRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GetAccessRuleRequest() {
    ruleIds_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private GetAccessRuleRequest(
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
            if (!((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
              ruleIds_ = new java.util.ArrayList<java.lang.Integer>();
              mutable_bitField0_ |= 0x00000001;
            }
            ruleIds_.add(input.readInt32());
            break;
          }
          case 10: {
            int length = input.readRawVarint32();
            int limit = input.pushLimit(length);
            if (!((mutable_bitField0_ & 0x00000001) == 0x00000001) && input.getBytesUntilLimit() > 0) {
              ruleIds_ = new java.util.ArrayList<java.lang.Integer>();
              mutable_bitField0_ |= 0x00000001;
            }
            while (input.getBytesUntilLimit() > 0) {
              ruleIds_.add(input.readInt32());
            }
            input.popLimit(limit);
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
        ruleIds_ = java.util.Collections.unmodifiableList(ruleIds_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.intellif.ifai.facedb.Ifai.internal_static_Ifaipb_GetAccessRuleRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.intellif.ifai.facedb.Ifai.internal_static_Ifaipb_GetAccessRuleRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.intellif.ifai.facedb.GetAccessRuleRequest.class, com.intellif.ifai.facedb.GetAccessRuleRequest.Builder.class);
  }

  public static final int RULE_IDS_FIELD_NUMBER = 1;
  private java.util.List<java.lang.Integer> ruleIds_;
  /**
   * <pre>
   *规则id,为空则返回设备所有的规则
   * </pre>
   *
   * <code>repeated int32 rule_ids = 1;</code>
   */
  public java.util.List<java.lang.Integer>
      getRuleIdsList() {
    return ruleIds_;
  }
  /**
   * <pre>
   *规则id,为空则返回设备所有的规则
   * </pre>
   *
   * <code>repeated int32 rule_ids = 1;</code>
   */
  public int getRuleIdsCount() {
    return ruleIds_.size();
  }
  /**
   * <pre>
   *规则id,为空则返回设备所有的规则
   * </pre>
   *
   * <code>repeated int32 rule_ids = 1;</code>
   */
  public int getRuleIds(int index) {
    return ruleIds_.get(index);
  }
  private int ruleIdsMemoizedSerializedSize = -1;

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
    getSerializedSize();
    if (getRuleIdsList().size() > 0) {
      output.writeUInt32NoTag(10);
      output.writeUInt32NoTag(ruleIdsMemoizedSerializedSize);
    }
    for (int i = 0; i < ruleIds_.size(); i++) {
      output.writeInt32NoTag(ruleIds_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    {
      int dataSize = 0;
      for (int i = 0; i < ruleIds_.size(); i++) {
        dataSize += com.google.protobuf.CodedOutputStream
          .computeInt32SizeNoTag(ruleIds_.get(i));
      }
      size += dataSize;
      if (!getRuleIdsList().isEmpty()) {
        size += 1;
        size += com.google.protobuf.CodedOutputStream
            .computeInt32SizeNoTag(dataSize);
      }
      ruleIdsMemoizedSerializedSize = dataSize;
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
    if (!(obj instanceof com.intellif.ifai.facedb.GetAccessRuleRequest)) {
      return super.equals(obj);
    }
    com.intellif.ifai.facedb.GetAccessRuleRequest other = (com.intellif.ifai.facedb.GetAccessRuleRequest) obj;

    boolean result = true;
    result = result && getRuleIdsList()
        .equals(other.getRuleIdsList());
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
    if (getRuleIdsCount() > 0) {
      hash = (37 * hash) + RULE_IDS_FIELD_NUMBER;
      hash = (53 * hash) + getRuleIdsList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.intellif.ifai.facedb.GetAccessRuleRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.intellif.ifai.facedb.GetAccessRuleRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.intellif.ifai.facedb.GetAccessRuleRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.intellif.ifai.facedb.GetAccessRuleRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.intellif.ifai.facedb.GetAccessRuleRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.intellif.ifai.facedb.GetAccessRuleRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.intellif.ifai.facedb.GetAccessRuleRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.intellif.ifai.facedb.GetAccessRuleRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.intellif.ifai.facedb.GetAccessRuleRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.intellif.ifai.facedb.GetAccessRuleRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.intellif.ifai.facedb.GetAccessRuleRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.intellif.ifai.facedb.GetAccessRuleRequest parseFrom(
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
  public static Builder newBuilder(com.intellif.ifai.facedb.GetAccessRuleRequest prototype) {
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
   *新增查询通行规则请求
   * </pre>
   *
   * Protobuf type {@code Ifaipb.GetAccessRuleRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:Ifaipb.GetAccessRuleRequest)
      com.intellif.ifai.facedb.GetAccessRuleRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.intellif.ifai.facedb.Ifai.internal_static_Ifaipb_GetAccessRuleRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.intellif.ifai.facedb.Ifai.internal_static_Ifaipb_GetAccessRuleRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.intellif.ifai.facedb.GetAccessRuleRequest.class, com.intellif.ifai.facedb.GetAccessRuleRequest.Builder.class);
    }

    // Construct using com.intellif.ifai.facedb.GetAccessRuleRequest.newBuilder()
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
      ruleIds_ = java.util.Collections.emptyList();
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.intellif.ifai.facedb.Ifai.internal_static_Ifaipb_GetAccessRuleRequest_descriptor;
    }

    @java.lang.Override
    public com.intellif.ifai.facedb.GetAccessRuleRequest getDefaultInstanceForType() {
      return com.intellif.ifai.facedb.GetAccessRuleRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.intellif.ifai.facedb.GetAccessRuleRequest build() {
      com.intellif.ifai.facedb.GetAccessRuleRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.intellif.ifai.facedb.GetAccessRuleRequest buildPartial() {
      com.intellif.ifai.facedb.GetAccessRuleRequest result = new com.intellif.ifai.facedb.GetAccessRuleRequest(this);
      int from_bitField0_ = bitField0_;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        ruleIds_ = java.util.Collections.unmodifiableList(ruleIds_);
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.ruleIds_ = ruleIds_;
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
      if (other instanceof com.intellif.ifai.facedb.GetAccessRuleRequest) {
        return mergeFrom((com.intellif.ifai.facedb.GetAccessRuleRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.intellif.ifai.facedb.GetAccessRuleRequest other) {
      if (other == com.intellif.ifai.facedb.GetAccessRuleRequest.getDefaultInstance()) return this;
      if (!other.ruleIds_.isEmpty()) {
        if (ruleIds_.isEmpty()) {
          ruleIds_ = other.ruleIds_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureRuleIdsIsMutable();
          ruleIds_.addAll(other.ruleIds_);
        }
        onChanged();
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
      com.intellif.ifai.facedb.GetAccessRuleRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.intellif.ifai.facedb.GetAccessRuleRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<java.lang.Integer> ruleIds_ = java.util.Collections.emptyList();
    private void ensureRuleIdsIsMutable() {
      if (!((bitField0_ & 0x00000001) == 0x00000001)) {
        ruleIds_ = new java.util.ArrayList<java.lang.Integer>(ruleIds_);
        bitField0_ |= 0x00000001;
       }
    }
    /**
     * <pre>
     *规则id,为空则返回设备所有的规则
     * </pre>
     *
     * <code>repeated int32 rule_ids = 1;</code>
     */
    public java.util.List<java.lang.Integer>
        getRuleIdsList() {
      return java.util.Collections.unmodifiableList(ruleIds_);
    }
    /**
     * <pre>
     *规则id,为空则返回设备所有的规则
     * </pre>
     *
     * <code>repeated int32 rule_ids = 1;</code>
     */
    public int getRuleIdsCount() {
      return ruleIds_.size();
    }
    /**
     * <pre>
     *规则id,为空则返回设备所有的规则
     * </pre>
     *
     * <code>repeated int32 rule_ids = 1;</code>
     */
    public int getRuleIds(int index) {
      return ruleIds_.get(index);
    }
    /**
     * <pre>
     *规则id,为空则返回设备所有的规则
     * </pre>
     *
     * <code>repeated int32 rule_ids = 1;</code>
     */
    public Builder setRuleIds(
        int index, int value) {
      ensureRuleIdsIsMutable();
      ruleIds_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     *规则id,为空则返回设备所有的规则
     * </pre>
     *
     * <code>repeated int32 rule_ids = 1;</code>
     */
    public Builder addRuleIds(int value) {
      ensureRuleIdsIsMutable();
      ruleIds_.add(value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     *规则id,为空则返回设备所有的规则
     * </pre>
     *
     * <code>repeated int32 rule_ids = 1;</code>
     */
    public Builder addAllRuleIds(
        java.lang.Iterable<? extends java.lang.Integer> values) {
      ensureRuleIdsIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, ruleIds_);
      onChanged();
      return this;
    }
    /**
     * <pre>
     *规则id,为空则返回设备所有的规则
     * </pre>
     *
     * <code>repeated int32 rule_ids = 1;</code>
     */
    public Builder clearRuleIds() {
      ruleIds_ = java.util.Collections.emptyList();
      bitField0_ = (bitField0_ & ~0x00000001);
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


    // @@protoc_insertion_point(builder_scope:Ifaipb.GetAccessRuleRequest)
  }

  // @@protoc_insertion_point(class_scope:Ifaipb.GetAccessRuleRequest)
  private static final com.intellif.ifai.facedb.GetAccessRuleRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.intellif.ifai.facedb.GetAccessRuleRequest();
  }

  public static com.intellif.ifai.facedb.GetAccessRuleRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetAccessRuleRequest>
      PARSER = new com.google.protobuf.AbstractParser<GetAccessRuleRequest>() {
    @java.lang.Override
    public GetAccessRuleRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new GetAccessRuleRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<GetAccessRuleRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetAccessRuleRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.intellif.ifai.facedb.GetAccessRuleRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
