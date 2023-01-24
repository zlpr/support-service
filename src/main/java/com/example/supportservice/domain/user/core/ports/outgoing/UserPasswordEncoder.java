package com.example.supportservice.domain.user.core.ports.outgoing;

public interface UserPasswordEncoder {
    String encode(String str);
}
