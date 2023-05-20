package com.ordermgmt.dto;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class OrderDto {
	private int orderNo;
	private String description;
	private LocalDate orderedDate;
	private String customerName;
	private double amount;
	private String status;
}
