package com.tourplanner.repositories;

import java.time.LocalDate;
import java.util.Collection;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.tourplanner.entities.BusinessTrip;
import com.tourplanner.entities.HolidayTrip;
import com.tourplanner.entities.QuickTrip;
import com.tourplanner.entities.Trip;

public interface TripRepository extends JpaRepository<Trip, Integer> {

	List<Trip> findBySource(String source);

	List<Trip> findBySourceIgnoreCase(String source);

	List<Trip> findBySourceAndDestination(String source, String destination);

	long countByDaysGreaterThan(int days);

	// List<Trip> findByEstimatedCostBetween(double minCost, double maxCost);

	List<Trip> findByPlannedDateAfter(LocalDate plannedDate);

	List<Trip> findBySourceIn(Collection<String> sources);

	List<Trip> findByTripNameLike(String tripName);

	List<Trip> findBySourceOrderByDays(String source);

	@Modifying
	@Query("update Trip trip set trip.source=:source, trip.destination=:dest where trip.tripNo=:tpNo")
	int updateTripSourceAndDestinationByTripNo(@Param("tpNo") int tripNo, @Param("source") String source,
			@Param("dest") String destination);

	List<QuickTrip> findByDaysGreaterThanEqual(int days);

	List<HolidayTrip> findByEstimatedCostBetween(double minCost, double maxCost);

	List<BusinessTrip> findByEstimatedCostGreaterThan(double estimatedCost);

	<T> List<T> findByTripNameLike(String tripName, Class<T> entityType);
}
