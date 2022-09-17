package com.lettieri.application.notification.notificationGateway.services;

import com.lettieri.application.notification.notificationGateway.config.TwilioConfig;
import com.lettieri.application.notification.notificationGateway.model.NotificationRequest;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;

@AllArgsConstructor
public class SmsService extends GatewayService {

    private TwilioConfig twilioConfig;

    @Override
    public void send(NotificationRequest notificationRequest) {
        Twilio.init(twilioConfig.getSid(), twilioConfig.getPassword());
        Message.creator(new PhoneNumber(notificationRequest.getPhoneNumber()),
                new PhoneNumber("+16187875031"), notificationRequest.getNotificationContent()).create();
    }
}
