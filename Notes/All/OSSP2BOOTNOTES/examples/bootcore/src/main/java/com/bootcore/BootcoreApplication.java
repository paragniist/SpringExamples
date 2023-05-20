package com.bootcore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.bootcore.beans.Robot;

@SpringBootApplication
/*@Configuration
@ComponentScan(basePackages = { "com.bootcore.*" })
@EnableAutoConfiguration*/
public class BootcoreApplication {
	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(BootcoreApplication.class, args);
		Robot robot = context.getBean(Robot.class);
		System.out.println(robot);
	}
}
