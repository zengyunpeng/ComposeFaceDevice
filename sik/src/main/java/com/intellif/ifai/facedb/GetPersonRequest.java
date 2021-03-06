// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: IfFaceDatabase.proto

package com.intellif.ifai.facedb;

/**
 * <pre>
 *&#47;////////////////////////////////////
 * </pre>
 *
 * Protobuf type {@code Ifaipb.GetPersonRequest}
 */
public  final class GetPersonRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:Ifaipb.GetPersonRequest)
    GetPersonRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GetPersonRequest.newBuilder() to construct.
  private GetPersonRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GetPersonRequest() {
    faceIds_ = java.util.Collections.emptyList();
    personIds_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    customerIds_ = com.google.protobuf.LazyStringArrayList.EMPTY;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private GetPersonRequest(
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
            if (!((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
              faceIds_ = new java.util.ArrayList<java.lang.Integer>();
              mutable_bitField0_ |= 0x00000001;
            }
            faceIds_.add(input.readInt32());
            break;
          }
          case 10: {
            int length = input.readRawVarint32();
            int limit = input.pushLimit(length);
            if (!((mutable_bitField0_ & 0x00000001) == 0x00000001) && input.getBytesUntilLimit() > 0) {
              faceIds_ = new java.util.ArrayList<java.lang.Integer>();
              mutable_bitField0_ |= 0x00000001;
            }
            while (input.getBytesUntilLimit() > 0) {
              faceIds_.add(input.readInt32());
            }
            input.popLimit(limit);
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();
            if (!((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
              personIds_ = new com.google.protobuf.LazyStringArrayList();
              mutable_bitField0_ |= 0x00000002;
            }
            personIds_.add(s);
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();
            if (!((mutable_bitField0_ & 0x00000004) == 0x00000004)) {
              customerIds_ = new com.google.protobuf.LazyStringArrayList();
              mutable_bitField0_ |= 0x00000004;
            }
            customerIds_.add(s);
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
      if (((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
        faceIds_ = java.util.Collections.unmodifiableList(faceIds_);
      }
      if (((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
        personIds_ = personIds_.getUnmodifiableView();
      }
      if (((mutable_bitField0_ & 0x00000004) == 0x00000004)) {
        customerIds_ = customerIds_.getUnmodifiableView();
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.intellif.ifai.facedb.Ifai.internal_static_Ifaipb_GetPersonRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.intellif.ifai.facedb.Ifai.internal_static_Ifaipb_GetPersonRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.intellif.ifai.facedb.GetPersonRequest.class, com.intellif.ifai.facedb.GetPersonRequest.Builder.class);
  }

  public static final int FACE_IDS_FIELD_NUMBER = 1;
  private java.util.List<java.lang.Integer> faceIds_;
  /**
   * <pre>
   *???????????????face_id???????????????????????????????????????person_id???????????????????????????????????????customer_ids??????????????????????????????????????????
   * </pre>
   *
   * <code>repeated int32 face_ids = 1;</code>
   */
  public java.util.List<java.lang.Integer>
      getFaceIdsList() {
    return faceIds_;
  }
  /**
   * <pre>
   *???????????????face_id???????????????????????????????????????person_id???????????????????????????????????????customer_ids??????????????????????????????????????????
   * </pre>
   *
   * <code>repeated int32 face_ids = 1;</code>
   */
  public int getFaceIdsCount() {
    return faceIds_.size();
  }
  /**
   * <pre>
   *???????????????face_id???????????????????????????????????????person_id???????????????????????????????????????customer_ids??????????????????????????????????????????
   * </pre>
   *
   * <code>repeated int32 face_ids = 1;</code>
   */
  public int getFaceIds(int index) {
    return faceIds_.get(index);
  }
  private int faceIdsMemoizedSerializedSize = -1;

  public static final int PERSON_IDS_FIELD_NUMBER = 2;
  private com.google.protobuf.LazyStringList personIds_;
  /**
   * <pre>
   *??????ID?????????????????????
   * </pre>
   *
   * <code>repeated string person_ids = 2;</code>
   */
  public com.google.protobuf.ProtocolStringList
      getPersonIdsList() {
    return personIds_;
  }
  /**
   * <pre>
   *??????ID?????????????????????
   * </pre>
   *
   * <code>repeated string person_ids = 2;</code>
   */
  public int getPersonIdsCount() {
    return personIds_.size();
  }
  /**
   * <pre>
   *??????ID?????????????????????
   * </pre>
   *
   * <code>repeated string person_ids = 2;</code>
   */
  public java.lang.String getPersonIds(int index) {
    return personIds_.get(index);
  }
  /**
   * <pre>
   *??????ID?????????????????????
   * </pre>
   *
   * <code>repeated string person_ids = 2;</code>
   */
  public com.google.protobuf.ByteString
      getPersonIdsBytes(int index) {
    return personIds_.getByteString(index);
  }

  public static final int CUSTOMER_IDS_FIELD_NUMBER = 3;
  private com.google.protobuf.LazyStringList customerIds_;
  /**
   * <pre>
   *???????????????Id
   * </pre>
   *
   * <code>repeated string customer_ids = 3;</code>
   */
  public com.google.protobuf.ProtocolStringList
      getCustomerIdsList() {
    return customerIds_;
  }
  /**
   * <pre>
   *???????????????Id
   * </pre>
   *
   * <code>repeated string customer_ids = 3;</code>
   */
  public int getCustomerIdsCount() {
    return customerIds_.size();
  }
  /**
   * <pre>
   *???????????????Id
   * </pre>
   *
   * <code>repeated string customer_ids = 3;</code>
   */
  public java.lang.String getCustomerIds(int index) {
    return customerIds_.get(index);
  }
  /**
   * <pre>
   *???????????????Id
   * </pre>
   *
   * <code>repeated string customer_ids = 3;</code>
   */
  public com.google.protobuf.ByteString
      getCustomerIdsBytes(int index) {
    return customerIds_.getByteString(index);
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
    getSerializedSize();
    if (getFaceIdsList().size() > 0) {
      output.writeUInt32NoTag(10);
      output.writeUInt32NoTag(faceIdsMemoizedSerializedSize);
    }
    for (int i = 0; i < faceIds_.size(); i++) {
      output.writeInt32NoTag(faceIds_.get(i));
    }
    for (int i = 0; i < personIds_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, personIds_.getRaw(i));
    }
    for (int i = 0; i < customerIds_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, customerIds_.getRaw(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    {
      int dataSize = 0;
      for (int i = 0; i < faceIds_.size(); i++) {
        dataSize += com.google.protobuf.CodedOutputStream
          .computeInt32SizeNoTag(faceIds_.get(i));
      }
      size += dataSize;
      if (!getFaceIdsList().isEmpty()) {
        size += 1;
        size += com.google.protobuf.CodedOutputStream
            .computeInt32SizeNoTag(dataSize);
      }
      faceIdsMemoizedSerializedSize = dataSize;
    }
    {
      int dataSize = 0;
      for (int i = 0; i < personIds_.size(); i++) {
        dataSize += computeStringSizeNoTag(personIds_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getPersonIdsList().size();
    }
    {
      int dataSize = 0;
      for (int i = 0; i < customerIds_.size(); i++) {
        dataSize += computeStringSizeNoTag(customerIds_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getCustomerIdsList().size();
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
    if (!(obj instanceof com.intellif.ifai.facedb.GetPersonRequest)) {
      return super.equals(obj);
    }
    com.intellif.ifai.facedb.GetPersonRequest other = (com.intellif.ifai.facedb.GetPersonRequest) obj;

    boolean result = true;
    result = result && getFaceIdsList()
        .equals(other.getFaceIdsList());
    result = result && getPersonIdsList()
        .equals(other.getPersonIdsList());
    result = result && getCustomerIdsList()
        .equals(other.getCustomerIdsList());
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
    if (getFaceIdsCount() > 0) {
      hash = (37 * hash) + FACE_IDS_FIELD_NUMBER;
      hash = (53 * hash) + getFaceIdsList().hashCode();
    }
    if (getPersonIdsCount() > 0) {
      hash = (37 * hash) + PERSON_IDS_FIELD_NUMBER;
      hash = (53 * hash) + getPersonIdsList().hashCode();
    }
    if (getCustomerIdsCount() > 0) {
      hash = (37 * hash) + CUSTOMER_IDS_FIELD_NUMBER;
      hash = (53 * hash) + getCustomerIdsList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.intellif.ifai.facedb.GetPersonRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.intellif.ifai.facedb.GetPersonRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.intellif.ifai.facedb.GetPersonRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.intellif.ifai.facedb.GetPersonRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.intellif.ifai.facedb.GetPersonRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.intellif.ifai.facedb.GetPersonRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.intellif.ifai.facedb.GetPersonRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.intellif.ifai.facedb.GetPersonRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.intellif.ifai.facedb.GetPersonRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.intellif.ifai.facedb.GetPersonRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.intellif.ifai.facedb.GetPersonRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.intellif.ifai.facedb.GetPersonRequest parseFrom(
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
  public static Builder newBuilder(com.intellif.ifai.facedb.GetPersonRequest prototype) {
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
   *&#47;////////////////////////////////////
   * </pre>
   *
   * Protobuf type {@code Ifaipb.GetPersonRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:Ifaipb.GetPersonRequest)
      com.intellif.ifai.facedb.GetPersonRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.intellif.ifai.facedb.Ifai.internal_static_Ifaipb_GetPersonRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.intellif.ifai.facedb.Ifai.internal_static_Ifaipb_GetPersonRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.intellif.ifai.facedb.GetPersonRequest.class, com.intellif.ifai.facedb.GetPersonRequest.Builder.class);
    }

    // Construct using com.intellif.ifai.facedb.GetPersonRequest.newBuilder()
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
      faceIds_ = java.util.Collections.emptyList();
      bitField0_ = (bitField0_ & ~0x00000001);
      personIds_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000002);
      customerIds_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000004);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.intellif.ifai.facedb.Ifai.internal_static_Ifaipb_GetPersonRequest_descriptor;
    }

    @java.lang.Override
    public com.intellif.ifai.facedb.GetPersonRequest getDefaultInstanceForType() {
      return com.intellif.ifai.facedb.GetPersonRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.intellif.ifai.facedb.GetPersonRequest build() {
      com.intellif.ifai.facedb.GetPersonRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.intellif.ifai.facedb.GetPersonRequest buildPartial() {
      com.intellif.ifai.facedb.GetPersonRequest result = new com.intellif.ifai.facedb.GetPersonRequest(this);
      int from_bitField0_ = bitField0_;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        faceIds_ = java.util.Collections.unmodifiableList(faceIds_);
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.faceIds_ = faceIds_;
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        personIds_ = personIds_.getUnmodifiableView();
        bitField0_ = (bitField0_ & ~0x00000002);
      }
      result.personIds_ = personIds_;
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        customerIds_ = customerIds_.getUnmodifiableView();
        bitField0_ = (bitField0_ & ~0x00000004);
      }
      result.customerIds_ = customerIds_;
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
      if (other instanceof com.intellif.ifai.facedb.GetPersonRequest) {
        return mergeFrom((com.intellif.ifai.facedb.GetPersonRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.intellif.ifai.facedb.GetPersonRequest other) {
      if (other == com.intellif.ifai.facedb.GetPersonRequest.getDefaultInstance()) return this;
      if (!other.faceIds_.isEmpty()) {
        if (faceIds_.isEmpty()) {
          faceIds_ = other.faceIds_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureFaceIdsIsMutable();
          faceIds_.addAll(other.faceIds_);
        }
        onChanged();
      }
      if (!other.personIds_.isEmpty()) {
        if (personIds_.isEmpty()) {
          personIds_ = other.personIds_;
          bitField0_ = (bitField0_ & ~0x00000002);
        } else {
          ensurePersonIdsIsMutable();
          personIds_.addAll(other.personIds_);
        }
        onChanged();
      }
      if (!other.customerIds_.isEmpty()) {
        if (customerIds_.isEmpty()) {
          customerIds_ = other.customerIds_;
          bitField0_ = (bitField0_ & ~0x00000004);
        } else {
          ensureCustomerIdsIsMutable();
          customerIds_.addAll(other.customerIds_);
        }
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
      com.intellif.ifai.facedb.GetPersonRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.intellif.ifai.facedb.GetPersonRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<java.lang.Integer> faceIds_ = java.util.Collections.emptyList();
    private void ensureFaceIdsIsMutable() {
      if (!((bitField0_ & 0x00000001) == 0x00000001)) {
        faceIds_ = new java.util.ArrayList<java.lang.Integer>(faceIds_);
        bitField0_ |= 0x00000001;
       }
    }
    /**
     * <pre>
     *???????????????face_id???????????????????????????????????????person_id???????????????????????????????????????customer_ids??????????????????????????????????????????
     * </pre>
     *
     * <code>repeated int32 face_ids = 1;</code>
     */
    public java.util.List<java.lang.Integer>
        getFaceIdsList() {
      return java.util.Collections.unmodifiableList(faceIds_);
    }
    /**
     * <pre>
     *???????????????face_id???????????????????????????????????????person_id???????????????????????????????????????customer_ids??????????????????????????????????????????
     * </pre>
     *
     * <code>repeated int32 face_ids = 1;</code>
     */
    public int getFaceIdsCount() {
      return faceIds_.size();
    }
    /**
     * <pre>
     *???????????????face_id???????????????????????????????????????person_id???????????????????????????????????????customer_ids??????????????????????????????????????????
     * </pre>
     *
     * <code>repeated int32 face_ids = 1;</code>
     */
    public int getFaceIds(int index) {
      return faceIds_.get(index);
    }
    /**
     * <pre>
     *???????????????face_id???????????????????????????????????????person_id???????????????????????????????????????customer_ids??????????????????????????????????????????
     * </pre>
     *
     * <code>repeated int32 face_ids = 1;</code>
     */
    public Builder setFaceIds(
        int index, int value) {
      ensureFaceIdsIsMutable();
      faceIds_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     *???????????????face_id???????????????????????????????????????person_id???????????????????????????????????????customer_ids??????????????????????????????????????????
     * </pre>
     *
     * <code>repeated int32 face_ids = 1;</code>
     */
    public Builder addFaceIds(int value) {
      ensureFaceIdsIsMutable();
      faceIds_.add(value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     *???????????????face_id???????????????????????????????????????person_id???????????????????????????????????????customer_ids??????????????????????????????????????????
     * </pre>
     *
     * <code>repeated int32 face_ids = 1;</code>
     */
    public Builder addAllFaceIds(
        java.lang.Iterable<? extends java.lang.Integer> values) {
      ensureFaceIdsIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, faceIds_);
      onChanged();
      return this;
    }
    /**
     * <pre>
     *???????????????face_id???????????????????????????????????????person_id???????????????????????????????????????customer_ids??????????????????????????????????????????
     * </pre>
     *
     * <code>repeated int32 face_ids = 1;</code>
     */
    public Builder clearFaceIds() {
      faceIds_ = java.util.Collections.emptyList();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }

    private com.google.protobuf.LazyStringList personIds_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    private void ensurePersonIdsIsMutable() {
      if (!((bitField0_ & 0x00000002) == 0x00000002)) {
        personIds_ = new com.google.protobuf.LazyStringArrayList(personIds_);
        bitField0_ |= 0x00000002;
       }
    }
    /**
     * <pre>
     *??????ID?????????????????????
     * </pre>
     *
     * <code>repeated string person_ids = 2;</code>
     */
    public com.google.protobuf.ProtocolStringList
        getPersonIdsList() {
      return personIds_.getUnmodifiableView();
    }
    /**
     * <pre>
     *??????ID?????????????????????
     * </pre>
     *
     * <code>repeated string person_ids = 2;</code>
     */
    public int getPersonIdsCount() {
      return personIds_.size();
    }
    /**
     * <pre>
     *??????ID?????????????????????
     * </pre>
     *
     * <code>repeated string person_ids = 2;</code>
     */
    public java.lang.String getPersonIds(int index) {
      return personIds_.get(index);
    }
    /**
     * <pre>
     *??????ID?????????????????????
     * </pre>
     *
     * <code>repeated string person_ids = 2;</code>
     */
    public com.google.protobuf.ByteString
        getPersonIdsBytes(int index) {
      return personIds_.getByteString(index);
    }
    /**
     * <pre>
     *??????ID?????????????????????
     * </pre>
     *
     * <code>repeated string person_ids = 2;</code>
     */
    public Builder setPersonIds(
        int index, java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensurePersonIdsIsMutable();
      personIds_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     *??????ID?????????????????????
     * </pre>
     *
     * <code>repeated string person_ids = 2;</code>
     */
    public Builder addPersonIds(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensurePersonIdsIsMutable();
      personIds_.add(value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     *??????ID?????????????????????
     * </pre>
     *
     * <code>repeated string person_ids = 2;</code>
     */
    public Builder addAllPersonIds(
        java.lang.Iterable<java.lang.String> values) {
      ensurePersonIdsIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, personIds_);
      onChanged();
      return this;
    }
    /**
     * <pre>
     *??????ID?????????????????????
     * </pre>
     *
     * <code>repeated string person_ids = 2;</code>
     */
    public Builder clearPersonIds() {
      personIds_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <pre>
     *??????ID?????????????????????
     * </pre>
     *
     * <code>repeated string person_ids = 2;</code>
     */
    public Builder addPersonIdsBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      ensurePersonIdsIsMutable();
      personIds_.add(value);
      onChanged();
      return this;
    }

    private com.google.protobuf.LazyStringList customerIds_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    private void ensureCustomerIdsIsMutable() {
      if (!((bitField0_ & 0x00000004) == 0x00000004)) {
        customerIds_ = new com.google.protobuf.LazyStringArrayList(customerIds_);
        bitField0_ |= 0x00000004;
       }
    }
    /**
     * <pre>
     *???????????????Id
     * </pre>
     *
     * <code>repeated string customer_ids = 3;</code>
     */
    public com.google.protobuf.ProtocolStringList
        getCustomerIdsList() {
      return customerIds_.getUnmodifiableView();
    }
    /**
     * <pre>
     *???????????????Id
     * </pre>
     *
     * <code>repeated string customer_ids = 3;</code>
     */
    public int getCustomerIdsCount() {
      return customerIds_.size();
    }
    /**
     * <pre>
     *???????????????Id
     * </pre>
     *
     * <code>repeated string customer_ids = 3;</code>
     */
    public java.lang.String getCustomerIds(int index) {
      return customerIds_.get(index);
    }
    /**
     * <pre>
     *???????????????Id
     * </pre>
     *
     * <code>repeated string customer_ids = 3;</code>
     */
    public com.google.protobuf.ByteString
        getCustomerIdsBytes(int index) {
      return customerIds_.getByteString(index);
    }
    /**
     * <pre>
     *???????????????Id
     * </pre>
     *
     * <code>repeated string customer_ids = 3;</code>
     */
    public Builder setCustomerIds(
        int index, java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureCustomerIdsIsMutable();
      customerIds_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     *???????????????Id
     * </pre>
     *
     * <code>repeated string customer_ids = 3;</code>
     */
    public Builder addCustomerIds(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureCustomerIdsIsMutable();
      customerIds_.add(value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     *???????????????Id
     * </pre>
     *
     * <code>repeated string customer_ids = 3;</code>
     */
    public Builder addAllCustomerIds(
        java.lang.Iterable<java.lang.String> values) {
      ensureCustomerIdsIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, customerIds_);
      onChanged();
      return this;
    }
    /**
     * <pre>
     *???????????????Id
     * </pre>
     *
     * <code>repeated string customer_ids = 3;</code>
     */
    public Builder clearCustomerIds() {
      customerIds_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     * <pre>
     *???????????????Id
     * </pre>
     *
     * <code>repeated string customer_ids = 3;</code>
     */
    public Builder addCustomerIdsBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      ensureCustomerIdsIsMutable();
      customerIds_.add(value);
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


    // @@protoc_insertion_point(builder_scope:Ifaipb.GetPersonRequest)
  }

  // @@protoc_insertion_point(class_scope:Ifaipb.GetPersonRequest)
  private static final com.intellif.ifai.facedb.GetPersonRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.intellif.ifai.facedb.GetPersonRequest();
  }

  public static com.intellif.ifai.facedb.GetPersonRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetPersonRequest>
      PARSER = new com.google.protobuf.AbstractParser<GetPersonRequest>() {
    @java.lang.Override
    public GetPersonRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new GetPersonRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<GetPersonRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetPersonRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.intellif.ifai.facedb.GetPersonRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

