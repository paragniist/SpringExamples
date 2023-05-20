package com.bs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;

import com.bs.servlet.PingServlet;

@SpringBootApplication
@ServletComponentScan(basePackages = { "com.bs.servlet" })
public class BootServletApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootServletApplication.class, args);
	}

//	@Bean
//	public ServletRegistrationBean<PingServlet> pingServlet() {
//		ServletRegistrationBean<PingServlet> pingServlet = new ServletRegistrationBean<PingServlet>(new PingServlet(),
//				"/ping");
//		pingServlet.setLoadOnStartup(1);
//		return pingServlet;
//	}
}
