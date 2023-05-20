package com.goair2.service;

import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.goair2.dto.TripDto;
import com.goair2.repositories.TripRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class TripService {
	private final TripRepository tripRepository;

	@Transactional(readOnly = true)
	public List<TripDto> getAvailableTrips(Date prefferedDate) {
		return tripRepository.findByPlannedDateGreaterThan(prefferedDate).stream().map(entity -> {
			TripDto dto = TripDto.of().tripNo(entity.getTripNo()).tripName(entity.getTripName())
					.source(entity.getSource()).destination(entity.getDestination())
					.plannedDate(entity.getPlannedDate()).estimatedCost(entity.getEstimatedCost()).build();
			return dto;
		}).toList();
	}
}
