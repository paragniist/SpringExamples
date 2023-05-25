package com.autowire.annotation;
//source code
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
@Component
//@Service
//@Controller
//@Repository
public class Truck {
	@Autowired
	//@Qualifier("vehicle2")
	private Vehicle vehicle;

	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}

	@Override
	public String toString() {
		return "Truck [vehicle=" + vehicle + "]";
	}
	
}
