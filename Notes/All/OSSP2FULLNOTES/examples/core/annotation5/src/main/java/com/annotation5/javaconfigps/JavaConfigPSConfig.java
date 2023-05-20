package com.annotation5.javaconfigps;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

@Configuration
@PropertySource("classpath:com/annotation5/javaconfigps/library.properties")
public class JavaConfigPSConfig {
	/*
	 * @Autowired private Environment env;
	 */

	@Bean
	public Library library(@Value("${library.libraryNo}") int libraryNo,
			@Value("${library.libraryName}") String libraryName, @Value("${library.nbooks}") int nbooks) {
		Library library = null;
		/*
		 * library = new
		 * Library(Integer.parseInt(env.getProperty("library.libraryNo")));
		 * library.setLibraryName(env.getProperty("library.libraryName"));
		 * library.setnBooks(Integer.parseInt(env.getProperty("library.nbooks")));
		 */
		library = new Library(libraryNo);
		library.setLibraryName(libraryName);
		library.setnBooks(nbooks);

		return library;
	}
}
