package com.lettieri.application.notification.notificationGateway.config;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Configuration
public class TwilioConfig {

    @Value("${twilio.sid}")
    String sid;
    @Value("${twilio.password}")
    String password;
}
