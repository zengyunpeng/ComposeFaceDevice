// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: IfCommonType.proto

package com.intellif.ifai.common;

/**
 * <pre>
 *&#47;////////////////////////////////////
 *公共数据类型定义
 * /////////////////////////////////////
 * </pre>
 *
 * Protobuf enum {@code Ifaipb.ErrorCode}
 */
public enum ErrorCode
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <pre>
   *OK
   * </pre>
   *
   * <code>ErrorCode_OK = 0;</code>
   */
  ErrorCode_OK(0),
  /**
   * <pre>
   *内部处理错误
   * </pre>
   *
   * <code>ErrorCode_InnerError = -1;</code>
   */
  ErrorCode_InnerError(-1),
  /**
   * <pre>
   *无效的参数
   * </pre>
   *
   * <code>ErrorCode_InvalidParameter = -2;</code>
   */
  ErrorCode_InvalidParameter(-2),
  /**
   * <pre>
   *系统忙
   * </pre>
   *
   * <code>ErrorCode_SystemBusy = -3;</code>
   */
  ErrorCode_SystemBusy(-3),
  /**
   * <pre>
   *无效的消息
   * </pre>
   *
   * <code>ErrorCode_InvalidMessage = -4;</code>
   */
  ErrorCode_InvalidMessage(-4),
  /**
   * <pre>
   *无效的用户名或密码
   * </pre>
   *
   * <code>ErrorCode_InvalidUsernameOrPassword = -5;</code>
   */
  ErrorCode_InvalidUsernameOrPassword(-5),
  /**
   * <pre>
   *没有权限
   * </pre>
   *
   * <code>ErrorCode_PermissionDenied = -6;</code>
   */
  ErrorCode_PermissionDenied(-6),
  /**
   * <pre>
   *没有实现
   * </pre>
   *
   * <code>ErrorCode_NotImplemented = -7;</code>
   */
  ErrorCode_NotImplemented(-7),
  UNRECOGNIZED(-1),
  ;

  /**
   * <pre>
   *OK
   * </pre>
   *
   * <code>ErrorCode_OK = 0;</code>
   */
  public static final int ErrorCode_OK_VALUE = 0;
  /**
   * <pre>
   *内部处理错误
   * </pre>
   *
   * <code>ErrorCode_InnerError = -1;</code>
   */
  public static final int ErrorCode_InnerError_VALUE = -1;
  /**
   * <pre>
   *无效的参数
   * </pre>
   *
   * <code>ErrorCode_InvalidParameter = -2;</code>
   */
  public static final int ErrorCode_InvalidParameter_VALUE = -2;
  /**
   * <pre>
   *系统忙
   * </pre>
   *
   * <code>ErrorCode_SystemBusy = -3;</code>
   */
  public static final int ErrorCode_SystemBusy_VALUE = -3;
  /**
   * <pre>
   *无效的消息
   * </pre>
   *
   * <code>ErrorCode_InvalidMessage = -4;</code>
   */
  public static final int ErrorCode_InvalidMessage_VALUE = -4;
  /**
   * <pre>
   *无效的用户名或密码
   * </pre>
   *
   * <code>ErrorCode_InvalidUsernameOrPassword = -5;</code>
   */
  public static final int ErrorCode_InvalidUsernameOrPassword_VALUE = -5;
  /**
   * <pre>
   *没有权限
   * </pre>
   *
   * <code>ErrorCode_PermissionDenied = -6;</code>
   */
  public static final int ErrorCode_PermissionDenied_VALUE = -6;
  /**
   * <pre>
   *没有实现
   * </pre>
   *
   * <code>ErrorCode_NotImplemented = -7;</code>
   */
  public static final int ErrorCode_NotImplemented_VALUE = -7;


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
  public static ErrorCode valueOf(int value) {
    return forNumber(value);
  }

  public static ErrorCode forNumber(int value) {
    switch (value) {
      case 0: return ErrorCode_OK;
      case -1: return ErrorCode_InnerError;
      case -2: return ErrorCode_InvalidParameter;
      case -3: return ErrorCode_SystemBusy;
      case -4: return ErrorCode_InvalidMessage;
      case -5: return ErrorCode_InvalidUsernameOrPassword;
      case -6: return ErrorCode_PermissionDenied;
      case -7: return ErrorCode_NotImplemented;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<ErrorCode>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      ErrorCode> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<ErrorCode>() {
          public ErrorCode findValueByNumber(int number) {
            return ErrorCode.forNumber(number);
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
    return com.intellif.ifai.common.Ifai.getDescriptor().getEnumTypes().get(0);
  }

  private static final ErrorCode[] VALUES = values();

  public static ErrorCode valueOf(
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

  private ErrorCode(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:Ifaipb.ErrorCode)
}
