package com.example.supportservice.domain.chat.core.event;

import java.time.Instant;

public class NewChatWasAddedEvent {
    private final Long chatId;
    private final Instant timestamp;

    public NewChatWasAddedEvent(Long chatId) {
        this.chatId = chatId;
        this.timestamp = Instant.now();
    }
}
