package com.luv4code.clients.notification;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
public class NotificationRequest {
    private Integer toCustomerId;
    private String toCustomerName;
    private String message;

    public Integer getToCustomerId() {
        return toCustomerId;
    }

    public String getToCustomerName() {
        return toCustomerName;
    }

    public String getMessage() {
        return message;
    }

}
