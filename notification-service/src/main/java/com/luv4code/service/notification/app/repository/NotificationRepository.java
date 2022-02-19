package com.luv4code.service.notification.app.repository;

import com.luv4code.service.notification.app.web.ui.model.Notification;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NotificationRepository extends JpaRepository<Notification, Integer> {
}
