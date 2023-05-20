package com.cpe.beans;

public class NavigationMap {
	private GeoLocation geoLocation;

	public void setGeoLocation(GeoLocation geoLocation) {
		this.geoLocation = geoLocation;
	}

	@Override
	public String toString() {
		return "NavigationMap [geoLocation=" + geoLocation + "]";
	}

}
