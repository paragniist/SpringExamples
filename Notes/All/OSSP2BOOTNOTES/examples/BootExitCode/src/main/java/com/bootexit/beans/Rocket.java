package com.bootexit.beans;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Component;

@Component
public class Rocket {
	@PostConstruct
	public void init() {
		System.out.println("init rocket");
	}

	public void launch() {
		System.out.println("launching rocket!");
		throw new IllegalArgumentException("failed launching rocket");
	}

	@PreDestroy
	public void destroy() {
		System.out.println("destroy rocket");
	}
}
