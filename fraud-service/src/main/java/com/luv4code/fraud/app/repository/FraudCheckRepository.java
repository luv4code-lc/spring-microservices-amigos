package com.luv4code.fraud.app.repository;

import com.luv4code.fraud.app.web.ui.model.FraudCheckHistory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FraudCheckRepository extends JpaRepository<FraudCheckHistory, Integer> {
}
