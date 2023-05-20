package com.bootmavenimport.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Game {
	@Value("${title}")
	private String title;

	@Override
	public String toString() {
		return "Game [title=" + title + "]";
	}

}
