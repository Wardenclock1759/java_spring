package com.test.rest.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;
import java.util.UUID;

public class Passport {
    private final UUID id;
    private final String name;
    private final List<Block> blocks;

    public Passport(@JsonProperty("id") UUID id,
                    @JsonProperty("name") String name,
                    @JsonProperty("blocks") List<Block> blocks) {
        this.id = id;
        this.name = name;
        this.blocks = blocks;
    }

    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public List<Block> getBlocks() {
        return blocks;
    }
}
