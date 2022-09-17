package com.lettieri.application.notification.notificationGateway.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class NotificationRequest {
    String customerId;
    NotificationMode notificationMode;
    String notificationContent;
    String emailAddress;
    String emailSubject;
    String phoneNumber;

}
