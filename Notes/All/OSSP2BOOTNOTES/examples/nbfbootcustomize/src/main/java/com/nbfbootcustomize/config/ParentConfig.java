package com.nbfbootcustomize.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.nbfbootcustomize.beans.Engine;

@Configuration
public class ParentConfig {
	@Bean
	public Engine engine(@Value("${engineType}") String engineType, @Value("${capacity}") int capacity) {
		Engine engine = new Engine();
		engine.setEngineType(engineType);
		engine.setCapacity(capacity);

		return engine;
	}
}
