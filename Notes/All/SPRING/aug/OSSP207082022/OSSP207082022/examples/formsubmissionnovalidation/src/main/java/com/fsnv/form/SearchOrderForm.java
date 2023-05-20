package com.fsnv.form;

import java.time.LocalDate;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class SearchOrderForm {
	private String orderNo;
	private String customerName;
	@DateTimeFormat(pattern = "dd-MM-yyyy")
	private LocalDate fromDate;
	@DateTimeFormat(pattern = "dd-MM-yyyy")
	private LocalDate toDate;
	private String mobileNo;
	private String emailAddress;
}
