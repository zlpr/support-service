package com.example.supportservice.domain.letter.core.ports.incoming;


import com.example.supportservice.domain.letter.core.model.AddLetterCommand;
import com.example.supportservice.domain.letter.core.model.LetterIdentifier;

public interface AddNewLetter {
    LetterIdentifier handle(AddLetterCommand addLetterCommand);
}
