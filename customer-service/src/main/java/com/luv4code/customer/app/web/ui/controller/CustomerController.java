package com.luv4code.customer.app.web.ui.controller;

import com.luv4code.customer.app.service.CustomerService;
import com.luv4code.customer.app.web.ui.model.request.CustomerRegistrationRequest;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api/v1/customers")
@RestController
@Slf4j
@RequiredArgsConstructor
public class CustomerController {

    private final CustomerService customerService;

    @PostMapping
    public void registerCustomer(@RequestBody CustomerRegistrationRequest customerRegistrationRequest) {
        log.info("new customer registration {}", customerRegistrationRequest);
        customerService.registerCustomer(customerRegistrationRequest);
    }
}
