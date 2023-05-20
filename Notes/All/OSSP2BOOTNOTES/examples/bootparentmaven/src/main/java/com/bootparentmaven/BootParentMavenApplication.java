package com.bootparentmaven;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.bootparentmaven.beans.Chain;

@SpringBootApplication
public class BootParentMavenApplication {
	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(BootParentMavenApplication.class, args);
		Chain chain = context.getBean(Chain.class);
		System.out.println(chain);
	}
}
