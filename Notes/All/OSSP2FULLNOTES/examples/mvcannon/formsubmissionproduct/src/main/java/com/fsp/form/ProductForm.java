package com.fsp.form;

import lombok.Data;

@Data
public class ProductForm {
	private String productName;
	private String description;
	private String manufacturer;
	private String category;
	private double price;

}
