package com.goair2.repositories;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.goair2.entities.Trip;

public interface TripRepository extends JpaRepository<Trip, Integer> {
	List<Trip> findByPlannedDateGreaterThan(Date date);
}
