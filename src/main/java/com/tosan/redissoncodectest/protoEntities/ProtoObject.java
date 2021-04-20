// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: SampleProtoObjectsForTest.proto

package com.tosan.redissoncodectest.protoEntities;

/**
 * Protobuf type {@code ProtoObject}
 */
public final class ProtoObject extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:ProtoObject)
    ProtoObjectOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ProtoObject.newBuilder() to construct.
  private ProtoObject(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ProtoObject() {
  }

  @Override
  @SuppressWarnings({"unused"})
  protected Object newInstance(
      UnusedPrivateParameter unused) {
    return new ProtoObject();
  }

  @Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ProtoObject(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new NullPointerException();
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
          case 8: {
            int rawValue = input.readEnum();
            kindCase_ = 1;
            kind_ = rawValue;
            break;
          }
          case 17: {
            kindCase_ = 2;
            kind_ = input.readDouble();
            break;
          }
          case 29: {
            kindCase_ = 3;
            kind_ = input.readFloat();
            break;
          }
          case 34: {
            String s = input.readStringRequireUtf8();
            kindCase_ = 4;
            kind_ = s;
            break;
          }
          case 40: {
            kindCase_ = 5;
            kind_ = input.readBool();
            break;
          }
          case 48: {
            kindCase_ = 6;
            kind_ = input.readInt32();
            break;
          }
          case 56: {
            kindCase_ = 7;
            kind_ = input.readInt64();
            break;
          }
          default: {
            if (!parseUnknownField(
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
    return SampleProtoObjectsForTest.internal_static_ProtoObject_descriptor;
  }

  @Override
  protected FieldAccessorTable
      internalGetFieldAccessorTable() {
    return SampleProtoObjectsForTest.internal_static_ProtoObject_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            ProtoObject.class, Builder.class);
  }

  private int kindCase_ = 0;
  private Object kind_;
  public enum KindCase
      implements com.google.protobuf.Internal.EnumLite,
          com.google.protobuf.AbstractMessage.InternalOneOfEnum {
    NULL_VALUE(1),
    DOUBLE_VALUE(2),
    FLOAT_VALUE(3),
    STRING_VALUE(4),
    BOOL_VALUE(5),
    INT_VALUE(6),
    LONG_VALUE(7),
    KIND_NOT_SET(0);
    private final int value;
    private KindCase(int value) {
      this.value = value;
    }
    /**
     * @param value The number of the enum to look for.
     * @return The enum associated with the given number.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @Deprecated
    public static KindCase valueOf(int value) {
      return forNumber(value);
    }

    public static KindCase forNumber(int value) {
      switch (value) {
        case 1: return NULL_VALUE;
        case 2: return DOUBLE_VALUE;
        case 3: return FLOAT_VALUE;
        case 4: return STRING_VALUE;
        case 5: return BOOL_VALUE;
        case 6: return INT_VALUE;
        case 7: return LONG_VALUE;
        case 0: return KIND_NOT_SET;
        default: return null;
      }
    }
    public int getNumber() {
      return this.value;
    }
  };

  public KindCase
  getKindCase() {
    return KindCase.forNumber(
        kindCase_);
  }

  public static final int NULL_VALUE_FIELD_NUMBER = 1;
  /**
   * <code>.NullValue null_value = 1;</code>
   * @return Whether the nullValue field is set.
   */
  public boolean hasNullValue() {
    return kindCase_ == 1;
  }
  /**
   * <code>.NullValue null_value = 1;</code>
   * @return The enum numeric value on the wire for nullValue.
   */
  public int getNullValueValue() {
    if (kindCase_ == 1) {
      return (Integer) kind_;
    }
    return 0;
  }
  /**
   * <code>.NullValue null_value = 1;</code>
   * @return The nullValue.
   */
  public NullValue getNullValue() {
    if (kindCase_ == 1) {
      @SuppressWarnings("deprecation")
      NullValue result = NullValue.valueOf(
          (Integer) kind_);
      return result == null ? NullValue.UNRECOGNIZED : result;
    }
    return NullValue.NULL_VALUE;
  }

  public static final int DOUBLE_VALUE_FIELD_NUMBER = 2;
  /**
   * <code>double double_value = 2;</code>
   * @return Whether the doubleValue field is set.
   */
  @Override
  public boolean hasDoubleValue() {
    return kindCase_ == 2;
  }
  /**
   * <code>double double_value = 2;</code>
   * @return The doubleValue.
   */
  @Override
  public double getDoubleValue() {
    if (kindCase_ == 2) {
      return (Double) kind_;
    }
    return 0D;
  }

  public static final int FLOAT_VALUE_FIELD_NUMBER = 3;
  /**
   * <code>float float_value = 3;</code>
   * @return Whether the floatValue field is set.
   */
  @Override
  public boolean hasFloatValue() {
    return kindCase_ == 3;
  }
  /**
   * <code>float float_value = 3;</code>
   * @return The floatValue.
   */
  @Override
  public float getFloatValue() {
    if (kindCase_ == 3) {
      return (Float) kind_;
    }
    return 0F;
  }

  public static final int STRING_VALUE_FIELD_NUMBER = 4;
  /**
   * <code>string string_value = 4;</code>
   * @return Whether the stringValue field is set.
   */
  public boolean hasStringValue() {
    return kindCase_ == 4;
  }
  /**
   * <code>string string_value = 4;</code>
   * @return The stringValue.
   */
  public String getStringValue() {
    Object ref = "";
    if (kindCase_ == 4) {
      ref = kind_;
    }
    if (ref instanceof String) {
      return (String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      String s = bs.toStringUtf8();
      if (kindCase_ == 4) {
        kind_ = s;
      }
      return s;
    }
  }
  /**
   * <code>string string_value = 4;</code>
   * @return The bytes for stringValue.
   */
  public com.google.protobuf.ByteString
      getStringValueBytes() {
    Object ref = "";
    if (kindCase_ == 4) {
      ref = kind_;
    }
    if (ref instanceof String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (String) ref);
      if (kindCase_ == 4) {
        kind_ = b;
      }
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int BOOL_VALUE_FIELD_NUMBER = 5;
  /**
   * <code>bool bool_value = 5;</code>
   * @return Whether the boolValue field is set.
   */
  @Override
  public boolean hasBoolValue() {
    return kindCase_ == 5;
  }
  /**
   * <code>bool bool_value = 5;</code>
   * @return The boolValue.
   */
  @Override
  public boolean getBoolValue() {
    if (kindCase_ == 5) {
      return (Boolean) kind_;
    }
    return false;
  }

  public static final int INT_VALUE_FIELD_NUMBER = 6;
  /**
   * <code>int32 int_value = 6;</code>
   * @return Whether the intValue field is set.
   */
  @Override
  public boolean hasIntValue() {
    return kindCase_ == 6;
  }
  /**
   * <code>int32 int_value = 6;</code>
   * @return The intValue.
   */
  @Override
  public int getIntValue() {
    if (kindCase_ == 6) {
      return (Integer) kind_;
    }
    return 0;
  }

  public static final int LONG_VALUE_FIELD_NUMBER = 7;
  /**
   * <code>int64 long_value = 7;</code>
   * @return Whether the longValue field is set.
   */
  @Override
  public boolean hasLongValue() {
    return kindCase_ == 7;
  }
  /**
   * <code>int64 long_value = 7;</code>
   * @return The longValue.
   */
  @Override
  public long getLongValue() {
    if (kindCase_ == 7) {
      return (Long) kind_;
    }
    return 0L;
  }

  private byte memoizedIsInitialized = -1;
  @Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (kindCase_ == 1) {
      output.writeEnum(1, ((Integer) kind_));
    }
    if (kindCase_ == 2) {
      output.writeDouble(
          2, (double)((Double) kind_));
    }
    if (kindCase_ == 3) {
      output.writeFloat(
          3, (float)((Float) kind_));
    }
    if (kindCase_ == 4) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, kind_);
    }
    if (kindCase_ == 5) {
      output.writeBool(
          5, (boolean)((Boolean) kind_));
    }
    if (kindCase_ == 6) {
      output.writeInt32(
          6, (int)((Integer) kind_));
    }
    if (kindCase_ == 7) {
      output.writeInt64(
          7, (long)((Long) kind_));
    }
    unknownFields.writeTo(output);
  }

  @Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (kindCase_ == 1) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, ((Integer) kind_));
    }
    if (kindCase_ == 2) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(
            2, (double)((Double) kind_));
    }
    if (kindCase_ == 3) {
      size += com.google.protobuf.CodedOutputStream
        .computeFloatSize(
            3, (float)((Float) kind_));
    }
    if (kindCase_ == 4) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, kind_);
    }
    if (kindCase_ == 5) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(
            5, (boolean)((Boolean) kind_));
    }
    if (kindCase_ == 6) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(
            6, (int)((Integer) kind_));
    }
    if (kindCase_ == 7) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(
            7, (long)((Long) kind_));
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @Override
  public boolean equals(final Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof ProtoObject)) {
      return super.equals(obj);
    }
    ProtoObject other = (ProtoObject) obj;

    if (!getKindCase().equals(other.getKindCase())) return false;
    switch (kindCase_) {
      case 1:
        if (getNullValueValue()
            != other.getNullValueValue()) return false;
        break;
      case 2:
        if (Double.doubleToLongBits(getDoubleValue())
            != Double.doubleToLongBits(
                other.getDoubleValue())) return false;
        break;
      case 3:
        if (Float.floatToIntBits(getFloatValue())
            != Float.floatToIntBits(
                other.getFloatValue())) return false;
        break;
      case 4:
        if (!getStringValue()
            .equals(other.getStringValue())) return false;
        break;
      case 5:
        if (getBoolValue()
            != other.getBoolValue()) return false;
        break;
      case 6:
        if (getIntValue()
            != other.getIntValue()) return false;
        break;
      case 7:
        if (getLongValue()
            != other.getLongValue()) return false;
        break;
      case 0:
      default:
    }
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    switch (kindCase_) {
      case 1:
        hash = (37 * hash) + NULL_VALUE_FIELD_NUMBER;
        hash = (53 * hash) + getNullValueValue();
        break;
      case 2:
        hash = (37 * hash) + DOUBLE_VALUE_FIELD_NUMBER;
        hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
            Double.doubleToLongBits(getDoubleValue()));
        break;
      case 3:
        hash = (37 * hash) + FLOAT_VALUE_FIELD_NUMBER;
        hash = (53 * hash) + Float.floatToIntBits(
            getFloatValue());
        break;
      case 4:
        hash = (37 * hash) + STRING_VALUE_FIELD_NUMBER;
        hash = (53 * hash) + getStringValue().hashCode();
        break;
      case 5:
        hash = (37 * hash) + BOOL_VALUE_FIELD_NUMBER;
        hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
            getBoolValue());
        break;
      case 6:
        hash = (37 * hash) + INT_VALUE_FIELD_NUMBER;
        hash = (53 * hash) + getIntValue();
        break;
      case 7:
        hash = (37 * hash) + LONG_VALUE_FIELD_NUMBER;
        hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
            getLongValue());
        break;
      case 0:
      default:
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static ProtoObject parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ProtoObject parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ProtoObject parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ProtoObject parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ProtoObject parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ProtoObject parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ProtoObject parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ProtoObject parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static ProtoObject parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static ProtoObject parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static ProtoObject parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ProtoObject parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(ProtoObject prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @Override
  protected Builder newBuilderForType(
      BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code ProtoObject}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:ProtoObject)
      ProtoObjectOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return SampleProtoObjectsForTest.internal_static_ProtoObject_descriptor;
    }

    @Override
    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return SampleProtoObjectsForTest.internal_static_ProtoObject_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              ProtoObject.class, Builder.class);
    }

    // Construct using com.tosan.redissoncodectest.protoEntities.ProtoObject.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @Override
    public Builder clear() {
      super.clear();
      kindCase_ = 0;
      kind_ = null;
      return this;
    }

    @Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return SampleProtoObjectsForTest.internal_static_ProtoObject_descriptor;
    }

    @Override
    public ProtoObject getDefaultInstanceForType() {
      return ProtoObject.getDefaultInstance();
    }

    @Override
    public ProtoObject build() {
      ProtoObject result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @Override
    public ProtoObject buildPartial() {
      ProtoObject result = new ProtoObject(this);
      if (kindCase_ == 1) {
        result.kind_ = kind_;
      }
      if (kindCase_ == 2) {
        result.kind_ = kind_;
      }
      if (kindCase_ == 3) {
        result.kind_ = kind_;
      }
      if (kindCase_ == 4) {
        result.kind_ = kind_;
      }
      if (kindCase_ == 5) {
        result.kind_ = kind_;
      }
      if (kindCase_ == 6) {
        result.kind_ = kind_;
      }
      if (kindCase_ == 7) {
        result.kind_ = kind_;
      }
      result.kindCase_ = kindCase_;
      onBuilt();
      return result;
    }

    @Override
    public Builder clone() {
      return super.clone();
    }
    @Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return super.setField(field, value);
    }
    @Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return super.addRepeatedField(field, value);
    }
    @Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof ProtoObject) {
        return mergeFrom((ProtoObject)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(ProtoObject other) {
      if (other == ProtoObject.getDefaultInstance()) return this;
      switch (other.getKindCase()) {
        case NULL_VALUE: {
          setNullValueValue(other.getNullValueValue());
          break;
        }
        case DOUBLE_VALUE: {
          setDoubleValue(other.getDoubleValue());
          break;
        }
        case FLOAT_VALUE: {
          setFloatValue(other.getFloatValue());
          break;
        }
        case STRING_VALUE: {
          kindCase_ = 4;
          kind_ = other.kind_;
          onChanged();
          break;
        }
        case BOOL_VALUE: {
          setBoolValue(other.getBoolValue());
          break;
        }
        case INT_VALUE: {
          setIntValue(other.getIntValue());
          break;
        }
        case LONG_VALUE: {
          setLongValue(other.getLongValue());
          break;
        }
        case KIND_NOT_SET: {
          break;
        }
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @Override
    public final boolean isInitialized() {
      return true;
    }

    @Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      ProtoObject parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (ProtoObject) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int kindCase_ = 0;
    private Object kind_;
    public KindCase
        getKindCase() {
      return KindCase.forNumber(
          kindCase_);
    }

    public Builder clearKind() {
      kindCase_ = 0;
      kind_ = null;
      onChanged();
      return this;
    }


    /**
     * <code>.NullValue null_value = 1;</code>
     * @return Whether the nullValue field is set.
     */
    @Override
    public boolean hasNullValue() {
      return kindCase_ == 1;
    }
    /**
     * <code>.NullValue null_value = 1;</code>
     * @return The enum numeric value on the wire for nullValue.
     */
    @Override
    public int getNullValueValue() {
      if (kindCase_ == 1) {
        return ((Integer) kind_).intValue();
      }
      return 0;
    }
    /**
     * <code>.NullValue null_value = 1;</code>
     * @param value The enum numeric value on the wire for nullValue to set.
     * @return This builder for chaining.
     */
    public Builder setNullValueValue(int value) {
      kindCase_ = 1;
      kind_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.NullValue null_value = 1;</code>
     * @return The nullValue.
     */
    @Override
    public NullValue getNullValue() {
      if (kindCase_ == 1) {
        @SuppressWarnings("deprecation")
        NullValue result = NullValue.valueOf(
            (Integer) kind_);
        return result == null ? NullValue.UNRECOGNIZED : result;
      }
      return NullValue.NULL_VALUE;
    }
    /**
     * <code>.NullValue null_value = 1;</code>
     * @param value The nullValue to set.
     * @return This builder for chaining.
     */
    public Builder setNullValue(NullValue value) {
      if (value == null) {
        throw new NullPointerException();
      }
      kindCase_ = 1;
      kind_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.NullValue null_value = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearNullValue() {
      if (kindCase_ == 1) {
        kindCase_ = 0;
        kind_ = null;
        onChanged();
      }
      return this;
    }

    /**
     * <code>double double_value = 2;</code>
     * @return Whether the doubleValue field is set.
     */
    public boolean hasDoubleValue() {
      return kindCase_ == 2;
    }
    /**
     * <code>double double_value = 2;</code>
     * @return The doubleValue.
     */
    public double getDoubleValue() {
      if (kindCase_ == 2) {
        return (Double) kind_;
      }
      return 0D;
    }
    /**
     * <code>double double_value = 2;</code>
     * @param value The doubleValue to set.
     * @return This builder for chaining.
     */
    public Builder setDoubleValue(double value) {
      kindCase_ = 2;
      kind_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>double double_value = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearDoubleValue() {
      if (kindCase_ == 2) {
        kindCase_ = 0;
        kind_ = null;
        onChanged();
      }
      return this;
    }

    /**
     * <code>float float_value = 3;</code>
     * @return Whether the floatValue field is set.
     */
    public boolean hasFloatValue() {
      return kindCase_ == 3;
    }
    /**
     * <code>float float_value = 3;</code>
     * @return The floatValue.
     */
    public float getFloatValue() {
      if (kindCase_ == 3) {
        return (Float) kind_;
      }
      return 0F;
    }
    /**
     * <code>float float_value = 3;</code>
     * @param value The floatValue to set.
     * @return This builder for chaining.
     */
    public Builder setFloatValue(float value) {
      kindCase_ = 3;
      kind_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>float float_value = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearFloatValue() {
      if (kindCase_ == 3) {
        kindCase_ = 0;
        kind_ = null;
        onChanged();
      }
      return this;
    }

    /**
     * <code>string string_value = 4;</code>
     * @return Whether the stringValue field is set.
     */
    @Override
    public boolean hasStringValue() {
      return kindCase_ == 4;
    }
    /**
     * <code>string string_value = 4;</code>
     * @return The stringValue.
     */
    @Override
    public String getStringValue() {
      Object ref = "";
      if (kindCase_ == 4) {
        ref = kind_;
      }
      if (!(ref instanceof String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        if (kindCase_ == 4) {
          kind_ = s;
        }
        return s;
      } else {
        return (String) ref;
      }
    }
    /**
     * <code>string string_value = 4;</code>
     * @return The bytes for stringValue.
     */
    @Override
    public com.google.protobuf.ByteString
        getStringValueBytes() {
      Object ref = "";
      if (kindCase_ == 4) {
        ref = kind_;
      }
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        if (kindCase_ == 4) {
          kind_ = b;
        }
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string string_value = 4;</code>
     * @param value The stringValue to set.
     * @return This builder for chaining.
     */
    public Builder setStringValue(
        String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  kindCase_ = 4;
      kind_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string string_value = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearStringValue() {
      if (kindCase_ == 4) {
        kindCase_ = 0;
        kind_ = null;
        onChanged();
      }
      return this;
    }
    /**
     * <code>string string_value = 4;</code>
     * @param value The bytes for stringValue to set.
     * @return This builder for chaining.
     */
    public Builder setStringValueBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      kindCase_ = 4;
      kind_ = value;
      onChanged();
      return this;
    }

    /**
     * <code>bool bool_value = 5;</code>
     * @return Whether the boolValue field is set.
     */
    public boolean hasBoolValue() {
      return kindCase_ == 5;
    }
    /**
     * <code>bool bool_value = 5;</code>
     * @return The boolValue.
     */
    public boolean getBoolValue() {
      if (kindCase_ == 5) {
        return (Boolean) kind_;
      }
      return false;
    }
    /**
     * <code>bool bool_value = 5;</code>
     * @param value The boolValue to set.
     * @return This builder for chaining.
     */
    public Builder setBoolValue(boolean value) {
      kindCase_ = 5;
      kind_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool bool_value = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearBoolValue() {
      if (kindCase_ == 5) {
        kindCase_ = 0;
        kind_ = null;
        onChanged();
      }
      return this;
    }

    /**
     * <code>int32 int_value = 6;</code>
     * @return Whether the intValue field is set.
     */
    public boolean hasIntValue() {
      return kindCase_ == 6;
    }
    /**
     * <code>int32 int_value = 6;</code>
     * @return The intValue.
     */
    public int getIntValue() {
      if (kindCase_ == 6) {
        return (Integer) kind_;
      }
      return 0;
    }
    /**
     * <code>int32 int_value = 6;</code>
     * @param value The intValue to set.
     * @return This builder for chaining.
     */
    public Builder setIntValue(int value) {
      kindCase_ = 6;
      kind_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 int_value = 6;</code>
     * @return This builder for chaining.
     */
    public Builder clearIntValue() {
      if (kindCase_ == 6) {
        kindCase_ = 0;
        kind_ = null;
        onChanged();
      }
      return this;
    }

    /**
     * <code>int64 long_value = 7;</code>
     * @return Whether the longValue field is set.
     */
    public boolean hasLongValue() {
      return kindCase_ == 7;
    }
    /**
     * <code>int64 long_value = 7;</code>
     * @return The longValue.
     */
    public long getLongValue() {
      if (kindCase_ == 7) {
        return (Long) kind_;
      }
      return 0L;
    }
    /**
     * <code>int64 long_value = 7;</code>
     * @param value The longValue to set.
     * @return This builder for chaining.
     */
    public Builder setLongValue(long value) {
      kindCase_ = 7;
      kind_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 long_value = 7;</code>
     * @return This builder for chaining.
     */
    public Builder clearLongValue() {
      if (kindCase_ == 7) {
        kindCase_ = 0;
        kind_ = null;
        onChanged();
      }
      return this;
    }
    @Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:ProtoObject)
  }

  // @@protoc_insertion_point(class_scope:ProtoObject)
  private static final ProtoObject DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new ProtoObject();
  }

  public static ProtoObject getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ProtoObject>
      PARSER = new com.google.protobuf.AbstractParser<ProtoObject>() {
    @Override
    public ProtoObject parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ProtoObject(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ProtoObject> parser() {
    return PARSER;
  }

  @Override
  public com.google.protobuf.Parser<ProtoObject> getParserForType() {
    return PARSER;
  }

  @Override
  public ProtoObject getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

