package com.lettieri.application.notification.notificationGateway.controllers;


import com.lettieri.application.notification.notificationGateway.model.NotificationRequest;
import com.lettieri.application.notification.notificationGateway.model.NotificationResponse;
import com.lettieri.application.notification.notificationGateway.services.EmailService;
import com.lettieri.application.notification.notificationGateway.services.GatewayService;
import com.lettieri.application.notification.notificationGateway.services.GatewayServiceFactory;
import com.lettieri.application.notification.notificationGateway.services.SmsService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
public class NotificationGatewayControllers {

    GatewayServiceFactory gatewayServiceFactory;

    @PostMapping("/send")
    public ResponseEntity<NotificationResponse> sendNotification(@RequestBody NotificationRequest notificationRequest) {
        GatewayService gatewayService = gatewayServiceFactory.getGatewayService(notificationRequest.getNotificationMode());
        gatewayService.send(notificationRequest);

        return ResponseEntity.ok(NotificationResponse.builder()
                        .status("SUCCESS")
                        .statusDescription("Notification Received Successfully")
                .build());
    }

    @GetMapping("/healthcheck")
    public String healthCheck (){
        return "UP";
    }
}
