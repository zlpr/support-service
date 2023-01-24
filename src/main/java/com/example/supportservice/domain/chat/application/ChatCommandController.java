package com.example.supportservice.domain.chat.application;

import com.example.supportservice.domain.chat.core.command.AddChatCommand;
import com.example.supportservice.domain.chat.core.command.AddCommentCommand;
import com.example.supportservice.domain.chat.core.ports.incoming.AddComment;
import com.example.supportservice.domain.chat.core.ports.incoming.AddNewChat;
import com.example.supportservice.domain.chat.core.ports.incoming.CloseChat;
import com.example.supportservice.domain.user.core.model.AddUserCommand;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/chat")
@AllArgsConstructor
public class ChatCommandController {

    private final AddNewChat addNewChat;
    private final AddComment addComment;
    private final CloseChat closeChat;

    @GetMapping
    public ResponseEntity<String> addChat(){
        return new ResponseEntity<>("New chat was added", HttpStatus.OK);
    }


    @PostMapping
    public ResponseEntity<String> addChat(@RequestBody AddChatCommand addChatCommand){
        System.out.println(addChatCommand);
        addNewChat.handle(addChatCommand);
        return new ResponseEntity<>("New chat was added", HttpStatus.CREATED);
    }

    @PostMapping("/comment")
    public ResponseEntity<String> addChat(@RequestBody AddCommentCommand addCommentCommand){
        System.out.println(addCommentCommand);
        addComment.handle(addCommentCommand);
        return new ResponseEntity<>("New comment was added", HttpStatus.CREATED);
    }





}
