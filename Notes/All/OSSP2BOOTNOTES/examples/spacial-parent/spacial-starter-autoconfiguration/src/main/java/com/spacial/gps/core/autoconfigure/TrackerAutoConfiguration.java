package com.spacial.gps.core.autoconfigure;

import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.context.annotation.Bean;

import com.spacial.gps.beans.autoconfigure.GeoConfigurationAutoConfiguration;
import com.spacial.gps.config.GeoConfiguration;
import com.spacial.gps.core.Tracker;

@AutoConfiguration(after = { GeoConfigurationAutoConfiguration.class })
@ConditionalOnBean(value = { GeoConfiguration.class })
public class TrackerAutoConfiguration {

	@Bean
	public Tracker tracker(GeoConfiguration geoConfiguration) {
		Tracker tracker = new Tracker(geoConfiguration);
		return tracker;
	}
}
