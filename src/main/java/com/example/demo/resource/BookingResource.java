package com.example.demo.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.dto.BookingRequest;
import com.example.demo.model.dto.BookingResponse;
import com.example.demo.service.BookingService;

@RestController
public class BookingResource {
	
	@Autowired
	private BookingService bookingService;

	@PostMapping("/bookingTicket")
	public BookingResponse bookFlightTicket(@RequestBody BookingRequest request){
		return bookingService.bookTicket(request);
	}

}
