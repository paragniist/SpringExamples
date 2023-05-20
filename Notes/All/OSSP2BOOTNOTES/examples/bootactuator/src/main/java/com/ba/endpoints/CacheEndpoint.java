package com.ba.endpoints;

import org.springframework.boot.actuate.endpoint.annotation.DeleteOperation;
import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.stereotype.Component;

@Component
@Endpoint(id = "cache")
public class CacheEndpoint {

	@ReadOperation
	public int entries() {
		return 10;
	}

	@DeleteOperation
	public boolean evict() {
		return true;
	}
}
