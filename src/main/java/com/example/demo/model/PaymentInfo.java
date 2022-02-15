package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class PaymentInfo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long paymantId;
	private String accountNo;
    private double amount;
    private String cardType;
    @OneToOne
    private PassengerInfo passengerInfo;
    

	public PaymentInfo() {
		super();
	}
	
	public PaymentInfo(String accountNo, double amount, String cardType, PassengerInfo passengerInfo) {
		super();
		this.accountNo = accountNo;
		this.amount = amount;
		this.cardType = cardType;
		this.passengerInfo = passengerInfo;
	}

	public long getPaymantId() {
		return paymantId;
	}

	public void setPaymantId(long paymantId) {
		this.paymantId = paymantId;
	}

	public String getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public String getCardType() {
		return cardType;
	}

	public void setCardType(String cardType) {
		this.cardType = cardType;
	}

	public PassengerInfo getPassengerInfo() {
		return passengerInfo;
	}

	public void setPassengerInfo(PassengerInfo passengerInfo) {
		this.passengerInfo = passengerInfo;
	}

	
}
