package com.lettieri.application.notification.notificationGateway.services;

import com.lettieri.application.notification.notificationGateway.model.NotificationRequest;
import lombok.AllArgsConstructor;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Component;


@AllArgsConstructor
public class EmailService extends GatewayService{
    JavaMailSender emailSender;

    @Override
    public void send(NotificationRequest notificationRequest) {

        SimpleMailMessage message = new SimpleMailMessage();
        message.setTo(notificationRequest.getEmailAddress());
        message.setSubject(notificationRequest.getEmailSubject());
        message.setText(notificationRequest.getNotificationContent());
        emailSender.send(message);
    }

}
