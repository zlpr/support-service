package com.example.supportservice.domain.chat.core.ports.incoming;


import com.example.supportservice.domain.chat.core.command.CloseChatCommand;

public interface CloseChat {
    void handle(CloseChatCommand closeChatCommand);
}
