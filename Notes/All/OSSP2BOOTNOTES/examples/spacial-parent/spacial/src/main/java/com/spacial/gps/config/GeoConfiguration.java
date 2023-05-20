package com.spacial.gps.config;

import java.util.TimeZone;

public class GeoConfiguration {
	private String spacialServiceNo;
	private String apiKey;
	private String apiAccessKey;
	private TimeZone timeZone;
	private String distanceIn;

	public String getSpacialServiceNo() {
		return spacialServiceNo;
	}

	public void setSpacialServiceNo(String spacialServiceNo) {
		this.spacialServiceNo = spacialServiceNo;
	}

	public String getApiKey() {
		return apiKey;
	}

	public void setApiKey(String apiKey) {
		this.apiKey = apiKey;
	}

	public String getApiAccessKey() {
		return apiAccessKey;
	}

	public void setApiAccessKey(String apiAccessKey) {
		this.apiAccessKey = apiAccessKey;
	}

	public TimeZone getTimeZone() {
		return timeZone;
	}

	public void setTimeZone(TimeZone timeZone) {
		this.timeZone = timeZone;
	}

	public String getDistanceIn() {
		return distanceIn;
	}

	public void setDistanceIn(String distanceIn) {
		this.distanceIn = distanceIn;
	}

}
