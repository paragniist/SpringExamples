package com.zomota.form;

import java.util.Date;

import javax.validation.constraints.Email;
import javax.validation.constraints.FutureOrPresent;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import org.springframework.format.annotation.DateTimeFormat;

import com.zomota.formatter.annotation.CouponCode;

import lombok.Data;

@Data
public class BookTableForm {
	@NotBlank
	private String customerName;
	@Min(value = 2)
	@Max(value = 30)
	private int persons;
	@FutureOrPresent
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	private Date reservationDate;
	@NotBlank
	private String timeslot;
	@NotBlank
	private String restaurantName;
	@NotBlank
	private String contactNo;
	@Email
	private String emailAddress;
	private String additionalNotes;
	@NotNull
	@CouponCode(type = "partner")
	private Coupon coupon;
}
