package com.awareinjection.beans;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;

public class Car implements BeanFactoryAware {
	private String beanId;
	private BeanFactory beanFactory;
	private String modelName;

	public Car(String beanId) {
		System.out.println("Car(String beanId)");
		this.beanId = beanId;
	}

	public void drive() {
		IEngine engine = null;

		engine = beanFactory.getBean(beanId, IEngine.class);
		engine.start();
		System.out.println("driving car " + modelName + " ...");
	}

	public void setModelName(String modelName) {
		System.out.println("setModelName(String modelName)");
		this.modelName = modelName;
	}

	@Override
	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		System.out.println("setBeanFactory(BeanFactory beanFactory)");
		this.beanFactory = beanFactory;
	}

}
