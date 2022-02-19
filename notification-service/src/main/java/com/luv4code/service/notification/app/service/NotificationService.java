package com.luv4code.service.notification.app.service;

import com.luv4code.clients.notification.NotificationRequest;
import com.luv4code.service.notification.app.repository.NotificationRepository;
import com.luv4code.service.notification.app.web.ui.model.Notification;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
@RequiredArgsConstructor
public class NotificationService {

    private final NotificationRepository notificationRepository;

    public void send(NotificationRequest notificationRequest) {
        notificationRepository.save(
                Notification.builder()
                        .toCustomerId(notificationRequest.getToCustomerId())
                        .toCustomerEmail(notificationRequest.getToCustomerName())
                        .sender("Luv4code")
                        .message(notificationRequest.getMessage())
                        .sentAt(LocalDateTime.now())
                        .build()
        );
    }
}
