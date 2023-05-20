package com.tourplanner.entities;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "parcel")
@Data
public class Parcel {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "parcel_no")
	private int parcelNo;
	private String description;
	private int weight;
	@Column(name = "shipping_charges")
	private String shippingCharges;

	@ManyToOne
	@JoinColumn(name = "delivery_associate_no")
	@Basic(fetch = FetchType.EAGER)
	private DeliveryAssociate deliveryAssociate;
}
