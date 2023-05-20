package com.bootevents;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;

import com.bootevents.beans.Task;
import com.bootevents.listener.BootEnvPreparedEventListener;
import com.bootevents.listener.BootStartedEventListener;
import com.bootevents.listener.BootStartingApplicationEventListener;

@SpringBootApplication
public class BooteventsApplication {
	public static void main(String[] args) {
		SpringApplicationBuilder builder = new SpringApplicationBuilder(BooteventsApplication.class).listeners(
				new BootStartingApplicationEventListener(), new BootEnvPreparedEventListener(),
				new BootStartedEventListener());
		SpringApplication springApplication = builder.build();
		ApplicationContext context = springApplication.run(args);
		Task task = context.getBean(Task.class);
		System.out.println(task.getId());
	}
}
