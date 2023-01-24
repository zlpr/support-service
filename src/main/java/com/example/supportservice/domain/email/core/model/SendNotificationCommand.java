package com.example.supportservice.domain.email.core.model;

import lombok.Getter;

@Getter
public class SendNotificationCommand {

    private final Long reservationId;
    private final Long userId;
    private final Long bookId;

    public SendNotificationCommand(Long reservationId, Long userId, Long bookId) {
        this.reservationId = reservationId;
        this.userId = userId;
        this.bookId = bookId;
    }
}
