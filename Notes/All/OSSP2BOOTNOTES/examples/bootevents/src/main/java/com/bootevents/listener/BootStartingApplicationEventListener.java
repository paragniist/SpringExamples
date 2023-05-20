package com.bootevents.listener;

import org.springframework.boot.context.event.ApplicationStartingEvent;
import org.springframework.context.ApplicationListener;

public class BootStartingApplicationEventListener implements ApplicationListener<ApplicationStartingEvent> {
	@Override
	public void onApplicationEvent(ApplicationStartingEvent event) {
		System.out.println("boot application is starting");
	}

}
