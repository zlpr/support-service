package com.example.supportservice.domain.email.core;



import com.example.supportservice.domain.email.core.model.Notification;
import com.example.supportservice.domain.email.core.model.SendNotificationCommand;
import com.example.supportservice.domain.email.core.ports.incoming.SendNotificationEmail;
import com.example.supportservice.domain.email.core.ports.outgoing.EmailDatabase;
import com.example.supportservice.domain.email.core.ports.outgoing.EmailSender;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class EmailFacade implements SendNotificationEmail {

    private final EmailSender emailSender;
    private final EmailDatabase database;

    @Override
    public void handle(SendNotificationCommand sendNotificationCommand) {



    }
}
