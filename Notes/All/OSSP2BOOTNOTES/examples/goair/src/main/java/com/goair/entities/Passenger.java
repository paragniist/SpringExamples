package com.goair.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "passenger")
@Setter
@Getter
public class Passenger {
	@Id
	@Column(name = "passenger_no")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	protected int passengerNo;
	protected String fullname;
	protected int age;
	protected String gender;
}
