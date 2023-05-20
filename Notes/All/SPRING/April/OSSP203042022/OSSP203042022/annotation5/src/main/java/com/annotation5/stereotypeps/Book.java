package com.annotation5.stereotypeps;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("classpath:com/annotation5/stereotypeps/book.properties")
// source code
public class Book {
	private int isbn;
	private String title;
	private String author;
	@Value("${book.publisher}")
	private String publisher;
	private double price;

	public Book(@Value("${book.isbn}") int isbn, @Value("${book.title}") String title) {
		this.isbn = isbn;
		this.title = title;
	}

	@Value("${book.author}")
	void setAuthor(String author) {
		this.author = author;
	}

	@Autowired
	public void newBook(@Value("${book.price}") double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Book [isbn=" + isbn + ", title=" + title + ", author=" + author + ", publisher=" + publisher
				+ ", price=" + price + "]";
	}

}
