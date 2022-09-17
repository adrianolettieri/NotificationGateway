package com.lettieri.application.notification.notificationGateway.services;

import com.lettieri.application.notification.notificationGateway.config.TwilioConfig;
import com.lettieri.application.notification.notificationGateway.model.NotificationMode;
import lombok.AllArgsConstructor;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class GatewayServiceFactory {
    JavaMailSender emailSender;
    TwilioConfig twilioConfig;

    public GatewayService getGatewayService(NotificationMode notificationMode) {
        switch (notificationMode) {
            case EMAIL: return new EmailService(emailSender);
            case SMS: return new SmsService(twilioConfig);
            default: throw new IllegalArgumentException(
                    String.format("Notification Mode [%s] not supported",
                            notificationMode));
        }
    }
}
