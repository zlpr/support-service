package com.example.supportservice.domain.letter.core.ports.outgoing;

import com.example.supportservice.domain.letter.core.model.NewLetterWasAddedEvent;

public interface LetterEventPublisher {
    void publish(NewLetterWasAddedEvent event);
}
