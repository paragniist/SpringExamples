package com.araom.beans;

import java.util.List;
import java.util.UUID;

public class OrderManager {
	public String placeOrder(List<Product> products, Address address) {
		return UUID.randomUUID().toString();
	}
}
