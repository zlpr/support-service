package com.example.supportservice.domain.chat.core.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@EqualsAndHashCode
@Entity
@Data
@Table(name = "chat")
public class Chat {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Enumerated(EnumType.STRING)
    private Status status;
    @OneToMany(mappedBy = "chat")
    private Set<ParticipantChat> participantChat;
    @OneToMany(mappedBy = "chat")
    private Set<Comment> comments;

    public Chat(Status status) {
        this.status = status;
    }

    public Chat() {

    }

    public void closeChat(Long participantId) {
        participantChat.stream()
                .filter(e -> e.getParticipant().getId().equals(participantId))
                .findFirst()
                .ifPresent(e -> this.status = Status.CLOSED);
    }


}
