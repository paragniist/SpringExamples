package com.profiles.annotaion;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;

@Configuration
@Profile("test")
@PropertySource("classpath:com/profiles/annotaion/values-test.properties")
public class TestConfig {
	
}