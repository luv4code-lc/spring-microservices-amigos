package com.luv4code.customer.app.service;

import com.luv4code.customer.app.repository.CustomerRepository;
import com.luv4code.customer.app.web.ui.model.Customer;
import com.luv4code.customer.app.web.ui.model.request.CustomerRegistrationRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CustomerService {

    private final CustomerRepository customerRepository;

    public void registerCustomer(CustomerRegistrationRequest request) {
        Customer customer = Customer.builder()
                .firstName(request.getFirstName())
                .lastName(request.getLastName())
                .email(request.getEmail())
                .build();
        customerRepository.save(customer);
    }
}
