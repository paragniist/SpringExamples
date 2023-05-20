package com.npjt.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
@ComponentScan(basePackages = { "com.npjt.dao" })
@PropertySource("classpath:db.properties")
public class NPJavaConfig {

	@Bean
	public DataSource dataSource(@Value("${db.driverClassname}") String driverClassname, @Value("${db.url}") String url,
			@Value("${db.username}") String username, @Value("${db.password}") String password) {
		DriverManagerDataSource dataSource = null;

		dataSource = new DriverManagerDataSource(url, username, password);
		dataSource.setDriverClassName(driverClassname);
		return dataSource;
	}

	@Bean
	public NamedParameterJdbcTemplate npJdbcTemplate(DataSource dataSource) {
		return new NamedParameterJdbcTemplate(dataSource);
	}
}
