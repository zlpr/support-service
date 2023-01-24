package com.example.supportservice.domain.letter.core.model;

import java.time.Instant;

public class NewCommentWasAddedEvent {
    private final Long letterId;
    private final CommentId commentId;
    private final Instant timestamp;

    public NewCommentWasAddedEvent(Long letterId, CommentId commentId) {
        this.letterId = letterId;
        this.commentId = commentId;
        timestamp = Instant.now();
    }
}
