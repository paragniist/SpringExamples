package com.bootmavenimport;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.bootmavenimport.beans.Game;

@SpringBootApplication
public class BootMavenImportApplication {
	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(BootMavenImportApplication.class, args);
		Game game = context.getBean(Game.class);
		System.out.println(game);
	}
}
