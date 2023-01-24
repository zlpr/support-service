package com.example.supportservice.domain.user.infrastructure;

import com.example.supportservice.domain.user.core.model.User;
import com.example.supportservice.domain.user.core.model.UserIdentifier;
import com.example.supportservice.domain.user.core.ports.outgoing.UserDatabase;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class UserDatabaseAdapter implements UserDatabase {

    private final UserRepository userRepository;

    @Override
    public UserIdentifier save(User user) {
        User savedUser = userRepository.save(user);
        return new UserIdentifier(savedUser.getIdentifierAsLong());
    }
}
