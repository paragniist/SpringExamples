package com.goair.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.goair.dto.PassengerDto;
import com.goair.repositories.PassengerRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class PassengerService {
	private final PassengerRepository passengerRepository;

	@Transactional(readOnly = true)
	public List<PassengerDto> getPassengersByAge(int age) {
		return passengerRepository.findByAgeGreaterThan(age).stream().map(PassengerDto::toPassengerDto).toList();
	}
}
