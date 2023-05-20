package com.zomota.dto;

import java.util.Date;

import com.zomota.form.Coupon;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class BookingDto {
	private String referenceNo;
	private String restaurantName;
	private Date bookingDate;
	private String timeslot;
	private String contactPerson;
	private String contactNo;
	private Coupon coupon;
}
