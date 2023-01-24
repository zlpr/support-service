package com.example.supportservice.domain.user.infrastructure;

import com.example.supportservice.domain.user.core.ports.outgoing.UserPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class UserPasswordEncoderAdapter implements UserPasswordEncoder {

    private final PasswordEncoder passwordEncoder;

    @Override
    public String encode(String str) {
        return passwordEncoder.encode(str);
    }
}
