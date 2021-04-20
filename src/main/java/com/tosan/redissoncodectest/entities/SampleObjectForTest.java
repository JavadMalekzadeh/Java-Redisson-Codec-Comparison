package com.tosan.redissoncodectest.entities;

import java.io.Serializable;
import java.util.List;

public class SampleObjectForTest implements Serializable {
    private double doubleTypeField;
    private float floatTypeField;
    private int intTypeField;
    private long longTypeField;
    private Boolean boolTrueField;
    private Boolean boolFalseField;
    private String stringTypeField;
    private List<Object> ArrayListOfObjectTypeField;

    public double getDoubleTypeField() {
        return doubleTypeField;
    }

    public void setDoubleTypeField(double doubleTypeField) {
        this.doubleTypeField = doubleTypeField;
    }

    public float getFloatTypeField() {
        return floatTypeField;
    }

    public void setFloatTypeField(float floatTypeField) {
        this.floatTypeField = floatTypeField;
    }

    public int getIntTypeField() {
        return intTypeField;
    }

    public void setIntTypeField(int intTypeField) {
        this.intTypeField = intTypeField;
    }

    public long getLongTypeField() {
        return longTypeField;
    }

    public void setLongTypeField(long longTypeField) {
        this.longTypeField = longTypeField;
    }

    public Boolean getBoolTrueField() {
        return boolTrueField;
    }

    public void setBoolTrueField(Boolean boolTrueField) {
        this.boolTrueField = boolTrueField;
    }

    public Boolean getBoolFalseField() {
        return boolFalseField;
    }

    public void setBoolFalseField(Boolean boolFalseField) {
        this.boolFalseField = boolFalseField;
    }

    public String getStringTypeField() {
        return stringTypeField;
    }

    public void setStringTypeField(String stringTypeField) {
        this.stringTypeField = stringTypeField;
    }

    public List<Object> getArrayListOfObjectTypeField() {
        return ArrayListOfObjectTypeField;
    }

    public void setArrayListOfObjectTypeField(List<Object> arrayListOfObjectTypeField) {
        ArrayListOfObjectTypeField = arrayListOfObjectTypeField;
    }
}

