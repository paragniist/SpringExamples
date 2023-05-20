package com.annotation5.profiles;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:com/annotation5/profiles/common-dev.properties")
@Profile("dev")
public class DevConfig {

}
