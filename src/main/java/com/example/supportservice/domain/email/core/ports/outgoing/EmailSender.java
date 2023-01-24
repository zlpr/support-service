package com.example.supportservice.domain.email.core.ports.outgoing;


import com.example.supportservice.domain.email.core.model.Notification;

public interface EmailSender {
    void sendNotificationEmail(Notification notificationEmail);
}
