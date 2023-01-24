package com.example.supportservice.domain.chat.core.ports.outgoing;

import com.example.supportservice.domain.chat.core.event.NewChatWasAddedEvent;
import com.example.supportservice.domain.chat.core.event.NewCommentWasAddedEvent;

public interface ChatEventPublisher {
    void publish(NewChatWasAddedEvent event);
    void publish(NewCommentWasAddedEvent event);
}
