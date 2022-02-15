package com.example.demo.model.dto;

import java.time.LocalDate;

import com.example.demo.model.PassengerInfo;
import com.example.demo.model.PaymentInfo;
import com.fasterxml.jackson.annotation.JsonFormat;

public class BookingRequest {

	 private String name;
	 private String email;
	 private String source;
	 private String destination;
	 @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
	 private LocalDate travelDate;
	 private double fare;
	 private String accountNo;
	 private String cardType;
	 
	 
	public BookingRequest() {
		super();
	}
	public BookingRequest(String name, String email, String source, String destination, LocalDate travelDate,
			double fare, String accountNo, String cardType) {
		super();
		this.name = name;
		this.email = email;
		this.source = source;
		this.destination = destination;
		this.travelDate = travelDate;
		this.fare = fare;
		this.accountNo = accountNo;
		this.cardType = cardType;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public LocalDate getTravelDate() {
		return travelDate;
	}
	public void setTravelDate(LocalDate travelDate) {
		this.travelDate = travelDate;
	}
	public double getFare() {
		return fare;
	}
	public void setFare(double fare) {
		this.fare = fare;
	}
	public String getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}
	public String getCardType() {
		return cardType;
	}
	public void setCardType(String cardType) {
		this.cardType = cardType;
	}
	
	@Override
	public String toString() {
		return "BookingRequest [name=" + name + ", email=" + email + ", source=" + source + ", destination="
				+ destination + ", travelDate=" + travelDate + ", fare=" + fare + ", accountNo=" + accountNo
				+ ", cardType=" + cardType + "]";
	}	 
}
