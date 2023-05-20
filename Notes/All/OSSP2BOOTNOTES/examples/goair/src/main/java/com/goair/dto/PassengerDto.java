package com.goair.dto;

import com.goair.entities.Passenger;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class PassengerDto {
	private int passengerNo;
	private String fullname;

	public static PassengerDto toPassengerDto(Passenger passenger) {
		return new PassengerDto(passenger.getPassengerNo(), passenger.getFullname());
	}
}
