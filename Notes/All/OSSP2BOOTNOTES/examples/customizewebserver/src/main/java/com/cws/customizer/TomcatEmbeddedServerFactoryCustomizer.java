package com.cws.customizer;

import java.net.InetAddress;
import java.net.UnknownHostException;

import org.springframework.boot.autoconfigure.web.ServerProperties;
import org.springframework.boot.autoconfigure.web.embedded.TomcatWebServerFactoryCustomizer;
import org.springframework.boot.web.embedded.tomcat.ConfigurableTomcatWebServerFactory;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
public class TomcatEmbeddedServerFactoryCustomizer extends TomcatWebServerFactoryCustomizer {
	public TomcatEmbeddedServerFactoryCustomizer(Environment environment, ServerProperties serverProperties) {
		super(environment, serverProperties);
	}

	@Override
	public void customize(ConfigurableTomcatWebServerFactory factory) {
		factory.setAddress(InetAddress.getLoopbackAddress());
		factory.setPort(8083);

	}

}
