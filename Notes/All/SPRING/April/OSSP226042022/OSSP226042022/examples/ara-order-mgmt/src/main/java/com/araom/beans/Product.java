package com.araom.beans;

/**
 * @author Sriman
 *
 */
public class Product {
	private int productCode;
	private int quantity;

	public Product(int productCode, int quantity) {
		this.productCode = productCode;
		this.quantity = quantity;
	}

	public int getProductCode() {
		return productCode;
	}

	public void setProductCode(int productCode) {
		this.productCode = productCode;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

}
