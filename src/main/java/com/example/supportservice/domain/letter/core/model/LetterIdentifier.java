package com.example.supportservice.domain.letter.core.model;


public class LetterIdentifier {

    private final Long id;

    public LetterIdentifier(Long id) {
        this.id = id;
    }

    public Long getId(){
        return id;
    }
}
