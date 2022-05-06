// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: IfCommonType.proto

package com.intellif.ifai.common;

/**
 * Protobuf type {@code Ifaipb.DateTime}
 */
public  final class DateTime extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:Ifaipb.DateTime)
    DateTimeOrBuilder {
private static final long serialVersionUID = 0L;
  // Use DateTime.newBuilder() to construct.
  private DateTime(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private DateTime() {
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private DateTime(
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
            com.intellif.ifai.common.Date.Builder subBuilder = null;
            if (date_ != null) {
              subBuilder = date_.toBuilder();
            }
            date_ = input.readMessage(com.intellif.ifai.common.Date.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(date_);
              date_ = subBuilder.buildPartial();
            }

            break;
          }
          case 18: {
            com.intellif.ifai.common.Time.Builder subBuilder = null;
            if (time_ != null) {
              subBuilder = time_.toBuilder();
            }
            time_ = input.readMessage(com.intellif.ifai.common.Time.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(time_);
              time_ = subBuilder.buildPartial();
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
    return com.intellif.ifai.common.Ifai.internal_static_Ifaipb_DateTime_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.intellif.ifai.common.Ifai.internal_static_Ifaipb_DateTime_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.intellif.ifai.common.DateTime.class, com.intellif.ifai.common.DateTime.Builder.class);
  }

  public static final int DATE_FIELD_NUMBER = 1;
  private com.intellif.ifai.common.Date date_;
  /**
   * <code>.Ifaipb.Date date = 1;</code>
   */
  public boolean hasDate() {
    return date_ != null;
  }
  /**
   * <code>.Ifaipb.Date date = 1;</code>
   */
  public com.intellif.ifai.common.Date getDate() {
    return date_ == null ? com.intellif.ifai.common.Date.getDefaultInstance() : date_;
  }
  /**
   * <code>.Ifaipb.Date date = 1;</code>
   */
  public com.intellif.ifai.common.DateOrBuilder getDateOrBuilder() {
    return getDate();
  }

  public static final int TIME_FIELD_NUMBER = 2;
  private com.intellif.ifai.common.Time time_;
  /**
   * <code>.Ifaipb.Time time = 2;</code>
   */
  public boolean hasTime() {
    return time_ != null;
  }
  /**
   * <code>.Ifaipb.Time time = 2;</code>
   */
  public com.intellif.ifai.common.Time getTime() {
    return time_ == null ? com.intellif.ifai.common.Time.getDefaultInstance() : time_;
  }
  /**
   * <code>.Ifaipb.Time time = 2;</code>
   */
  public com.intellif.ifai.common.TimeOrBuilder getTimeOrBuilder() {
    return getTime();
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
    if (date_ != null) {
      output.writeMessage(1, getDate());
    }
    if (time_ != null) {
      output.writeMessage(2, getTime());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (date_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getDate());
    }
    if (time_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getTime());
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
    if (!(obj instanceof com.intellif.ifai.common.DateTime)) {
      return super.equals(obj);
    }
    com.intellif.ifai.common.DateTime other = (com.intellif.ifai.common.DateTime) obj;

    boolean result = true;
    result = result && (hasDate() == other.hasDate());
    if (hasDate()) {
      result = result && getDate()
          .equals(other.getDate());
    }
    result = result && (hasTime() == other.hasTime());
    if (hasTime()) {
      result = result && getTime()
          .equals(other.getTime());
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
    if (hasDate()) {
      hash = (37 * hash) + DATE_FIELD_NUMBER;
      hash = (53 * hash) + getDate().hashCode();
    }
    if (hasTime()) {
      hash = (37 * hash) + TIME_FIELD_NUMBER;
      hash = (53 * hash) + getTime().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.intellif.ifai.common.DateTime parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.intellif.ifai.common.DateTime parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.intellif.ifai.common.DateTime parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.intellif.ifai.common.DateTime parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.intellif.ifai.common.DateTime parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.intellif.ifai.common.DateTime parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.intellif.ifai.common.DateTime parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.intellif.ifai.common.DateTime parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.intellif.ifai.common.DateTime parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.intellif.ifai.common.DateTime parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.intellif.ifai.common.DateTime parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.intellif.ifai.common.DateTime parseFrom(
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
  public static Builder newBuilder(com.intellif.ifai.common.DateTime prototype) {
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
   * Protobuf type {@code Ifaipb.DateTime}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:Ifaipb.DateTime)
      com.intellif.ifai.common.DateTimeOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.intellif.ifai.common.Ifai.internal_static_Ifaipb_DateTime_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.intellif.ifai.common.Ifai.internal_static_Ifaipb_DateTime_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.intellif.ifai.common.DateTime.class, com.intellif.ifai.common.DateTime.Builder.class);
    }

    // Construct using com.intellif.ifai.common.DateTime.newBuilder()
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
      if (dateBuilder_ == null) {
        date_ = null;
      } else {
        date_ = null;
        dateBuilder_ = null;
      }
      if (timeBuilder_ == null) {
        time_ = null;
      } else {
        time_ = null;
        timeBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.intellif.ifai.common.Ifai.internal_static_Ifaipb_DateTime_descriptor;
    }

    @java.lang.Override
    public com.intellif.ifai.common.DateTime getDefaultInstanceForType() {
      return com.intellif.ifai.common.DateTime.getDefaultInstance();
    }

    @java.lang.Override
    public com.intellif.ifai.common.DateTime build() {
      com.intellif.ifai.common.DateTime result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.intellif.ifai.common.DateTime buildPartial() {
      com.intellif.ifai.common.DateTime result = new com.intellif.ifai.common.DateTime(this);
      if (dateBuilder_ == null) {
        result.date_ = date_;
      } else {
        result.date_ = dateBuilder_.build();
      }
      if (timeBuilder_ == null) {
        result.time_ = time_;
      } else {
        result.time_ = timeBuilder_.build();
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
      if (other instanceof com.intellif.ifai.common.DateTime) {
        return mergeFrom((com.intellif.ifai.common.DateTime)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.intellif.ifai.common.DateTime other) {
      if (other == com.intellif.ifai.common.DateTime.getDefaultInstance()) return this;
      if (other.hasDate()) {
        mergeDate(other.getDate());
      }
      if (other.hasTime()) {
        mergeTime(other.getTime());
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
      com.intellif.ifai.common.DateTime parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.intellif.ifai.common.DateTime) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.intellif.ifai.common.Date date_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.intellif.ifai.common.Date, com.intellif.ifai.common.Date.Builder, com.intellif.ifai.common.DateOrBuilder> dateBuilder_;
    /**
     * <code>.Ifaipb.Date date = 1;</code>
     */
    public boolean hasDate() {
      return dateBuilder_ != null || date_ != null;
    }
    /**
     * <code>.Ifaipb.Date date = 1;</code>
     */
    public com.intellif.ifai.common.Date getDate() {
      if (dateBuilder_ == null) {
        return date_ == null ? com.intellif.ifai.common.Date.getDefaultInstance() : date_;
      } else {
        return dateBuilder_.getMessage();
      }
    }
    /**
     * <code>.Ifaipb.Date date = 1;</code>
     */
    public Builder setDate(com.intellif.ifai.common.Date value) {
      if (dateBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        date_ = value;
        onChanged();
      } else {
        dateBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.Ifaipb.Date date = 1;</code>
     */
    public Builder setDate(
        com.intellif.ifai.common.Date.Builder builderForValue) {
      if (dateBuilder_ == null) {
        date_ = builderForValue.build();
        onChanged();
      } else {
        dateBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.Ifaipb.Date date = 1;</code>
     */
    public Builder mergeDate(com.intellif.ifai.common.Date value) {
      if (dateBuilder_ == null) {
        if (date_ != null) {
          date_ =
            com.intellif.ifai.common.Date.newBuilder(date_).mergeFrom(value).buildPartial();
        } else {
          date_ = value;
        }
        onChanged();
      } else {
        dateBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.Ifaipb.Date date = 1;</code>
     */
    public Builder clearDate() {
      if (dateBuilder_ == null) {
        date_ = null;
        onChanged();
      } else {
        date_ = null;
        dateBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.Ifaipb.Date date = 1;</code>
     */
    public com.intellif.ifai.common.Date.Builder getDateBuilder() {
      
      onChanged();
      return getDateFieldBuilder().getBuilder();
    }
    /**
     * <code>.Ifaipb.Date date = 1;</code>
     */
    public com.intellif.ifai.common.DateOrBuilder getDateOrBuilder() {
      if (dateBuilder_ != null) {
        return dateBuilder_.getMessageOrBuilder();
      } else {
        return date_ == null ?
            com.intellif.ifai.common.Date.getDefaultInstance() : date_;
      }
    }
    /**
     * <code>.Ifaipb.Date date = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.intellif.ifai.common.Date, com.intellif.ifai.common.Date.Builder, com.intellif.ifai.common.DateOrBuilder> 
        getDateFieldBuilder() {
      if (dateBuilder_ == null) {
        dateBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.intellif.ifai.common.Date, com.intellif.ifai.common.Date.Builder, com.intellif.ifai.common.DateOrBuilder>(
                getDate(),
                getParentForChildren(),
                isClean());
        date_ = null;
      }
      return dateBuilder_;
    }

    private com.intellif.ifai.common.Time time_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.intellif.ifai.common.Time, com.intellif.ifai.common.Time.Builder, com.intellif.ifai.common.TimeOrBuilder> timeBuilder_;
    /**
     * <code>.Ifaipb.Time time = 2;</code>
     */
    public boolean hasTime() {
      return timeBuilder_ != null || time_ != null;
    }
    /**
     * <code>.Ifaipb.Time time = 2;</code>
     */
    public com.intellif.ifai.common.Time getTime() {
      if (timeBuilder_ == null) {
        return time_ == null ? com.intellif.ifai.common.Time.getDefaultInstance() : time_;
      } else {
        return timeBuilder_.getMessage();
      }
    }
    /**
     * <code>.Ifaipb.Time time = 2;</code>
     */
    public Builder setTime(com.intellif.ifai.common.Time value) {
      if (timeBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        time_ = value;
        onChanged();
      } else {
        timeBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.Ifaipb.Time time = 2;</code>
     */
    public Builder setTime(
        com.intellif.ifai.common.Time.Builder builderForValue) {
      if (timeBuilder_ == null) {
        time_ = builderForValue.build();
        onChanged();
      } else {
        timeBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.Ifaipb.Time time = 2;</code>
     */
    public Builder mergeTime(com.intellif.ifai.common.Time value) {
      if (timeBuilder_ == null) {
        if (time_ != null) {
          time_ =
            com.intellif.ifai.common.Time.newBuilder(time_).mergeFrom(value).buildPartial();
        } else {
          time_ = value;
        }
        onChanged();
      } else {
        timeBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.Ifaipb.Time time = 2;</code>
     */
    public Builder clearTime() {
      if (timeBuilder_ == null) {
        time_ = null;
        onChanged();
      } else {
        time_ = null;
        timeBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.Ifaipb.Time time = 2;</code>
     */
    public com.intellif.ifai.common.Time.Builder getTimeBuilder() {
      
      onChanged();
      return getTimeFieldBuilder().getBuilder();
    }
    /**
     * <code>.Ifaipb.Time time = 2;</code>
     */
    public com.intellif.ifai.common.TimeOrBuilder getTimeOrBuilder() {
      if (timeBuilder_ != null) {
        return timeBuilder_.getMessageOrBuilder();
      } else {
        return time_ == null ?
            com.intellif.ifai.common.Time.getDefaultInstance() : time_;
      }
    }
    /**
     * <code>.Ifaipb.Time time = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.intellif.ifai.common.Time, com.intellif.ifai.common.Time.Builder, com.intellif.ifai.common.TimeOrBuilder> 
        getTimeFieldBuilder() {
      if (timeBuilder_ == null) {
        timeBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.intellif.ifai.common.Time, com.intellif.ifai.common.Time.Builder, com.intellif.ifai.common.TimeOrBuilder>(
                getTime(),
                getParentForChildren(),
                isClean());
        time_ = null;
      }
      return timeBuilder_;
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


    // @@protoc_insertion_point(builder_scope:Ifaipb.DateTime)
  }

  // @@protoc_insertion_point(class_scope:Ifaipb.DateTime)
  private static final com.intellif.ifai.common.DateTime DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.intellif.ifai.common.DateTime();
  }

  public static com.intellif.ifai.common.DateTime getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DateTime>
      PARSER = new com.google.protobuf.AbstractParser<DateTime>() {
    @java.lang.Override
    public DateTime parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new DateTime(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<DateTime> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DateTime> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.intellif.ifai.common.DateTime getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

