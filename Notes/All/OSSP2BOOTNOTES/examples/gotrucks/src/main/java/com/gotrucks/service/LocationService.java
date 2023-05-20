package com.gotrucks.service;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.spacial.gps.beans.GeoLocation;
import com.spacial.gps.core.Tracker;

@Component
public class LocationService {
	private final static Logger logger = LogManager.getLogger(LocationService.class);

	@Autowired
	private Tracker tracker;

	public String begin(String deviceNo, double latitude, double longitute) {
		GeoLocation geoLocation = new GeoLocation();
		geoLocation.setLatitude(latitude);
		geoLocation.setLongitute(longitute);
		String routeNo = tracker.init(deviceNo, geoLocation);
		logger.info("begin route with routeNo: {}", routeNo);
		return routeNo;
	}

	public void hop(String routeNo, double latitude, double longtitude) {
		GeoLocation geoLocation = new GeoLocation();
		geoLocation.setLatitude(latitude);
		geoLocation.setLongitute(longtitude);
		String refNo = tracker.route(routeNo, geoLocation);
		logger.info("hop ref: {}", refNo);
	}
}
