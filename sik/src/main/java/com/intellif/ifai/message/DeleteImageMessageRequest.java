// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: IfMessage.proto

package com.intellif.ifai.message;

/**
 * Protobuf type {@code Ifaipb.DeleteImageMessageRequest}
 */
public  final class DeleteImageMessageRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:Ifaipb.DeleteImageMessageRequest)
    DeleteImageMessageRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use DeleteImageMessageRequest.newBuilder() to construct.
  private DeleteImageMessageRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private DeleteImageMessageRequest() {
    deleteAll_ = false;
    resourceIds_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private DeleteImageMessageRequest(
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

            deleteAll_ = input.readBool();
            break;
          }
          case 16: {
            if (!((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
              resourceIds_ = new java.util.ArrayList<java.lang.Long>();
              mutable_bitField0_ |= 0x00000002;
            }
            resourceIds_.add(input.readInt64());
            break;
          }
          case 18: {
            int length = input.readRawVarint32();
            int limit = input.pushLimit(length);
            if (!((mutable_bitField0_ & 0x00000002) == 0x00000002) && input.getBytesUntilLimit() > 0) {
              resourceIds_ = new java.util.ArrayList<java.lang.Long>();
              mutable_bitField0_ |= 0x00000002;
            }
            while (input.getBytesUntilLimit() > 0) {
              resourceIds_.add(input.readInt64());
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
      if (((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
        resourceIds_ = java.util.Collections.unmodifiableList(resourceIds_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.intellif.ifai.message.Ifai.internal_static_Ifaipb_DeleteImageMessageRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.intellif.ifai.message.Ifai.internal_static_Ifaipb_DeleteImageMessageRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.intellif.ifai.message.DeleteImageMessageRequest.class, com.intellif.ifai.message.DeleteImageMessageRequest.Builder.class);
  }

  private int bitField0_;
  public static final int DELETE_ALL_FIELD_NUMBER = 1;
  private boolean deleteAll_;
  /**
   * <pre>
   * 是否删除所有图片（是，则删除该设备下所有图片推送，否则根据资源id列表进行删除，默认false）
   * </pre>
   *
   * <code>bool delete_all = 1;</code>
   */
  public boolean getDeleteAll() {
    return deleteAll_;
  }

  public static final int RESOURCE_IDS_FIELD_NUMBER = 2;
  private java.util.List<java.lang.Long> resourceIds_;
  /**
   * <pre>
   *资源id列表
   * </pre>
   *
   * <code>repeated int64 resource_ids = 2;</code>
   */
  public java.util.List<java.lang.Long>
      getResourceIdsList() {
    return resourceIds_;
  }
  /**
   * <pre>
   *资源id列表
   * </pre>
   *
   * <code>repeated int64 resource_ids = 2;</code>
   */
  public int getResourceIdsCount() {
    return resourceIds_.size();
  }
  /**
   * <pre>
   *资源id列表
   * </pre>
   *
   * <code>repeated int64 resource_ids = 2;</code>
   */
  public long getResourceIds(int index) {
    return resourceIds_.get(index);
  }
  private int resourceIdsMemoizedSerializedSize = -1;

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
    if (deleteAll_ != false) {
      output.writeBool(1, deleteAll_);
    }
    if (getResourceIdsList().size() > 0) {
      output.writeUInt32NoTag(18);
      output.writeUInt32NoTag(resourceIdsMemoizedSerializedSize);
    }
    for (int i = 0; i < resourceIds_.size(); i++) {
      output.writeInt64NoTag(resourceIds_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (deleteAll_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(1, deleteAll_);
    }
    {
      int dataSize = 0;
      for (int i = 0; i < resourceIds_.size(); i++) {
        dataSize += com.google.protobuf.CodedOutputStream
          .computeInt64SizeNoTag(resourceIds_.get(i));
      }
      size += dataSize;
      if (!getResourceIdsList().isEmpty()) {
        size += 1;
        size += com.google.protobuf.CodedOutputStream
            .computeInt32SizeNoTag(dataSize);
      }
      resourceIdsMemoizedSerializedSize = dataSize;
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
    if (!(obj instanceof com.intellif.ifai.message.DeleteImageMessageRequest)) {
      return super.equals(obj);
    }
    com.intellif.ifai.message.DeleteImageMessageRequest other = (com.intellif.ifai.message.DeleteImageMessageRequest) obj;

    boolean result = true;
    result = result && (getDeleteAll()
        == other.getDeleteAll());
    result = result && getResourceIdsList()
        .equals(other.getResourceIdsList());
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
    hash = (37 * hash) + DELETE_ALL_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getDeleteAll());
    if (getResourceIdsCount() > 0) {
      hash = (37 * hash) + RESOURCE_IDS_FIELD_NUMBER;
      hash = (53 * hash) + getResourceIdsList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.intellif.ifai.message.DeleteImageMessageRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.intellif.ifai.message.DeleteImageMessageRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.intellif.ifai.message.DeleteImageMessageRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.intellif.ifai.message.DeleteImageMessageRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.intellif.ifai.message.DeleteImageMessageRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.intellif.ifai.message.DeleteImageMessageRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.intellif.ifai.message.DeleteImageMessageRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.intellif.ifai.message.DeleteImageMessageRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.intellif.ifai.message.DeleteImageMessageRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.intellif.ifai.message.DeleteImageMessageRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.intellif.ifai.message.DeleteImageMessageRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.intellif.ifai.message.DeleteImageMessageRequest parseFrom(
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
  public static Builder newBuilder(com.intellif.ifai.message.DeleteImageMessageRequest prototype) {
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
   * Protobuf type {@code Ifaipb.DeleteImageMessageRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:Ifaipb.DeleteImageMessageRequest)
      com.intellif.ifai.message.DeleteImageMessageRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.intellif.ifai.message.Ifai.internal_static_Ifaipb_DeleteImageMessageRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.intellif.ifai.message.Ifai.internal_static_Ifaipb_DeleteImageMessageRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.intellif.ifai.message.DeleteImageMessageRequest.class, com.intellif.ifai.message.DeleteImageMessageRequest.Builder.class);
    }

    // Construct using com.intellif.ifai.message.DeleteImageMessageRequest.newBuilder()
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
      deleteAll_ = false;

      resourceIds_ = java.util.Collections.emptyList();
      bitField0_ = (bitField0_ & ~0x00000002);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.intellif.ifai.message.Ifai.internal_static_Ifaipb_DeleteImageMessageRequest_descriptor;
    }

    @java.lang.Override
    public com.intellif.ifai.message.DeleteImageMessageRequest getDefaultInstanceForType() {
      return com.intellif.ifai.message.DeleteImageMessageRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.intellif.ifai.message.DeleteImageMessageRequest build() {
      com.intellif.ifai.message.DeleteImageMessageRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.intellif.ifai.message.DeleteImageMessageRequest buildPartial() {
      com.intellif.ifai.message.DeleteImageMessageRequest result = new com.intellif.ifai.message.DeleteImageMessageRequest(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      result.deleteAll_ = deleteAll_;
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        resourceIds_ = java.util.Collections.unmodifiableList(resourceIds_);
        bitField0_ = (bitField0_ & ~0x00000002);
      }
      result.resourceIds_ = resourceIds_;
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
      if (other instanceof com.intellif.ifai.message.DeleteImageMessageRequest) {
        return mergeFrom((com.intellif.ifai.message.DeleteImageMessageRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.intellif.ifai.message.DeleteImageMessageRequest other) {
      if (other == com.intellif.ifai.message.DeleteImageMessageRequest.getDefaultInstance()) return this;
      if (other.getDeleteAll() != false) {
        setDeleteAll(other.getDeleteAll());
      }
      if (!other.resourceIds_.isEmpty()) {
        if (resourceIds_.isEmpty()) {
          resourceIds_ = other.resourceIds_;
          bitField0_ = (bitField0_ & ~0x00000002);
        } else {
          ensureResourceIdsIsMutable();
          resourceIds_.addAll(other.resourceIds_);
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
      com.intellif.ifai.message.DeleteImageMessageRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.intellif.ifai.message.DeleteImageMessageRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private boolean deleteAll_ ;
    /**
     * <pre>
     * 是否删除所有图片（是，则删除该设备下所有图片推送，否则根据资源id列表进行删除，默认false）
     * </pre>
     *
     * <code>bool delete_all = 1;</code>
     */
    public boolean getDeleteAll() {
      return deleteAll_;
    }
    /**
     * <pre>
     * 是否删除所有图片（是，则删除该设备下所有图片推送，否则根据资源id列表进行删除，默认false）
     * </pre>
     *
     * <code>bool delete_all = 1;</code>
     */
    public Builder setDeleteAll(boolean value) {
      
      deleteAll_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 是否删除所有图片（是，则删除该设备下所有图片推送，否则根据资源id列表进行删除，默认false）
     * </pre>
     *
     * <code>bool delete_all = 1;</code>
     */
    public Builder clearDeleteAll() {
      
      deleteAll_ = false;
      onChanged();
      return this;
    }

    private java.util.List<java.lang.Long> resourceIds_ = java.util.Collections.emptyList();
    private void ensureResourceIdsIsMutable() {
      if (!((bitField0_ & 0x00000002) == 0x00000002)) {
        resourceIds_ = new java.util.ArrayList<java.lang.Long>(resourceIds_);
        bitField0_ |= 0x00000002;
       }
    }
    /**
     * <pre>
     *资源id列表
     * </pre>
     *
     * <code>repeated int64 resource_ids = 2;</code>
     */
    public java.util.List<java.lang.Long>
        getResourceIdsList() {
      return java.util.Collections.unmodifiableList(resourceIds_);
    }
    /**
     * <pre>
     *资源id列表
     * </pre>
     *
     * <code>repeated int64 resource_ids = 2;</code>
     */
    public int getResourceIdsCount() {
      return resourceIds_.size();
    }
    /**
     * <pre>
     *资源id列表
     * </pre>
     *
     * <code>repeated int64 resource_ids = 2;</code>
     */
    public long getResourceIds(int index) {
      return resourceIds_.get(index);
    }
    /**
     * <pre>
     *资源id列表
     * </pre>
     *
     * <code>repeated int64 resource_ids = 2;</code>
     */
    public Builder setResourceIds(
        int index, long value) {
      ensureResourceIdsIsMutable();
      resourceIds_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     *资源id列表
     * </pre>
     *
     * <code>repeated int64 resource_ids = 2;</code>
     */
    public Builder addResourceIds(long value) {
      ensureResourceIdsIsMutable();
      resourceIds_.add(value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     *资源id列表
     * </pre>
     *
     * <code>repeated int64 resource_ids = 2;</code>
     */
    public Builder addAllResourceIds(
        java.lang.Iterable<? extends java.lang.Long> values) {
      ensureResourceIdsIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, resourceIds_);
      onChanged();
      return this;
    }
    /**
     * <pre>
     *资源id列表
     * </pre>
     *
     * <code>repeated int64 resource_ids = 2;</code>
     */
    public Builder clearResourceIds() {
      resourceIds_ = java.util.Collections.emptyList();
      bitField0_ = (bitField0_ & ~0x00000002);
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


    // @@protoc_insertion_point(builder_scope:Ifaipb.DeleteImageMessageRequest)
  }

  // @@protoc_insertion_point(class_scope:Ifaipb.DeleteImageMessageRequest)
  private static final com.intellif.ifai.message.DeleteImageMessageRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.intellif.ifai.message.DeleteImageMessageRequest();
  }

  public static com.intellif.ifai.message.DeleteImageMessageRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DeleteImageMessageRequest>
      PARSER = new com.google.protobuf.AbstractParser<DeleteImageMessageRequest>() {
    @java.lang.Override
    public DeleteImageMessageRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new DeleteImageMessageRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<DeleteImageMessageRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DeleteImageMessageRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.intellif.ifai.message.DeleteImageMessageRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

