// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: IfCommonType.proto

package com.intellif.ifai.common;

/**
 * <pre>
 * 检查模式
 * </pre>
 *
 * Protobuf type {@code Ifaipb.PassThroughModel}
 */
public  final class PassThroughModel extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:Ifaipb.PassThroughModel)
    PassThroughModelOrBuilder {
private static final long serialVersionUID = 0L;
  // Use PassThroughModel.newBuilder() to construct.
  private PassThroughModel(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private PassThroughModel() {
    personFace_ = false;
    icCard_ = false;
    identityCard_ = false;
    identityCardImmediately_ = false;
    qrCode_ = false;
    personFaceAndIdCard_ = false;
    appointment_ = false;
    identitySameCp_ = false;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private PassThroughModel(
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

            personFace_ = input.readBool();
            break;
          }
          case 16: {

            icCard_ = input.readBool();
            break;
          }
          case 24: {

            identityCard_ = input.readBool();
            break;
          }
          case 32: {

            identityCardImmediately_ = input.readBool();
            break;
          }
          case 40: {

            qrCode_ = input.readBool();
            break;
          }
          case 48: {

            personFaceAndIdCard_ = input.readBool();
            break;
          }
          case 56: {

            appointment_ = input.readBool();
            break;
          }
          case 64: {

            identitySameCp_ = input.readBool();
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
    return com.intellif.ifai.common.Ifai.internal_static_Ifaipb_PassThroughModel_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.intellif.ifai.common.Ifai.internal_static_Ifaipb_PassThroughModel_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.intellif.ifai.common.PassThroughModel.class, com.intellif.ifai.common.PassThroughModel.Builder.class);
  }

  public static final int PERSON_FACE_FIELD_NUMBER = 1;
  private boolean personFace_;
  /**
   * <pre>
   * 人脸
   * </pre>
   *
   * <code>bool person_face = 1;</code>
   */
  public boolean getPersonFace() {
    return personFace_;
  }

  public static final int IC_CARD_FIELD_NUMBER = 2;
  private boolean icCard_;
  /**
   * <pre>
   * IC卡
   * </pre>
   *
   * <code>bool ic_card = 2;</code>
   */
  public boolean getIcCard() {
    return icCard_;
  }

  public static final int IDENTITY_CARD_FIELD_NUMBER = 3;
  private boolean identityCard_;
  /**
   * <pre>
   * 身份证和人脸 1:1
   * </pre>
   *
   * <code>bool identity_card = 3;</code>
   */
  public boolean getIdentityCard() {
    return identityCard_;
  }

  public static final int IDENTITY_CARD_IMMEDIATELY_FIELD_NUMBER = 4;
  private boolean identityCardImmediately_;
  /**
   * <pre>
   * 只刷身份证
   * </pre>
   *
   * <code>bool identity_card_immediately = 4;</code>
   */
  public boolean getIdentityCardImmediately() {
    return identityCardImmediately_;
  }

  public static final int QR_CODE_FIELD_NUMBER = 5;
  private boolean qrCode_;
  /**
   * <pre>
   * 二维码开门
   * </pre>
   *
   * <code>bool qr_code = 5;</code>
   */
  public boolean getQrCode() {
    return qrCode_;
  }

  public static final int PERSON_FACE_AND_ID_CARD_FIELD_NUMBER = 6;
  private boolean personFaceAndIdCard_;
  /**
   * <pre>
   * 人脸+IC卡
   * </pre>
   *
   * <code>bool person_face_and_id_card = 6;</code>
   */
  public boolean getPersonFaceAndIdCard() {
    return personFaceAndIdCard_;
  }

  public static final int APPOINTMENT_FIELD_NUMBER = 7;
  private boolean appointment_;
  /**
   * <pre>
   * 人证预约模式
   * </pre>
   *
   * <code>bool appointment = 7;</code>
   */
  public boolean getAppointment() {
    return appointment_;
  }

  public static final int IDENTITY_SAME_CP_FIELD_NUMBER = 8;
  private boolean identitySameCp_;
  /**
   * <pre>
   *身份证号码相互比对
   * </pre>
   *
   * <code>bool identity_same_cp = 8;</code>
   */
  public boolean getIdentitySameCp() {
    return identitySameCp_;
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
    if (personFace_ != false) {
      output.writeBool(1, personFace_);
    }
    if (icCard_ != false) {
      output.writeBool(2, icCard_);
    }
    if (identityCard_ != false) {
      output.writeBool(3, identityCard_);
    }
    if (identityCardImmediately_ != false) {
      output.writeBool(4, identityCardImmediately_);
    }
    if (qrCode_ != false) {
      output.writeBool(5, qrCode_);
    }
    if (personFaceAndIdCard_ != false) {
      output.writeBool(6, personFaceAndIdCard_);
    }
    if (appointment_ != false) {
      output.writeBool(7, appointment_);
    }
    if (identitySameCp_ != false) {
      output.writeBool(8, identitySameCp_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (personFace_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(1, personFace_);
    }
    if (icCard_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(2, icCard_);
    }
    if (identityCard_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(3, identityCard_);
    }
    if (identityCardImmediately_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(4, identityCardImmediately_);
    }
    if (qrCode_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(5, qrCode_);
    }
    if (personFaceAndIdCard_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(6, personFaceAndIdCard_);
    }
    if (appointment_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(7, appointment_);
    }
    if (identitySameCp_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(8, identitySameCp_);
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
    if (!(obj instanceof com.intellif.ifai.common.PassThroughModel)) {
      return super.equals(obj);
    }
    com.intellif.ifai.common.PassThroughModel other = (com.intellif.ifai.common.PassThroughModel) obj;

    boolean result = true;
    result = result && (getPersonFace()
        == other.getPersonFace());
    result = result && (getIcCard()
        == other.getIcCard());
    result = result && (getIdentityCard()
        == other.getIdentityCard());
    result = result && (getIdentityCardImmediately()
        == other.getIdentityCardImmediately());
    result = result && (getQrCode()
        == other.getQrCode());
    result = result && (getPersonFaceAndIdCard()
        == other.getPersonFaceAndIdCard());
    result = result && (getAppointment()
        == other.getAppointment());
    result = result && (getIdentitySameCp()
        == other.getIdentitySameCp());
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
    hash = (37 * hash) + PERSON_FACE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getPersonFace());
    hash = (37 * hash) + IC_CARD_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getIcCard());
    hash = (37 * hash) + IDENTITY_CARD_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getIdentityCard());
    hash = (37 * hash) + IDENTITY_CARD_IMMEDIATELY_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getIdentityCardImmediately());
    hash = (37 * hash) + QR_CODE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getQrCode());
    hash = (37 * hash) + PERSON_FACE_AND_ID_CARD_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getPersonFaceAndIdCard());
    hash = (37 * hash) + APPOINTMENT_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getAppointment());
    hash = (37 * hash) + IDENTITY_SAME_CP_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getIdentitySameCp());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.intellif.ifai.common.PassThroughModel parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.intellif.ifai.common.PassThroughModel parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.intellif.ifai.common.PassThroughModel parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.intellif.ifai.common.PassThroughModel parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.intellif.ifai.common.PassThroughModel parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.intellif.ifai.common.PassThroughModel parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.intellif.ifai.common.PassThroughModel parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.intellif.ifai.common.PassThroughModel parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.intellif.ifai.common.PassThroughModel parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.intellif.ifai.common.PassThroughModel parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.intellif.ifai.common.PassThroughModel parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.intellif.ifai.common.PassThroughModel parseFrom(
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
  public static Builder newBuilder(com.intellif.ifai.common.PassThroughModel prototype) {
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
   * 检查模式
   * </pre>
   *
   * Protobuf type {@code Ifaipb.PassThroughModel}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:Ifaipb.PassThroughModel)
      com.intellif.ifai.common.PassThroughModelOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.intellif.ifai.common.Ifai.internal_static_Ifaipb_PassThroughModel_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.intellif.ifai.common.Ifai.internal_static_Ifaipb_PassThroughModel_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.intellif.ifai.common.PassThroughModel.class, com.intellif.ifai.common.PassThroughModel.Builder.class);
    }

    // Construct using com.intellif.ifai.common.PassThroughModel.newBuilder()
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
      personFace_ = false;

      icCard_ = false;

      identityCard_ = false;

      identityCardImmediately_ = false;

      qrCode_ = false;

      personFaceAndIdCard_ = false;

      appointment_ = false;

      identitySameCp_ = false;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.intellif.ifai.common.Ifai.internal_static_Ifaipb_PassThroughModel_descriptor;
    }

    @java.lang.Override
    public com.intellif.ifai.common.PassThroughModel getDefaultInstanceForType() {
      return com.intellif.ifai.common.PassThroughModel.getDefaultInstance();
    }

    @java.lang.Override
    public com.intellif.ifai.common.PassThroughModel build() {
      com.intellif.ifai.common.PassThroughModel result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.intellif.ifai.common.PassThroughModel buildPartial() {
      com.intellif.ifai.common.PassThroughModel result = new com.intellif.ifai.common.PassThroughModel(this);
      result.personFace_ = personFace_;
      result.icCard_ = icCard_;
      result.identityCard_ = identityCard_;
      result.identityCardImmediately_ = identityCardImmediately_;
      result.qrCode_ = qrCode_;
      result.personFaceAndIdCard_ = personFaceAndIdCard_;
      result.appointment_ = appointment_;
      result.identitySameCp_ = identitySameCp_;
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
      if (other instanceof com.intellif.ifai.common.PassThroughModel) {
        return mergeFrom((com.intellif.ifai.common.PassThroughModel)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.intellif.ifai.common.PassThroughModel other) {
      if (other == com.intellif.ifai.common.PassThroughModel.getDefaultInstance()) return this;
      if (other.getPersonFace() != false) {
        setPersonFace(other.getPersonFace());
      }
      if (other.getIcCard() != false) {
        setIcCard(other.getIcCard());
      }
      if (other.getIdentityCard() != false) {
        setIdentityCard(other.getIdentityCard());
      }
      if (other.getIdentityCardImmediately() != false) {
        setIdentityCardImmediately(other.getIdentityCardImmediately());
      }
      if (other.getQrCode() != false) {
        setQrCode(other.getQrCode());
      }
      if (other.getPersonFaceAndIdCard() != false) {
        setPersonFaceAndIdCard(other.getPersonFaceAndIdCard());
      }
      if (other.getAppointment() != false) {
        setAppointment(other.getAppointment());
      }
      if (other.getIdentitySameCp() != false) {
        setIdentitySameCp(other.getIdentitySameCp());
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
      com.intellif.ifai.common.PassThroughModel parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.intellif.ifai.common.PassThroughModel) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private boolean personFace_ ;
    /**
     * <pre>
     * 人脸
     * </pre>
     *
     * <code>bool person_face = 1;</code>
     */
    public boolean getPersonFace() {
      return personFace_;
    }
    /**
     * <pre>
     * 人脸
     * </pre>
     *
     * <code>bool person_face = 1;</code>
     */
    public Builder setPersonFace(boolean value) {
      
      personFace_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 人脸
     * </pre>
     *
     * <code>bool person_face = 1;</code>
     */
    public Builder clearPersonFace() {
      
      personFace_ = false;
      onChanged();
      return this;
    }

    private boolean icCard_ ;
    /**
     * <pre>
     * IC卡
     * </pre>
     *
     * <code>bool ic_card = 2;</code>
     */
    public boolean getIcCard() {
      return icCard_;
    }
    /**
     * <pre>
     * IC卡
     * </pre>
     *
     * <code>bool ic_card = 2;</code>
     */
    public Builder setIcCard(boolean value) {
      
      icCard_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * IC卡
     * </pre>
     *
     * <code>bool ic_card = 2;</code>
     */
    public Builder clearIcCard() {
      
      icCard_ = false;
      onChanged();
      return this;
    }

    private boolean identityCard_ ;
    /**
     * <pre>
     * 身份证和人脸 1:1
     * </pre>
     *
     * <code>bool identity_card = 3;</code>
     */
    public boolean getIdentityCard() {
      return identityCard_;
    }
    /**
     * <pre>
     * 身份证和人脸 1:1
     * </pre>
     *
     * <code>bool identity_card = 3;</code>
     */
    public Builder setIdentityCard(boolean value) {
      
      identityCard_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 身份证和人脸 1:1
     * </pre>
     *
     * <code>bool identity_card = 3;</code>
     */
    public Builder clearIdentityCard() {
      
      identityCard_ = false;
      onChanged();
      return this;
    }

    private boolean identityCardImmediately_ ;
    /**
     * <pre>
     * 只刷身份证
     * </pre>
     *
     * <code>bool identity_card_immediately = 4;</code>
     */
    public boolean getIdentityCardImmediately() {
      return identityCardImmediately_;
    }
    /**
     * <pre>
     * 只刷身份证
     * </pre>
     *
     * <code>bool identity_card_immediately = 4;</code>
     */
    public Builder setIdentityCardImmediately(boolean value) {
      
      identityCardImmediately_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 只刷身份证
     * </pre>
     *
     * <code>bool identity_card_immediately = 4;</code>
     */
    public Builder clearIdentityCardImmediately() {
      
      identityCardImmediately_ = false;
      onChanged();
      return this;
    }

    private boolean qrCode_ ;
    /**
     * <pre>
     * 二维码开门
     * </pre>
     *
     * <code>bool qr_code = 5;</code>
     */
    public boolean getQrCode() {
      return qrCode_;
    }
    /**
     * <pre>
     * 二维码开门
     * </pre>
     *
     * <code>bool qr_code = 5;</code>
     */
    public Builder setQrCode(boolean value) {
      
      qrCode_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 二维码开门
     * </pre>
     *
     * <code>bool qr_code = 5;</code>
     */
    public Builder clearQrCode() {
      
      qrCode_ = false;
      onChanged();
      return this;
    }

    private boolean personFaceAndIdCard_ ;
    /**
     * <pre>
     * 人脸+IC卡
     * </pre>
     *
     * <code>bool person_face_and_id_card = 6;</code>
     */
    public boolean getPersonFaceAndIdCard() {
      return personFaceAndIdCard_;
    }
    /**
     * <pre>
     * 人脸+IC卡
     * </pre>
     *
     * <code>bool person_face_and_id_card = 6;</code>
     */
    public Builder setPersonFaceAndIdCard(boolean value) {
      
      personFaceAndIdCard_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 人脸+IC卡
     * </pre>
     *
     * <code>bool person_face_and_id_card = 6;</code>
     */
    public Builder clearPersonFaceAndIdCard() {
      
      personFaceAndIdCard_ = false;
      onChanged();
      return this;
    }

    private boolean appointment_ ;
    /**
     * <pre>
     * 人证预约模式
     * </pre>
     *
     * <code>bool appointment = 7;</code>
     */
    public boolean getAppointment() {
      return appointment_;
    }
    /**
     * <pre>
     * 人证预约模式
     * </pre>
     *
     * <code>bool appointment = 7;</code>
     */
    public Builder setAppointment(boolean value) {
      
      appointment_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 人证预约模式
     * </pre>
     *
     * <code>bool appointment = 7;</code>
     */
    public Builder clearAppointment() {
      
      appointment_ = false;
      onChanged();
      return this;
    }

    private boolean identitySameCp_ ;
    /**
     * <pre>
     *身份证号码相互比对
     * </pre>
     *
     * <code>bool identity_same_cp = 8;</code>
     */
    public boolean getIdentitySameCp() {
      return identitySameCp_;
    }
    /**
     * <pre>
     *身份证号码相互比对
     * </pre>
     *
     * <code>bool identity_same_cp = 8;</code>
     */
    public Builder setIdentitySameCp(boolean value) {
      
      identitySameCp_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     *身份证号码相互比对
     * </pre>
     *
     * <code>bool identity_same_cp = 8;</code>
     */
    public Builder clearIdentitySameCp() {
      
      identitySameCp_ = false;
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


    // @@protoc_insertion_point(builder_scope:Ifaipb.PassThroughModel)
  }

  // @@protoc_insertion_point(class_scope:Ifaipb.PassThroughModel)
  private static final com.intellif.ifai.common.PassThroughModel DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.intellif.ifai.common.PassThroughModel();
  }

  public static com.intellif.ifai.common.PassThroughModel getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PassThroughModel>
      PARSER = new com.google.protobuf.AbstractParser<PassThroughModel>() {
    @java.lang.Override
    public PassThroughModel parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new PassThroughModel(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<PassThroughModel> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PassThroughModel> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.intellif.ifai.common.PassThroughModel getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

