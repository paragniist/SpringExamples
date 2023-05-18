package com.stereotype.beans;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

//@Component
//@Service
//@Repository
@Controller
public class Aeroplane {
	public void fly() {
		System.out.println("flying.....");
	}
}
