package com.luv4code.customer.app.web.ui.model.request;

import lombok.Builder;
import lombok.Data;

@Data
public class CustomerRegistrationRequest {
    private String firstName;
    private String lastName;
    private String email;
}
