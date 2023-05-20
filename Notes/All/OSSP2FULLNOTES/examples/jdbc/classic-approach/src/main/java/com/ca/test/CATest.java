package com.ca.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ca.bo.VehicleBo;
import com.ca.dao.VehicleDao;

public class CATest {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/ca/common/application-context.xml");
		VehicleDao vehicleDao = context.getBean("vehicleDao", VehicleDao.class);
		List<VehicleBo> vehicleBos = vehicleDao.getVehiclesByModelName("corola");
		
		vehicleBos.stream().forEach(System.out::println);
	}
}
