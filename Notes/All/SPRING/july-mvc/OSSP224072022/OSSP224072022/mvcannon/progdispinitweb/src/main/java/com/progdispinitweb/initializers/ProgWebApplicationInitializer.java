package com.progdispinitweb.initializers;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.support.XmlWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class ProgWebApplicationInitializer implements WebApplicationInitializer {
	@Override
	public void onStartup(ServletContext servletContext) throws ServletException {
		XmlWebApplicationContext rootApplicationContext = null;
		XmlWebApplicationContext servletApplicationContext = null;
		DispatcherServlet dispatcherServlet = null;
		ContextLoaderListener contextLoaderListener = null;

		rootApplicationContext = new XmlWebApplicationContext();
		rootApplicationContext.setConfigLocation("/WEB-INF/application-context.xml");
		contextLoaderListener = new ContextLoaderListener(rootApplicationContext);
		servletContext.addListener(contextLoaderListener);

		servletApplicationContext = new XmlWebApplicationContext();
		servletApplicationContext.setConfigLocation("/WEB-INF/dispatcher-servlet.xml");
		dispatcherServlet = new DispatcherServlet(servletApplicationContext);
		ServletRegistration.Dynamic dynamic = servletContext.addServlet("dispatcher", dispatcherServlet);
		dynamic.setLoadOnStartup(1);
		dynamic.addMapping("*.htm");
	}
}
