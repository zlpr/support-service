package com.example.supportservice.domain.chat.core.command;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AddCommentCommand {
    private Long chatId;
    private Long participantId;
    private String comment;
}
