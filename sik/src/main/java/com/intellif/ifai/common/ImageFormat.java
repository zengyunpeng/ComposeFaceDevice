// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: IfCommonType.proto

package com.intellif.ifai.common;

/**
 * Protobuf enum {@code Ifaipb.ImageFormat}
 */
public enum ImageFormat
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>ImageFormat_JPG = 0;</code>
   */
  ImageFormat_JPG(0),
  /**
   * <code>ImageFormat_PNG = 1;</code>
   */
  ImageFormat_PNG(1),
  /**
   * <code>ImageFormat_OTHER = 2;</code>
   */
  ImageFormat_OTHER(2),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>ImageFormat_JPG = 0;</code>
   */
  public static final int ImageFormat_JPG_VALUE = 0;
  /**
   * <code>ImageFormat_PNG = 1;</code>
   */
  public static final int ImageFormat_PNG_VALUE = 1;
  /**
   * <code>ImageFormat_OTHER = 2;</code>
   */
  public static final int ImageFormat_OTHER_VALUE = 2;


  public final int getNumber() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalArgumentException(
          "Can't get the number of an unknown enum value.");
    }
    return value;
  }

  /**
   * @deprecated Use {@link #forNumber(int)} instead.
   */
  @java.lang.Deprecated
  public static ImageFormat valueOf(int value) {
    return forNumber(value);
  }

  public static ImageFormat forNumber(int value) {
    switch (value) {
      case 0: return ImageFormat_JPG;
      case 1: return ImageFormat_PNG;
      case 2: return ImageFormat_OTHER;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<ImageFormat>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      ImageFormat> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<ImageFormat>() {
          public ImageFormat findValueByNumber(int number) {
            return ImageFormat.forNumber(number);
          }
        };

  public final com.google.protobuf.Descriptors.EnumValueDescriptor
      getValueDescriptor() {
    return getDescriptor().getValues().get(ordinal());
  }
  public final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptorForType() {
    return getDescriptor();
  }
  public static final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptor() {
    return com.intellif.ifai.common.Ifai.getDescriptor().getEnumTypes().get(2);
  }

  private static final ImageFormat[] VALUES = values();

  public static ImageFormat valueOf(
      com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException(
        "EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private ImageFormat(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:Ifaipb.ImageFormat)
}

