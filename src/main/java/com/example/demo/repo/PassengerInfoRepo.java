package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.PassengerInfo;

public interface PassengerInfoRepo extends JpaRepository<PassengerInfo, Long> {

}
