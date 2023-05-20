package com.bootexit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.bootexit.beans.Rocket;

@SpringBootApplication
public class BootExitCodeApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(BootExitCodeApplication.class, args);
		Rocket rocket = context.getBean(Rocket.class);
		// rocket.launch();
		int exitCode = SpringApplication.exit(context);
		System.exit(exitCode);
	}

}
