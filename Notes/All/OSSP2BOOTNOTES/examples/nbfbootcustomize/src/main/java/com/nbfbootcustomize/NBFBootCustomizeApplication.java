package com.nbfbootcustomize;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import com.nbfbootcustomize.beans.Car;
import com.nbfbootcustomize.beans.Engine;
import com.nbfbootcustomize.config.ParentConfig;

@SpringBootApplication
public class NBFBootCustomizeApplication {

	@Bean
	public Car car(Engine engine) {
		Car car = new Car();
		car.setEngine(engine);
		return car;
	}

	public static void main(String[] args) {
		ApplicationContext context = new SpringApplicationBuilder().parent(ParentConfig.class)
				.sources(NBFBootCustomizeApplication.class).build().run(args);
		Car car = context.getBean(Car.class);
		System.out.println(car);
	}
}
