package com.example.supportservice.domain.letter.core.model;


import lombok.EqualsAndHashCode;

@EqualsAndHashCode
public class Message {

    private String value;

    public Message(String value) {
        this.value = value;
    }

    private Message() {
    }
}
