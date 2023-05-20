package com.ba.endpoints;

import org.springframework.boot.actuate.info.Info.Builder;
import org.springframework.boot.actuate.info.InfoContributor;
import org.springframework.stereotype.Component;

@Component("info")
public class InfoEndpoint implements InfoContributor {

	@Override
	public void contribute(Builder builder) {
		builder.withDetail("version", "1.0").withDetail("author", "sriman").withDetail("releaseDate", "2022-12-12")
				.build();
	}

}
