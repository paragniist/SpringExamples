package com.bootevents.listener;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanDefinitionCustomizer;
import org.springframework.boot.context.event.ApplicationStartedEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.GenericApplicationContext;

import com.bootevents.beans.Task;

public class BootStartedEventListener implements ApplicationListener<ApplicationStartedEvent> {

	@Override
	public void onApplicationEvent(ApplicationStartedEvent event) {
		ConfigurableApplicationContext context = event.getApplicationContext();
		GenericApplicationContext gContext = (GenericApplicationContext) context;
		int id = Integer.parseInt(context.getEnvironment().getProperty("id"));
		System.out.println("id :" + id);

		gContext.registerBean(Task.class, new BeanDefinitionCustomizer() {
			@Override
			public void customize(BeanDefinition bd) {
				bd.setAttribute("id", id);
			}
		});
	}

}
