// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: IfEvent.proto

package com.intellif.ifai.event;

/**
 * <pre>
 * Notification Confirm
 * </pre>
 *
 * Protobuf type {@code Ifaipb.NotificationConfirmRequest}
 */
public  final class NotificationConfirmRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:Ifaipb.NotificationConfirmRequest)
    NotificationConfirmRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use NotificationConfirmRequest.newBuilder() to construct.
  private NotificationConfirmRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private NotificationConfirmRequest() {
    notificationId_ = 0;
    confirm_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private NotificationConfirmRequest(
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

            notificationId_ = input.readInt32();
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            confirm_ = s;
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
    return com.intellif.ifai.event.Ifai.internal_static_Ifaipb_NotificationConfirmRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.intellif.ifai.event.Ifai.internal_static_Ifaipb_NotificationConfirmRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.intellif.ifai.event.NotificationConfirmRequest.class, com.intellif.ifai.event.NotificationConfirmRequest.Builder.class);
  }

  public static final int NOTIFICATION_ID_FIELD_NUMBER = 1;
  private int notificationId_;
  /**
   * <pre>
   * ????????????
   * </pre>
   *
   * <code>int32 notification_id = 1;</code>
   */
  public int getNotificationId() {
    return notificationId_;
  }

  public static final int CONFIRM_FIELD_NUMBER = 2;
  private volatile java.lang.Object confirm_;
  /**
   * <pre>
   * confirm
   * </pre>
   *
   * <code>string confirm = 2;</code>
   */
  public java.lang.String getConfirm() {
    java.lang.Object ref = confirm_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      confirm_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * confirm
   * </pre>
   *
   * <code>string confirm = 2;</code>
   */
  public com.google.protobuf.ByteString
      getConfirmBytes() {
    java.lang.Object ref = confirm_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      confirm_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    if (notificationId_ != 0) {
      output.writeInt32(1, notificationId_);
    }
    if (!getConfirmBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, confirm_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (notificationId_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, notificationId_);
    }
    if (!getConfirmBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, confirm_);
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
    if (!(obj instanceof com.intellif.ifai.event.NotificationConfirmRequest)) {
      return super.equals(obj);
    }
    com.intellif.ifai.event.NotificationConfirmRequest other = (com.intellif.ifai.event.NotificationConfirmRequest) obj;

    boolean result = true;
    result = result && (getNotificationId()
        == other.getNotificationId());
    result = result && getConfirm()
        .equals(other.getConfirm());
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
    hash = (37 * hash) + NOTIFICATION_ID_FIELD_NUMBER;
    hash = (53 * hash) + getNotificationId();
    hash = (37 * hash) + CONFIRM_FIELD_NUMBER;
    hash = (53 * hash) + getConfirm().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.intellif.ifai.event.NotificationConfirmRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.intellif.ifai.event.NotificationConfirmRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.intellif.ifai.event.NotificationConfirmRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.intellif.ifai.event.NotificationConfirmRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.intellif.ifai.event.NotificationConfirmRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.intellif.ifai.event.NotificationConfirmRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.intellif.ifai.event.NotificationConfirmRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.intellif.ifai.event.NotificationConfirmRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.intellif.ifai.event.NotificationConfirmRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.intellif.ifai.event.NotificationConfirmRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.intellif.ifai.event.NotificationConfirmRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.intellif.ifai.event.NotificationConfirmRequest parseFrom(
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
  public static Builder newBuilder(com.intellif.ifai.event.NotificationConfirmRequest prototype) {
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
   * Notification Confirm
   * </pre>
   *
   * Protobuf type {@code Ifaipb.NotificationConfirmRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:Ifaipb.NotificationConfirmRequest)
      com.intellif.ifai.event.NotificationConfirmRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.intellif.ifai.event.Ifai.internal_static_Ifaipb_NotificationConfirmRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.intellif.ifai.event.Ifai.internal_static_Ifaipb_NotificationConfirmRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.intellif.ifai.event.NotificationConfirmRequest.class, com.intellif.ifai.event.NotificationConfirmRequest.Builder.class);
    }

    // Construct using com.intellif.ifai.event.NotificationConfirmRequest.newBuilder()
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
      notificationId_ = 0;

      confirm_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.intellif.ifai.event.Ifai.internal_static_Ifaipb_NotificationConfirmRequest_descriptor;
    }

    @java.lang.Override
    public com.intellif.ifai.event.NotificationConfirmRequest getDefaultInstanceForType() {
      return com.intellif.ifai.event.NotificationConfirmRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.intellif.ifai.event.NotificationConfirmRequest build() {
      com.intellif.ifai.event.NotificationConfirmRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.intellif.ifai.event.NotificationConfirmRequest buildPartial() {
      com.intellif.ifai.event.NotificationConfirmRequest result = new com.intellif.ifai.event.NotificationConfirmRequest(this);
      result.notificationId_ = notificationId_;
      result.confirm_ = confirm_;
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
      if (other instanceof com.intellif.ifai.event.NotificationConfirmRequest) {
        return mergeFrom((com.intellif.ifai.event.NotificationConfirmRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.intellif.ifai.event.NotificationConfirmRequest other) {
      if (other == com.intellif.ifai.event.NotificationConfirmRequest.getDefaultInstance()) return this;
      if (other.getNotificationId() != 0) {
        setNotificationId(other.getNotificationId());
      }
      if (!other.getConfirm().isEmpty()) {
        confirm_ = other.confirm_;
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
      com.intellif.ifai.event.NotificationConfirmRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.intellif.ifai.event.NotificationConfirmRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int notificationId_ ;
    /**
     * <pre>
     * ????????????
     * </pre>
     *
     * <code>int32 notification_id = 1;</code>
     */
    public int getNotificationId() {
      return notificationId_;
    }
    /**
     * <pre>
     * ????????????
     * </pre>
     *
     * <code>int32 notification_id = 1;</code>
     */
    public Builder setNotificationId(int value) {
      
      notificationId_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * ????????????
     * </pre>
     *
     * <code>int32 notification_id = 1;</code>
     */
    public Builder clearNotificationId() {
      
      notificationId_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object confirm_ = "";
    /**
     * <pre>
     * confirm
     * </pre>
     *
     * <code>string confirm = 2;</code>
     */
    public java.lang.String getConfirm() {
      java.lang.Object ref = confirm_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        confirm_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * confirm
     * </pre>
     *
     * <code>string confirm = 2;</code>
     */
    public com.google.protobuf.ByteString
        getConfirmBytes() {
      java.lang.Object ref = confirm_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        confirm_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * confirm
     * </pre>
     *
     * <code>string confirm = 2;</code>
     */
    public Builder setConfirm(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      confirm_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * confirm
     * </pre>
     *
     * <code>string confirm = 2;</code>
     */
    public Builder clearConfirm() {
      
      confirm_ = getDefaultInstance().getConfirm();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * confirm
     * </pre>
     *
     * <code>string confirm = 2;</code>
     */
    public Builder setConfirmBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      confirm_ = value;
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


    // @@protoc_insertion_point(builder_scope:Ifaipb.NotificationConfirmRequest)
  }

  // @@protoc_insertion_point(class_scope:Ifaipb.NotificationConfirmRequest)
  private static final com.intellif.ifai.event.NotificationConfirmRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.intellif.ifai.event.NotificationConfirmRequest();
  }

  public static com.intellif.ifai.event.NotificationConfirmRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<NotificationConfirmRequest>
      PARSER = new com.google.protobuf.AbstractParser<NotificationConfirmRequest>() {
    @java.lang.Override
    public NotificationConfirmRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new NotificationConfirmRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<NotificationConfirmRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<NotificationConfirmRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.intellif.ifai.event.NotificationConfirmRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

