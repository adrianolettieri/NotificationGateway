package com.lettieri.application.notification.notificationGateway.services;

import com.lettieri.application.notification.notificationGateway.model.NotificationRequest;

public abstract class GatewayService {
    public abstract void send(NotificationRequest notificationRequest);
}
