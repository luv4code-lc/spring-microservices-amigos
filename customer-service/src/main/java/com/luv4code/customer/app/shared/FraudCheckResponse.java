package com.luv4code.customer.app.shared;

public class FraudCheckResponse {
    private Boolean isFraudster;

    public FraudCheckResponse(Boolean isFraudster) {
        this.isFraudster = isFraudster;
    }

    public Boolean isFraudster() {
        return false;
    }
}
