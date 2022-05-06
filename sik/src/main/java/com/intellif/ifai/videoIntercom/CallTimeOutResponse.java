// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: IfVideoIntercom.proto

package com.intellif.ifai.videoIntercom;

/**
 * Protobuf type {@code Ifaipb.CallTimeOutResponse}
 */
public  final class CallTimeOutResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:Ifaipb.CallTimeOutResponse)
    CallTimeOutResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CallTimeOutResponse.newBuilder() to construct.
  private CallTimeOutResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CallTimeOutResponse() {
    callCode_ = 0;
  }

  @Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private CallTimeOutResponse(
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
          case 8: {
            int rawValue = input.readEnum();

            callCode_ = rawValue;
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
    return Ifai.internal_static_Ifaipb_CallTimeOutResponse_descriptor;
  }

  @Override
  protected FieldAccessorTable
      internalGetFieldAccessorTable() {
    return Ifai.internal_static_Ifaipb_CallTimeOutResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            CallTimeOutResponse.class, Builder.class);
  }

  public static final int CALL_CODE_FIELD_NUMBER = 1;
  private int callCode_;
  /**
   * <pre>
   *错误码
   * </pre>
   *
   * <code>.Ifaipb.CallCode call_code = 1;</code>
   */
  public int getCallCodeValue() {
    return callCode_;
  }
  /**
   * <pre>
   *错误码
   * </pre>
   *
   * <code>.Ifaipb.CallCode call_code = 1;</code>
   */
  public CallCode getCallCode() {
    @SuppressWarnings("deprecation")
    CallCode result = CallCode.valueOf(callCode_);
    return result == null ? CallCode.UNRECOGNIZED : result;
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
    if (callCode_ != CallCode.Success.getNumber()) {
      output.writeEnum(1, callCode_);
    }
    unknownFields.writeTo(output);
  }

  @Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (callCode_ != CallCode.Success.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, callCode_);
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
    if (!(obj instanceof CallTimeOutResponse)) {
      return super.equals(obj);
    }
    CallTimeOutResponse other = (CallTimeOutResponse) obj;

    boolean result = true;
    result = result && callCode_ == other.callCode_;
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
    hash = (37 * hash) + CALL_CODE_FIELD_NUMBER;
    hash = (53 * hash) + callCode_;
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static CallTimeOutResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static CallTimeOutResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static CallTimeOutResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static CallTimeOutResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static CallTimeOutResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static CallTimeOutResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static CallTimeOutResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static CallTimeOutResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static CallTimeOutResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static CallTimeOutResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static CallTimeOutResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static CallTimeOutResponse parseFrom(
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
  public static Builder newBuilder(CallTimeOutResponse prototype) {
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
   * Protobuf type {@code Ifaipb.CallTimeOutResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:Ifaipb.CallTimeOutResponse)
      CallTimeOutResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return Ifai.internal_static_Ifaipb_CallTimeOutResponse_descriptor;
    }

    @Override
    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return Ifai.internal_static_Ifaipb_CallTimeOutResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              CallTimeOutResponse.class, Builder.class);
    }

    // Construct using com.intellif.ifai.videoIntercom.CallTimeOutResponse.newBuilder()
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
      callCode_ = 0;

      return this;
    }

    @Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return Ifai.internal_static_Ifaipb_CallTimeOutResponse_descriptor;
    }

    @Override
    public CallTimeOutResponse getDefaultInstanceForType() {
      return CallTimeOutResponse.getDefaultInstance();
    }

    @Override
    public CallTimeOutResponse build() {
      CallTimeOutResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @Override
    public CallTimeOutResponse buildPartial() {
      CallTimeOutResponse result = new CallTimeOutResponse(this);
      result.callCode_ = callCode_;
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
      if (other instanceof CallTimeOutResponse) {
        return mergeFrom((CallTimeOutResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(CallTimeOutResponse other) {
      if (other == CallTimeOutResponse.getDefaultInstance()) return this;
      if (other.callCode_ != 0) {
        setCallCodeValue(other.getCallCodeValue());
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
      CallTimeOutResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (CallTimeOutResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int callCode_ = 0;
    /**
     * <pre>
     *错误码
     * </pre>
     *
     * <code>.Ifaipb.CallCode call_code = 1;</code>
     */
    public int getCallCodeValue() {
      return callCode_;
    }
    /**
     * <pre>
     *错误码
     * </pre>
     *
     * <code>.Ifaipb.CallCode call_code = 1;</code>
     */
    public Builder setCallCodeValue(int value) {
      callCode_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     *错误码
     * </pre>
     *
     * <code>.Ifaipb.CallCode call_code = 1;</code>
     */
    public CallCode getCallCode() {
      @SuppressWarnings("deprecation")
      CallCode result = CallCode.valueOf(callCode_);
      return result == null ? CallCode.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     *错误码
     * </pre>
     *
     * <code>.Ifaipb.CallCode call_code = 1;</code>
     */
    public Builder setCallCode(CallCode value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      callCode_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     *错误码
     * </pre>
     *
     * <code>.Ifaipb.CallCode call_code = 1;</code>
     */
    public Builder clearCallCode() {
      
      callCode_ = 0;
      onChanged();
      return this;
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


    // @@protoc_insertion_point(builder_scope:Ifaipb.CallTimeOutResponse)
  }

  // @@protoc_insertion_point(class_scope:Ifaipb.CallTimeOutResponse)
  private static final CallTimeOutResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new CallTimeOutResponse();
  }

  public static CallTimeOutResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CallTimeOutResponse>
      PARSER = new com.google.protobuf.AbstractParser<CallTimeOutResponse>() {
    @Override
    public CallTimeOutResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new CallTimeOutResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<CallTimeOutResponse> parser() {
    return PARSER;
  }

  @Override
  public com.google.protobuf.Parser<CallTimeOutResponse> getParserForType() {
    return PARSER;
  }

  @Override
  public CallTimeOutResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

