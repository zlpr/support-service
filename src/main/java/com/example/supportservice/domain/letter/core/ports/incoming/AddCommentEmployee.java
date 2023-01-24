package com.example.supportservice.domain.letter.core.ports.incoming;

import com.example.supportservice.domain.letter.core.model.AddCommentCommand;
import com.example.supportservice.domain.letter.core.model.CommentId;

public interface AddCommentEmployee {
    CommentId handle(AddCommentCommand addCommentCommand);
}
