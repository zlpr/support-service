package com.example.supportservice.domain.chat.core.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
@Data
@EqualsAndHashCode
@AllArgsConstructor
public class ParticipantChatKey implements Serializable {
    @Column(name = "participan_id")
    private Long participantId;
    @Column(name = "chat_id")
    private Long chatId;

    public ParticipantChatKey() {

    }
}
