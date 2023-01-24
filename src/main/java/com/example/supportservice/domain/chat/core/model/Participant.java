package com.example.supportservice.domain.chat.core.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;

import javax.persistence.*;
import java.util.Set;

@EqualsAndHashCode
@AllArgsConstructor
@Data
@Entity
@Table(name = "participant")
public class Participant {
    @Id
    private Long id;
    @OneToMany(mappedBy = "participant")
    private Set<ParticipantChat> participantChat;
    @OneToMany(mappedBy = "participant")
    private Set<Comment> comments;


    public Participant(Long id) {
        this.id = id;
    }

    public Participant() {

    }
}
