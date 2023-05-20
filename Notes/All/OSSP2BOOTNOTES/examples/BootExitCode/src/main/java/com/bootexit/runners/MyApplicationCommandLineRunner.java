package com.bootexit.runners;

import java.io.InputStream;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class MyApplicationCommandLineRunner implements CommandLineRunner {
	@Override
	public void run(String... args) throws Exception {
		InputStream in = this.getClass().getClassLoader().getResourceAsStream("db.properties");
		while (in.read() != -1) {

		}
	}

}
