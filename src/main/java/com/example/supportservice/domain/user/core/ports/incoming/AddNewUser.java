package com.example.supportservice.domain.user.core.ports.incoming;


import com.example.supportservice.domain.user.core.model.AddUserCommand;
import com.example.supportservice.domain.user.core.model.UserIdentifier;

public interface AddNewUser {
    UserIdentifier handle(AddUserCommand addUserCommand);
}
