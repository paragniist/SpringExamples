package com.npjt.test;

import java.util.Date;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.npjt.bo.CustomerBo;
import com.npjt.config.NPJavaConfig;
import com.npjt.dao.CustomerDao;

public class NPJdbcTemplateTest {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(NPJavaConfig.class);
		CustomerDao customerDao = context.getBean("customerDao", CustomerDao.class);
		// int c = customerDao.getCustomerCountByGender("male");
		// System.out.println("c : " +c);

		//int r = customerDao.updateCustomer(1, "john", new Date());
		CustomerBo bo = new CustomerBo(25, "marvik", new Date(), "male");
		int r = customerDao.saveCustomer(bo);
		System.out.println("records updated: " + r);
	}
}
