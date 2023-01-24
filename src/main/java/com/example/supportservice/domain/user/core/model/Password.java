package com.example.supportservice.domain.user.core.model;

import lombok.EqualsAndHashCode;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
@EqualsAndHashCode
public class Password {

    @Column(name = "password")
    private String value;

    public Password(String value) {
        this.value = value;
    }

    private Password() {
    }
}
