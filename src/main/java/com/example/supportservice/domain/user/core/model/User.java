package com.example.supportservice.domain.user.core.model;

import javax.persistence.*;
import lombok.EqualsAndHashCode;




@Entity
@Table(name="users")
@EqualsAndHashCode
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Exclude
    private Long id;

    @Embedded
    private Email email;

    @Embedded
    private Password password;

    @Column(name="first_name")
    private String firstName;

    @Column(name="last_name")
    private String lastName;

    public User(Email email, Password password, String firstName, String lastName) {
        this.email = email;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Long getIdentifierAsLong(){
        return id;
    }

    private User(){}
}
