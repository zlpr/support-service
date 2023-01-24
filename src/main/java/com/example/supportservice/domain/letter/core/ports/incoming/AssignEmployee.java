package com.example.supportservice.domain.letter.core.ports.incoming;

import com.example.supportservice.domain.letter.core.model.AssignEmployeeCommand;
import com.example.supportservice.domain.letter.core.model.LetterIdentifier;

public interface AssignEmployee {
    void handle(AssignEmployeeCommand assignEmployeeCommand);
}
