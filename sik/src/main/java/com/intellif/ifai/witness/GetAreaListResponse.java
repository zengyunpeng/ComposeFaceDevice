// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: IfWitness.proto

package com.intellif.ifai.witness;

/**
 * Protobuf type {@code Ifaipb.GetAreaListResponse}
 */
public  final class GetAreaListResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:Ifaipb.GetAreaListResponse)
    GetAreaListResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GetAreaListResponse.newBuilder() to construct.
  private GetAreaListResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GetAreaListResponse() {
    areas_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private GetAreaListResponse(
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
              areas_ = new java.util.ArrayList<com.intellif.ifai.witness.Area>();
              mutable_bitField0_ |= 0x00000001;
            }
            areas_.add(
                input.readMessage(com.intellif.ifai.witness.Area.parser(), extensionRegistry));
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
        areas_ = java.util.Collections.unmodifiableList(areas_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.intellif.ifai.witness.Ifai.internal_static_Ifaipb_GetAreaListResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.intellif.ifai.witness.Ifai.internal_static_Ifaipb_GetAreaListResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.intellif.ifai.witness.GetAreaListResponse.class, com.intellif.ifai.witness.GetAreaListResponse.Builder.class);
  }

  public static final int AREAS_FIELD_NUMBER = 1;
  private java.util.List<com.intellif.ifai.witness.Area> areas_;
  /**
   * <code>repeated .Ifaipb.Area areas = 1;</code>
   */
  public java.util.List<com.intellif.ifai.witness.Area> getAreasList() {
    return areas_;
  }
  /**
   * <code>repeated .Ifaipb.Area areas = 1;</code>
   */
  public java.util.List<? extends com.intellif.ifai.witness.AreaOrBuilder> 
      getAreasOrBuilderList() {
    return areas_;
  }
  /**
   * <code>repeated .Ifaipb.Area areas = 1;</code>
   */
  public int getAreasCount() {
    return areas_.size();
  }
  /**
   * <code>repeated .Ifaipb.Area areas = 1;</code>
   */
  public com.intellif.ifai.witness.Area getAreas(int index) {
    return areas_.get(index);
  }
  /**
   * <code>repeated .Ifaipb.Area areas = 1;</code>
   */
  public com.intellif.ifai.witness.AreaOrBuilder getAreasOrBuilder(
      int index) {
    return areas_.get(index);
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
    for (int i = 0; i < areas_.size(); i++) {
      output.writeMessage(1, areas_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < areas_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, areas_.get(i));
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
    if (!(obj instanceof com.intellif.ifai.witness.GetAreaListResponse)) {
      return super.equals(obj);
    }
    com.intellif.ifai.witness.GetAreaListResponse other = (com.intellif.ifai.witness.GetAreaListResponse) obj;

    boolean result = true;
    result = result && getAreasList()
        .equals(other.getAreasList());
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
    if (getAreasCount() > 0) {
      hash = (37 * hash) + AREAS_FIELD_NUMBER;
      hash = (53 * hash) + getAreasList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.intellif.ifai.witness.GetAreaListResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.intellif.ifai.witness.GetAreaListResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.intellif.ifai.witness.GetAreaListResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.intellif.ifai.witness.GetAreaListResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.intellif.ifai.witness.GetAreaListResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.intellif.ifai.witness.GetAreaListResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.intellif.ifai.witness.GetAreaListResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.intellif.ifai.witness.GetAreaListResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.intellif.ifai.witness.GetAreaListResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.intellif.ifai.witness.GetAreaListResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.intellif.ifai.witness.GetAreaListResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.intellif.ifai.witness.GetAreaListResponse parseFrom(
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
  public static Builder newBuilder(com.intellif.ifai.witness.GetAreaListResponse prototype) {
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
   * Protobuf type {@code Ifaipb.GetAreaListResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:Ifaipb.GetAreaListResponse)
      com.intellif.ifai.witness.GetAreaListResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.intellif.ifai.witness.Ifai.internal_static_Ifaipb_GetAreaListResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.intellif.ifai.witness.Ifai.internal_static_Ifaipb_GetAreaListResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.intellif.ifai.witness.GetAreaListResponse.class, com.intellif.ifai.witness.GetAreaListResponse.Builder.class);
    }

    // Construct using com.intellif.ifai.witness.GetAreaListResponse.newBuilder()
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
        getAreasFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (areasBuilder_ == null) {
        areas_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        areasBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.intellif.ifai.witness.Ifai.internal_static_Ifaipb_GetAreaListResponse_descriptor;
    }

    @java.lang.Override
    public com.intellif.ifai.witness.GetAreaListResponse getDefaultInstanceForType() {
      return com.intellif.ifai.witness.GetAreaListResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.intellif.ifai.witness.GetAreaListResponse build() {
      com.intellif.ifai.witness.GetAreaListResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.intellif.ifai.witness.GetAreaListResponse buildPartial() {
      com.intellif.ifai.witness.GetAreaListResponse result = new com.intellif.ifai.witness.GetAreaListResponse(this);
      int from_bitField0_ = bitField0_;
      if (areasBuilder_ == null) {
        if (((bitField0_ & 0x00000001) == 0x00000001)) {
          areas_ = java.util.Collections.unmodifiableList(areas_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.areas_ = areas_;
      } else {
        result.areas_ = areasBuilder_.build();
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
      if (other instanceof com.intellif.ifai.witness.GetAreaListResponse) {
        return mergeFrom((com.intellif.ifai.witness.GetAreaListResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.intellif.ifai.witness.GetAreaListResponse other) {
      if (other == com.intellif.ifai.witness.GetAreaListResponse.getDefaultInstance()) return this;
      if (areasBuilder_ == null) {
        if (!other.areas_.isEmpty()) {
          if (areas_.isEmpty()) {
            areas_ = other.areas_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureAreasIsMutable();
            areas_.addAll(other.areas_);
          }
          onChanged();
        }
      } else {
        if (!other.areas_.isEmpty()) {
          if (areasBuilder_.isEmpty()) {
            areasBuilder_.dispose();
            areasBuilder_ = null;
            areas_ = other.areas_;
            bitField0_ = (bitField0_ & ~0x00000001);
            areasBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getAreasFieldBuilder() : null;
          } else {
            areasBuilder_.addAllMessages(other.areas_);
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
      com.intellif.ifai.witness.GetAreaListResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.intellif.ifai.witness.GetAreaListResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<com.intellif.ifai.witness.Area> areas_ =
      java.util.Collections.emptyList();
    private void ensureAreasIsMutable() {
      if (!((bitField0_ & 0x00000001) == 0x00000001)) {
        areas_ = new java.util.ArrayList<com.intellif.ifai.witness.Area>(areas_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.intellif.ifai.witness.Area, com.intellif.ifai.witness.Area.Builder, com.intellif.ifai.witness.AreaOrBuilder> areasBuilder_;

    /**
     * <code>repeated .Ifaipb.Area areas = 1;</code>
     */
    public java.util.List<com.intellif.ifai.witness.Area> getAreasList() {
      if (areasBuilder_ == null) {
        return java.util.Collections.unmodifiableList(areas_);
      } else {
        return areasBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .Ifaipb.Area areas = 1;</code>
     */
    public int getAreasCount() {
      if (areasBuilder_ == null) {
        return areas_.size();
      } else {
        return areasBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .Ifaipb.Area areas = 1;</code>
     */
    public com.intellif.ifai.witness.Area getAreas(int index) {
      if (areasBuilder_ == null) {
        return areas_.get(index);
      } else {
        return areasBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .Ifaipb.Area areas = 1;</code>
     */
    public Builder setAreas(
        int index, com.intellif.ifai.witness.Area value) {
      if (areasBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureAreasIsMutable();
        areas_.set(index, value);
        onChanged();
      } else {
        areasBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .Ifaipb.Area areas = 1;</code>
     */
    public Builder setAreas(
        int index, com.intellif.ifai.witness.Area.Builder builderForValue) {
      if (areasBuilder_ == null) {
        ensureAreasIsMutable();
        areas_.set(index, builderForValue.build());
        onChanged();
      } else {
        areasBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .Ifaipb.Area areas = 1;</code>
     */
    public Builder addAreas(com.intellif.ifai.witness.Area value) {
      if (areasBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureAreasIsMutable();
        areas_.add(value);
        onChanged();
      } else {
        areasBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .Ifaipb.Area areas = 1;</code>
     */
    public Builder addAreas(
        int index, com.intellif.ifai.witness.Area value) {
      if (areasBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureAreasIsMutable();
        areas_.add(index, value);
        onChanged();
      } else {
        areasBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .Ifaipb.Area areas = 1;</code>
     */
    public Builder addAreas(
        com.intellif.ifai.witness.Area.Builder builderForValue) {
      if (areasBuilder_ == null) {
        ensureAreasIsMutable();
        areas_.add(builderForValue.build());
        onChanged();
      } else {
        areasBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .Ifaipb.Area areas = 1;</code>
     */
    public Builder addAreas(
        int index, com.intellif.ifai.witness.Area.Builder builderForValue) {
      if (areasBuilder_ == null) {
        ensureAreasIsMutable();
        areas_.add(index, builderForValue.build());
        onChanged();
      } else {
        areasBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .Ifaipb.Area areas = 1;</code>
     */
    public Builder addAllAreas(
        java.lang.Iterable<? extends com.intellif.ifai.witness.Area> values) {
      if (areasBuilder_ == null) {
        ensureAreasIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, areas_);
        onChanged();
      } else {
        areasBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .Ifaipb.Area areas = 1;</code>
     */
    public Builder clearAreas() {
      if (areasBuilder_ == null) {
        areas_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        areasBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .Ifaipb.Area areas = 1;</code>
     */
    public Builder removeAreas(int index) {
      if (areasBuilder_ == null) {
        ensureAreasIsMutable();
        areas_.remove(index);
        onChanged();
      } else {
        areasBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .Ifaipb.Area areas = 1;</code>
     */
    public com.intellif.ifai.witness.Area.Builder getAreasBuilder(
        int index) {
      return getAreasFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .Ifaipb.Area areas = 1;</code>
     */
    public com.intellif.ifai.witness.AreaOrBuilder getAreasOrBuilder(
        int index) {
      if (areasBuilder_ == null) {
        return areas_.get(index);  } else {
        return areasBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .Ifaipb.Area areas = 1;</code>
     */
    public java.util.List<? extends com.intellif.ifai.witness.AreaOrBuilder> 
         getAreasOrBuilderList() {
      if (areasBuilder_ != null) {
        return areasBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(areas_);
      }
    }
    /**
     * <code>repeated .Ifaipb.Area areas = 1;</code>
     */
    public com.intellif.ifai.witness.Area.Builder addAreasBuilder() {
      return getAreasFieldBuilder().addBuilder(
          com.intellif.ifai.witness.Area.getDefaultInstance());
    }
    /**
     * <code>repeated .Ifaipb.Area areas = 1;</code>
     */
    public com.intellif.ifai.witness.Area.Builder addAreasBuilder(
        int index) {
      return getAreasFieldBuilder().addBuilder(
          index, com.intellif.ifai.witness.Area.getDefaultInstance());
    }
    /**
     * <code>repeated .Ifaipb.Area areas = 1;</code>
     */
    public java.util.List<com.intellif.ifai.witness.Area.Builder> 
         getAreasBuilderList() {
      return getAreasFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.intellif.ifai.witness.Area, com.intellif.ifai.witness.Area.Builder, com.intellif.ifai.witness.AreaOrBuilder> 
        getAreasFieldBuilder() {
      if (areasBuilder_ == null) {
        areasBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.intellif.ifai.witness.Area, com.intellif.ifai.witness.Area.Builder, com.intellif.ifai.witness.AreaOrBuilder>(
                areas_,
                ((bitField0_ & 0x00000001) == 0x00000001),
                getParentForChildren(),
                isClean());
        areas_ = null;
      }
      return areasBuilder_;
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


    // @@protoc_insertion_point(builder_scope:Ifaipb.GetAreaListResponse)
  }

  // @@protoc_insertion_point(class_scope:Ifaipb.GetAreaListResponse)
  private static final com.intellif.ifai.witness.GetAreaListResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.intellif.ifai.witness.GetAreaListResponse();
  }

  public static com.intellif.ifai.witness.GetAreaListResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetAreaListResponse>
      PARSER = new com.google.protobuf.AbstractParser<GetAreaListResponse>() {
    @java.lang.Override
    public GetAreaListResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new GetAreaListResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<GetAreaListResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetAreaListResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.intellif.ifai.witness.GetAreaListResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

