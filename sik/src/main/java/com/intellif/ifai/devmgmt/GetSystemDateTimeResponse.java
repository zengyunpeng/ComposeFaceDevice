// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: IfDeviceManagment.proto

package com.intellif.ifai.devmgmt;

/**
 * Protobuf type {@code Ifaipb.GetSystemDateTimeResponse}
 */
public  final class GetSystemDateTimeResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:Ifaipb.GetSystemDateTimeResponse)
    GetSystemDateTimeResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GetSystemDateTimeResponse.newBuilder() to construct.
  private GetSystemDateTimeResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GetSystemDateTimeResponse() {
    type_ = 0;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private GetSystemDateTimeResponse(
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
            int rawValue = input.readEnum();

            type_ = rawValue;
            break;
          }
          case 18: {
            com.intellif.ifai.common.DateTime.Builder subBuilder = null;
            if (dateTime_ != null) {
              subBuilder = dateTime_.toBuilder();
            }
            dateTime_ = input.readMessage(com.intellif.ifai.common.DateTime.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(dateTime_);
              dateTime_ = subBuilder.buildPartial();
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
    return com.intellif.ifai.devmgmt.Ifai.internal_static_Ifaipb_GetSystemDateTimeResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.intellif.ifai.devmgmt.Ifai.internal_static_Ifaipb_GetSystemDateTimeResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.intellif.ifai.devmgmt.GetSystemDateTimeResponse.class, com.intellif.ifai.devmgmt.GetSystemDateTimeResponse.Builder.class);
  }

  public static final int TYPE_FIELD_NUMBER = 1;
  private int type_;
  /**
   * <code>.Ifaipb.SetDateTimeType type = 1;</code>
   */
  public int getTypeValue() {
    return type_;
  }
  /**
   * <code>.Ifaipb.SetDateTimeType type = 1;</code>
   */
  public com.intellif.ifai.devmgmt.SetDateTimeType getType() {
    @SuppressWarnings("deprecation")
    com.intellif.ifai.devmgmt.SetDateTimeType result = com.intellif.ifai.devmgmt.SetDateTimeType.valueOf(type_);
    return result == null ? com.intellif.ifai.devmgmt.SetDateTimeType.UNRECOGNIZED : result;
  }

  public static final int DATE_TIME_FIELD_NUMBER = 2;
  private com.intellif.ifai.common.DateTime dateTime_;
  /**
   * <pre>
   *当前时间   
   * </pre>
   *
   * <code>.Ifaipb.DateTime date_time = 2;</code>
   */
  public boolean hasDateTime() {
    return dateTime_ != null;
  }
  /**
   * <pre>
   *当前时间   
   * </pre>
   *
   * <code>.Ifaipb.DateTime date_time = 2;</code>
   */
  public com.intellif.ifai.common.DateTime getDateTime() {
    return dateTime_ == null ? com.intellif.ifai.common.DateTime.getDefaultInstance() : dateTime_;
  }
  /**
   * <pre>
   *当前时间   
   * </pre>
   *
   * <code>.Ifaipb.DateTime date_time = 2;</code>
   */
  public com.intellif.ifai.common.DateTimeOrBuilder getDateTimeOrBuilder() {
    return getDateTime();
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
    if (type_ != com.intellif.ifai.devmgmt.SetDateTimeType.SetDateTimeType_Manual.getNumber()) {
      output.writeEnum(1, type_);
    }
    if (dateTime_ != null) {
      output.writeMessage(2, getDateTime());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (type_ != com.intellif.ifai.devmgmt.SetDateTimeType.SetDateTimeType_Manual.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, type_);
    }
    if (dateTime_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getDateTime());
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
    if (!(obj instanceof com.intellif.ifai.devmgmt.GetSystemDateTimeResponse)) {
      return super.equals(obj);
    }
    com.intellif.ifai.devmgmt.GetSystemDateTimeResponse other = (com.intellif.ifai.devmgmt.GetSystemDateTimeResponse) obj;

    boolean result = true;
    result = result && type_ == other.type_;
    result = result && (hasDateTime() == other.hasDateTime());
    if (hasDateTime()) {
      result = result && getDateTime()
          .equals(other.getDateTime());
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
    hash = (37 * hash) + TYPE_FIELD_NUMBER;
    hash = (53 * hash) + type_;
    if (hasDateTime()) {
      hash = (37 * hash) + DATE_TIME_FIELD_NUMBER;
      hash = (53 * hash) + getDateTime().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.intellif.ifai.devmgmt.GetSystemDateTimeResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.intellif.ifai.devmgmt.GetSystemDateTimeResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.intellif.ifai.devmgmt.GetSystemDateTimeResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.intellif.ifai.devmgmt.GetSystemDateTimeResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.intellif.ifai.devmgmt.GetSystemDateTimeResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.intellif.ifai.devmgmt.GetSystemDateTimeResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.intellif.ifai.devmgmt.GetSystemDateTimeResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.intellif.ifai.devmgmt.GetSystemDateTimeResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.intellif.ifai.devmgmt.GetSystemDateTimeResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.intellif.ifai.devmgmt.GetSystemDateTimeResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.intellif.ifai.devmgmt.GetSystemDateTimeResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.intellif.ifai.devmgmt.GetSystemDateTimeResponse parseFrom(
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
  public static Builder newBuilder(com.intellif.ifai.devmgmt.GetSystemDateTimeResponse prototype) {
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
   * Protobuf type {@code Ifaipb.GetSystemDateTimeResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:Ifaipb.GetSystemDateTimeResponse)
      com.intellif.ifai.devmgmt.GetSystemDateTimeResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.intellif.ifai.devmgmt.Ifai.internal_static_Ifaipb_GetSystemDateTimeResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.intellif.ifai.devmgmt.Ifai.internal_static_Ifaipb_GetSystemDateTimeResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.intellif.ifai.devmgmt.GetSystemDateTimeResponse.class, com.intellif.ifai.devmgmt.GetSystemDateTimeResponse.Builder.class);
    }

    // Construct using com.intellif.ifai.devmgmt.GetSystemDateTimeResponse.newBuilder()
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
      type_ = 0;

      if (dateTimeBuilder_ == null) {
        dateTime_ = null;
      } else {
        dateTime_ = null;
        dateTimeBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.intellif.ifai.devmgmt.Ifai.internal_static_Ifaipb_GetSystemDateTimeResponse_descriptor;
    }

    @java.lang.Override
    public com.intellif.ifai.devmgmt.GetSystemDateTimeResponse getDefaultInstanceForType() {
      return com.intellif.ifai.devmgmt.GetSystemDateTimeResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.intellif.ifai.devmgmt.GetSystemDateTimeResponse build() {
      com.intellif.ifai.devmgmt.GetSystemDateTimeResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.intellif.ifai.devmgmt.GetSystemDateTimeResponse buildPartial() {
      com.intellif.ifai.devmgmt.GetSystemDateTimeResponse result = new com.intellif.ifai.devmgmt.GetSystemDateTimeResponse(this);
      result.type_ = type_;
      if (dateTimeBuilder_ == null) {
        result.dateTime_ = dateTime_;
      } else {
        result.dateTime_ = dateTimeBuilder_.build();
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
      if (other instanceof com.intellif.ifai.devmgmt.GetSystemDateTimeResponse) {
        return mergeFrom((com.intellif.ifai.devmgmt.GetSystemDateTimeResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.intellif.ifai.devmgmt.GetSystemDateTimeResponse other) {
      if (other == com.intellif.ifai.devmgmt.GetSystemDateTimeResponse.getDefaultInstance()) return this;
      if (other.type_ != 0) {
        setTypeValue(other.getTypeValue());
      }
      if (other.hasDateTime()) {
        mergeDateTime(other.getDateTime());
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
      com.intellif.ifai.devmgmt.GetSystemDateTimeResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.intellif.ifai.devmgmt.GetSystemDateTimeResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int type_ = 0;
    /**
     * <code>.Ifaipb.SetDateTimeType type = 1;</code>
     */
    public int getTypeValue() {
      return type_;
    }
    /**
     * <code>.Ifaipb.SetDateTimeType type = 1;</code>
     */
    public Builder setTypeValue(int value) {
      type_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.Ifaipb.SetDateTimeType type = 1;</code>
     */
    public com.intellif.ifai.devmgmt.SetDateTimeType getType() {
      @SuppressWarnings("deprecation")
      com.intellif.ifai.devmgmt.SetDateTimeType result = com.intellif.ifai.devmgmt.SetDateTimeType.valueOf(type_);
      return result == null ? com.intellif.ifai.devmgmt.SetDateTimeType.UNRECOGNIZED : result;
    }
    /**
     * <code>.Ifaipb.SetDateTimeType type = 1;</code>
     */
    public Builder setType(com.intellif.ifai.devmgmt.SetDateTimeType value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      type_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.Ifaipb.SetDateTimeType type = 1;</code>
     */
    public Builder clearType() {
      
      type_ = 0;
      onChanged();
      return this;
    }

    private com.intellif.ifai.common.DateTime dateTime_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.intellif.ifai.common.DateTime, com.intellif.ifai.common.DateTime.Builder, com.intellif.ifai.common.DateTimeOrBuilder> dateTimeBuilder_;
    /**
     * <pre>
     *当前时间   
     * </pre>
     *
     * <code>.Ifaipb.DateTime date_time = 2;</code>
     */
    public boolean hasDateTime() {
      return dateTimeBuilder_ != null || dateTime_ != null;
    }
    /**
     * <pre>
     *当前时间   
     * </pre>
     *
     * <code>.Ifaipb.DateTime date_time = 2;</code>
     */
    public com.intellif.ifai.common.DateTime getDateTime() {
      if (dateTimeBuilder_ == null) {
        return dateTime_ == null ? com.intellif.ifai.common.DateTime.getDefaultInstance() : dateTime_;
      } else {
        return dateTimeBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     *当前时间   
     * </pre>
     *
     * <code>.Ifaipb.DateTime date_time = 2;</code>
     */
    public Builder setDateTime(com.intellif.ifai.common.DateTime value) {
      if (dateTimeBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        dateTime_ = value;
        onChanged();
      } else {
        dateTimeBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     *当前时间   
     * </pre>
     *
     * <code>.Ifaipb.DateTime date_time = 2;</code>
     */
    public Builder setDateTime(
        com.intellif.ifai.common.DateTime.Builder builderForValue) {
      if (dateTimeBuilder_ == null) {
        dateTime_ = builderForValue.build();
        onChanged();
      } else {
        dateTimeBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     *当前时间   
     * </pre>
     *
     * <code>.Ifaipb.DateTime date_time = 2;</code>
     */
    public Builder mergeDateTime(com.intellif.ifai.common.DateTime value) {
      if (dateTimeBuilder_ == null) {
        if (dateTime_ != null) {
          dateTime_ =
            com.intellif.ifai.common.DateTime.newBuilder(dateTime_).mergeFrom(value).buildPartial();
        } else {
          dateTime_ = value;
        }
        onChanged();
      } else {
        dateTimeBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     *当前时间   
     * </pre>
     *
     * <code>.Ifaipb.DateTime date_time = 2;</code>
     */
    public Builder clearDateTime() {
      if (dateTimeBuilder_ == null) {
        dateTime_ = null;
        onChanged();
      } else {
        dateTime_ = null;
        dateTimeBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     *当前时间   
     * </pre>
     *
     * <code>.Ifaipb.DateTime date_time = 2;</code>
     */
    public com.intellif.ifai.common.DateTime.Builder getDateTimeBuilder() {
      
      onChanged();
      return getDateTimeFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     *当前时间   
     * </pre>
     *
     * <code>.Ifaipb.DateTime date_time = 2;</code>
     */
    public com.intellif.ifai.common.DateTimeOrBuilder getDateTimeOrBuilder() {
      if (dateTimeBuilder_ != null) {
        return dateTimeBuilder_.getMessageOrBuilder();
      } else {
        return dateTime_ == null ?
            com.intellif.ifai.common.DateTime.getDefaultInstance() : dateTime_;
      }
    }
    /**
     * <pre>
     *当前时间   
     * </pre>
     *
     * <code>.Ifaipb.DateTime date_time = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.intellif.ifai.common.DateTime, com.intellif.ifai.common.DateTime.Builder, com.intellif.ifai.common.DateTimeOrBuilder> 
        getDateTimeFieldBuilder() {
      if (dateTimeBuilder_ == null) {
        dateTimeBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.intellif.ifai.common.DateTime, com.intellif.ifai.common.DateTime.Builder, com.intellif.ifai.common.DateTimeOrBuilder>(
                getDateTime(),
                getParentForChildren(),
                isClean());
        dateTime_ = null;
      }
      return dateTimeBuilder_;
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


    // @@protoc_insertion_point(builder_scope:Ifaipb.GetSystemDateTimeResponse)
  }

  // @@protoc_insertion_point(class_scope:Ifaipb.GetSystemDateTimeResponse)
  private static final com.intellif.ifai.devmgmt.GetSystemDateTimeResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.intellif.ifai.devmgmt.GetSystemDateTimeResponse();
  }

  public static com.intellif.ifai.devmgmt.GetSystemDateTimeResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetSystemDateTimeResponse>
      PARSER = new com.google.protobuf.AbstractParser<GetSystemDateTimeResponse>() {
    @java.lang.Override
    public GetSystemDateTimeResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new GetSystemDateTimeResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<GetSystemDateTimeResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetSystemDateTimeResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.intellif.ifai.devmgmt.GetSystemDateTimeResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

