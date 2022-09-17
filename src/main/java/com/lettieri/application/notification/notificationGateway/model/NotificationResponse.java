package com.lettieri.application.notification.notificationGateway.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@Builder
public class NotificationResponse {
    String status;
    String statusDescription;
}
