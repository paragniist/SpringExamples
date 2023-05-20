package com.annotation5.importannon;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ExchangeConfig {
	@Bean
	public Exchange exchange(@Value("${exchangeNo}") int exchangeNo, @Value("${area}") String area,
			@Autowired Telephone telephone) {
		Exchange exchange = new Exchange(exchangeNo);
		exchange.setArea(area);
		exchange.setTelephone(telephone);
		return exchange;
	}
}
