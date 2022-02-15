package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.PaymentInfo;

public interface PaymentInfoRepo extends JpaRepository<PaymentInfo, Long>{

}
