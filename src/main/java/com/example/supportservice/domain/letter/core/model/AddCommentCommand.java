package com.example.supportservice.domain.letter.core.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AddCommentCommand {
    private Long letterId;

    private Long participantId;

    private String comment;
}
