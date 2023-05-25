package com.autowire.annotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
@ComponentScan(basePackages = "com.autowire.annotation")
public class JavaConfig {
	@Bean

	public Vehicle vehicle() {
		Vehicle vehicle=new Vehicle();
		vehicle.setCapacity(2000);
		vehicle.setType("truck");
		vehicle.setFuelType("White Petrol");
		vehicle.setTransmission("AMT");
		vehicle.setColor("Green");
		return vehicle;
	}
	@Bean
	//@Primary
	public Vehicle vehicle1() {
		Vehicle vehicle1=new Vehicle();
		vehicle1.setCapacity(1500);
		vehicle1.setType("Mini Truck");
		vehicle1.setFuelType("White Petrol");
		vehicle1.setTransmission("AMT");
		vehicle1.setColor("Red");
		return vehicle1;
	}
}



/*@autowired
@qualifier

javaConfig.java
@bean
@primary
*/







