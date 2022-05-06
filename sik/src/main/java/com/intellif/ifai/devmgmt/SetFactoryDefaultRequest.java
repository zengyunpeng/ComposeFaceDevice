// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: IfDeviceManagment.proto

package com.intellif.ifai.devmgmt;

/**
 * <pre>
 *恢复出厂设置
 * /////////////////////////////////////
 * </pre>
 *
 * Protobuf type {@code Ifaipb.SetFactoryDefaultRequest}
 */
public  final class SetFactoryDefaultRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:Ifaipb.SetFactoryDefaultRequest)
    SetFactoryDefaultRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use SetFactoryDefaultRequest.newBuilder() to construct.
  private SetFactoryDefaultRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SetFactoryDefaultRequest() {
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private SetFactoryDefaultRequest(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
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
    return com.intellif.ifai.devmgmt.Ifai.internal_static_Ifaipb_SetFactoryDefaultRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.intellif.ifai.devmgmt.Ifai.internal_static_Ifaipb_SetFactoryDefaultRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.intellif.ifai.devmgmt.SetFactoryDefaultRequest.class, com.intellif.ifai.devmgmt.SetFactoryDefaultRequest.Builder.class);
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
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.intellif.ifai.devmgmt.SetFactoryDefaultRequest)) {
      return super.equals(obj);
    }
    com.intellif.ifai.devmgmt.SetFactoryDefaultRequest other = (com.intellif.ifai.devmgmt.SetFactoryDefaultRequest) obj;

    boolean result = true;
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
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.intellif.ifai.devmgmt.SetFactoryDefaultRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.intellif.ifai.devmgmt.SetFactoryDefaultRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.intellif.ifai.devmgmt.SetFactoryDefaultRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.intellif.ifai.devmgmt.SetFactoryDefaultRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.intellif.ifai.devmgmt.SetFactoryDefaultRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.intellif.ifai.devmgmt.SetFactoryDefaultRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.intellif.ifai.devmgmt.SetFactoryDefaultRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.intellif.ifai.devmgmt.SetFactoryDefaultRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.intellif.ifai.devmgmt.SetFactoryDefaultRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.intellif.ifai.devmgmt.SetFactoryDefaultRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.intellif.ifai.devmgmt.SetFactoryDefaultRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.intellif.ifai.devmgmt.SetFactoryDefaultRequest parseFrom(
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
  public static Builder newBuilder(com.intellif.ifai.devmgmt.SetFactoryDefaultRequest prototype) {
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
   *恢复出厂设置
   * /////////////////////////////////////
   * </pre>
   *
   * Protobuf type {@code Ifaipb.SetFactoryDefaultRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:Ifaipb.SetFactoryDefaultRequest)
      com.intellif.ifai.devmgmt.SetFactoryDefaultRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.intellif.ifai.devmgmt.Ifai.internal_static_Ifaipb_SetFactoryDefaultRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.intellif.ifai.devmgmt.Ifai.internal_static_Ifaipb_SetFactoryDefaultRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.intellif.ifai.devmgmt.SetFactoryDefaultRequest.class, com.intellif.ifai.devmgmt.SetFactoryDefaultRequest.Builder.class);
    }

    // Construct using com.intellif.ifai.devmgmt.SetFactoryDefaultRequest.newBuilder()
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
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.intellif.ifai.devmgmt.Ifai.internal_static_Ifaipb_SetFactoryDefaultRequest_descriptor;
    }

    @java.lang.Override
    public com.intellif.ifai.devmgmt.SetFactoryDefaultRequest getDefaultInstanceForType() {
      return com.intellif.ifai.devmgmt.SetFactoryDefaultRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.intellif.ifai.devmgmt.SetFactoryDefaultRequest build() {
      com.intellif.ifai.devmgmt.SetFactoryDefaultRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.intellif.ifai.devmgmt.SetFactoryDefaultRequest buildPartial() {
      com.intellif.ifai.devmgmt.SetFactoryDefaultRequest result = new com.intellif.ifai.devmgmt.SetFactoryDefaultRequest(this);
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
      if (other instanceof com.intellif.ifai.devmgmt.SetFactoryDefaultRequest) {
        return mergeFrom((com.intellif.ifai.devmgmt.SetFactoryDefaultRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.intellif.ifai.devmgmt.SetFactoryDefaultRequest other) {
      if (other == com.intellif.ifai.devmgmt.SetFactoryDefaultRequest.getDefaultInstance()) return this;
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
      com.intellif.ifai.devmgmt.SetFactoryDefaultRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.intellif.ifai.devmgmt.SetFactoryDefaultRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
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


    // @@protoc_insertion_point(builder_scope:Ifaipb.SetFactoryDefaultRequest)
  }

  // @@protoc_insertion_point(class_scope:Ifaipb.SetFactoryDefaultRequest)
  private static final com.intellif.ifai.devmgmt.SetFactoryDefaultRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.intellif.ifai.devmgmt.SetFactoryDefaultRequest();
  }

  public static com.intellif.ifai.devmgmt.SetFactoryDefaultRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SetFactoryDefaultRequest>
      PARSER = new com.google.protobuf.AbstractParser<SetFactoryDefaultRequest>() {
    @java.lang.Override
    public SetFactoryDefaultRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new SetFactoryDefaultRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<SetFactoryDefaultRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SetFactoryDefaultRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.intellif.ifai.devmgmt.SetFactoryDefaultRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
