package com.jbv.test;

import java.util.Date;
import java.util.Set;

import com.jbv.beans.Trip;

import jakarta.validation.ConstraintViolation;
import jakarta.validation.Validation;
import jakarta.validation.Validator;
import jakarta.validation.ValidatorFactory;

public class JBVTest {
	public static void main(String[] args) {
		Trip trip = Trip.builder().tripNo(-937).source("Hyd").destination("Banglore").tripPlannedDate(new Date())
				.tripName("Piligrimate South").amount(-100).build();

		ValidatorFactory validatorFactory = Validation.buildDefaultValidatorFactory();
		Validator validator = validatorFactory.getValidator();

		Set<ConstraintViolation<Trip>> constraintViolations = validator.validate(trip);
		for (ConstraintViolation<Trip> constraintViolation : constraintViolations) {
			System.out.println(constraintViolation.getMessage());
		}

	}
}
