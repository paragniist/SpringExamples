package com.ymlpsf.beans;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "parcel")
public class Parcel {
	private String parcelNo;
	private String description;
	private int weight;
	private String source;
	private String destination;
	private double charges;

	public String getParcelNo() {
		return parcelNo;
	}

	public void setParcelNo(String parcelNo) {
		this.parcelNo = parcelNo;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public double getCharges() {
		return charges;
	}

	public void setCharges(double charges) {
		this.charges = charges;
	}

	@Override
	public String toString() {
		return "Parcel [parcelNo=" + parcelNo + ", description=" + description + ", weight=" + weight + ", source="
				+ source + ", destination=" + destination + ", charges=" + charges + "]";
	}

}
