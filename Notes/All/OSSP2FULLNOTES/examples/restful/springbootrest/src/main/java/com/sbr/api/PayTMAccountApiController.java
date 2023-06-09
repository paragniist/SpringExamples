package com.sbr.api;

import java.security.SecureRandom;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.http.ResponseEntity.BodyBuilder;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.MatrixVariable;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/payTMAccount")
public class PayTMAccountApiController {

	@GetMapping(value = "/{mobileNo}/balance", produces = { MediaType.TEXT_PLAIN_VALUE })
	public String getAccountBalance(@PathVariable("mobileNo") String mobileNo) {
		return String.valueOf(new SecureRandom().nextInt());
	}

	@GetMapping(value = "/{transactionId}/status", produces = { MediaType.TEXT_PLAIN_VALUE })
	public String getTransactionStatus(@PathVariable("transactionId") String transactionId,
			@MatrixVariable("merchantId") String merchantId,
			@RequestParam(name = "amount", required = false) double amount) {
		return "transactionId: " + transactionId + " merchantId: " + merchantId + " amount: " + amount
				+ " status: SUCCESS";
	}

	@PostMapping(value = "/login", consumes = { MediaType.TEXT_PLAIN_VALUE }, produces = { MediaType.TEXT_PLAIN_VALUE })
	public String login(@CookieValue("username") String username, @RequestBody String password,
			@RequestHeader("appId") String appId) {
		return "username: " + username + " password:" + password + " appId: " + appId;
	}

	@GetMapping(value = "/{accountNo}/name", produces = { MediaType.TEXT_PLAIN_VALUE })
	public ResponseEntity<String> getAccountHolderName(@PathVariable("accountNo") String accountNo) {
		ResponseEntity<String> responseEntity = null;
		BodyBuilder bodyBuilder = ResponseEntity.ok();
		bodyBuilder.header("secret", "ab0393");
		responseEntity = bodyBuilder.body("Albert");

		return responseEntity;
	}
}
