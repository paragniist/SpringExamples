package com.externalconfig.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class Book {
	@Value("${isbn}")
	private String isbn;
	@Value("${title}")
	private String title;
	@Value("${author}")
	private String author;
	@Value("${pages}")
	private int pages;
	@Value("${price}")
	private double price;

}
