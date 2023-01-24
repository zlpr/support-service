package com.example.supportservice.domain.letter.core.model;

import lombok.EqualsAndHashCode;

@EqualsAndHashCode
public class ProcessingLetter {
    private Long letterId;
    private Long employeeId;

    public Long getId() {
        return letterId;
    }
}
