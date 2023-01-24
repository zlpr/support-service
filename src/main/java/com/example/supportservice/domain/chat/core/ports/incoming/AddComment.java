package com.example.supportservice.domain.chat.core.ports.incoming;


import com.example.supportservice.domain.chat.core.command.AddCommentCommand;

public interface AddComment {
    void handle(AddCommentCommand addCommentCommand);

}
