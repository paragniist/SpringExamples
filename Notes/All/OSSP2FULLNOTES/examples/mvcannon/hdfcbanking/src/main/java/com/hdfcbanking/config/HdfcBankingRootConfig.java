package com.hdfcbanking.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = { "com.hdfcbanking.service" })
public class HdfcBankingRootConfig {

}
