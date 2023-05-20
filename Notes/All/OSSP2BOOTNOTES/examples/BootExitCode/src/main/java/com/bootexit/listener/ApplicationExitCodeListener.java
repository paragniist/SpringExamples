package com.bootexit.listener;

import org.springframework.boot.ExitCodeEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class ApplicationExitCodeListener implements ApplicationListener<ExitCodeEvent> {

	@Override
	public void onApplicationEvent(ExitCodeEvent event) {
		System.out.println("exitcode : " + event.getExitCode());
	}

}
