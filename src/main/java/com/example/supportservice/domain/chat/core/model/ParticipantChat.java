package com.example.supportservice.domain.chat.core.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;

@Data
@EqualsAndHashCode
@Entity
@Table(name = "participant_chat")
public class ParticipantChat {
    @EmbeddedId
    private ParticipantChatKey id;
    @ManyToOne
    @MapsId("chatId")
    @JoinColumn(name = "chat_id")
    private Chat chat;
    @ManyToOne
    @MapsId("participantId")
    @JoinColumn(name = "participant_id")
    private  Participant participant;

    public ParticipantChat(Chat chat, Participant participant) {
        this.chat = chat;
        this.participant = participant;
        this.id = new ParticipantChatKey(chat.getId(),participant.getId());

    }

    public ParticipantChat() {

    }
}
