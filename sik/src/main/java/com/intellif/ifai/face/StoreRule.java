// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: IfAnalytics.proto

package com.intellif.ifai.face;

/**
 * Protobuf type {@code Ifaipb.StoreRule}
 */
public  final class StoreRule extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:Ifaipb.StoreRule)
    StoreRuleOrBuilder {
private static final long serialVersionUID = 0L;
  // Use StoreRule.newBuilder() to construct.
  private StoreRule(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private StoreRule() {
    storeId_ = 0;
    storeColor_ = "";
    rules_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private StoreRule(
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

            storeId_ = input.readInt32();
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            storeColor_ = s;
            break;
          }
          case 26: {
            com.intellif.ifai.common.CommonString.Builder subBuilder = null;
            if (storeName_ != null) {
              subBuilder = storeName_.toBuilder();
            }
            storeName_ = input.readMessage(com.intellif.ifai.common.CommonString.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(storeName_);
              storeName_ = subBuilder.buildPartial();
            }

            break;
          }
          case 34: {
            if (!((mutable_bitField0_ & 0x00000008) == 0x00000008)) {
              rules_ = new java.util.ArrayList<com.intellif.ifai.face.SmartAreaRule>();
              mutable_bitField0_ |= 0x00000008;
            }
            rules_.add(
                input.readMessage(com.intellif.ifai.face.SmartAreaRule.parser(), extensionRegistry));
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
      if (((mutable_bitField0_ & 0x00000008) == 0x00000008)) {
        rules_ = java.util.Collections.unmodifiableList(rules_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.intellif.ifai.face.Ifai.internal_static_Ifaipb_StoreRule_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.intellif.ifai.face.Ifai.internal_static_Ifaipb_StoreRule_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.intellif.ifai.face.StoreRule.class, com.intellif.ifai.face.StoreRule.Builder.class);
  }

  private int bitField0_;
  public static final int STORE_ID_FIELD_NUMBER = 1;
  private int storeId_;
  /**
   * <code>int32 store_id = 1;</code>
   */
  public int getStoreId() {
    return storeId_;
  }

  public static final int STORE_COLOR_FIELD_NUMBER = 2;
  private volatile java.lang.Object storeColor_;
  /**
   * <code>string store_color = 2;</code>
   */
  public java.lang.String getStoreColor() {
    java.lang.Object ref = storeColor_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      storeColor_ = s;
      return s;
    }
  }
  /**
   * <code>string store_color = 2;</code>
   */
  public com.google.protobuf.ByteString
      getStoreColorBytes() {
    java.lang.Object ref = storeColor_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      storeColor_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int STORE_NAME_FIELD_NUMBER = 3;
  private com.intellif.ifai.common.CommonString storeName_;
  /**
   * <pre>
   *门店名称
   * </pre>
   *
   * <code>.Ifaipb.CommonString store_name = 3;</code>
   */
  public boolean hasStoreName() {
    return storeName_ != null;
  }
  /**
   * <pre>
   *门店名称
   * </pre>
   *
   * <code>.Ifaipb.CommonString store_name = 3;</code>
   */
  public com.intellif.ifai.common.CommonString getStoreName() {
    return storeName_ == null ? com.intellif.ifai.common.CommonString.getDefaultInstance() : storeName_;
  }
  /**
   * <pre>
   *门店名称
   * </pre>
   *
   * <code>.Ifaipb.CommonString store_name = 3;</code>
   */
  public com.intellif.ifai.common.CommonStringOrBuilder getStoreNameOrBuilder() {
    return getStoreName();
  }

  public static final int RULES_FIELD_NUMBER = 4;
  private java.util.List<com.intellif.ifai.face.SmartAreaRule> rules_;
  /**
   * <pre>
   *规则
   * </pre>
   *
   * <code>repeated .Ifaipb.SmartAreaRule rules = 4;</code>
   */
  public java.util.List<com.intellif.ifai.face.SmartAreaRule> getRulesList() {
    return rules_;
  }
  /**
   * <pre>
   *规则
   * </pre>
   *
   * <code>repeated .Ifaipb.SmartAreaRule rules = 4;</code>
   */
  public java.util.List<? extends com.intellif.ifai.face.SmartAreaRuleOrBuilder> 
      getRulesOrBuilderList() {
    return rules_;
  }
  /**
   * <pre>
   *规则
   * </pre>
   *
   * <code>repeated .Ifaipb.SmartAreaRule rules = 4;</code>
   */
  public int getRulesCount() {
    return rules_.size();
  }
  /**
   * <pre>
   *规则
   * </pre>
   *
   * <code>repeated .Ifaipb.SmartAreaRule rules = 4;</code>
   */
  public com.intellif.ifai.face.SmartAreaRule getRules(int index) {
    return rules_.get(index);
  }
  /**
   * <pre>
   *规则
   * </pre>
   *
   * <code>repeated .Ifaipb.SmartAreaRule rules = 4;</code>
   */
  public com.intellif.ifai.face.SmartAreaRuleOrBuilder getRulesOrBuilder(
      int index) {
    return rules_.get(index);
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
    if (storeId_ != 0) {
      output.writeInt32(1, storeId_);
    }
    if (!getStoreColorBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, storeColor_);
    }
    if (storeName_ != null) {
      output.writeMessage(3, getStoreName());
    }
    for (int i = 0; i < rules_.size(); i++) {
      output.writeMessage(4, rules_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (storeId_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, storeId_);
    }
    if (!getStoreColorBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, storeColor_);
    }
    if (storeName_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getStoreName());
    }
    for (int i = 0; i < rules_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(4, rules_.get(i));
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
    if (!(obj instanceof com.intellif.ifai.face.StoreRule)) {
      return super.equals(obj);
    }
    com.intellif.ifai.face.StoreRule other = (com.intellif.ifai.face.StoreRule) obj;

    boolean result = true;
    result = result && (getStoreId()
        == other.getStoreId());
    result = result && getStoreColor()
        .equals(other.getStoreColor());
    result = result && (hasStoreName() == other.hasStoreName());
    if (hasStoreName()) {
      result = result && getStoreName()
          .equals(other.getStoreName());
    }
    result = result && getRulesList()
        .equals(other.getRulesList());
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
    hash = (37 * hash) + STORE_ID_FIELD_NUMBER;
    hash = (53 * hash) + getStoreId();
    hash = (37 * hash) + STORE_COLOR_FIELD_NUMBER;
    hash = (53 * hash) + getStoreColor().hashCode();
    if (hasStoreName()) {
      hash = (37 * hash) + STORE_NAME_FIELD_NUMBER;
      hash = (53 * hash) + getStoreName().hashCode();
    }
    if (getRulesCount() > 0) {
      hash = (37 * hash) + RULES_FIELD_NUMBER;
      hash = (53 * hash) + getRulesList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.intellif.ifai.face.StoreRule parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.intellif.ifai.face.StoreRule parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.intellif.ifai.face.StoreRule parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.intellif.ifai.face.StoreRule parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.intellif.ifai.face.StoreRule parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.intellif.ifai.face.StoreRule parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.intellif.ifai.face.StoreRule parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.intellif.ifai.face.StoreRule parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.intellif.ifai.face.StoreRule parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.intellif.ifai.face.StoreRule parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.intellif.ifai.face.StoreRule parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.intellif.ifai.face.StoreRule parseFrom(
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
  public static Builder newBuilder(com.intellif.ifai.face.StoreRule prototype) {
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
   * Protobuf type {@code Ifaipb.StoreRule}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:Ifaipb.StoreRule)
      com.intellif.ifai.face.StoreRuleOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.intellif.ifai.face.Ifai.internal_static_Ifaipb_StoreRule_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.intellif.ifai.face.Ifai.internal_static_Ifaipb_StoreRule_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.intellif.ifai.face.StoreRule.class, com.intellif.ifai.face.StoreRule.Builder.class);
    }

    // Construct using com.intellif.ifai.face.StoreRule.newBuilder()
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
        getRulesFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      storeId_ = 0;

      storeColor_ = "";

      if (storeNameBuilder_ == null) {
        storeName_ = null;
      } else {
        storeName_ = null;
        storeNameBuilder_ = null;
      }
      if (rulesBuilder_ == null) {
        rules_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000008);
      } else {
        rulesBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.intellif.ifai.face.Ifai.internal_static_Ifaipb_StoreRule_descriptor;
    }

    @java.lang.Override
    public com.intellif.ifai.face.StoreRule getDefaultInstanceForType() {
      return com.intellif.ifai.face.StoreRule.getDefaultInstance();
    }

    @java.lang.Override
    public com.intellif.ifai.face.StoreRule build() {
      com.intellif.ifai.face.StoreRule result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.intellif.ifai.face.StoreRule buildPartial() {
      com.intellif.ifai.face.StoreRule result = new com.intellif.ifai.face.StoreRule(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      result.storeId_ = storeId_;
      result.storeColor_ = storeColor_;
      if (storeNameBuilder_ == null) {
        result.storeName_ = storeName_;
      } else {
        result.storeName_ = storeNameBuilder_.build();
      }
      if (rulesBuilder_ == null) {
        if (((bitField0_ & 0x00000008) == 0x00000008)) {
          rules_ = java.util.Collections.unmodifiableList(rules_);
          bitField0_ = (bitField0_ & ~0x00000008);
        }
        result.rules_ = rules_;
      } else {
        result.rules_ = rulesBuilder_.build();
      }
      result.bitField0_ = to_bitField0_;
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
      if (other instanceof com.intellif.ifai.face.StoreRule) {
        return mergeFrom((com.intellif.ifai.face.StoreRule)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.intellif.ifai.face.StoreRule other) {
      if (other == com.intellif.ifai.face.StoreRule.getDefaultInstance()) return this;
      if (other.getStoreId() != 0) {
        setStoreId(other.getStoreId());
      }
      if (!other.getStoreColor().isEmpty()) {
        storeColor_ = other.storeColor_;
        onChanged();
      }
      if (other.hasStoreName()) {
        mergeStoreName(other.getStoreName());
      }
      if (rulesBuilder_ == null) {
        if (!other.rules_.isEmpty()) {
          if (rules_.isEmpty()) {
            rules_ = other.rules_;
            bitField0_ = (bitField0_ & ~0x00000008);
          } else {
            ensureRulesIsMutable();
            rules_.addAll(other.rules_);
          }
          onChanged();
        }
      } else {
        if (!other.rules_.isEmpty()) {
          if (rulesBuilder_.isEmpty()) {
            rulesBuilder_.dispose();
            rulesBuilder_ = null;
            rules_ = other.rules_;
            bitField0_ = (bitField0_ & ~0x00000008);
            rulesBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getRulesFieldBuilder() : null;
          } else {
            rulesBuilder_.addAllMessages(other.rules_);
          }
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
      com.intellif.ifai.face.StoreRule parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.intellif.ifai.face.StoreRule) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private int storeId_ ;
    /**
     * <code>int32 store_id = 1;</code>
     */
    public int getStoreId() {
      return storeId_;
    }
    /**
     * <code>int32 store_id = 1;</code>
     */
    public Builder setStoreId(int value) {
      
      storeId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 store_id = 1;</code>
     */
    public Builder clearStoreId() {
      
      storeId_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object storeColor_ = "";
    /**
     * <code>string store_color = 2;</code>
     */
    public java.lang.String getStoreColor() {
      java.lang.Object ref = storeColor_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        storeColor_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string store_color = 2;</code>
     */
    public com.google.protobuf.ByteString
        getStoreColorBytes() {
      java.lang.Object ref = storeColor_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        storeColor_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string store_color = 2;</code>
     */
    public Builder setStoreColor(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      storeColor_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string store_color = 2;</code>
     */
    public Builder clearStoreColor() {
      
      storeColor_ = getDefaultInstance().getStoreColor();
      onChanged();
      return this;
    }
    /**
     * <code>string store_color = 2;</code>
     */
    public Builder setStoreColorBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      storeColor_ = value;
      onChanged();
      return this;
    }

    private com.intellif.ifai.common.CommonString storeName_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.intellif.ifai.common.CommonString, com.intellif.ifai.common.CommonString.Builder, com.intellif.ifai.common.CommonStringOrBuilder> storeNameBuilder_;
    /**
     * <pre>
     *门店名称
     * </pre>
     *
     * <code>.Ifaipb.CommonString store_name = 3;</code>
     */
    public boolean hasStoreName() {
      return storeNameBuilder_ != null || storeName_ != null;
    }
    /**
     * <pre>
     *门店名称
     * </pre>
     *
     * <code>.Ifaipb.CommonString store_name = 3;</code>
     */
    public com.intellif.ifai.common.CommonString getStoreName() {
      if (storeNameBuilder_ == null) {
        return storeName_ == null ? com.intellif.ifai.common.CommonString.getDefaultInstance() : storeName_;
      } else {
        return storeNameBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     *门店名称
     * </pre>
     *
     * <code>.Ifaipb.CommonString store_name = 3;</code>
     */
    public Builder setStoreName(com.intellif.ifai.common.CommonString value) {
      if (storeNameBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        storeName_ = value;
        onChanged();
      } else {
        storeNameBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     *门店名称
     * </pre>
     *
     * <code>.Ifaipb.CommonString store_name = 3;</code>
     */
    public Builder setStoreName(
        com.intellif.ifai.common.CommonString.Builder builderForValue) {
      if (storeNameBuilder_ == null) {
        storeName_ = builderForValue.build();
        onChanged();
      } else {
        storeNameBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     *门店名称
     * </pre>
     *
     * <code>.Ifaipb.CommonString store_name = 3;</code>
     */
    public Builder mergeStoreName(com.intellif.ifai.common.CommonString value) {
      if (storeNameBuilder_ == null) {
        if (storeName_ != null) {
          storeName_ =
            com.intellif.ifai.common.CommonString.newBuilder(storeName_).mergeFrom(value).buildPartial();
        } else {
          storeName_ = value;
        }
        onChanged();
      } else {
        storeNameBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     *门店名称
     * </pre>
     *
     * <code>.Ifaipb.CommonString store_name = 3;</code>
     */
    public Builder clearStoreName() {
      if (storeNameBuilder_ == null) {
        storeName_ = null;
        onChanged();
      } else {
        storeName_ = null;
        storeNameBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     *门店名称
     * </pre>
     *
     * <code>.Ifaipb.CommonString store_name = 3;</code>
     */
    public com.intellif.ifai.common.CommonString.Builder getStoreNameBuilder() {
      
      onChanged();
      return getStoreNameFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     *门店名称
     * </pre>
     *
     * <code>.Ifaipb.CommonString store_name = 3;</code>
     */
    public com.intellif.ifai.common.CommonStringOrBuilder getStoreNameOrBuilder() {
      if (storeNameBuilder_ != null) {
        return storeNameBuilder_.getMessageOrBuilder();
      } else {
        return storeName_ == null ?
            com.intellif.ifai.common.CommonString.getDefaultInstance() : storeName_;
      }
    }
    /**
     * <pre>
     *门店名称
     * </pre>
     *
     * <code>.Ifaipb.CommonString store_name = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.intellif.ifai.common.CommonString, com.intellif.ifai.common.CommonString.Builder, com.intellif.ifai.common.CommonStringOrBuilder> 
        getStoreNameFieldBuilder() {
      if (storeNameBuilder_ == null) {
        storeNameBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.intellif.ifai.common.CommonString, com.intellif.ifai.common.CommonString.Builder, com.intellif.ifai.common.CommonStringOrBuilder>(
                getStoreName(),
                getParentForChildren(),
                isClean());
        storeName_ = null;
      }
      return storeNameBuilder_;
    }

    private java.util.List<com.intellif.ifai.face.SmartAreaRule> rules_ =
      java.util.Collections.emptyList();
    private void ensureRulesIsMutable() {
      if (!((bitField0_ & 0x00000008) == 0x00000008)) {
        rules_ = new java.util.ArrayList<com.intellif.ifai.face.SmartAreaRule>(rules_);
        bitField0_ |= 0x00000008;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.intellif.ifai.face.SmartAreaRule, com.intellif.ifai.face.SmartAreaRule.Builder, com.intellif.ifai.face.SmartAreaRuleOrBuilder> rulesBuilder_;

    /**
     * <pre>
     *规则
     * </pre>
     *
     * <code>repeated .Ifaipb.SmartAreaRule rules = 4;</code>
     */
    public java.util.List<com.intellif.ifai.face.SmartAreaRule> getRulesList() {
      if (rulesBuilder_ == null) {
        return java.util.Collections.unmodifiableList(rules_);
      } else {
        return rulesBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     *规则
     * </pre>
     *
     * <code>repeated .Ifaipb.SmartAreaRule rules = 4;</code>
     */
    public int getRulesCount() {
      if (rulesBuilder_ == null) {
        return rules_.size();
      } else {
        return rulesBuilder_.getCount();
      }
    }
    /**
     * <pre>
     *规则
     * </pre>
     *
     * <code>repeated .Ifaipb.SmartAreaRule rules = 4;</code>
     */
    public com.intellif.ifai.face.SmartAreaRule getRules(int index) {
      if (rulesBuilder_ == null) {
        return rules_.get(index);
      } else {
        return rulesBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     *规则
     * </pre>
     *
     * <code>repeated .Ifaipb.SmartAreaRule rules = 4;</code>
     */
    public Builder setRules(
        int index, com.intellif.ifai.face.SmartAreaRule value) {
      if (rulesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureRulesIsMutable();
        rules_.set(index, value);
        onChanged();
      } else {
        rulesBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     *规则
     * </pre>
     *
     * <code>repeated .Ifaipb.SmartAreaRule rules = 4;</code>
     */
    public Builder setRules(
        int index, com.intellif.ifai.face.SmartAreaRule.Builder builderForValue) {
      if (rulesBuilder_ == null) {
        ensureRulesIsMutable();
        rules_.set(index, builderForValue.build());
        onChanged();
      } else {
        rulesBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     *规则
     * </pre>
     *
     * <code>repeated .Ifaipb.SmartAreaRule rules = 4;</code>
     */
    public Builder addRules(com.intellif.ifai.face.SmartAreaRule value) {
      if (rulesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureRulesIsMutable();
        rules_.add(value);
        onChanged();
      } else {
        rulesBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     *规则
     * </pre>
     *
     * <code>repeated .Ifaipb.SmartAreaRule rules = 4;</code>
     */
    public Builder addRules(
        int index, com.intellif.ifai.face.SmartAreaRule value) {
      if (rulesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureRulesIsMutable();
        rules_.add(index, value);
        onChanged();
      } else {
        rulesBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     *规则
     * </pre>
     *
     * <code>repeated .Ifaipb.SmartAreaRule rules = 4;</code>
     */
    public Builder addRules(
        com.intellif.ifai.face.SmartAreaRule.Builder builderForValue) {
      if (rulesBuilder_ == null) {
        ensureRulesIsMutable();
        rules_.add(builderForValue.build());
        onChanged();
      } else {
        rulesBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     *规则
     * </pre>
     *
     * <code>repeated .Ifaipb.SmartAreaRule rules = 4;</code>
     */
    public Builder addRules(
        int index, com.intellif.ifai.face.SmartAreaRule.Builder builderForValue) {
      if (rulesBuilder_ == null) {
        ensureRulesIsMutable();
        rules_.add(index, builderForValue.build());
        onChanged();
      } else {
        rulesBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     *规则
     * </pre>
     *
     * <code>repeated .Ifaipb.SmartAreaRule rules = 4;</code>
     */
    public Builder addAllRules(
        java.lang.Iterable<? extends com.intellif.ifai.face.SmartAreaRule> values) {
      if (rulesBuilder_ == null) {
        ensureRulesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, rules_);
        onChanged();
      } else {
        rulesBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     *规则
     * </pre>
     *
     * <code>repeated .Ifaipb.SmartAreaRule rules = 4;</code>
     */
    public Builder clearRules() {
      if (rulesBuilder_ == null) {
        rules_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000008);
        onChanged();
      } else {
        rulesBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     *规则
     * </pre>
     *
     * <code>repeated .Ifaipb.SmartAreaRule rules = 4;</code>
     */
    public Builder removeRules(int index) {
      if (rulesBuilder_ == null) {
        ensureRulesIsMutable();
        rules_.remove(index);
        onChanged();
      } else {
        rulesBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     *规则
     * </pre>
     *
     * <code>repeated .Ifaipb.SmartAreaRule rules = 4;</code>
     */
    public com.intellif.ifai.face.SmartAreaRule.Builder getRulesBuilder(
        int index) {
      return getRulesFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     *规则
     * </pre>
     *
     * <code>repeated .Ifaipb.SmartAreaRule rules = 4;</code>
     */
    public com.intellif.ifai.face.SmartAreaRuleOrBuilder getRulesOrBuilder(
        int index) {
      if (rulesBuilder_ == null) {
        return rules_.get(index);  } else {
        return rulesBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     *规则
     * </pre>
     *
     * <code>repeated .Ifaipb.SmartAreaRule rules = 4;</code>
     */
    public java.util.List<? extends com.intellif.ifai.face.SmartAreaRuleOrBuilder> 
         getRulesOrBuilderList() {
      if (rulesBuilder_ != null) {
        return rulesBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(rules_);
      }
    }
    /**
     * <pre>
     *规则
     * </pre>
     *
     * <code>repeated .Ifaipb.SmartAreaRule rules = 4;</code>
     */
    public com.intellif.ifai.face.SmartAreaRule.Builder addRulesBuilder() {
      return getRulesFieldBuilder().addBuilder(
          com.intellif.ifai.face.SmartAreaRule.getDefaultInstance());
    }
    /**
     * <pre>
     *规则
     * </pre>
     *
     * <code>repeated .Ifaipb.SmartAreaRule rules = 4;</code>
     */
    public com.intellif.ifai.face.SmartAreaRule.Builder addRulesBuilder(
        int index) {
      return getRulesFieldBuilder().addBuilder(
          index, com.intellif.ifai.face.SmartAreaRule.getDefaultInstance());
    }
    /**
     * <pre>
     *规则
     * </pre>
     *
     * <code>repeated .Ifaipb.SmartAreaRule rules = 4;</code>
     */
    public java.util.List<com.intellif.ifai.face.SmartAreaRule.Builder> 
         getRulesBuilderList() {
      return getRulesFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.intellif.ifai.face.SmartAreaRule, com.intellif.ifai.face.SmartAreaRule.Builder, com.intellif.ifai.face.SmartAreaRuleOrBuilder> 
        getRulesFieldBuilder() {
      if (rulesBuilder_ == null) {
        rulesBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.intellif.ifai.face.SmartAreaRule, com.intellif.ifai.face.SmartAreaRule.Builder, com.intellif.ifai.face.SmartAreaRuleOrBuilder>(
                rules_,
                ((bitField0_ & 0x00000008) == 0x00000008),
                getParentForChildren(),
                isClean());
        rules_ = null;
      }
      return rulesBuilder_;
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


    // @@protoc_insertion_point(builder_scope:Ifaipb.StoreRule)
  }

  // @@protoc_insertion_point(class_scope:Ifaipb.StoreRule)
  private static final com.intellif.ifai.face.StoreRule DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.intellif.ifai.face.StoreRule();
  }

  public static com.intellif.ifai.face.StoreRule getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<StoreRule>
      PARSER = new com.google.protobuf.AbstractParser<StoreRule>() {
    @java.lang.Override
    public StoreRule parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new StoreRule(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<StoreRule> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<StoreRule> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.intellif.ifai.face.StoreRule getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

