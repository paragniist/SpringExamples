package com.annotation5.javaconfig2;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfig2 {
	@Bean
	@Qualifier("turboTurbine")
	public Turbine turbine1() {
		return new Turbine();
	}

	@Bean
	public Turbine turbine2() {
		return new Turbine();
	}

	@Bean
	public Powerstation powerstation(@Qualifier("turboTurbine") Turbine turbine) {
		Powerstation powerstation = null;

		powerstation = new Powerstation(turbine);
		return powerstation;
	}
}
