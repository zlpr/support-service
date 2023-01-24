package com.example.supportservice.domain.user.core.ports.outgoing;


import com.example.supportservice.domain.user.core.model.User;
import com.example.supportservice.domain.user.core.model.UserIdentifier;

public interface UserDatabase {
    UserIdentifier save(User user);
}
