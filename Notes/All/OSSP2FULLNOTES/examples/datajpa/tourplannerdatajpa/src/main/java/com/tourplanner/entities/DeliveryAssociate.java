package com.tourplanner.entities;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "delivery_associate")
@Data
public class DeliveryAssociate {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "delivery_associate_no")
	private int deliveryAssociateNo;
	private String fullname;
	private String mobileNo;
	@Column(name = "email_address")
	private String emailAddress;

	@OneToMany(mappedBy = "deliveryAssociate")
	private Set<Parcel> parcels;
}
