package com.example.supportservice.domain.letter.core.model;

import java.time.Instant;

public class NewLetterWasAddedEvent {

    private final Long letterId;
    private final Instant timestamp;

    public NewLetterWasAddedEvent(Long letterId) {
        this.letterId = letterId;
        timestamp = Instant.now();
    }
}
