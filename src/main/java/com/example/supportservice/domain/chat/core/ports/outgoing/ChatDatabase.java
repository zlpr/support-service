package com.example.supportservice.domain.chat.core.ports.outgoing;


import com.example.supportservice.domain.chat.core.model.Chat;
import com.example.supportservice.domain.chat.core.model.Comment;
import com.example.supportservice.domain.chat.core.model.Participant;
import com.example.supportservice.domain.chat.core.model.ParticipantChat;

import java.util.Optional;

public interface ChatDatabase {
    Chat save(Chat chat);
    Optional<Chat> findChat(Long id);
    Optional<Participant> findParticipantByIdAndChatId(Long id, Long chatId);
    Participant save(Participant participant);
    Comment save(Comment comment);
    ParticipantChat save (ParticipantChat participantChat);




}
