package com.example.supportservice.domain.chat.core.ports.incoming;


import com.example.supportservice.domain.chat.core.command.AddChatCommand;

public interface AddNewChat {
    void handle(AddChatCommand addChatCommand);
}
