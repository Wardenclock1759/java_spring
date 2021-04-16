package com.test.rest.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class Field {
    private final String type;
    private final String name;
    private final String unit;
    private final List<String> fixedValues;
    private final List<String> fileBtn;

    public Field(@JsonProperty("type") String type,
                 @JsonProperty("name") String name,
                 @JsonProperty("unit") String unit,
                 @JsonProperty("fixedValues") List<String> fixedValues,
                 @JsonProperty("fileBtns") List<String> fileBtn) {
        this.type = type;
        this.name = name;
        this.unit = unit;
        this.fixedValues = fixedValues;
        this.fileBtn = fileBtn;
    }

    public String getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public String getUnit() {
        return unit;
    }

    public List<String> getFixedValues() {
        return fixedValues;
    }

    public List<String> getFileBtn() {
        return fileBtn;
    }
}