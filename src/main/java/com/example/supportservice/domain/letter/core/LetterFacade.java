package com.example.supportservice.domain.letter.core;

import com.example.supportservice.domain.letter.core.model.*;
import com.example.supportservice.domain.letter.core.ports.incoming.AddNewLetter;
import com.example.supportservice.domain.letter.core.ports.outgoing.LetterDatabase;

import com.example.supportservice.domain.letter.core.ports.outgoing.LetterEventPublisher;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class LetterFacade implements AddNewLetter {

    private final LetterDatabase database;
    private final LetterEventPublisher eventPublisher;

    @Override
    public LetterIdentifier handle(AddLetterCommand addLetterCommand) {

        return null;
    }
}
