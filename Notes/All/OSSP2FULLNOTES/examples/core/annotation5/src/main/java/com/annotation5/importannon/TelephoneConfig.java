package com.annotation5.importannon;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TelephoneConfig {
	@Bean
	public Telephone telephone(@Value("${telephoneNumber}") int telephoneNumber,
			@Value("${subscriptionType}") String subscriptionType) {
		Telephone telephone = new Telephone(telephoneNumber);
		telephone.setSubscriptionType(subscriptionType);
		return telephone;
	}
}
