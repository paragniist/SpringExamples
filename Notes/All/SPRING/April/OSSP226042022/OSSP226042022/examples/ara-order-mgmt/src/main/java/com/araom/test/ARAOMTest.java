package com.araom.test;

import java.util.Arrays;
import java.util.List;

import org.springframework.aop.framework.ProxyFactory;

import com.araom.beans.Address;
import com.araom.beans.NotificationAdvice;
import com.araom.beans.OrderManager;
import com.araom.beans.Product;

public class ARAOMTest {
	public static void main(String[] args) {
		ProxyFactory pf = new ProxyFactory();
		pf.setTarget(new OrderManager());
		pf.addAdvice(new NotificationAdvice());

		OrderManager proxy = (OrderManager) pf.getProxy();
		List<Product> products = Arrays.asList(new Product[] { new Product(18, 8), new Product(73, 1) });
		Address address = new Address("Hitech City, Phase2", "Dell India Pvt Ltd, Floor 5", "Hyderabad", "TS", 83889,
				"India");
		String orderNo = proxy.placeOrder(products, address);
		System.out.println("order no:" + orderNo);
	}
}
