package com.swr.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.sbr.client.PayTMApiInvoker;
import com.swr.config.RestConfig;

public class ClientTest {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(RestConfig.class);
		PayTMApiInvoker payTMApiInvoker = context.getBean(PayTMApiInvoker.class);
		String bal = payTMApiInvoker.getAccountBalance("39833");
		System.out.println("balance: " + bal);
	}
}
