package com.caannon.bo;

public class ProductBo {
	private int productNo;
	private String productName;
	private String description;
	private float price;

	public int getProductNo() {
		return productNo;
	}

	public void setProductNo(int productNo) {
		this.productNo = productNo;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "ProductBo [productNo=" + productNo + ", productName=" + productName + ", description=" + description
				+ ", price=" + price + "]";
	}

}
