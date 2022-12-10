package com.techelevator.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ParticipantName {

    @JsonProperty("name_id")
    private int nameId;
    private String name;

    public ParticipantName(int nameId, String name) {
        this.nameId = nameId;
        this.name = name;
    }

    public ParticipantName() {
    }

    public int getNameId() {
        return nameId;
    }

    public void setNameId(int nameId) {
        this.nameId = nameId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
