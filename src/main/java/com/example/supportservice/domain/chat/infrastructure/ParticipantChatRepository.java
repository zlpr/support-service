package com.example.supportservice.domain.chat.infrastructure;

import com.example.supportservice.domain.chat.core.model.ParticipantChat;
import com.example.supportservice.domain.chat.core.model.ParticipantChatKey;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ParticipantChatRepository extends JpaRepository<ParticipantChat, ParticipantChatKey> {
}
