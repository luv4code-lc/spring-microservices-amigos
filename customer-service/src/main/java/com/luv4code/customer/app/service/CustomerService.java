package com.luv4code.customer.app.service;

import com.luv4code.customer.app.web.ui.model.Customer;
import com.luv4code.customer.app.web.ui.model.request.CustomerRegistrationRequest;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {
    public void registerCustomer(CustomerRegistrationRequest request) {
        Customer customer = Customer.builder()
                .firstName(request.getFirstName())
                .lastName(request.getLastName())
                .email(request.getEmail())
                .build();
    }
}
