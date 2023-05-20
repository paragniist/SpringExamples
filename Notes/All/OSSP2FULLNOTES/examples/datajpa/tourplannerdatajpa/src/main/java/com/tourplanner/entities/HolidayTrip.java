package com.tourplanner.entities;

import org.springframework.beans.factory.annotation.Value;

public interface HolidayTrip {
	@Value("#{target.source}")
	String getFromSource();

	@Value("#{target.destination}")
	String getToDestination();

	@Value("#{target.days}")
	int getVacationDays();
}
