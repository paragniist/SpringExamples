package com.qa.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.qa.bo.VehicleBo;
import com.qa.config.QAJavaConfig;
import com.qa.dao.VehicleDao;

public class QATest {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(QAJavaConfig.class);
		VehicleDao vehicleDao = context.getBean("vehicleDao", VehicleDao.class);
		// int nvehicles = vehicleDao.getNoOfVehicles();
		// System.out.println("no of vehicles : " + nvehicles);
		// float maxLeaseAmount = vehicleDao.maxLeaseAmount();
		// System.out.println("max lease amount : " + maxLeaseAmount);

		// String modelName = vehicleDao.findModelName(2);
		// System.out.println("model nm : " + modelName);

		// VehicleBo bo = vehicleDao.getVehicle(2);
		// System.out.println(bo);
		/*
		 * List<VehicleBo> vehicleBos = vehicleDao.getVehicles("toyota corola");
		 * vehicleBos.stream().forEach(System.out::println);
		 */
		/*
		 * List<Map<String, Object>> records =
		 * vehicleDao.getVehiclesByManufacturer("toyota"); System.out.println(records);
		 */
		VehicleBo bo = new VehicleBo();
		bo.setVehicleNo(4);
		bo.setModelName("Creata");
		bo.setManufacturer("Hyundai");
		bo.setRegistrationNo("938 CA 93");
		bo.setColor("Black");
		bo.setFuelType("petrol");
		bo.setLeaseAmount(800);
		int r = vehicleDao.saveVehicle(bo);
		System.out.println("record inserted count : " + r);
	}
}
