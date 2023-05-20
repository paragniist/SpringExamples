package com.cpe.beans;

public class GeoLocation {
	private double lat;
	private double log;

	public double getLat() {
		return lat;
	}

	public void setLat(double lat) {
		this.lat = lat;
	}

	public double getLog() {
		return log;
	}

	public void setLog(double log) {
		this.log = log;
	}

	@Override
	public String toString() {
		return "GeoLocation [lat=" + lat + ", log=" + log + "]";
	}

}
