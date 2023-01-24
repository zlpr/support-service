package com.example.supportservice.domain.user.core;

import com.example.supportservice.domain.user.core.model.*;
import com.example.supportservice.domain.user.core.ports.incoming.AddNewUser;
import com.example.supportservice.domain.user.core.ports.outgoing.UserPasswordEncoder;
import com.example.supportservice.domain.user.core.ports.outgoing.UserDatabase;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class UserFacade implements AddNewUser {

    private final UserDatabase database;
    private final UserPasswordEncoder userPasswordEncoder;

    @Override
    public UserIdentifier handle(AddUserCommand addUserCommand) {
        User user = new User(
                new Email(addUserCommand.getEmail()),
                new Password(userPasswordEncoder.encode(addUserCommand.getPassword())),
                addUserCommand.getFirstName(),
                addUserCommand.getLastName()
        );
        return database.save(user);
    }
}
