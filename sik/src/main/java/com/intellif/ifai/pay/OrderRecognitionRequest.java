// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: IfPay.proto

package com.intellif.ifai.pay;

/**
 * <pre>
 * 订单识别结果
 * </pre>
 *
 * Protobuf type {@code Ifaipb.OrderRecognitionRequest}
 */
public  final class OrderRecognitionRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:Ifaipb.OrderRecognitionRequest)
    OrderRecognitionRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use OrderRecognitionRequest.newBuilder() to construct.
  private OrderRecognitionRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private OrderRecognitionRequest() {
    orderId_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private OrderRecognitionRequest(
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
            java.lang.String s = input.readStringRequireUtf8();

            orderId_ = s;
            break;
          }
          case 18: {
            com.intellif.ifai.event.FaceCaptureResult.Builder subBuilder = null;
            if (resultCase_ == 2) {
              subBuilder = ((com.intellif.ifai.event.FaceCaptureResult) result_).toBuilder();
            }
            result_ =
                input.readMessage(com.intellif.ifai.event.FaceCaptureResult.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom((com.intellif.ifai.event.FaceCaptureResult) result_);
              result_ = subBuilder.buildPartial();
            }
            resultCase_ = 2;
            break;
          }
          case 24: {
            int rawValue = input.readEnum();
            resultCase_ = 3;
            result_ = rawValue;
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
    return com.intellif.ifai.pay.Ifai.internal_static_Ifaipb_OrderRecognitionRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.intellif.ifai.pay.Ifai.internal_static_Ifaipb_OrderRecognitionRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.intellif.ifai.pay.OrderRecognitionRequest.class, com.intellif.ifai.pay.OrderRecognitionRequest.Builder.class);
  }

  private int resultCase_ = 0;
  private java.lang.Object result_;
  public enum ResultCase
      implements com.google.protobuf.Internal.EnumLite {
    FACE_CAPTURE(2),
    ERROR_INFO(3),
    RESULT_NOT_SET(0);
    private final int value;
    private ResultCase(int value) {
      this.value = value;
    }
    /**
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static ResultCase valueOf(int value) {
      return forNumber(value);
    }

    public static ResultCase forNumber(int value) {
      switch (value) {
        case 2: return FACE_CAPTURE;
        case 3: return ERROR_INFO;
        case 0: return RESULT_NOT_SET;
        default: return null;
      }
    }
    public int getNumber() {
      return this.value;
    }
  };

  public ResultCase
  getResultCase() {
    return ResultCase.forNumber(
        resultCase_);
  }

  public static final int ORDER_ID_FIELD_NUMBER = 1;
  private volatile java.lang.Object orderId_;
  /**
   * <code>string order_id = 1;</code>
   */
  public java.lang.String getOrderId() {
    java.lang.Object ref = orderId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      orderId_ = s;
      return s;
    }
  }
  /**
   * <code>string order_id = 1;</code>
   */
  public com.google.protobuf.ByteString
      getOrderIdBytes() {
    java.lang.Object ref = orderId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      orderId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int FACE_CAPTURE_FIELD_NUMBER = 2;
  /**
   * <pre>
   * 人脸检测结果
   * </pre>
   *
   * <code>.Ifaipb.FaceCaptureResult face_capture = 2;</code>
   */
  public boolean hasFaceCapture() {
    return resultCase_ == 2;
  }
  /**
   * <pre>
   * 人脸检测结果
   * </pre>
   *
   * <code>.Ifaipb.FaceCaptureResult face_capture = 2;</code>
   */
  public com.intellif.ifai.event.FaceCaptureResult getFaceCapture() {
    if (resultCase_ == 2) {
       return (com.intellif.ifai.event.FaceCaptureResult) result_;
    }
    return com.intellif.ifai.event.FaceCaptureResult.getDefaultInstance();
  }
  /**
   * <pre>
   * 人脸检测结果
   * </pre>
   *
   * <code>.Ifaipb.FaceCaptureResult face_capture = 2;</code>
   */
  public com.intellif.ifai.event.FaceCaptureResultOrBuilder getFaceCaptureOrBuilder() {
    if (resultCase_ == 2) {
       return (com.intellif.ifai.event.FaceCaptureResult) result_;
    }
    return com.intellif.ifai.event.FaceCaptureResult.getDefaultInstance();
  }

  public static final int ERROR_INFO_FIELD_NUMBER = 3;
  /**
   * <pre>
   * 识别错误信息
   * </pre>
   *
   * <code>.Ifaipb.OrderRecognitionError error_info = 3;</code>
   */
  public int getErrorInfoValue() {
    if (resultCase_ == 3) {
      return (java.lang.Integer) result_;
    }
    return 0;
  }
  /**
   * <pre>
   * 识别错误信息
   * </pre>
   *
   * <code>.Ifaipb.OrderRecognitionError error_info = 3;</code>
   */
  public com.intellif.ifai.pay.OrderRecognitionError getErrorInfo() {
    if (resultCase_ == 3) {
      @SuppressWarnings("deprecation")
      com.intellif.ifai.pay.OrderRecognitionError result = com.intellif.ifai.pay.OrderRecognitionError.valueOf(
          (java.lang.Integer) result_);
      return result == null ? com.intellif.ifai.pay.OrderRecognitionError.UNRECOGNIZED : result;
    }
    return com.intellif.ifai.pay.OrderRecognitionError.NO_FACE;
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
    if (!getOrderIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, orderId_);
    }
    if (resultCase_ == 2) {
      output.writeMessage(2, (com.intellif.ifai.event.FaceCaptureResult) result_);
    }
    if (resultCase_ == 3) {
      output.writeEnum(3, ((java.lang.Integer) result_));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getOrderIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, orderId_);
    }
    if (resultCase_ == 2) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, (com.intellif.ifai.event.FaceCaptureResult) result_);
    }
    if (resultCase_ == 3) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(3, ((java.lang.Integer) result_));
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
    if (!(obj instanceof com.intellif.ifai.pay.OrderRecognitionRequest)) {
      return super.equals(obj);
    }
    com.intellif.ifai.pay.OrderRecognitionRequest other = (com.intellif.ifai.pay.OrderRecognitionRequest) obj;

    boolean result = true;
    result = result && getOrderId()
        .equals(other.getOrderId());
    result = result && getResultCase().equals(
        other.getResultCase());
    if (!result) return false;
    switch (resultCase_) {
      case 2:
        result = result && getFaceCapture()
            .equals(other.getFaceCapture());
        break;
      case 3:
        result = result && getErrorInfoValue()
            == other.getErrorInfoValue();
        break;
      case 0:
      default:
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
    hash = (37 * hash) + ORDER_ID_FIELD_NUMBER;
    hash = (53 * hash) + getOrderId().hashCode();
    switch (resultCase_) {
      case 2:
        hash = (37 * hash) + FACE_CAPTURE_FIELD_NUMBER;
        hash = (53 * hash) + getFaceCapture().hashCode();
        break;
      case 3:
        hash = (37 * hash) + ERROR_INFO_FIELD_NUMBER;
        hash = (53 * hash) + getErrorInfoValue();
        break;
      case 0:
      default:
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.intellif.ifai.pay.OrderRecognitionRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.intellif.ifai.pay.OrderRecognitionRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.intellif.ifai.pay.OrderRecognitionRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.intellif.ifai.pay.OrderRecognitionRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.intellif.ifai.pay.OrderRecognitionRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.intellif.ifai.pay.OrderRecognitionRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.intellif.ifai.pay.OrderRecognitionRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.intellif.ifai.pay.OrderRecognitionRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.intellif.ifai.pay.OrderRecognitionRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.intellif.ifai.pay.OrderRecognitionRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.intellif.ifai.pay.OrderRecognitionRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.intellif.ifai.pay.OrderRecognitionRequest parseFrom(
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
  public static Builder newBuilder(com.intellif.ifai.pay.OrderRecognitionRequest prototype) {
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
   * 订单识别结果
   * </pre>
   *
   * Protobuf type {@code Ifaipb.OrderRecognitionRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:Ifaipb.OrderRecognitionRequest)
      com.intellif.ifai.pay.OrderRecognitionRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.intellif.ifai.pay.Ifai.internal_static_Ifaipb_OrderRecognitionRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.intellif.ifai.pay.Ifai.internal_static_Ifaipb_OrderRecognitionRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.intellif.ifai.pay.OrderRecognitionRequest.class, com.intellif.ifai.pay.OrderRecognitionRequest.Builder.class);
    }

    // Construct using com.intellif.ifai.pay.OrderRecognitionRequest.newBuilder()
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
      orderId_ = "";

      resultCase_ = 0;
      result_ = null;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.intellif.ifai.pay.Ifai.internal_static_Ifaipb_OrderRecognitionRequest_descriptor;
    }

    @java.lang.Override
    public com.intellif.ifai.pay.OrderRecognitionRequest getDefaultInstanceForType() {
      return com.intellif.ifai.pay.OrderRecognitionRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.intellif.ifai.pay.OrderRecognitionRequest build() {
      com.intellif.ifai.pay.OrderRecognitionRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.intellif.ifai.pay.OrderRecognitionRequest buildPartial() {
      com.intellif.ifai.pay.OrderRecognitionRequest result = new com.intellif.ifai.pay.OrderRecognitionRequest(this);
      result.orderId_ = orderId_;
      if (resultCase_ == 2) {
        if (faceCaptureBuilder_ == null) {
          result.result_ = result_;
        } else {
          result.result_ = faceCaptureBuilder_.build();
        }
      }
      if (resultCase_ == 3) {
        result.result_ = result_;
      }
      result.resultCase_ = resultCase_;
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
      if (other instanceof com.intellif.ifai.pay.OrderRecognitionRequest) {
        return mergeFrom((com.intellif.ifai.pay.OrderRecognitionRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.intellif.ifai.pay.OrderRecognitionRequest other) {
      if (other == com.intellif.ifai.pay.OrderRecognitionRequest.getDefaultInstance()) return this;
      if (!other.getOrderId().isEmpty()) {
        orderId_ = other.orderId_;
        onChanged();
      }
      switch (other.getResultCase()) {
        case FACE_CAPTURE: {
          mergeFaceCapture(other.getFaceCapture());
          break;
        }
        case ERROR_INFO: {
          setErrorInfoValue(other.getErrorInfoValue());
          break;
        }
        case RESULT_NOT_SET: {
          break;
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
      com.intellif.ifai.pay.OrderRecognitionRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.intellif.ifai.pay.OrderRecognitionRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int resultCase_ = 0;
    private java.lang.Object result_;
    public ResultCase
        getResultCase() {
      return ResultCase.forNumber(
          resultCase_);
    }

    public Builder clearResult() {
      resultCase_ = 0;
      result_ = null;
      onChanged();
      return this;
    }


    private java.lang.Object orderId_ = "";
    /**
     * <code>string order_id = 1;</code>
     */
    public java.lang.String getOrderId() {
      java.lang.Object ref = orderId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        orderId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string order_id = 1;</code>
     */
    public com.google.protobuf.ByteString
        getOrderIdBytes() {
      java.lang.Object ref = orderId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        orderId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string order_id = 1;</code>
     */
    public Builder setOrderId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      orderId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string order_id = 1;</code>
     */
    public Builder clearOrderId() {
      
      orderId_ = getDefaultInstance().getOrderId();
      onChanged();
      return this;
    }
    /**
     * <code>string order_id = 1;</code>
     */
    public Builder setOrderIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      orderId_ = value;
      onChanged();
      return this;
    }

    private com.google.protobuf.SingleFieldBuilderV3<
        com.intellif.ifai.event.FaceCaptureResult, com.intellif.ifai.event.FaceCaptureResult.Builder, com.intellif.ifai.event.FaceCaptureResultOrBuilder> faceCaptureBuilder_;
    /**
     * <pre>
     * 人脸检测结果
     * </pre>
     *
     * <code>.Ifaipb.FaceCaptureResult face_capture = 2;</code>
     */
    public boolean hasFaceCapture() {
      return resultCase_ == 2;
    }
    /**
     * <pre>
     * 人脸检测结果
     * </pre>
     *
     * <code>.Ifaipb.FaceCaptureResult face_capture = 2;</code>
     */
    public com.intellif.ifai.event.FaceCaptureResult getFaceCapture() {
      if (faceCaptureBuilder_ == null) {
        if (resultCase_ == 2) {
          return (com.intellif.ifai.event.FaceCaptureResult) result_;
        }
        return com.intellif.ifai.event.FaceCaptureResult.getDefaultInstance();
      } else {
        if (resultCase_ == 2) {
          return faceCaptureBuilder_.getMessage();
        }
        return com.intellif.ifai.event.FaceCaptureResult.getDefaultInstance();
      }
    }
    /**
     * <pre>
     * 人脸检测结果
     * </pre>
     *
     * <code>.Ifaipb.FaceCaptureResult face_capture = 2;</code>
     */
    public Builder setFaceCapture(com.intellif.ifai.event.FaceCaptureResult value) {
      if (faceCaptureBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        result_ = value;
        onChanged();
      } else {
        faceCaptureBuilder_.setMessage(value);
      }
      resultCase_ = 2;
      return this;
    }
    /**
     * <pre>
     * 人脸检测结果
     * </pre>
     *
     * <code>.Ifaipb.FaceCaptureResult face_capture = 2;</code>
     */
    public Builder setFaceCapture(
        com.intellif.ifai.event.FaceCaptureResult.Builder builderForValue) {
      if (faceCaptureBuilder_ == null) {
        result_ = builderForValue.build();
        onChanged();
      } else {
        faceCaptureBuilder_.setMessage(builderForValue.build());
      }
      resultCase_ = 2;
      return this;
    }
    /**
     * <pre>
     * 人脸检测结果
     * </pre>
     *
     * <code>.Ifaipb.FaceCaptureResult face_capture = 2;</code>
     */
    public Builder mergeFaceCapture(com.intellif.ifai.event.FaceCaptureResult value) {
      if (faceCaptureBuilder_ == null) {
        if (resultCase_ == 2 &&
            result_ != com.intellif.ifai.event.FaceCaptureResult.getDefaultInstance()) {
          result_ = com.intellif.ifai.event.FaceCaptureResult.newBuilder((com.intellif.ifai.event.FaceCaptureResult) result_)
              .mergeFrom(value).buildPartial();
        } else {
          result_ = value;
        }
        onChanged();
      } else {
        if (resultCase_ == 2) {
          faceCaptureBuilder_.mergeFrom(value);
        }
        faceCaptureBuilder_.setMessage(value);
      }
      resultCase_ = 2;
      return this;
    }
    /**
     * <pre>
     * 人脸检测结果
     * </pre>
     *
     * <code>.Ifaipb.FaceCaptureResult face_capture = 2;</code>
     */
    public Builder clearFaceCapture() {
      if (faceCaptureBuilder_ == null) {
        if (resultCase_ == 2) {
          resultCase_ = 0;
          result_ = null;
          onChanged();
        }
      } else {
        if (resultCase_ == 2) {
          resultCase_ = 0;
          result_ = null;
        }
        faceCaptureBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * 人脸检测结果
     * </pre>
     *
     * <code>.Ifaipb.FaceCaptureResult face_capture = 2;</code>
     */
    public com.intellif.ifai.event.FaceCaptureResult.Builder getFaceCaptureBuilder() {
      return getFaceCaptureFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * 人脸检测结果
     * </pre>
     *
     * <code>.Ifaipb.FaceCaptureResult face_capture = 2;</code>
     */
    public com.intellif.ifai.event.FaceCaptureResultOrBuilder getFaceCaptureOrBuilder() {
      if ((resultCase_ == 2) && (faceCaptureBuilder_ != null)) {
        return faceCaptureBuilder_.getMessageOrBuilder();
      } else {
        if (resultCase_ == 2) {
          return (com.intellif.ifai.event.FaceCaptureResult) result_;
        }
        return com.intellif.ifai.event.FaceCaptureResult.getDefaultInstance();
      }
    }
    /**
     * <pre>
     * 人脸检测结果
     * </pre>
     *
     * <code>.Ifaipb.FaceCaptureResult face_capture = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.intellif.ifai.event.FaceCaptureResult, com.intellif.ifai.event.FaceCaptureResult.Builder, com.intellif.ifai.event.FaceCaptureResultOrBuilder> 
        getFaceCaptureFieldBuilder() {
      if (faceCaptureBuilder_ == null) {
        if (!(resultCase_ == 2)) {
          result_ = com.intellif.ifai.event.FaceCaptureResult.getDefaultInstance();
        }
        faceCaptureBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.intellif.ifai.event.FaceCaptureResult, com.intellif.ifai.event.FaceCaptureResult.Builder, com.intellif.ifai.event.FaceCaptureResultOrBuilder>(
                (com.intellif.ifai.event.FaceCaptureResult) result_,
                getParentForChildren(),
                isClean());
        result_ = null;
      }
      resultCase_ = 2;
      onChanged();;
      return faceCaptureBuilder_;
    }

    /**
     * <pre>
     * 识别错误信息
     * </pre>
     *
     * <code>.Ifaipb.OrderRecognitionError error_info = 3;</code>
     */
    public int getErrorInfoValue() {
      if (resultCase_ == 3) {
        return ((java.lang.Integer) result_).intValue();
      }
      return 0;
    }
    /**
     * <pre>
     * 识别错误信息
     * </pre>
     *
     * <code>.Ifaipb.OrderRecognitionError error_info = 3;</code>
     */
    public Builder setErrorInfoValue(int value) {
      resultCase_ = 3;
      result_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 识别错误信息
     * </pre>
     *
     * <code>.Ifaipb.OrderRecognitionError error_info = 3;</code>
     */
    public com.intellif.ifai.pay.OrderRecognitionError getErrorInfo() {
      if (resultCase_ == 3) {
        @SuppressWarnings("deprecation")
        com.intellif.ifai.pay.OrderRecognitionError result = com.intellif.ifai.pay.OrderRecognitionError.valueOf(
            (java.lang.Integer) result_);
        return result == null ? com.intellif.ifai.pay.OrderRecognitionError.UNRECOGNIZED : result;
      }
      return com.intellif.ifai.pay.OrderRecognitionError.NO_FACE;
    }
    /**
     * <pre>
     * 识别错误信息
     * </pre>
     *
     * <code>.Ifaipb.OrderRecognitionError error_info = 3;</code>
     */
    public Builder setErrorInfo(com.intellif.ifai.pay.OrderRecognitionError value) {
      if (value == null) {
        throw new NullPointerException();
      }
      resultCase_ = 3;
      result_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 识别错误信息
     * </pre>
     *
     * <code>.Ifaipb.OrderRecognitionError error_info = 3;</code>
     */
    public Builder clearErrorInfo() {
      if (resultCase_ == 3) {
        resultCase_ = 0;
        result_ = null;
        onChanged();
      }
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


    // @@protoc_insertion_point(builder_scope:Ifaipb.OrderRecognitionRequest)
  }

  // @@protoc_insertion_point(class_scope:Ifaipb.OrderRecognitionRequest)
  private static final com.intellif.ifai.pay.OrderRecognitionRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.intellif.ifai.pay.OrderRecognitionRequest();
  }

  public static com.intellif.ifai.pay.OrderRecognitionRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<OrderRecognitionRequest>
      PARSER = new com.google.protobuf.AbstractParser<OrderRecognitionRequest>() {
    @java.lang.Override
    public OrderRecognitionRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new OrderRecognitionRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<OrderRecognitionRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<OrderRecognitionRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.intellif.ifai.pay.OrderRecognitionRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

