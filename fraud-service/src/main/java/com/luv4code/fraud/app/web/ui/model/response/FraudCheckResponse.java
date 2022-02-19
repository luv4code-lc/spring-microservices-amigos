package com.luv4code.fraud.app.web.ui.model.response;

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
