package com.example.supportservice.domain.letter.core.model;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;

import java.time.Instant;

@EqualsAndHashCode
@AllArgsConstructor
public class Comment {
    private Long id;

    private Long userId;

    private Long chatId;

    private String value;

    private Instant instant;

    public Comment(Long userId, String value) {
        this.userId = userId;
        this.value = value;
        this.instant = Instant.now();
    }

    private Comment() {
    }
}
