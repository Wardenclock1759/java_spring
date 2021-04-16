package com.test.rest.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class Block {
    private final String header;
    private final List<Field> fields;

    public Block(@JsonProperty("header") String header,
                 @JsonProperty("fields") List<Field> fields) {
        this.header = header;
        this.fields = fields;
    }

    public String getHeader() {
        return header;
    }

    public List<Field> getFields() {
        return fields;
    }
}
