package com.urotaxi.application;

import java.io.File;

import org.apache.catalina.LifecycleException;
import org.apache.catalina.WebResourceRoot;
import org.apache.catalina.WebResourceSet;
import org.apache.catalina.core.StandardContext;
import org.apache.catalina.startup.Tomcat;
import org.apache.catalina.webresources.DirResourceSet;
import org.apache.catalina.webresources.StandardRoot;

public class UroTaxiServerApplication {
	public static void main(String[] args) throws LifecycleException {
		Tomcat tomcat = new Tomcat();
		tomcat.setPort(8081);

		StandardContext context = (StandardContext) tomcat.addWebapp("/urotaxies",
				new File("src/main/webapp").getAbsolutePath());
		WebResourceRoot webResourceRoot = new StandardRoot(context);

		WebResourceSet classesResourceSet = new DirResourceSet(webResourceRoot, "/WEB-INF/classes",
				new File("target/classes").getAbsolutePath(), "/");
		webResourceRoot.addPreResources(classesResourceSet);
		context.setResources(webResourceRoot);

		tomcat.start();
		tomcat.getServer().await();
	}
}
