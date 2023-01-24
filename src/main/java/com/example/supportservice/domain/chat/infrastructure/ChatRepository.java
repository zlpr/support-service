package com.example.supportservice.domain.chat.infrastructure;

import com.example.supportservice.domain.chat.core.model.Chat;
import org.springframework.data.repository.CrudRepository;

public interface ChatRepository extends CrudRepository<Chat,Long> {
}
