package com.example.supportservice.domain.chat.infrastructure;

import com.example.supportservice.domain.chat.core.model.Chat;
import com.example.supportservice.domain.chat.core.model.Comment;
import com.example.supportservice.domain.chat.core.model.Participant;
import com.example.supportservice.domain.chat.core.model.ParticipantChat;
import com.example.supportservice.domain.chat.core.ports.outgoing.ChatDatabase;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
@RequiredArgsConstructor
public class ChatDatabaseAdapter implements ChatDatabase {
   private final ChatRepository chatRepository;
   private final ParticipantRepository participantRepository;
   private final CommentRepository commentRepository;
   private final ParticipantChatRepository participantChatRepository;


    @Override
    public Chat save(Chat chat) {
        return chatRepository.save(chat);
    }

    @Override
    public Optional<Chat> findChat(Long id) {

        return chatRepository.findById(id);
    }

    @Override
    public Optional<Participant> findParticipantByIdAndChatId(Long id, Long chatId) {
        return participantRepository.findParticipantByIdAndChatId(id,chatId);
    }

    @Override
    public Participant save(Participant participant) {
        return participantRepository.save(participant);
    }

    @Override
    public Comment save(Comment comment) {
        return commentRepository.save(comment);
    }

    @Override
    public ParticipantChat save(ParticipantChat participantChat) {
        return participantChatRepository.save(participantChat);
    }
}
