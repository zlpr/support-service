package com.example.supportservice.domain.email.core.ports.outgoing;

import java.util.Optional;

public interface EmailDatabase {
    Optional<String> getTitleByBookId(Long bookId);
    Optional<String> getUserEmailAddress(Long userId);
}
