package com.goair.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.goair.entities.Passenger;

public interface PassengerRepository extends JpaRepository<Passenger, Integer> {
	List<Passenger> findByAgeGreaterThan(int age);
}
