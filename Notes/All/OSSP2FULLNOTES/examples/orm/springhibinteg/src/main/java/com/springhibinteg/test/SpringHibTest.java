package com.springhibinteg.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.springhibinteg.config.RootConfig;
import com.springhibinteg.dto.AddressDto;
import com.springhibinteg.service.AddressService;

public class SpringHibTest {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(RootConfig.class);
		AddressDto dto = AddressDto.builder().addressLine1("8374, marine ln").addressLine2("2nd phase")
				.city("Hyderabad").state("Telangana").zip(8374).country("India").build();
		AddressService addressService = context.getBean(AddressService.class);
//		int addressNo = addressService.addAddress(dto);
//		System.out.println("address no:" + addressNo);
		// dto = addressService.findAddress(2);
		// System.out.println(dto);

		addressService.findAddressByCity("Hyderabad").forEach(System.out::println);

	}
}
