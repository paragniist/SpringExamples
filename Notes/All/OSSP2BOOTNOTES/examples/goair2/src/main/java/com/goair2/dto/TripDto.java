package com.goair2.dto;

import java.util.Date;

import lombok.Builder;
import lombok.Getter;

@Builder(builderMethodName = "of")
@Getter
public class TripDto {
	private int tripNo;
	private String tripName;
	private String source;
	private String destination;
	private Date plannedDate;
	private double estimatedCost;

}
