package com.goair2.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "trip")
@Setter
@Getter
@EqualsAndHashCode
public class Trip {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "trip_no")
	private int tripNo;
	@Column(name = "trip_nm")
	private String tripName;
	private String source;
	private String destination;
	@Column(name = "planned_dt")
	private Date plannedDate;
	private int days;
	@Column(name = "estimated_cost")
	private double estimatedCost;

}
