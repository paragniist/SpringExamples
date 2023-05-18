package com.profiles.annotaion;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.Profile;

@Configuration
@ComponentScan(basePackages = {"com.profiles.annotaion"})
@Import({DevConfig.class,TestConfig.class})
public class CommonConfig {
	@Bean
	public Motor motor(@Value("${hp}") int hp, FuelTank fuelTank) {
		Motor motor=new Motor();
		motor.setHp(hp);
		motor.setFuelTank(fuelTank);
		return motor;
	}
}
