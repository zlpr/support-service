package com.example.supportservice.domain.chat.infrastructure;

import com.example.supportservice.domain.chat.core.event.NewChatWasAddedEvent;
import com.example.supportservice.domain.chat.core.event.NewCommentWasAddedEvent;
import com.example.supportservice.domain.chat.core.ports.outgoing.ChatEventPublisher;
import lombok.RequiredArgsConstructor;
import org.springframework.context.ApplicationEventPublisher;

@RequiredArgsConstructor
public class SpringChatEventPublisher implements ChatEventPublisher {

    private final ApplicationEventPublisher applicationEventPublisher;

    @Override
    public void publish(NewChatWasAddedEvent event) {
        applicationEventPublisher.publishEvent(event);
    }

    @Override
    public void publish(NewCommentWasAddedEvent event) {
        applicationEventPublisher.publishEvent(event);
    }
}
