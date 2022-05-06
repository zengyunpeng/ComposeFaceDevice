// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: IfAnalytics.proto

package com.intellif.ifai.face;

/**
 * Protobuf type {@code Ifaipb.ModifyEntryAreaRuleRequest}
 */
public  final class ModifyEntryAreaRuleRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:Ifaipb.ModifyEntryAreaRuleRequest)
    ModifyEntryAreaRuleRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ModifyEntryAreaRuleRequest.newBuilder() to construct.
  private ModifyEntryAreaRuleRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ModifyEntryAreaRuleRequest() {
    ruleId_ = 0;
    widthA_ = 0;
    widthB_ = 0;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ModifyEntryAreaRuleRequest(
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

            ruleId_ = input.readInt32();
            break;
          }
          case 16: {

            widthA_ = input.readInt32();
            break;
          }
          case 24: {

            widthB_ = input.readInt32();
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
    return com.intellif.ifai.face.Ifai.internal_static_Ifaipb_ModifyEntryAreaRuleRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.intellif.ifai.face.Ifai.internal_static_Ifaipb_ModifyEntryAreaRuleRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.intellif.ifai.face.ModifyEntryAreaRuleRequest.class, com.intellif.ifai.face.ModifyEntryAreaRuleRequest.Builder.class);
  }

  public static final int RULE_ID_FIELD_NUMBER = 1;
  private int ruleId_;
  /**
   * <pre>
   *id
   * </pre>
   *
   * <code>int32 rule_id = 1;</code>
   */
  public int getRuleId() {
    return ruleId_;
  }

  public static final int WIDTH_A_FIELD_NUMBER = 2;
  private int widthA_;
  /**
   * <pre>
   *a宽度
   * </pre>
   *
   * <code>int32 width_a = 2;</code>
   */
  public int getWidthA() {
    return widthA_;
  }

  public static final int WIDTH_B_FIELD_NUMBER = 3;
  private int widthB_;
  /**
   * <pre>
   *b宽度
   * </pre>
   *
   * <code>int32 width_b = 3;</code>
   */
  public int getWidthB() {
    return widthB_;
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
    if (ruleId_ != 0) {
      output.writeInt32(1, ruleId_);
    }
    if (widthA_ != 0) {
      output.writeInt32(2, widthA_);
    }
    if (widthB_ != 0) {
      output.writeInt32(3, widthB_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (ruleId_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, ruleId_);
    }
    if (widthA_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, widthA_);
    }
    if (widthB_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(3, widthB_);
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
    if (!(obj instanceof com.intellif.ifai.face.ModifyEntryAreaRuleRequest)) {
      return super.equals(obj);
    }
    com.intellif.ifai.face.ModifyEntryAreaRuleRequest other = (com.intellif.ifai.face.ModifyEntryAreaRuleRequest) obj;

    boolean result = true;
    result = result && (getRuleId()
        == other.getRuleId());
    result = result && (getWidthA()
        == other.getWidthA());
    result = result && (getWidthB()
        == other.getWidthB());
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
    hash = (37 * hash) + RULE_ID_FIELD_NUMBER;
    hash = (53 * hash) + getRuleId();
    hash = (37 * hash) + WIDTH_A_FIELD_NUMBER;
    hash = (53 * hash) + getWidthA();
    hash = (37 * hash) + WIDTH_B_FIELD_NUMBER;
    hash = (53 * hash) + getWidthB();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.intellif.ifai.face.ModifyEntryAreaRuleRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.intellif.ifai.face.ModifyEntryAreaRuleRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.intellif.ifai.face.ModifyEntryAreaRuleRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.intellif.ifai.face.ModifyEntryAreaRuleRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.intellif.ifai.face.ModifyEntryAreaRuleRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.intellif.ifai.face.ModifyEntryAreaRuleRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.intellif.ifai.face.ModifyEntryAreaRuleRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.intellif.ifai.face.ModifyEntryAreaRuleRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.intellif.ifai.face.ModifyEntryAreaRuleRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.intellif.ifai.face.ModifyEntryAreaRuleRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.intellif.ifai.face.ModifyEntryAreaRuleRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.intellif.ifai.face.ModifyEntryAreaRuleRequest parseFrom(
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
  public static Builder newBuilder(com.intellif.ifai.face.ModifyEntryAreaRuleRequest prototype) {
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
   * Protobuf type {@code Ifaipb.ModifyEntryAreaRuleRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:Ifaipb.ModifyEntryAreaRuleRequest)
      com.intellif.ifai.face.ModifyEntryAreaRuleRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.intellif.ifai.face.Ifai.internal_static_Ifaipb_ModifyEntryAreaRuleRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.intellif.ifai.face.Ifai.internal_static_Ifaipb_ModifyEntryAreaRuleRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.intellif.ifai.face.ModifyEntryAreaRuleRequest.class, com.intellif.ifai.face.ModifyEntryAreaRuleRequest.Builder.class);
    }

    // Construct using com.intellif.ifai.face.ModifyEntryAreaRuleRequest.newBuilder()
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
      ruleId_ = 0;

      widthA_ = 0;

      widthB_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.intellif.ifai.face.Ifai.internal_static_Ifaipb_ModifyEntryAreaRuleRequest_descriptor;
    }

    @java.lang.Override
    public com.intellif.ifai.face.ModifyEntryAreaRuleRequest getDefaultInstanceForType() {
      return com.intellif.ifai.face.ModifyEntryAreaRuleRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.intellif.ifai.face.ModifyEntryAreaRuleRequest build() {
      com.intellif.ifai.face.ModifyEntryAreaRuleRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.intellif.ifai.face.ModifyEntryAreaRuleRequest buildPartial() {
      com.intellif.ifai.face.ModifyEntryAreaRuleRequest result = new com.intellif.ifai.face.ModifyEntryAreaRuleRequest(this);
      result.ruleId_ = ruleId_;
      result.widthA_ = widthA_;
      result.widthB_ = widthB_;
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
      if (other instanceof com.intellif.ifai.face.ModifyEntryAreaRuleRequest) {
        return mergeFrom((com.intellif.ifai.face.ModifyEntryAreaRuleRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.intellif.ifai.face.ModifyEntryAreaRuleRequest other) {
      if (other == com.intellif.ifai.face.ModifyEntryAreaRuleRequest.getDefaultInstance()) return this;
      if (other.getRuleId() != 0) {
        setRuleId(other.getRuleId());
      }
      if (other.getWidthA() != 0) {
        setWidthA(other.getWidthA());
      }
      if (other.getWidthB() != 0) {
        setWidthB(other.getWidthB());
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
      com.intellif.ifai.face.ModifyEntryAreaRuleRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.intellif.ifai.face.ModifyEntryAreaRuleRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int ruleId_ ;
    /**
     * <pre>
     *id
     * </pre>
     *
     * <code>int32 rule_id = 1;</code>
     */
    public int getRuleId() {
      return ruleId_;
    }
    /**
     * <pre>
     *id
     * </pre>
     *
     * <code>int32 rule_id = 1;</code>
     */
    public Builder setRuleId(int value) {
      
      ruleId_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     *id
     * </pre>
     *
     * <code>int32 rule_id = 1;</code>
     */
    public Builder clearRuleId() {
      
      ruleId_ = 0;
      onChanged();
      return this;
    }

    private int widthA_ ;
    /**
     * <pre>
     *a宽度
     * </pre>
     *
     * <code>int32 width_a = 2;</code>
     */
    public int getWidthA() {
      return widthA_;
    }
    /**
     * <pre>
     *a宽度
     * </pre>
     *
     * <code>int32 width_a = 2;</code>
     */
    public Builder setWidthA(int value) {
      
      widthA_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     *a宽度
     * </pre>
     *
     * <code>int32 width_a = 2;</code>
     */
    public Builder clearWidthA() {
      
      widthA_ = 0;
      onChanged();
      return this;
    }

    private int widthB_ ;
    /**
     * <pre>
     *b宽度
     * </pre>
     *
     * <code>int32 width_b = 3;</code>
     */
    public int getWidthB() {
      return widthB_;
    }
    /**
     * <pre>
     *b宽度
     * </pre>
     *
     * <code>int32 width_b = 3;</code>
     */
    public Builder setWidthB(int value) {
      
      widthB_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     *b宽度
     * </pre>
     *
     * <code>int32 width_b = 3;</code>
     */
    public Builder clearWidthB() {
      
      widthB_ = 0;
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


    // @@protoc_insertion_point(builder_scope:Ifaipb.ModifyEntryAreaRuleRequest)
  }

  // @@protoc_insertion_point(class_scope:Ifaipb.ModifyEntryAreaRuleRequest)
  private static final com.intellif.ifai.face.ModifyEntryAreaRuleRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.intellif.ifai.face.ModifyEntryAreaRuleRequest();
  }

  public static com.intellif.ifai.face.ModifyEntryAreaRuleRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ModifyEntryAreaRuleRequest>
      PARSER = new com.google.protobuf.AbstractParser<ModifyEntryAreaRuleRequest>() {
    @java.lang.Override
    public ModifyEntryAreaRuleRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ModifyEntryAreaRuleRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ModifyEntryAreaRuleRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ModifyEntryAreaRuleRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.intellif.ifai.face.ModifyEntryAreaRuleRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
