package com.gpbeneficiaries.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@Import({ PersistenceConfig.class })
@ComponentScan(basePackages = { "com.gpbeneficiaries.dao", "com.gpbeneficiaries.service",
		"com.gpbeneficiaries.controller" })
@EnableTransactionManagement
public class RootConfig {

}
