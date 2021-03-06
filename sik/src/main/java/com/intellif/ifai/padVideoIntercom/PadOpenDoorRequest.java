// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: IfPadVideoIntercom.proto

package com.intellif.ifai.padVideoIntercom;

/**
 * <pre>
 *平板通知平台一键开门请求
 * </pre>
 *
 * Protobuf type {@code Ifaipb.PadOpenDoorRequest}
 */
public  final class PadOpenDoorRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:Ifaipb.PadOpenDoorRequest)
    PadOpenDoorRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use PadOpenDoorRequest.newBuilder() to construct.
  private PadOpenDoorRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private PadOpenDoorRequest() {
  }

  @Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private PadOpenDoorRequest(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new NullPointerException();
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
            com.intellif.ifai.common.CommonInt.Builder subBuilder = null;
            if (recordId_ != null) {
              subBuilder = recordId_.toBuilder();
            }
            recordId_ = input.readMessage(com.intellif.ifai.common.CommonInt.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(recordId_);
              recordId_ = subBuilder.buildPartial();
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
    return Ifai.internal_static_Ifaipb_PadOpenDoorRequest_descriptor;
  }

  @Override
  protected FieldAccessorTable
      internalGetFieldAccessorTable() {
    return Ifai.internal_static_Ifaipb_PadOpenDoorRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            PadOpenDoorRequest.class, Builder.class);
  }

  public static final int RECORD_ID_FIELD_NUMBER = 1;
  private com.intellif.ifai.common.CommonInt recordId_;
  /**
   * <pre>
   *记录id
   * </pre>
   *
   * <code>.Ifaipb.CommonInt record_id = 1;</code>
   */
  public boolean hasRecordId() {
    return recordId_ != null;
  }
  /**
   * <pre>
   *记录id
   * </pre>
   *
   * <code>.Ifaipb.CommonInt record_id = 1;</code>
   */
  public com.intellif.ifai.common.CommonInt getRecordId() {
    return recordId_ == null ? com.intellif.ifai.common.CommonInt.getDefaultInstance() : recordId_;
  }
  /**
   * <pre>
   *记录id
   * </pre>
   *
   * <code>.Ifaipb.CommonInt record_id = 1;</code>
   */
  public com.intellif.ifai.common.CommonIntOrBuilder getRecordIdOrBuilder() {
    return getRecordId();
  }

  private byte memoizedIsInitialized = -1;
  @Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (recordId_ != null) {
      output.writeMessage(1, getRecordId());
    }
    unknownFields.writeTo(output);
  }

  @Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (recordId_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getRecordId());
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @Override
  public boolean equals(final Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof PadOpenDoorRequest)) {
      return super.equals(obj);
    }
    PadOpenDoorRequest other = (PadOpenDoorRequest) obj;

    boolean result = true;
    result = result && (hasRecordId() == other.hasRecordId());
    if (hasRecordId()) {
      result = result && getRecordId()
          .equals(other.getRecordId());
    }
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (hasRecordId()) {
      hash = (37 * hash) + RECORD_ID_FIELD_NUMBER;
      hash = (53 * hash) + getRecordId().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static PadOpenDoorRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static PadOpenDoorRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static PadOpenDoorRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static PadOpenDoorRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static PadOpenDoorRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static PadOpenDoorRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static PadOpenDoorRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static PadOpenDoorRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static PadOpenDoorRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static PadOpenDoorRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static PadOpenDoorRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static PadOpenDoorRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(PadOpenDoorRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @Override
  protected Builder newBuilderForType(
      BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * <pre>
   *平板通知平台一键开门请求
   * </pre>
   *
   * Protobuf type {@code Ifaipb.PadOpenDoorRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:Ifaipb.PadOpenDoorRequest)
      PadOpenDoorRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return Ifai.internal_static_Ifaipb_PadOpenDoorRequest_descriptor;
    }

    @Override
    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return Ifai.internal_static_Ifaipb_PadOpenDoorRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              PadOpenDoorRequest.class, Builder.class);
    }

    // Construct using com.intellif.ifai.padVideoIntercom.PadOpenDoorRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @Override
    public Builder clear() {
      super.clear();
      if (recordIdBuilder_ == null) {
        recordId_ = null;
      } else {
        recordId_ = null;
        recordIdBuilder_ = null;
      }
      return this;
    }

    @Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return Ifai.internal_static_Ifaipb_PadOpenDoorRequest_descriptor;
    }

    @Override
    public PadOpenDoorRequest getDefaultInstanceForType() {
      return PadOpenDoorRequest.getDefaultInstance();
    }

    @Override
    public PadOpenDoorRequest build() {
      PadOpenDoorRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @Override
    public PadOpenDoorRequest buildPartial() {
      PadOpenDoorRequest result = new PadOpenDoorRequest(this);
      if (recordIdBuilder_ == null) {
        result.recordId_ = recordId_;
      } else {
        result.recordId_ = recordIdBuilder_.build();
      }
      onBuilt();
      return result;
    }

    @Override
    public Builder clone() {
      return (Builder) super.clone();
    }
    @Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.setField(field, value);
    }
    @Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    @Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    @Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    @Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    @Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof PadOpenDoorRequest) {
        return mergeFrom((PadOpenDoorRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(PadOpenDoorRequest other) {
      if (other == PadOpenDoorRequest.getDefaultInstance()) return this;
      if (other.hasRecordId()) {
        mergeRecordId(other.getRecordId());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @Override
    public final boolean isInitialized() {
      return true;
    }

    @Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      PadOpenDoorRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (PadOpenDoorRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.intellif.ifai.common.CommonInt recordId_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.intellif.ifai.common.CommonInt, com.intellif.ifai.common.CommonInt.Builder, com.intellif.ifai.common.CommonIntOrBuilder> recordIdBuilder_;
    /**
     * <pre>
     *记录id
     * </pre>
     *
     * <code>.Ifaipb.CommonInt record_id = 1;</code>
     */
    public boolean hasRecordId() {
      return recordIdBuilder_ != null || recordId_ != null;
    }
    /**
     * <pre>
     *记录id
     * </pre>
     *
     * <code>.Ifaipb.CommonInt record_id = 1;</code>
     */
    public com.intellif.ifai.common.CommonInt getRecordId() {
      if (recordIdBuilder_ == null) {
        return recordId_ == null ? com.intellif.ifai.common.CommonInt.getDefaultInstance() : recordId_;
      } else {
        return recordIdBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     *记录id
     * </pre>
     *
     * <code>.Ifaipb.CommonInt record_id = 1;</code>
     */
    public Builder setRecordId(com.intellif.ifai.common.CommonInt value) {
      if (recordIdBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        recordId_ = value;
        onChanged();
      } else {
        recordIdBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     *记录id
     * </pre>
     *
     * <code>.Ifaipb.CommonInt record_id = 1;</code>
     */
    public Builder setRecordId(
        com.intellif.ifai.common.CommonInt.Builder builderForValue) {
      if (recordIdBuilder_ == null) {
        recordId_ = builderForValue.build();
        onChanged();
      } else {
        recordIdBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     *记录id
     * </pre>
     *
     * <code>.Ifaipb.CommonInt record_id = 1;</code>
     */
    public Builder mergeRecordId(com.intellif.ifai.common.CommonInt value) {
      if (recordIdBuilder_ == null) {
        if (recordId_ != null) {
          recordId_ =
            com.intellif.ifai.common.CommonInt.newBuilder(recordId_).mergeFrom(value).buildPartial();
        } else {
          recordId_ = value;
        }
        onChanged();
      } else {
        recordIdBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     *记录id
     * </pre>
     *
     * <code>.Ifaipb.CommonInt record_id = 1;</code>
     */
    public Builder clearRecordId() {
      if (recordIdBuilder_ == null) {
        recordId_ = null;
        onChanged();
      } else {
        recordId_ = null;
        recordIdBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     *记录id
     * </pre>
     *
     * <code>.Ifaipb.CommonInt record_id = 1;</code>
     */
    public com.intellif.ifai.common.CommonInt.Builder getRecordIdBuilder() {
      
      onChanged();
      return getRecordIdFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     *记录id
     * </pre>
     *
     * <code>.Ifaipb.CommonInt record_id = 1;</code>
     */
    public com.intellif.ifai.common.CommonIntOrBuilder getRecordIdOrBuilder() {
      if (recordIdBuilder_ != null) {
        return recordIdBuilder_.getMessageOrBuilder();
      } else {
        return recordId_ == null ?
            com.intellif.ifai.common.CommonInt.getDefaultInstance() : recordId_;
      }
    }
    /**
     * <pre>
     *记录id
     * </pre>
     *
     * <code>.Ifaipb.CommonInt record_id = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.intellif.ifai.common.CommonInt, com.intellif.ifai.common.CommonInt.Builder, com.intellif.ifai.common.CommonIntOrBuilder> 
        getRecordIdFieldBuilder() {
      if (recordIdBuilder_ == null) {
        recordIdBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.intellif.ifai.common.CommonInt, com.intellif.ifai.common.CommonInt.Builder, com.intellif.ifai.common.CommonIntOrBuilder>(
                getRecordId(),
                getParentForChildren(),
                isClean());
        recordId_ = null;
      }
      return recordIdBuilder_;
    }
    @Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    @Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:Ifaipb.PadOpenDoorRequest)
  }

  // @@protoc_insertion_point(class_scope:Ifaipb.PadOpenDoorRequest)
  private static final PadOpenDoorRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new PadOpenDoorRequest();
  }

  public static PadOpenDoorRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PadOpenDoorRequest>
      PARSER = new com.google.protobuf.AbstractParser<PadOpenDoorRequest>() {
    @Override
    public PadOpenDoorRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new PadOpenDoorRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<PadOpenDoorRequest> parser() {
    return PARSER;
  }

  @Override
  public com.google.protobuf.Parser<PadOpenDoorRequest> getParserForType() {
    return PARSER;
  }

  @Override
  public PadOpenDoorRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

