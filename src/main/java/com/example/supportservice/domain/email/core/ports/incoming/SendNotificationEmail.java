package com.example.supportservice.domain.email.core.ports.incoming;


import com.example.supportservice.domain.email.core.model.SendNotificationCommand;

public interface SendNotificationEmail {
    void handle(SendNotificationCommand sendNotificationCommand);
}
