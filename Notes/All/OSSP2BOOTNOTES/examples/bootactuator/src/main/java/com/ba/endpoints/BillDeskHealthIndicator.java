package com.ba.endpoints;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component("billdesk")
public class BillDeskHealthIndicator implements HealthIndicator {
	private final String BILL_DESK_URL = "https://www.billdesk.com/web/";

	@Autowired
	private RestTemplate restTemplate;

	@Override
	public Health health() {
		ResponseEntity<String> response = restTemplate.getForEntity(BILL_DESK_URL, String.class);
		if (response.getStatusCodeValue() == 200) {
			return Health.up().build();
		}
		return Health.down().build();
	}

}
