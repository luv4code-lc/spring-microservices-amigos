package com.luv4code.customer.app.service;

import com.luv4code.clients.fraud.FraudCheckResponse;
import com.luv4code.clients.fraud.FraudClient;
import com.luv4code.clients.notification.NotificationClient;
import com.luv4code.clients.notification.NotificationRequest;
import com.luv4code.customer.app.repository.CustomerRepository;
import com.luv4code.customer.app.web.ui.model.Customer;
import com.luv4code.customer.app.web.ui.model.request.CustomerRegistrationRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@RequiredArgsConstructor
public class CustomerService {

    private final CustomerRepository customerRepository;
    private final RestTemplate restTemplate;
    private final FraudClient fraudClient;
    private final NotificationClient notificationClient;

    public void registerCustomer(CustomerRegistrationRequest request) {
        Customer customer = Customer.builder()
                .firstName(request.getFirstName())
                .lastName(request.getLastName())
                .email(request.getEmail())
                .build();
        customerRepository.saveAndFlush(customer);

        FraudCheckResponse fraudCheckResponse = fraudClient.isFraudster(customer.getId());
        if (fraudCheckResponse.isFraudster()) {
            throw new IllegalStateException("fraudster");
        }

        notificationClient.sendNotification(
                new NotificationRequest(
                        customer.getId(),
                        customer.getEmail(),
                        String.format("Hi %s, Welcome to Luv4code....", customer.getFirstName())
                )
        );
    }
}
