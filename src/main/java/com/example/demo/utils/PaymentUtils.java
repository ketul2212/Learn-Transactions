package com.example.demo.utils;

import java.util.HashMap;
import java.util.Map;

import com.example.demo.exception.InsufficientAmountException;

public class PaymentUtils {

	private static Map<String, Double> usersMap = new HashMap<String, Double>();
	
	static {
		usersMap.put("101", 10000.0);
		usersMap.put("102", 8000.0);
		usersMap.put("103", 5000.0);
		usersMap.put("104", 100.0);
		usersMap.put("105", 1200.0);
	}

	public static boolean validateCreditLimit(String accountNo, Double paidAmount) {
		if (paidAmount > usersMap.get(accountNo))
            throw new InsufficientAmountException("Insufficient fund..!");
        return true;
	}
	
	
}
