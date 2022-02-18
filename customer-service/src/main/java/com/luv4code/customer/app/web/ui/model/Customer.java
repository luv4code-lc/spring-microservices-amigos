package com.luv4code.customer.app.web.ui.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Customer {
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
}
