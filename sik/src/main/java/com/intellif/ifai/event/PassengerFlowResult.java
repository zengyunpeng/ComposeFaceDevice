// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: IfEvent.proto

package com.intellif.ifai.event;

/**
 * Protobuf type {@code Ifaipb.PassengerFlowResult}
 */
public  final class PassengerFlowResult extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:Ifaipb.PassengerFlowResult)
    PassengerFlowResultOrBuilder {
private static final long serialVersionUID = 0L;
  // Use PassengerFlowResult.newBuilder() to construct.
  private PassengerFlowResult(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private PassengerFlowResult() {
    lineId_ = 0;
    arrivalX_ = 0;
    arrivalY_ = 0;
    reportTime_ = 0;
    objectId_ = 0;
    direction_ = 0;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private PassengerFlowResult(
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

            lineId_ = input.readInt32();
            break;
          }
          case 16: {

            arrivalX_ = input.readInt32();
            break;
          }
          case 24: {

            arrivalY_ = input.readInt32();
            break;
          }
          case 32: {

            reportTime_ = input.readInt32();
            break;
          }
          case 40: {

            objectId_ = input.readInt32();
            break;
          }
          case 48: {

            direction_ = input.readInt32();
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
    return com.intellif.ifai.event.Ifai.internal_static_Ifaipb_PassengerFlowResult_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.intellif.ifai.event.Ifai.internal_static_Ifaipb_PassengerFlowResult_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.intellif.ifai.event.PassengerFlowResult.class, com.intellif.ifai.event.PassengerFlowResult.Builder.class);
  }

  public static final int LINE_ID_FIELD_NUMBER = 1;
  private int lineId_;
  /**
   * <pre>
   *跨过得线的Id
   * </pre>
   *
   * <code>int32 line_id = 1;</code>
   */
  public int getLineId() {
    return lineId_;
  }

  public static final int ARRIVAL_X_FIELD_NUMBER = 2;
  private int arrivalX_;
  /**
   * <pre>
   *跨线位置横坐标
   * </pre>
   *
   * <code>int32 arrival_x = 2;</code>
   */
  public int getArrivalX() {
    return arrivalX_;
  }

  public static final int ARRIVAL_Y_FIELD_NUMBER = 3;
  private int arrivalY_;
  /**
   * <pre>
   *跨线位置纵坐标
   * </pre>
   *
   * <code>int32 arrival_y = 3;</code>
   */
  public int getArrivalY() {
    return arrivalY_;
  }

  public static final int REPORT_TIME_FIELD_NUMBER = 4;
  private int reportTime_;
  /**
   * <pre>
   *跨线时间
   * </pre>
   *
   * <code>int32 report_time = 4;</code>
   */
  public int getReportTime() {
    return reportTime_;
  }

  public static final int OBJECT_ID_FIELD_NUMBER = 5;
  private int objectId_;
  /**
   * <pre>
   *被识别物体Id
   * </pre>
   *
   * <code>int32 object_id = 5;</code>
   */
  public int getObjectId() {
    return objectId_;
  }

  public static final int DIRECTION_FIELD_NUMBER = 6;
  private int direction_;
  /**
   * <pre>
   *跨线方向，0为正向，1为反向
   * </pre>
   *
   * <code>int32 direction = 6;</code>
   */
  public int getDirection() {
    return direction_;
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
    if (lineId_ != 0) {
      output.writeInt32(1, lineId_);
    }
    if (arrivalX_ != 0) {
      output.writeInt32(2, arrivalX_);
    }
    if (arrivalY_ != 0) {
      output.writeInt32(3, arrivalY_);
    }
    if (reportTime_ != 0) {
      output.writeInt32(4, reportTime_);
    }
    if (objectId_ != 0) {
      output.writeInt32(5, objectId_);
    }
    if (direction_ != 0) {
      output.writeInt32(6, direction_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (lineId_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, lineId_);
    }
    if (arrivalX_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, arrivalX_);
    }
    if (arrivalY_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(3, arrivalY_);
    }
    if (reportTime_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(4, reportTime_);
    }
    if (objectId_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(5, objectId_);
    }
    if (direction_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(6, direction_);
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
    if (!(obj instanceof com.intellif.ifai.event.PassengerFlowResult)) {
      return super.equals(obj);
    }
    com.intellif.ifai.event.PassengerFlowResult other = (com.intellif.ifai.event.PassengerFlowResult) obj;

    boolean result = true;
    result = result && (getLineId()
        == other.getLineId());
    result = result && (getArrivalX()
        == other.getArrivalX());
    result = result && (getArrivalY()
        == other.getArrivalY());
    result = result && (getReportTime()
        == other.getReportTime());
    result = result && (getObjectId()
        == other.getObjectId());
    result = result && (getDirection()
        == other.getDirection());
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
    hash = (37 * hash) + LINE_ID_FIELD_NUMBER;
    hash = (53 * hash) + getLineId();
    hash = (37 * hash) + ARRIVAL_X_FIELD_NUMBER;
    hash = (53 * hash) + getArrivalX();
    hash = (37 * hash) + ARRIVAL_Y_FIELD_NUMBER;
    hash = (53 * hash) + getArrivalY();
    hash = (37 * hash) + REPORT_TIME_FIELD_NUMBER;
    hash = (53 * hash) + getReportTime();
    hash = (37 * hash) + OBJECT_ID_FIELD_NUMBER;
    hash = (53 * hash) + getObjectId();
    hash = (37 * hash) + DIRECTION_FIELD_NUMBER;
    hash = (53 * hash) + getDirection();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.intellif.ifai.event.PassengerFlowResult parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.intellif.ifai.event.PassengerFlowResult parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.intellif.ifai.event.PassengerFlowResult parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.intellif.ifai.event.PassengerFlowResult parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.intellif.ifai.event.PassengerFlowResult parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.intellif.ifai.event.PassengerFlowResult parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.intellif.ifai.event.PassengerFlowResult parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.intellif.ifai.event.PassengerFlowResult parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.intellif.ifai.event.PassengerFlowResult parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.intellif.ifai.event.PassengerFlowResult parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.intellif.ifai.event.PassengerFlowResult parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.intellif.ifai.event.PassengerFlowResult parseFrom(
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
  public static Builder newBuilder(com.intellif.ifai.event.PassengerFlowResult prototype) {
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
   * Protobuf type {@code Ifaipb.PassengerFlowResult}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:Ifaipb.PassengerFlowResult)
      com.intellif.ifai.event.PassengerFlowResultOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.intellif.ifai.event.Ifai.internal_static_Ifaipb_PassengerFlowResult_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.intellif.ifai.event.Ifai.internal_static_Ifaipb_PassengerFlowResult_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.intellif.ifai.event.PassengerFlowResult.class, com.intellif.ifai.event.PassengerFlowResult.Builder.class);
    }

    // Construct using com.intellif.ifai.event.PassengerFlowResult.newBuilder()
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
      lineId_ = 0;

      arrivalX_ = 0;

      arrivalY_ = 0;

      reportTime_ = 0;

      objectId_ = 0;

      direction_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.intellif.ifai.event.Ifai.internal_static_Ifaipb_PassengerFlowResult_descriptor;
    }

    @java.lang.Override
    public com.intellif.ifai.event.PassengerFlowResult getDefaultInstanceForType() {
      return com.intellif.ifai.event.PassengerFlowResult.getDefaultInstance();
    }

    @java.lang.Override
    public com.intellif.ifai.event.PassengerFlowResult build() {
      com.intellif.ifai.event.PassengerFlowResult result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.intellif.ifai.event.PassengerFlowResult buildPartial() {
      com.intellif.ifai.event.PassengerFlowResult result = new com.intellif.ifai.event.PassengerFlowResult(this);
      result.lineId_ = lineId_;
      result.arrivalX_ = arrivalX_;
      result.arrivalY_ = arrivalY_;
      result.reportTime_ = reportTime_;
      result.objectId_ = objectId_;
      result.direction_ = direction_;
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
      if (other instanceof com.intellif.ifai.event.PassengerFlowResult) {
        return mergeFrom((com.intellif.ifai.event.PassengerFlowResult)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.intellif.ifai.event.PassengerFlowResult other) {
      if (other == com.intellif.ifai.event.PassengerFlowResult.getDefaultInstance()) return this;
      if (other.getLineId() != 0) {
        setLineId(other.getLineId());
      }
      if (other.getArrivalX() != 0) {
        setArrivalX(other.getArrivalX());
      }
      if (other.getArrivalY() != 0) {
        setArrivalY(other.getArrivalY());
      }
      if (other.getReportTime() != 0) {
        setReportTime(other.getReportTime());
      }
      if (other.getObjectId() != 0) {
        setObjectId(other.getObjectId());
      }
      if (other.getDirection() != 0) {
        setDirection(other.getDirection());
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
      com.intellif.ifai.event.PassengerFlowResult parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.intellif.ifai.event.PassengerFlowResult) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int lineId_ ;
    /**
     * <pre>
     *跨过得线的Id
     * </pre>
     *
     * <code>int32 line_id = 1;</code>
     */
    public int getLineId() {
      return lineId_;
    }
    /**
     * <pre>
     *跨过得线的Id
     * </pre>
     *
     * <code>int32 line_id = 1;</code>
     */
    public Builder setLineId(int value) {
      
      lineId_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     *跨过得线的Id
     * </pre>
     *
     * <code>int32 line_id = 1;</code>
     */
    public Builder clearLineId() {
      
      lineId_ = 0;
      onChanged();
      return this;
    }

    private int arrivalX_ ;
    /**
     * <pre>
     *跨线位置横坐标
     * </pre>
     *
     * <code>int32 arrival_x = 2;</code>
     */
    public int getArrivalX() {
      return arrivalX_;
    }
    /**
     * <pre>
     *跨线位置横坐标
     * </pre>
     *
     * <code>int32 arrival_x = 2;</code>
     */
    public Builder setArrivalX(int value) {
      
      arrivalX_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     *跨线位置横坐标
     * </pre>
     *
     * <code>int32 arrival_x = 2;</code>
     */
    public Builder clearArrivalX() {
      
      arrivalX_ = 0;
      onChanged();
      return this;
    }

    private int arrivalY_ ;
    /**
     * <pre>
     *跨线位置纵坐标
     * </pre>
     *
     * <code>int32 arrival_y = 3;</code>
     */
    public int getArrivalY() {
      return arrivalY_;
    }
    /**
     * <pre>
     *跨线位置纵坐标
     * </pre>
     *
     * <code>int32 arrival_y = 3;</code>
     */
    public Builder setArrivalY(int value) {
      
      arrivalY_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     *跨线位置纵坐标
     * </pre>
     *
     * <code>int32 arrival_y = 3;</code>
     */
    public Builder clearArrivalY() {
      
      arrivalY_ = 0;
      onChanged();
      return this;
    }

    private int reportTime_ ;
    /**
     * <pre>
     *跨线时间
     * </pre>
     *
     * <code>int32 report_time = 4;</code>
     */
    public int getReportTime() {
      return reportTime_;
    }
    /**
     * <pre>
     *跨线时间
     * </pre>
     *
     * <code>int32 report_time = 4;</code>
     */
    public Builder setReportTime(int value) {
      
      reportTime_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     *跨线时间
     * </pre>
     *
     * <code>int32 report_time = 4;</code>
     */
    public Builder clearReportTime() {
      
      reportTime_ = 0;
      onChanged();
      return this;
    }

    private int objectId_ ;
    /**
     * <pre>
     *被识别物体Id
     * </pre>
     *
     * <code>int32 object_id = 5;</code>
     */
    public int getObjectId() {
      return objectId_;
    }
    /**
     * <pre>
     *被识别物体Id
     * </pre>
     *
     * <code>int32 object_id = 5;</code>
     */
    public Builder setObjectId(int value) {
      
      objectId_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     *被识别物体Id
     * </pre>
     *
     * <code>int32 object_id = 5;</code>
     */
    public Builder clearObjectId() {
      
      objectId_ = 0;
      onChanged();
      return this;
    }

    private int direction_ ;
    /**
     * <pre>
     *跨线方向，0为正向，1为反向
     * </pre>
     *
     * <code>int32 direction = 6;</code>
     */
    public int getDirection() {
      return direction_;
    }
    /**
     * <pre>
     *跨线方向，0为正向，1为反向
     * </pre>
     *
     * <code>int32 direction = 6;</code>
     */
    public Builder setDirection(int value) {
      
      direction_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     *跨线方向，0为正向，1为反向
     * </pre>
     *
     * <code>int32 direction = 6;</code>
     */
    public Builder clearDirection() {
      
      direction_ = 0;
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


    // @@protoc_insertion_point(builder_scope:Ifaipb.PassengerFlowResult)
  }

  // @@protoc_insertion_point(class_scope:Ifaipb.PassengerFlowResult)
  private static final com.intellif.ifai.event.PassengerFlowResult DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.intellif.ifai.event.PassengerFlowResult();
  }

  public static com.intellif.ifai.event.PassengerFlowResult getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PassengerFlowResult>
      PARSER = new com.google.protobuf.AbstractParser<PassengerFlowResult>() {
    @java.lang.Override
    public PassengerFlowResult parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new PassengerFlowResult(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<PassengerFlowResult> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PassengerFlowResult> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.intellif.ifai.event.PassengerFlowResult getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

