package com.spacial.gps.beans.autoconfigure;

import java.time.ZoneId;
import java.util.TimeZone;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.core.env.Environment;

import com.spacial.gps.config.GeoConfiguration;

@AutoConfiguration
@ConditionalOnProperty(name = "spacial.serviceNo")
public class GeoConfigurationAutoConfiguration {
	@Autowired
	private Environment env;

	@Bean
	public GeoConfiguration geoConfiguration() {
		GeoConfiguration geoConfiguration = new GeoConfiguration();

		geoConfiguration.setSpacialServiceNo(env.getProperty("spacial.serviceNo"));
		geoConfiguration.setApiKey(env.getProperty("spacial.apiKey"));
		geoConfiguration.setApiAccessKey(env.getProperty("spacial.apiAccessKey"));
		geoConfiguration.setTimeZone(TimeZone.getTimeZone(ZoneId.of(env.getProperty("spacial.timeZone"))));
		geoConfiguration.setDistanceIn(env.getProperty("spacial.distanceIn"));

		return geoConfiguration;
	}

}
