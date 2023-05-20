package com.annotation5.dependson;

import org.springframework.context.annotation.DependsOn;
import org.springframework.stereotype.Component;

@Component
@DependsOn("loanManager")
public class CacheManager {

	public CacheManager() {
		System.out.println("cache manager created");
	}

}
