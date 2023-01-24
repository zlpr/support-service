package com.example.supportservice.domain.email.core.model;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class Notification {

    private final Email from;
    private final Email to;
    private final String subject;
    private final String content;

    public String getFromEmailAsString(){
        return this.from.getAsString();
    }

    public String getToEmailAsString(){
        return this.to.getAsString();
    }

    public String getSubjectAsString(){
        return this.subject;
    }

    public String getContentAsString(){
        return this.content;
    }
}
