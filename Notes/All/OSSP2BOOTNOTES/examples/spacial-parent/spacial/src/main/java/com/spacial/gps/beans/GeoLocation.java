package com.spacial.gps.beans;

public class GeoLocation {
	private double latitude;
	private double longitute;

	public double getLatitude() {
		return latitude;
	}

	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}

	public double getLongitute() {
		return longitute;
	}

	public void setLongitute(double longitute) {
		this.longitute = longitute;
	}

	@Override
	public String toString() {
		return "GeoLocation [latitude=" + latitude + ", longitute=" + longitute + "]";
	}

}
