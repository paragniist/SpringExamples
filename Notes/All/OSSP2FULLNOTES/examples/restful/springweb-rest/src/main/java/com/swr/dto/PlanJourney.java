package com.swr.dto;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Data;

@Data
public class PlanJourney {
	String source;
	String destination;
	int trainNo;
	@JsonFormat(pattern = "yyyy-MM-dd")
	Date journeyDate;
	String reservationType;
	String quota;
	double amount;

}
