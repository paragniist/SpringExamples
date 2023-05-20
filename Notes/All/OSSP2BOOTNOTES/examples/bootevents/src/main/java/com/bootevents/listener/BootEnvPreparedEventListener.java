package com.bootevents.listener;

import java.util.HashMap;
import java.util.Map;

import org.springframework.boot.context.event.ApplicationEnvironmentPreparedEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.env.MapPropertySource;

public class BootEnvPreparedEventListener implements ApplicationListener<ApplicationEnvironmentPreparedEvent> {

	@Override
	public void onApplicationEvent(ApplicationEnvironmentPreparedEvent event) {
		Map<String, Object> map = new HashMap<>();
		map.put("spring.main.banner-mode", "off");
		MapPropertySource propertySource = new MapPropertySource("app", map);
		ConfigurableEnvironment env = event.getEnvironment();
		env.getPropertySources().stream().forEach(ps -> {
			System.out.println(ps.getName());
		});
		env.getPropertySources().addLast(propertySource);
		System.out.println(env.getProperty("applicationName"));
	}
}
