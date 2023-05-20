package com.sbr.client;

import java.net.URI;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriBuilder;
import org.springframework.web.util.UriComponentsBuilder;

@Component
public class PayTMApiInvoker {
	private final RestTemplate restTemplate;

	public PayTMApiInvoker(RestTemplate restTemplate) {
		this.restTemplate = restTemplate;
	}

	public String getAccountBalance(String mobileNo) {
		Map<String, String> pathVariables = new HashMap<>();
		UriBuilder uriBuilder = UriComponentsBuilder
				.fromUriString("http://localhost:8081/api/payTMAccount/{mobileNo}/balance");
		pathVariables.put("mobileNo", mobileNo);
		URI uri = uriBuilder.build(pathVariables);

		return restTemplate.getForEntity(uri, String.class).getBody();
	}

}
