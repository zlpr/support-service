package com.example.supportservice.infrastructure;

import com.example.supportservice.domain.chat.core.ChatFacade;
import com.example.supportservice.domain.chat.core.ports.incoming.AddComment;
import com.example.supportservice.domain.chat.core.ports.incoming.AddNewChat;
import com.example.supportservice.domain.chat.core.ports.incoming.CloseChat;
import com.example.supportservice.domain.chat.core.ports.outgoing.ChatDatabase;
import com.example.supportservice.domain.chat.core.ports.outgoing.ChatEventPublisher;
import com.example.supportservice.domain.chat.infrastructure.*;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.annotation.Bean;

public class ChatDomainConfig {
    @Bean
    public ChatDatabase chatDatabase(ChatRepository chatRepository,
                                     CommentRepository commentRepository,
                                     ParticipantRepository participantRepository,
                                     ParticipantChatRepository participantChatRepository){
        return new ChatDatabaseAdapter(chatRepository,participantRepository,commentRepository,participantChatRepository);
    }

    @Bean
    public ChatEventPublisher chatEventPublisher(ApplicationEventPublisher applicationEventPublisher){
        return new SpringChatEventPublisher(applicationEventPublisher);
    }

    @Bean
    public ChatFacade chatFacade(ChatDatabase chatDatabase,ChatEventPublisher chatEventPublisher){
        return new ChatFacade(chatDatabase,chatEventPublisher);
    }

    @Bean
    public AddNewChat addNewChat(ChatFacade chatFacade){
        return chatFacade;
    }

    @Bean
    public AddComment addComment(ChatFacade chatFacade){
        return chatFacade;
    }

    @Bean
    public CloseChat closeChat(ChatFacade chatFacade){
        return chatFacade;
    }
}
