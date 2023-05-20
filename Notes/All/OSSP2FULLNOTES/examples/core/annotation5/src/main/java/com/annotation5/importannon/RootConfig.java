package com.annotation5.importannon;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:com/annotation5/importannon/common.properties")
@Import({ TelephoneConfig.class, ExchangeConfig.class })
public class RootConfig {

}
