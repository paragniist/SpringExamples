package com.ba.beans;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "product")
public class Product {
	private int productCode;
	private String description;

	public int getProductCode() {
		return productCode;
	}

	public void setProductCode(int productCode) {
		this.productCode = productCode;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "Product [productCode=" + productCode + ", description=" + description + "]";
	}

}
