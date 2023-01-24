package com.example.supportservice.domain.chat.core.event;

import java.time.Instant;

public class NewCommentWasAddedEvent {

    private final Long chatId;
    private final Long commentId;
    private final Instant timestamp;

    public NewCommentWasAddedEvent(Long chatId, Long commentId) {
        this.chatId = chatId;
        this.commentId = commentId;
        this.timestamp = Instant.now();
    }
}
