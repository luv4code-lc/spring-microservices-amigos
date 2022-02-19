package com.luv4code.clients.notification;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "notification-service", url = "${clients.notification.url}")
public interface NotificationClient {

    @PostMapping("/api/v1/notification")
    public void sendNotification(NotificationRequest notificationRequest);

}
