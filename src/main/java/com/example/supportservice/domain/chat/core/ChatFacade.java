package com.example.supportservice.domain.chat.core;

import com.example.supportservice.domain.chat.core.command.AddChatCommand;
import com.example.supportservice.domain.chat.core.command.CloseChatCommand;
import com.example.supportservice.domain.chat.core.command.AddCommentCommand;
import com.example.supportservice.domain.chat.core.event.NewChatWasAddedEvent;
import com.example.supportservice.domain.chat.core.event.NewCommentWasAddedEvent;
import com.example.supportservice.domain.chat.core.model.*;
import com.example.supportservice.domain.chat.core.ports.incoming.AddComment;
import com.example.supportservice.domain.chat.core.ports.incoming.AddNewChat;
import com.example.supportservice.domain.chat.core.ports.incoming.CloseChat;
import com.example.supportservice.domain.chat.core.ports.outgoing.ChatDatabase;
import com.example.supportservice.domain.chat.core.ports.outgoing.ChatEventPublisher;
import lombok.AllArgsConstructor;

import java.util.Set;

@AllArgsConstructor
public class ChatFacade implements AddComment, AddNewChat, CloseChat {
    private final ChatDatabase database;
    private final ChatEventPublisher publisher;

    @Override
    public void handle(AddCommentCommand addCommentCommand) {
        var chat = database.findChat(addCommentCommand.getChatId()).orElseThrow();
        var participant = database.findParticipantByIdAndChatId(
                addCommentCommand.getParticipantId(),
                addCommentCommand.getChatId()).orElseThrow(() -> new RuntimeException(""));
        var comment = database.save(new Comment(chat, participant,
                addCommentCommand.getComment()));
        publisher.publish(new NewCommentWasAddedEvent(chat.getId(), comment.getId()));
    }

    @Override
    public void handle(AddChatCommand addChatCommand) {
        var chat = database.save(new Chat(Status.NEW));
        if (chat.getParticipantChat()!= null && chat.getParticipantChat().size() >= 2){
            throw new RuntimeException("");
        }
        var participant = database.save(new Participant(addChatCommand.getParticipantId()));
        var participantChat = database.save(new ParticipantChat(chat,participant));

        System.out.println(participantChat);
        publisher.publish(new NewChatWasAddedEvent(chat.getId()));
    }

    @Override
    public void handle(CloseChatCommand closeChatCommand) {
        var chat = database.findChat(closeChatCommand.getChatId()).orElseThrow();
        if (contains(chat.getParticipantChat(), closeChatCommand.getParticipantId())) {
            chat.closeChat(closeChatCommand.getParticipantId());
        }
    }

    private boolean contains(Set<ParticipantChat> participants, Long participantId) {
        return participants.stream()
                .anyMatch(e -> e.getParticipant().getId().equals(participantId));
    }
}
