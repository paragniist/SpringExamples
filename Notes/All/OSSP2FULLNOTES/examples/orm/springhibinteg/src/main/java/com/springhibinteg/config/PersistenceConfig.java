package com.springhibinteg.config;

import java.util.Properties;

import javax.sql.DataSource;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;

import com.springhibinteg.entities.Address;

@Configuration
@PropertySource("classpath:db.properties")
@ComponentScan(basePackages = { "com.springhibinteg.dao" })
public class PersistenceConfig {

	@Bean
	public DataSource dataSource(@Value("${db.driverClassname}") String driverClassname, @Value("${db.url}") String url,
			@Value("${db.username}") String username, @Value("${db.password}") String password) {
		DriverManagerDataSource dataSource = new DriverManagerDataSource(url, username, password);
		dataSource.setDriverClassName(driverClassname);
		return dataSource;
	}

	@Bean
	public LocalSessionFactoryBean sessionFactoryBean(DataSource dataSource) {
		LocalSessionFactoryBean sessionFactoryBean = new LocalSessionFactoryBean();
		sessionFactoryBean.setDataSource(dataSource);
		Properties hibernateProperties = new Properties();
		hibernateProperties.put("hibernate.show_sql", true);
		hibernateProperties.put("hibernate.dialect", "org.hibernate.dialect.MySQL8Dialect");
		hibernateProperties.put("hibernate.hbm2ddl.auto", "update");

		sessionFactoryBean.setHibernateProperties(hibernateProperties);
		//sessionFactoryBean.setAnnotatedPackages("com.springhibinteg.entities");
		sessionFactoryBean.setAnnotatedClasses(Address.class);

		return sessionFactoryBean;
	}

	@Bean
	public HibernateTemplate hibernateTemplate(SessionFactory sessionFactory) {
		HibernateTemplate hibernateTemplate = new HibernateTemplate(sessionFactory);
		return hibernateTemplate;
	}

	@Bean
	public PlatformTransactionManager transactionManager(SessionFactory sessionFactory) {
		HibernateTransactionManager transactionManager = new HibernateTransactionManager(sessionFactory);
		return transactionManager;
	}

}
