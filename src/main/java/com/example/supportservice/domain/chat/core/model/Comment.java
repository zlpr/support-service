package com.example.supportservice.domain.chat.core.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.time.Instant;

@EqualsAndHashCode
@Data
@Entity
@Table(name = "comment")
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    private Chat chat;
    @ManyToOne
    private Participant participant;
    private String message;
    private Instant instant;

    public Comment(Chat chat, Participant participant, String message) {
        this.chat = chat;
        this.participant = participant;
        this.message = message;
        this.instant = Instant.now();
    }


    public Comment() {

    }
}
