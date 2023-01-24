package com.example.supportservice.domain.chat.core.model;

import lombok.Getter;

@Getter
public class ChatIdentifier {

    private final Long id;

    public ChatIdentifier(Long id) {
        this.id = id;
    }

}
