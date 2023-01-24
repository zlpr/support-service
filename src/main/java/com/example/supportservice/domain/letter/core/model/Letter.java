package com.example.supportservice.domain.letter.core.model;

import java.util.List;

public class Letter {
    private Long Id;

    private Email email;

    private Message message;

    private List<Comment> comments;

    public Letter(Email email, Message message, List<Comment> comments) {
        this.email = email;
        this.message = message;
        this.comments = comments;
    }

    public Long getId(){
        return Id;
    }

    private Letter(){}
}
