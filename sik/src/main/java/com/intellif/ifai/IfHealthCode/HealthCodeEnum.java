// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: IfHealthCode.proto

package com.intellif.ifai.IfHealthCode;

/**
 * Protobuf enum {@code Ifaipb.HealthCodeEnum}
 */
public enum HealthCodeEnum
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <pre>
   *未知
   * </pre>
   *
   * <code>UNKNOWN_CODE = 0;</code>
   */
  UNKNOWN_CODE(0),
  /**
   * <pre>
   *红码
   * </pre>
   *
   * <code>RED = 1;</code>
   */
  RED(1),
  /**
   * <pre>
   *黄码
   * </pre>
   *
   * <code>YELLOW = 2;</code>
   */
  YELLOW(2),
  /**
   * <pre>
   *绿码
   * </pre>
   *
   * <code>GREEN = 3;</code>
   */
  GREEN(3),
  UNRECOGNIZED(-1),
  ;

  /**
   * <pre>
   *未知
   * </pre>
   *
   * <code>UNKNOWN_CODE = 0;</code>
   */
  public static final int UNKNOWN_CODE_VALUE = 0;
  /**
   * <pre>
   *红码
   * </pre>
   *
   * <code>RED = 1;</code>
   */
  public static final int RED_VALUE = 1;
  /**
   * <pre>
   *黄码
   * </pre>
   *
   * <code>YELLOW = 2;</code>
   */
  public static final int YELLOW_VALUE = 2;
  /**
   * <pre>
   *绿码
   * </pre>
   *
   * <code>GREEN = 3;</code>
   */
  public static final int GREEN_VALUE = 3;


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
  public static HealthCodeEnum valueOf(int value) {
    return forNumber(value);
  }

  public static HealthCodeEnum forNumber(int value) {
    switch (value) {
      case 0: return UNKNOWN_CODE;
      case 1: return RED;
      case 2: return YELLOW;
      case 3: return GREEN;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<HealthCodeEnum>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      HealthCodeEnum> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<HealthCodeEnum>() {
          public HealthCodeEnum findValueByNumber(int number) {
            return HealthCodeEnum.forNumber(number);
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
    return com.intellif.ifai.IfHealthCode.Ifai.getDescriptor().getEnumTypes().get(1);
  }

  private static final HealthCodeEnum[] VALUES = values();

  public static HealthCodeEnum valueOf(
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

  private HealthCodeEnum(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:Ifaipb.HealthCodeEnum)
}

