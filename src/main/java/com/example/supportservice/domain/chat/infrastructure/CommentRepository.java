package com.example.supportservice.domain.chat.infrastructure;

import com.example.supportservice.domain.chat.core.model.Comment;
import org.springframework.data.repository.CrudRepository;

public interface CommentRepository extends CrudRepository<Comment,Long> {
}
