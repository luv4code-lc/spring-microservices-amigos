package com.luv4code.customer.app.repository;

import com.luv4code.customer.app.web.ui.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
