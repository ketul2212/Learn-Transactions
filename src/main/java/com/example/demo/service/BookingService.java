package com.example.demo.service;

import java.util.UUID;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.PassengerInfo;
import com.example.demo.model.PaymentInfo;
import com.example.demo.model.dto.BookingRequest;
import com.example.demo.model.dto.BookingResponse;
import com.example.demo.repo.PassengerInfoRepo;
import com.example.demo.repo.PaymentInfoRepo;
import com.example.demo.utils.PaymentUtils;

@Service
public class BookingService {
	
	@Autowired
	private PassengerInfoRepo passengerInfoRepo;
	
	@Autowired
	private PaymentInfoRepo paymantInfoRepo;

	@Transactional
	public BookingResponse bookTicket(BookingRequest request) {
		
		PassengerInfo passengerInfo = new PassengerInfo();
		passengerInfo.setName(request.getName());
		passengerInfo.setEmail(request.getEmail());
		passengerInfo.setSource(request.getSource());
		System.out.println(request.getDestination());
		passengerInfo.setDestination(request.getDestination());
		passengerInfo.setTravelDate(request.getTravelDate());
		passengerInfo.setFare(request.getFare());
        passengerInfo = passengerInfoRepo.save(passengerInfo);

        PaymentInfo paymentInfo = new PaymentInfo();
        paymentInfo.setAccountNo(request.getAccountNo());
        paymentInfo.setAmount(passengerInfo.getFare());
        paymentInfo.setCardType(request.getCardType());
        paymentInfo.setPassengerInfo(passengerInfo);
        
        PaymentUtils.validateCreditLimit(paymentInfo.getAccountNo(), passengerInfo.getFare());
        paymantInfoRepo.save(paymentInfo);
        
        return new BookingResponse("SUCCESS", passengerInfo.getFare(), UUID.randomUUID().toString().split("-")[0], passengerInfo);

    }
}