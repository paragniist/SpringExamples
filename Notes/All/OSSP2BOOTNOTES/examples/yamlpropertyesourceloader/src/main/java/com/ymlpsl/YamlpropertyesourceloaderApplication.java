package com.ymlpsl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;

import com.ymlpsl.beans.AirTicket;
import com.ymlpsl.initializer.YamlConfigApplicationContextInitializer;

@SpringBootApplication
public class YamlpropertyesourceloaderApplication {

	public static void main(String[] args) {
		// ApplicationContext context =
		// SpringApplication.run(YamlpropertyesourceloaderApplication.class, args);
		SpringApplicationBuilder builder = new SpringApplicationBuilder(YamlpropertyesourceloaderApplication.class)
				.initializers(new YamlConfigApplicationContextInitializer());
		SpringApplication springApplication = builder.build();
		ApplicationContext context = springApplication.run(args);

		AirTicket airTicket = context.getBean(AirTicket.class);
		System.out.println(airTicket);
	}

}
