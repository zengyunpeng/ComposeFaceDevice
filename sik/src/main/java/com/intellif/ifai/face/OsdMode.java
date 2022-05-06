// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: IfAnalytics.proto

package com.intellif.ifai.face;

/**
 * <pre>
 *新增叠加信息配置
 * </pre>
 *
 * Protobuf enum {@code Ifaipb.OsdMode}
 */
public enum OsdMode
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <pre>
   *无
   * </pre>
   *
   * <code>OSD_NO = 0;</code>
   */
  OSD_NO(0),
  /**
   * <pre>
   *进入
   * </pre>
   *
   * <code>OSD_IN = 1;</code>
   */
  OSD_IN(1),
  /**
   * <pre>
   *离开
   * </pre>
   *
   * <code>OSD_OUT = 2;</code>
   */
  OSD_OUT(2),
  /**
   * <pre>
   *进入/离开
   * </pre>
   *
   * <code>OSD_IN_OUT = 3;</code>
   */
  OSD_IN_OUT(3),
  UNRECOGNIZED(-1),
  ;

  /**
   * <pre>
   *无
   * </pre>
   *
   * <code>OSD_NO = 0;</code>
   */
  public static final int OSD_NO_VALUE = 0;
  /**
   * <pre>
   *进入
   * </pre>
   *
   * <code>OSD_IN = 1;</code>
   */
  public static final int OSD_IN_VALUE = 1;
  /**
   * <pre>
   *离开
   * </pre>
   *
   * <code>OSD_OUT = 2;</code>
   */
  public static final int OSD_OUT_VALUE = 2;
  /**
   * <pre>
   *进入/离开
   * </pre>
   *
   * <code>OSD_IN_OUT = 3;</code>
   */
  public static final int OSD_IN_OUT_VALUE = 3;


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
  public static OsdMode valueOf(int value) {
    return forNumber(value);
  }

  public static OsdMode forNumber(int value) {
    switch (value) {
      case 0: return OSD_NO;
      case 1: return OSD_IN;
      case 2: return OSD_OUT;
      case 3: return OSD_IN_OUT;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<OsdMode>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      OsdMode> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<OsdMode>() {
          public OsdMode findValueByNumber(int number) {
            return OsdMode.forNumber(number);
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
    return com.intellif.ifai.face.Ifai.getDescriptor().getEnumTypes().get(0);
  }

  private static final OsdMode[] VALUES = values();

  public static OsdMode valueOf(
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

  private OsdMode(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:Ifaipb.OsdMode)
}

