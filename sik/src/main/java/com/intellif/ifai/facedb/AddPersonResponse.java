// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: IfFaceDatabase.proto

package com.intellif.ifai.facedb;

/**
 * Protobuf type {@code Ifaipb.AddPersonResponse}
 */
public  final class AddPersonResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:Ifaipb.AddPersonResponse)
    AddPersonResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use AddPersonResponse.newBuilder() to construct.
  private AddPersonResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private AddPersonResponse() {
    personId_ = "";
    faceId_ = 0;
    name_ = "";
    customerId_ = "";
    state_ = 0;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private AddPersonResponse(
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

            personId_ = s;
            break;
          }
          case 16: {

            faceId_ = input.readInt32();
            break;
          }
          case 26: {
            com.intellif.ifai.common.Rectangle.Builder subBuilder = null;
            if (faceRectangle_ != null) {
              subBuilder = faceRectangle_.toBuilder();
            }
            faceRectangle_ = input.readMessage(com.intellif.ifai.common.Rectangle.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(faceRectangle_);
              faceRectangle_ = subBuilder.buildPartial();
            }

            break;
          }
          case 34: {
            java.lang.String s = input.readStringRequireUtf8();

            name_ = s;
            break;
          }
          case 42: {
            java.lang.String s = input.readStringRequireUtf8();

            customerId_ = s;
            break;
          }
          case 48: {
            int rawValue = input.readEnum();

            state_ = rawValue;
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
    return com.intellif.ifai.facedb.Ifai.internal_static_Ifaipb_AddPersonResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.intellif.ifai.facedb.Ifai.internal_static_Ifaipb_AddPersonResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.intellif.ifai.facedb.AddPersonResponse.class, com.intellif.ifai.facedb.AddPersonResponse.Builder.class);
  }

  public static final int PERSON_ID_FIELD_NUMBER = 1;
  private volatile java.lang.Object personId_;
  /**
   * <pre>
   *人员ID，如身份证号码
   * </pre>
   *
   * <code>string person_id = 1;</code>
   */
  public java.lang.String getPersonId() {
    java.lang.Object ref = personId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      personId_ = s;
      return s;
    }
  }
  /**
   * <pre>
   *人员ID，如身份证号码
   * </pre>
   *
   * <code>string person_id = 1;</code>
   */
  public com.google.protobuf.ByteString
      getPersonIdBytes() {
    java.lang.Object ref = personId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      personId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int FACE_ID_FIELD_NUMBER = 2;
  private int faceId_;
  /**
   * <pre>
   *人脸ID
   * </pre>
   *
   * <code>int32 face_id = 2;</code>
   */
  public int getFaceId() {
    return faceId_;
  }

  public static final int FACE_RECTANGLE_FIELD_NUMBER = 3;
  private com.intellif.ifai.common.Rectangle faceRectangle_;
  /**
   * <pre>
   *人脸在照片中的位置
   * </pre>
   *
   * <code>.Ifaipb.Rectangle face_rectangle = 3;</code>
   */
  public boolean hasFaceRectangle() {
    return faceRectangle_ != null;
  }
  /**
   * <pre>
   *人脸在照片中的位置
   * </pre>
   *
   * <code>.Ifaipb.Rectangle face_rectangle = 3;</code>
   */
  public com.intellif.ifai.common.Rectangle getFaceRectangle() {
    return faceRectangle_ == null ? com.intellif.ifai.common.Rectangle.getDefaultInstance() : faceRectangle_;
  }
  /**
   * <pre>
   *人脸在照片中的位置
   * </pre>
   *
   * <code>.Ifaipb.Rectangle face_rectangle = 3;</code>
   */
  public com.intellif.ifai.common.RectangleOrBuilder getFaceRectangleOrBuilder() {
    return getFaceRectangle();
  }

  public static final int NAME_FIELD_NUMBER = 4;
  private volatile java.lang.Object name_;
  /**
   * <pre>
   *姓名
   * </pre>
   *
   * <code>string name = 4;</code>
   */
  public java.lang.String getName() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      name_ = s;
      return s;
    }
  }
  /**
   * <pre>
   *姓名
   * </pre>
   *
   * <code>string name = 4;</code>
   */
  public com.google.protobuf.ByteString
      getNameBytes() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      name_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int CUSTOMER_ID_FIELD_NUMBER = 5;
  private volatile java.lang.Object customerId_;
  /**
   * <pre>
   *用户自定义Id
   * </pre>
   *
   * <code>string customer_id = 5;</code>
   */
  public java.lang.String getCustomerId() {
    java.lang.Object ref = customerId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      customerId_ = s;
      return s;
    }
  }
  /**
   * <pre>
   *用户自定义Id
   * </pre>
   *
   * <code>string customer_id = 5;</code>
   */
  public com.google.protobuf.ByteString
      getCustomerIdBytes() {
    java.lang.Object ref = customerId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      customerId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int STATE_FIELD_NUMBER = 6;
  private int state_;
  /**
   * <pre>
   *添加状态，只有当state=AddPersonState_OK时，上述参数有效
   * </pre>
   *
   * <code>.Ifaipb.AddPersonState state = 6;</code>
   */
  public int getStateValue() {
    return state_;
  }
  /**
   * <pre>
   *添加状态，只有当state=AddPersonState_OK时，上述参数有效
   * </pre>
   *
   * <code>.Ifaipb.AddPersonState state = 6;</code>
   */
  public com.intellif.ifai.facedb.AddPersonState getState() {
    @SuppressWarnings("deprecation")
    com.intellif.ifai.facedb.AddPersonState result = com.intellif.ifai.facedb.AddPersonState.valueOf(state_);
    return result == null ? com.intellif.ifai.facedb.AddPersonState.UNRECOGNIZED : result;
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
    if (!getPersonIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, personId_);
    }
    if (faceId_ != 0) {
      output.writeInt32(2, faceId_);
    }
    if (faceRectangle_ != null) {
      output.writeMessage(3, getFaceRectangle());
    }
    if (!getNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, name_);
    }
    if (!getCustomerIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 5, customerId_);
    }
    if (state_ != com.intellif.ifai.facedb.AddPersonState.AddPersonState_OK.getNumber()) {
      output.writeEnum(6, state_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getPersonIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, personId_);
    }
    if (faceId_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, faceId_);
    }
    if (faceRectangle_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getFaceRectangle());
    }
    if (!getNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, name_);
    }
    if (!getCustomerIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(5, customerId_);
    }
    if (state_ != com.intellif.ifai.facedb.AddPersonState.AddPersonState_OK.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(6, state_);
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
    if (!(obj instanceof com.intellif.ifai.facedb.AddPersonResponse)) {
      return super.equals(obj);
    }
    com.intellif.ifai.facedb.AddPersonResponse other = (com.intellif.ifai.facedb.AddPersonResponse) obj;

    boolean result = true;
    result = result && getPersonId()
        .equals(other.getPersonId());
    result = result && (getFaceId()
        == other.getFaceId());
    result = result && (hasFaceRectangle() == other.hasFaceRectangle());
    if (hasFaceRectangle()) {
      result = result && getFaceRectangle()
          .equals(other.getFaceRectangle());
    }
    result = result && getName()
        .equals(other.getName());
    result = result && getCustomerId()
        .equals(other.getCustomerId());
    result = result && state_ == other.state_;
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
    hash = (37 * hash) + PERSON_ID_FIELD_NUMBER;
    hash = (53 * hash) + getPersonId().hashCode();
    hash = (37 * hash) + FACE_ID_FIELD_NUMBER;
    hash = (53 * hash) + getFaceId();
    if (hasFaceRectangle()) {
      hash = (37 * hash) + FACE_RECTANGLE_FIELD_NUMBER;
      hash = (53 * hash) + getFaceRectangle().hashCode();
    }
    hash = (37 * hash) + NAME_FIELD_NUMBER;
    hash = (53 * hash) + getName().hashCode();
    hash = (37 * hash) + CUSTOMER_ID_FIELD_NUMBER;
    hash = (53 * hash) + getCustomerId().hashCode();
    hash = (37 * hash) + STATE_FIELD_NUMBER;
    hash = (53 * hash) + state_;
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.intellif.ifai.facedb.AddPersonResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.intellif.ifai.facedb.AddPersonResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.intellif.ifai.facedb.AddPersonResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.intellif.ifai.facedb.AddPersonResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.intellif.ifai.facedb.AddPersonResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.intellif.ifai.facedb.AddPersonResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.intellif.ifai.facedb.AddPersonResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.intellif.ifai.facedb.AddPersonResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.intellif.ifai.facedb.AddPersonResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.intellif.ifai.facedb.AddPersonResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.intellif.ifai.facedb.AddPersonResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.intellif.ifai.facedb.AddPersonResponse parseFrom(
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
  public static Builder newBuilder(com.intellif.ifai.facedb.AddPersonResponse prototype) {
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
   * Protobuf type {@code Ifaipb.AddPersonResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:Ifaipb.AddPersonResponse)
      com.intellif.ifai.facedb.AddPersonResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.intellif.ifai.facedb.Ifai.internal_static_Ifaipb_AddPersonResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.intellif.ifai.facedb.Ifai.internal_static_Ifaipb_AddPersonResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.intellif.ifai.facedb.AddPersonResponse.class, com.intellif.ifai.facedb.AddPersonResponse.Builder.class);
    }

    // Construct using com.intellif.ifai.facedb.AddPersonResponse.newBuilder()
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
      personId_ = "";

      faceId_ = 0;

      if (faceRectangleBuilder_ == null) {
        faceRectangle_ = null;
      } else {
        faceRectangle_ = null;
        faceRectangleBuilder_ = null;
      }
      name_ = "";

      customerId_ = "";

      state_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.intellif.ifai.facedb.Ifai.internal_static_Ifaipb_AddPersonResponse_descriptor;
    }

    @java.lang.Override
    public com.intellif.ifai.facedb.AddPersonResponse getDefaultInstanceForType() {
      return com.intellif.ifai.facedb.AddPersonResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.intellif.ifai.facedb.AddPersonResponse build() {
      com.intellif.ifai.facedb.AddPersonResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.intellif.ifai.facedb.AddPersonResponse buildPartial() {
      com.intellif.ifai.facedb.AddPersonResponse result = new com.intellif.ifai.facedb.AddPersonResponse(this);
      result.personId_ = personId_;
      result.faceId_ = faceId_;
      if (faceRectangleBuilder_ == null) {
        result.faceRectangle_ = faceRectangle_;
      } else {
        result.faceRectangle_ = faceRectangleBuilder_.build();
      }
      result.name_ = name_;
      result.customerId_ = customerId_;
      result.state_ = state_;
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
      if (other instanceof com.intellif.ifai.facedb.AddPersonResponse) {
        return mergeFrom((com.intellif.ifai.facedb.AddPersonResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.intellif.ifai.facedb.AddPersonResponse other) {
      if (other == com.intellif.ifai.facedb.AddPersonResponse.getDefaultInstance()) return this;
      if (!other.getPersonId().isEmpty()) {
        personId_ = other.personId_;
        onChanged();
      }
      if (other.getFaceId() != 0) {
        setFaceId(other.getFaceId());
      }
      if (other.hasFaceRectangle()) {
        mergeFaceRectangle(other.getFaceRectangle());
      }
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        onChanged();
      }
      if (!other.getCustomerId().isEmpty()) {
        customerId_ = other.customerId_;
        onChanged();
      }
      if (other.state_ != 0) {
        setStateValue(other.getStateValue());
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
      com.intellif.ifai.facedb.AddPersonResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.intellif.ifai.facedb.AddPersonResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object personId_ = "";
    /**
     * <pre>
     *人员ID，如身份证号码
     * </pre>
     *
     * <code>string person_id = 1;</code>
     */
    public java.lang.String getPersonId() {
      java.lang.Object ref = personId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        personId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     *人员ID，如身份证号码
     * </pre>
     *
     * <code>string person_id = 1;</code>
     */
    public com.google.protobuf.ByteString
        getPersonIdBytes() {
      java.lang.Object ref = personId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        personId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     *人员ID，如身份证号码
     * </pre>
     *
     * <code>string person_id = 1;</code>
     */
    public Builder setPersonId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      personId_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     *人员ID，如身份证号码
     * </pre>
     *
     * <code>string person_id = 1;</code>
     */
    public Builder clearPersonId() {
      
      personId_ = getDefaultInstance().getPersonId();
      onChanged();
      return this;
    }
    /**
     * <pre>
     *人员ID，如身份证号码
     * </pre>
     *
     * <code>string person_id = 1;</code>
     */
    public Builder setPersonIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      personId_ = value;
      onChanged();
      return this;
    }

    private int faceId_ ;
    /**
     * <pre>
     *人脸ID
     * </pre>
     *
     * <code>int32 face_id = 2;</code>
     */
    public int getFaceId() {
      return faceId_;
    }
    /**
     * <pre>
     *人脸ID
     * </pre>
     *
     * <code>int32 face_id = 2;</code>
     */
    public Builder setFaceId(int value) {
      
      faceId_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     *人脸ID
     * </pre>
     *
     * <code>int32 face_id = 2;</code>
     */
    public Builder clearFaceId() {
      
      faceId_ = 0;
      onChanged();
      return this;
    }

    private com.intellif.ifai.common.Rectangle faceRectangle_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.intellif.ifai.common.Rectangle, com.intellif.ifai.common.Rectangle.Builder, com.intellif.ifai.common.RectangleOrBuilder> faceRectangleBuilder_;
    /**
     * <pre>
     *人脸在照片中的位置
     * </pre>
     *
     * <code>.Ifaipb.Rectangle face_rectangle = 3;</code>
     */
    public boolean hasFaceRectangle() {
      return faceRectangleBuilder_ != null || faceRectangle_ != null;
    }
    /**
     * <pre>
     *人脸在照片中的位置
     * </pre>
     *
     * <code>.Ifaipb.Rectangle face_rectangle = 3;</code>
     */
    public com.intellif.ifai.common.Rectangle getFaceRectangle() {
      if (faceRectangleBuilder_ == null) {
        return faceRectangle_ == null ? com.intellif.ifai.common.Rectangle.getDefaultInstance() : faceRectangle_;
      } else {
        return faceRectangleBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     *人脸在照片中的位置
     * </pre>
     *
     * <code>.Ifaipb.Rectangle face_rectangle = 3;</code>
     */
    public Builder setFaceRectangle(com.intellif.ifai.common.Rectangle value) {
      if (faceRectangleBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        faceRectangle_ = value;
        onChanged();
      } else {
        faceRectangleBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     *人脸在照片中的位置
     * </pre>
     *
     * <code>.Ifaipb.Rectangle face_rectangle = 3;</code>
     */
    public Builder setFaceRectangle(
        com.intellif.ifai.common.Rectangle.Builder builderForValue) {
      if (faceRectangleBuilder_ == null) {
        faceRectangle_ = builderForValue.build();
        onChanged();
      } else {
        faceRectangleBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     *人脸在照片中的位置
     * </pre>
     *
     * <code>.Ifaipb.Rectangle face_rectangle = 3;</code>
     */
    public Builder mergeFaceRectangle(com.intellif.ifai.common.Rectangle value) {
      if (faceRectangleBuilder_ == null) {
        if (faceRectangle_ != null) {
          faceRectangle_ =
            com.intellif.ifai.common.Rectangle.newBuilder(faceRectangle_).mergeFrom(value).buildPartial();
        } else {
          faceRectangle_ = value;
        }
        onChanged();
      } else {
        faceRectangleBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     *人脸在照片中的位置
     * </pre>
     *
     * <code>.Ifaipb.Rectangle face_rectangle = 3;</code>
     */
    public Builder clearFaceRectangle() {
      if (faceRectangleBuilder_ == null) {
        faceRectangle_ = null;
        onChanged();
      } else {
        faceRectangle_ = null;
        faceRectangleBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     *人脸在照片中的位置
     * </pre>
     *
     * <code>.Ifaipb.Rectangle face_rectangle = 3;</code>
     */
    public com.intellif.ifai.common.Rectangle.Builder getFaceRectangleBuilder() {
      
      onChanged();
      return getFaceRectangleFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     *人脸在照片中的位置
     * </pre>
     *
     * <code>.Ifaipb.Rectangle face_rectangle = 3;</code>
     */
    public com.intellif.ifai.common.RectangleOrBuilder getFaceRectangleOrBuilder() {
      if (faceRectangleBuilder_ != null) {
        return faceRectangleBuilder_.getMessageOrBuilder();
      } else {
        return faceRectangle_ == null ?
            com.intellif.ifai.common.Rectangle.getDefaultInstance() : faceRectangle_;
      }
    }
    /**
     * <pre>
     *人脸在照片中的位置
     * </pre>
     *
     * <code>.Ifaipb.Rectangle face_rectangle = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.intellif.ifai.common.Rectangle, com.intellif.ifai.common.Rectangle.Builder, com.intellif.ifai.common.RectangleOrBuilder> 
        getFaceRectangleFieldBuilder() {
      if (faceRectangleBuilder_ == null) {
        faceRectangleBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.intellif.ifai.common.Rectangle, com.intellif.ifai.common.Rectangle.Builder, com.intellif.ifai.common.RectangleOrBuilder>(
                getFaceRectangle(),
                getParentForChildren(),
                isClean());
        faceRectangle_ = null;
      }
      return faceRectangleBuilder_;
    }

    private java.lang.Object name_ = "";
    /**
     * <pre>
     *姓名
     * </pre>
     *
     * <code>string name = 4;</code>
     */
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        name_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     *姓名
     * </pre>
     *
     * <code>string name = 4;</code>
     */
    public com.google.protobuf.ByteString
        getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     *姓名
     * </pre>
     *
     * <code>string name = 4;</code>
     */
    public Builder setName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      name_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     *姓名
     * </pre>
     *
     * <code>string name = 4;</code>
     */
    public Builder clearName() {
      
      name_ = getDefaultInstance().getName();
      onChanged();
      return this;
    }
    /**
     * <pre>
     *姓名
     * </pre>
     *
     * <code>string name = 4;</code>
     */
    public Builder setNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      name_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object customerId_ = "";
    /**
     * <pre>
     *用户自定义Id
     * </pre>
     *
     * <code>string customer_id = 5;</code>
     */
    public java.lang.String getCustomerId() {
      java.lang.Object ref = customerId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        customerId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     *用户自定义Id
     * </pre>
     *
     * <code>string customer_id = 5;</code>
     */
    public com.google.protobuf.ByteString
        getCustomerIdBytes() {
      java.lang.Object ref = customerId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        customerId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     *用户自定义Id
     * </pre>
     *
     * <code>string customer_id = 5;</code>
     */
    public Builder setCustomerId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      customerId_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     *用户自定义Id
     * </pre>
     *
     * <code>string customer_id = 5;</code>
     */
    public Builder clearCustomerId() {
      
      customerId_ = getDefaultInstance().getCustomerId();
      onChanged();
      return this;
    }
    /**
     * <pre>
     *用户自定义Id
     * </pre>
     *
     * <code>string customer_id = 5;</code>
     */
    public Builder setCustomerIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      customerId_ = value;
      onChanged();
      return this;
    }

    private int state_ = 0;
    /**
     * <pre>
     *添加状态，只有当state=AddPersonState_OK时，上述参数有效
     * </pre>
     *
     * <code>.Ifaipb.AddPersonState state = 6;</code>
     */
    public int getStateValue() {
      return state_;
    }
    /**
     * <pre>
     *添加状态，只有当state=AddPersonState_OK时，上述参数有效
     * </pre>
     *
     * <code>.Ifaipb.AddPersonState state = 6;</code>
     */
    public Builder setStateValue(int value) {
      state_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     *添加状态，只有当state=AddPersonState_OK时，上述参数有效
     * </pre>
     *
     * <code>.Ifaipb.AddPersonState state = 6;</code>
     */
    public com.intellif.ifai.facedb.AddPersonState getState() {
      @SuppressWarnings("deprecation")
      com.intellif.ifai.facedb.AddPersonState result = com.intellif.ifai.facedb.AddPersonState.valueOf(state_);
      return result == null ? com.intellif.ifai.facedb.AddPersonState.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     *添加状态，只有当state=AddPersonState_OK时，上述参数有效
     * </pre>
     *
     * <code>.Ifaipb.AddPersonState state = 6;</code>
     */
    public Builder setState(com.intellif.ifai.facedb.AddPersonState value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      state_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     *添加状态，只有当state=AddPersonState_OK时，上述参数有效
     * </pre>
     *
     * <code>.Ifaipb.AddPersonState state = 6;</code>
     */
    public Builder clearState() {
      
      state_ = 0;
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


    // @@protoc_insertion_point(builder_scope:Ifaipb.AddPersonResponse)
  }

  // @@protoc_insertion_point(class_scope:Ifaipb.AddPersonResponse)
  private static final com.intellif.ifai.facedb.AddPersonResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.intellif.ifai.facedb.AddPersonResponse();
  }

  public static com.intellif.ifai.facedb.AddPersonResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AddPersonResponse>
      PARSER = new com.google.protobuf.AbstractParser<AddPersonResponse>() {
    @java.lang.Override
    public AddPersonResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new AddPersonResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<AddPersonResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AddPersonResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.intellif.ifai.facedb.AddPersonResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
