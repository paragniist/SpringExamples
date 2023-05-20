package com.progannon.initializers;

import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.support.AbstractDispatcherServletInitializer;

import com.progannon.config.MvcConfig;
import com.progannon.config.RootConfig;

public class ProgAnnonDispatcherServletInitializer extends AbstractDispatcherServletInitializer {

	@Override
	protected WebApplicationContext createServletApplicationContext() {
		AnnotationConfigWebApplicationContext servletApplicationContext = new AnnotationConfigWebApplicationContext();
		servletApplicationContext.register(MvcConfig.class);
		return servletApplicationContext;
	}

	@Override
	protected String[] getServletMappings() {
		return new String[] { "*.htm" };
	}

	@Override
	protected WebApplicationContext createRootApplicationContext() {
		AnnotationConfigWebApplicationContext rootApplicationContext = null;

		rootApplicationContext = new AnnotationConfigWebApplicationContext();
		rootApplicationContext.register(RootConfig.class);
		return rootApplicationContext;
	}

}
