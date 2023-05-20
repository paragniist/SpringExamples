package com.ymlpsf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.PropertySource;

import com.ymlpsf.beans.Parcel;
import com.ymlpsf.factory.YamlPropertySourceFactory;

@SpringBootApplication
@PropertySource(name = "appConfig", value = "classpath:appConfig.yml", factory = YamlPropertySourceFactory.class)
public class PropertySourceFactoryApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(PropertySourceFactoryApplication.class, args);
		Parcel parcel = context.getBean(Parcel.class);
		System.out.println(parcel);
	}

}
