package com.luv4code.clients.notification;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
public class NotificationRequest {
    private Integer toCustomerId;
    private String toCustomerName;
    private String message;

    public Integer toCustomerId() {
        return toCustomerId;
    }

    public String toCustomerName() {
        return toCustomerName;
    }

    public String message() {
        return message;
    }
}
