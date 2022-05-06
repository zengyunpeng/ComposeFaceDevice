// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: IfHealthCode.proto

package com.intellif.ifai.IfHealthCode;

/**
 * Protobuf type {@code Ifaipb.ReportPassInfoResponse}
 */
public  final class ReportPassInfoResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:Ifaipb.ReportPassInfoResponse)
    ReportPassInfoResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ReportPassInfoResponse.newBuilder() to construct.
  private ReportPassInfoResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ReportPassInfoResponse() {
    healthCode_ = 0;
    healthStatus_ = 0;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ReportPassInfoResponse(
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
            com.intellif.ifai.common.ErrorInformation.Builder subBuilder = null;
            if (errorInfo_ != null) {
              subBuilder = errorInfo_.toBuilder();
            }
            errorInfo_ = input.readMessage(com.intellif.ifai.common.ErrorInformation.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(errorInfo_);
              errorInfo_ = subBuilder.buildPartial();
            }

            break;
          }
          case 16: {
            int rawValue = input.readEnum();

            healthCode_ = rawValue;
            break;
          }
          case 24: {
            int rawValue = input.readEnum();

            healthStatus_ = rawValue;
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
    return com.intellif.ifai.IfHealthCode.Ifai.internal_static_Ifaipb_ReportPassInfoResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.intellif.ifai.IfHealthCode.Ifai.internal_static_Ifaipb_ReportPassInfoResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.intellif.ifai.IfHealthCode.ReportPassInfoResponse.class, com.intellif.ifai.IfHealthCode.ReportPassInfoResponse.Builder.class);
  }

  public static final int ERROR_INFO_FIELD_NUMBER = 1;
  private com.intellif.ifai.common.ErrorInformation errorInfo_;
  /**
   * <pre>
   *返回信息
   * </pre>
   *
   * <code>.Ifaipb.ErrorInformation error_info = 1;</code>
   */
  public boolean hasErrorInfo() {
    return errorInfo_ != null;
  }
  /**
   * <pre>
   *返回信息
   * </pre>
   *
   * <code>.Ifaipb.ErrorInformation error_info = 1;</code>
   */
  public com.intellif.ifai.common.ErrorInformation getErrorInfo() {
    return errorInfo_ == null ? com.intellif.ifai.common.ErrorInformation.getDefaultInstance() : errorInfo_;
  }
  /**
   * <pre>
   *返回信息
   * </pre>
   *
   * <code>.Ifaipb.ErrorInformation error_info = 1;</code>
   */
  public com.intellif.ifai.common.ErrorInformationOrBuilder getErrorInfoOrBuilder() {
    return getErrorInfo();
  }

  public static final int HEALTH_CODE_FIELD_NUMBER = 2;
  private int healthCode_;
  /**
   * <pre>
   *健康码
   * </pre>
   *
   * <code>.Ifaipb.HealthCodeEnum health_code = 2;</code>
   */
  public int getHealthCodeValue() {
    return healthCode_;
  }
  /**
   * <pre>
   *健康码
   * </pre>
   *
   * <code>.Ifaipb.HealthCodeEnum health_code = 2;</code>
   */
  public com.intellif.ifai.IfHealthCode.HealthCodeEnum getHealthCode() {
    @SuppressWarnings("deprecation")
    com.intellif.ifai.IfHealthCode.HealthCodeEnum result = com.intellif.ifai.IfHealthCode.HealthCodeEnum.valueOf(healthCode_);
    return result == null ? com.intellif.ifai.IfHealthCode.HealthCodeEnum.UNRECOGNIZED : result;
  }

  public static final int HEALTH_STATUS_FIELD_NUMBER = 3;
  private int healthStatus_;
  /**
   * <pre>
   *健康检测状态
   * </pre>
   *
   * <code>.Ifaipb.HealthStatusEnum health_status = 3;</code>
   */
  public int getHealthStatusValue() {
    return healthStatus_;
  }
  /**
   * <pre>
   *健康检测状态
   * </pre>
   *
   * <code>.Ifaipb.HealthStatusEnum health_status = 3;</code>
   */
  public com.intellif.ifai.IfHealthCode.HealthStatusEnum getHealthStatus() {
    @SuppressWarnings("deprecation")
    com.intellif.ifai.IfHealthCode.HealthStatusEnum result = com.intellif.ifai.IfHealthCode.HealthStatusEnum.valueOf(healthStatus_);
    return result == null ? com.intellif.ifai.IfHealthCode.HealthStatusEnum.UNRECOGNIZED : result;
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
    if (errorInfo_ != null) {
      output.writeMessage(1, getErrorInfo());
    }
    if (healthCode_ != com.intellif.ifai.IfHealthCode.HealthCodeEnum.UNKNOWN_CODE.getNumber()) {
      output.writeEnum(2, healthCode_);
    }
    if (healthStatus_ != com.intellif.ifai.IfHealthCode.HealthStatusEnum.UNKNOWN_STATUS.getNumber()) {
      output.writeEnum(3, healthStatus_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (errorInfo_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getErrorInfo());
    }
    if (healthCode_ != com.intellif.ifai.IfHealthCode.HealthCodeEnum.UNKNOWN_CODE.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(2, healthCode_);
    }
    if (healthStatus_ != com.intellif.ifai.IfHealthCode.HealthStatusEnum.UNKNOWN_STATUS.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(3, healthStatus_);
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
    if (!(obj instanceof com.intellif.ifai.IfHealthCode.ReportPassInfoResponse)) {
      return super.equals(obj);
    }
    com.intellif.ifai.IfHealthCode.ReportPassInfoResponse other = (com.intellif.ifai.IfHealthCode.ReportPassInfoResponse) obj;

    boolean result = true;
    result = result && (hasErrorInfo() == other.hasErrorInfo());
    if (hasErrorInfo()) {
      result = result && getErrorInfo()
          .equals(other.getErrorInfo());
    }
    result = result && healthCode_ == other.healthCode_;
    result = result && healthStatus_ == other.healthStatus_;
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
    if (hasErrorInfo()) {
      hash = (37 * hash) + ERROR_INFO_FIELD_NUMBER;
      hash = (53 * hash) + getErrorInfo().hashCode();
    }
    hash = (37 * hash) + HEALTH_CODE_FIELD_NUMBER;
    hash = (53 * hash) + healthCode_;
    hash = (37 * hash) + HEALTH_STATUS_FIELD_NUMBER;
    hash = (53 * hash) + healthStatus_;
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.intellif.ifai.IfHealthCode.ReportPassInfoResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.intellif.ifai.IfHealthCode.ReportPassInfoResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.intellif.ifai.IfHealthCode.ReportPassInfoResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.intellif.ifai.IfHealthCode.ReportPassInfoResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.intellif.ifai.IfHealthCode.ReportPassInfoResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.intellif.ifai.IfHealthCode.ReportPassInfoResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.intellif.ifai.IfHealthCode.ReportPassInfoResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.intellif.ifai.IfHealthCode.ReportPassInfoResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.intellif.ifai.IfHealthCode.ReportPassInfoResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.intellif.ifai.IfHealthCode.ReportPassInfoResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.intellif.ifai.IfHealthCode.ReportPassInfoResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.intellif.ifai.IfHealthCode.ReportPassInfoResponse parseFrom(
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
  public static Builder newBuilder(com.intellif.ifai.IfHealthCode.ReportPassInfoResponse prototype) {
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
   * Protobuf type {@code Ifaipb.ReportPassInfoResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:Ifaipb.ReportPassInfoResponse)
      com.intellif.ifai.IfHealthCode.ReportPassInfoResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.intellif.ifai.IfHealthCode.Ifai.internal_static_Ifaipb_ReportPassInfoResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.intellif.ifai.IfHealthCode.Ifai.internal_static_Ifaipb_ReportPassInfoResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.intellif.ifai.IfHealthCode.ReportPassInfoResponse.class, com.intellif.ifai.IfHealthCode.ReportPassInfoResponse.Builder.class);
    }

    // Construct using com.intellif.ifai.IfHealthCode.ReportPassInfoResponse.newBuilder()
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
      if (errorInfoBuilder_ == null) {
        errorInfo_ = null;
      } else {
        errorInfo_ = null;
        errorInfoBuilder_ = null;
      }
      healthCode_ = 0;

      healthStatus_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.intellif.ifai.IfHealthCode.Ifai.internal_static_Ifaipb_ReportPassInfoResponse_descriptor;
    }

    @java.lang.Override
    public com.intellif.ifai.IfHealthCode.ReportPassInfoResponse getDefaultInstanceForType() {
      return com.intellif.ifai.IfHealthCode.ReportPassInfoResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.intellif.ifai.IfHealthCode.ReportPassInfoResponse build() {
      com.intellif.ifai.IfHealthCode.ReportPassInfoResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.intellif.ifai.IfHealthCode.ReportPassInfoResponse buildPartial() {
      com.intellif.ifai.IfHealthCode.ReportPassInfoResponse result = new com.intellif.ifai.IfHealthCode.ReportPassInfoResponse(this);
      if (errorInfoBuilder_ == null) {
        result.errorInfo_ = errorInfo_;
      } else {
        result.errorInfo_ = errorInfoBuilder_.build();
      }
      result.healthCode_ = healthCode_;
      result.healthStatus_ = healthStatus_;
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
      if (other instanceof com.intellif.ifai.IfHealthCode.ReportPassInfoResponse) {
        return mergeFrom((com.intellif.ifai.IfHealthCode.ReportPassInfoResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.intellif.ifai.IfHealthCode.ReportPassInfoResponse other) {
      if (other == com.intellif.ifai.IfHealthCode.ReportPassInfoResponse.getDefaultInstance()) return this;
      if (other.hasErrorInfo()) {
        mergeErrorInfo(other.getErrorInfo());
      }
      if (other.healthCode_ != 0) {
        setHealthCodeValue(other.getHealthCodeValue());
      }
      if (other.healthStatus_ != 0) {
        setHealthStatusValue(other.getHealthStatusValue());
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
      com.intellif.ifai.IfHealthCode.ReportPassInfoResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.intellif.ifai.IfHealthCode.ReportPassInfoResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.intellif.ifai.common.ErrorInformation errorInfo_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.intellif.ifai.common.ErrorInformation, com.intellif.ifai.common.ErrorInformation.Builder, com.intellif.ifai.common.ErrorInformationOrBuilder> errorInfoBuilder_;
    /**
     * <pre>
     *返回信息
     * </pre>
     *
     * <code>.Ifaipb.ErrorInformation error_info = 1;</code>
     */
    public boolean hasErrorInfo() {
      return errorInfoBuilder_ != null || errorInfo_ != null;
    }
    /**
     * <pre>
     *返回信息
     * </pre>
     *
     * <code>.Ifaipb.ErrorInformation error_info = 1;</code>
     */
    public com.intellif.ifai.common.ErrorInformation getErrorInfo() {
      if (errorInfoBuilder_ == null) {
        return errorInfo_ == null ? com.intellif.ifai.common.ErrorInformation.getDefaultInstance() : errorInfo_;
      } else {
        return errorInfoBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     *返回信息
     * </pre>
     *
     * <code>.Ifaipb.ErrorInformation error_info = 1;</code>
     */
    public Builder setErrorInfo(com.intellif.ifai.common.ErrorInformation value) {
      if (errorInfoBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        errorInfo_ = value;
        onChanged();
      } else {
        errorInfoBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     *返回信息
     * </pre>
     *
     * <code>.Ifaipb.ErrorInformation error_info = 1;</code>
     */
    public Builder setErrorInfo(
        com.intellif.ifai.common.ErrorInformation.Builder builderForValue) {
      if (errorInfoBuilder_ == null) {
        errorInfo_ = builderForValue.build();
        onChanged();
      } else {
        errorInfoBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     *返回信息
     * </pre>
     *
     * <code>.Ifaipb.ErrorInformation error_info = 1;</code>
     */
    public Builder mergeErrorInfo(com.intellif.ifai.common.ErrorInformation value) {
      if (errorInfoBuilder_ == null) {
        if (errorInfo_ != null) {
          errorInfo_ =
            com.intellif.ifai.common.ErrorInformation.newBuilder(errorInfo_).mergeFrom(value).buildPartial();
        } else {
          errorInfo_ = value;
        }
        onChanged();
      } else {
        errorInfoBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     *返回信息
     * </pre>
     *
     * <code>.Ifaipb.ErrorInformation error_info = 1;</code>
     */
    public Builder clearErrorInfo() {
      if (errorInfoBuilder_ == null) {
        errorInfo_ = null;
        onChanged();
      } else {
        errorInfo_ = null;
        errorInfoBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     *返回信息
     * </pre>
     *
     * <code>.Ifaipb.ErrorInformation error_info = 1;</code>
     */
    public com.intellif.ifai.common.ErrorInformation.Builder getErrorInfoBuilder() {
      
      onChanged();
      return getErrorInfoFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     *返回信息
     * </pre>
     *
     * <code>.Ifaipb.ErrorInformation error_info = 1;</code>
     */
    public com.intellif.ifai.common.ErrorInformationOrBuilder getErrorInfoOrBuilder() {
      if (errorInfoBuilder_ != null) {
        return errorInfoBuilder_.getMessageOrBuilder();
      } else {
        return errorInfo_ == null ?
            com.intellif.ifai.common.ErrorInformation.getDefaultInstance() : errorInfo_;
      }
    }
    /**
     * <pre>
     *返回信息
     * </pre>
     *
     * <code>.Ifaipb.ErrorInformation error_info = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.intellif.ifai.common.ErrorInformation, com.intellif.ifai.common.ErrorInformation.Builder, com.intellif.ifai.common.ErrorInformationOrBuilder> 
        getErrorInfoFieldBuilder() {
      if (errorInfoBuilder_ == null) {
        errorInfoBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.intellif.ifai.common.ErrorInformation, com.intellif.ifai.common.ErrorInformation.Builder, com.intellif.ifai.common.ErrorInformationOrBuilder>(
                getErrorInfo(),
                getParentForChildren(),
                isClean());
        errorInfo_ = null;
      }
      return errorInfoBuilder_;
    }

    private int healthCode_ = 0;
    /**
     * <pre>
     *健康码
     * </pre>
     *
     * <code>.Ifaipb.HealthCodeEnum health_code = 2;</code>
     */
    public int getHealthCodeValue() {
      return healthCode_;
    }
    /**
     * <pre>
     *健康码
     * </pre>
     *
     * <code>.Ifaipb.HealthCodeEnum health_code = 2;</code>
     */
    public Builder setHealthCodeValue(int value) {
      healthCode_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     *健康码
     * </pre>
     *
     * <code>.Ifaipb.HealthCodeEnum health_code = 2;</code>
     */
    public com.intellif.ifai.IfHealthCode.HealthCodeEnum getHealthCode() {
      @SuppressWarnings("deprecation")
      com.intellif.ifai.IfHealthCode.HealthCodeEnum result = com.intellif.ifai.IfHealthCode.HealthCodeEnum.valueOf(healthCode_);
      return result == null ? com.intellif.ifai.IfHealthCode.HealthCodeEnum.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     *健康码
     * </pre>
     *
     * <code>.Ifaipb.HealthCodeEnum health_code = 2;</code>
     */
    public Builder setHealthCode(com.intellif.ifai.IfHealthCode.HealthCodeEnum value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      healthCode_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     *健康码
     * </pre>
     *
     * <code>.Ifaipb.HealthCodeEnum health_code = 2;</code>
     */
    public Builder clearHealthCode() {
      
      healthCode_ = 0;
      onChanged();
      return this;
    }

    private int healthStatus_ = 0;
    /**
     * <pre>
     *健康检测状态
     * </pre>
     *
     * <code>.Ifaipb.HealthStatusEnum health_status = 3;</code>
     */
    public int getHealthStatusValue() {
      return healthStatus_;
    }
    /**
     * <pre>
     *健康检测状态
     * </pre>
     *
     * <code>.Ifaipb.HealthStatusEnum health_status = 3;</code>
     */
    public Builder setHealthStatusValue(int value) {
      healthStatus_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     *健康检测状态
     * </pre>
     *
     * <code>.Ifaipb.HealthStatusEnum health_status = 3;</code>
     */
    public com.intellif.ifai.IfHealthCode.HealthStatusEnum getHealthStatus() {
      @SuppressWarnings("deprecation")
      com.intellif.ifai.IfHealthCode.HealthStatusEnum result = com.intellif.ifai.IfHealthCode.HealthStatusEnum.valueOf(healthStatus_);
      return result == null ? com.intellif.ifai.IfHealthCode.HealthStatusEnum.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     *健康检测状态
     * </pre>
     *
     * <code>.Ifaipb.HealthStatusEnum health_status = 3;</code>
     */
    public Builder setHealthStatus(com.intellif.ifai.IfHealthCode.HealthStatusEnum value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      healthStatus_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     *健康检测状态
     * </pre>
     *
     * <code>.Ifaipb.HealthStatusEnum health_status = 3;</code>
     */
    public Builder clearHealthStatus() {
      
      healthStatus_ = 0;
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


    // @@protoc_insertion_point(builder_scope:Ifaipb.ReportPassInfoResponse)
  }

  // @@protoc_insertion_point(class_scope:Ifaipb.ReportPassInfoResponse)
  private static final com.intellif.ifai.IfHealthCode.ReportPassInfoResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.intellif.ifai.IfHealthCode.ReportPassInfoResponse();
  }

  public static com.intellif.ifai.IfHealthCode.ReportPassInfoResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ReportPassInfoResponse>
      PARSER = new com.google.protobuf.AbstractParser<ReportPassInfoResponse>() {
    @java.lang.Override
    public ReportPassInfoResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ReportPassInfoResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ReportPassInfoResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ReportPassInfoResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.intellif.ifai.IfHealthCode.ReportPassInfoResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

