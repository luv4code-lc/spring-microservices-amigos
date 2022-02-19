package com.luv4code.customer.app.shared;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
public class FraudCheckResponse {
    private Boolean isFraudster;

    public Boolean isFraudster() {
        return false;
    }
}
