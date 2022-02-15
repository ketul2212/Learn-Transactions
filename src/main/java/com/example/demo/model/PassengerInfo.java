package com.example.demo.model;

import java.time.LocalDate;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
public class PassengerInfo {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long pId;
    private String name;
    private String email;
    private String source;
    private String destination;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
    private LocalDate travelDate;
    private double fare;
    
	public PassengerInfo() {
		super();
	}

	public PassengerInfo(String name, String email, String source, String destination, LocalDate travelDate,
			double fare) {
		super();
		this.name = name;
		this.email = email;
		this.source = source;
		this.destination = destination;
		this.travelDate = travelDate;
		this.fare = fare;
	}



	public long getpId() {
		return pId;
	}

	public void setpId(long pId) {
		this.pId = pId;
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

	@Override
	public String toString() {
		return "PassangerInfo [pId=" + pId + ", name=" + name + ", email=" + email + ", source=" + source
				+ ", destination=" + destination + ", travelDate=" + travelDate + ", fare=" + fare + "]";
	}
}
