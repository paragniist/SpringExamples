package com.araom.beans;

import java.lang.reflect.Method;
import java.util.List;

import org.springframework.aop.AfterReturningAdvice;

public class NotificationAdvice implements AfterReturningAdvice {
	@Override
	public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
		List<Product> products = null;
		Address address = null;
		String orderNo = null;

		products = (List<Product>) args[0];
		address = (Address) args[1];
		orderNo = (String) returnValue;

		System.out.println("Your order# : " + orderNo + " total products in your order: " + products.size());
		System.out.println("Shipping Address: " + address);
	}
}
