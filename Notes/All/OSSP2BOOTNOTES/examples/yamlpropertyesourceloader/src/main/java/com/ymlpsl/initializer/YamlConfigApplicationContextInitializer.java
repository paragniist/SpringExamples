package com.ymlpsl.initializer;

import java.io.IOException;
import java.util.List;

import org.springframework.boot.env.YamlPropertySourceLoader;
import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.env.PropertySource;

public class YamlConfigApplicationContextInitializer
		implements ApplicationContextInitializer<ConfigurableApplicationContext> {
	@Override
	public void initialize(ConfigurableApplicationContext applicationContext) {
		YamlPropertySourceLoader yamlPropertySourceLoader = new YamlPropertySourceLoader();
		ConfigurableEnvironment environment = null;
		try {
			List<PropertySource<?>> propertySources = yamlPropertySourceLoader.load("appConfig",
					applicationContext.getResource("classpath:appConfig.yml"));
			environment = applicationContext.getEnvironment();
			for (PropertySource<?> propertySource : propertySources) {
				environment.getPropertySources().addLast(propertySource);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
