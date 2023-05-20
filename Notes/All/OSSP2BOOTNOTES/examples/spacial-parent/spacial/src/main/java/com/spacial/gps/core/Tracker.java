package com.spacial.gps.core;

import java.util.UUID;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.spacial.gps.beans.GeoLocation;
import com.spacial.gps.config.GeoConfiguration;

public class Tracker {
	private final static Logger logger = LogManager.getLogger(Tracker.class);
	private GeoConfiguration geoConfiguration;

	public Tracker(GeoConfiguration geoConfiguration) {
		this.geoConfiguration = geoConfiguration;
	}

	public String init(String deviceNo, GeoLocation geoLocation) {
		String routeNo = null;

		if (logger.isInfoEnabled()) {
			logger.info("recieved init({},{})", deviceNo, geoLocation);
		}
		if (logger.isDebugEnabled()) {
			logger.debug("storing deviceNo: {} with begin location: {}", deviceNo, geoLocation);
			logger.debug("sending initial coordinates for serviceNo: {}", geoConfiguration.getSpacialServiceNo());
		}
		routeNo = UUID.randomUUID().toString().substring(0, 9).replaceAll("-", "0");

		if (logger.isDebugEnabled()) {
			logger.debug("routeNo : {} for deviceNo: {}", routeNo, deviceNo);
		}
		return routeNo;
	}

	public String route(String routeNo, GeoLocation geoLocation) {
		String referenceNo = null;

		if (logger.isDebugEnabled()) {
			logger.debug("received route request with routeNo: {} at geoLocation: {}", routeNo, geoLocation);
			logger.debug("sending route coordinates for serviceNo: {}", geoConfiguration.getSpacialServiceNo());
		}
		referenceNo = UUID.randomUUID().toString().substring(0, 9).replaceAll("-", "9");

		return referenceNo;
	}
}
