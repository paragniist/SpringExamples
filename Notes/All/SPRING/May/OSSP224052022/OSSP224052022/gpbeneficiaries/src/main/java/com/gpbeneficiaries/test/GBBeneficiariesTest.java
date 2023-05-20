package com.gpbeneficiaries.test;

import java.util.Date;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.gpbeneficiaries.config.RootConfig;
import com.gpbeneficiaries.controller.GrantBeneficiaryController;
import com.gpbeneficiaries.form.GrantApplicationForm;

public class GBBeneficiariesTest {
	public static void main(String[] args) {
		/*
		 * ApplicationContext context = new ClassPathXmlApplicationContext(
		 * "com/gpbeneficiaries/common/application-context.xml");
		 */
		ApplicationContext context = new AnnotationConfigApplicationContext(RootConfig.class);
		GrantBeneficiaryController controller = context.getBean("grantBeneficiaryController",
				GrantBeneficiaryController.class);
		GrantApplicationForm form = new GrantApplicationForm();
		form.setBeneficiaryName("Adam Chris");
		form.setDob(new Date());
		form.setGender("M");
		form.setMobileNo("98638363333");
		form.setEmailAddress("adam.chris@gmail.com");
		form.setAadharNo("AA38393");
		form.setGrantType("Industrial Corporation Loan");
		form.setTenure(36);
		form.setGrantAmount(87983);
		int grantApplicationNo = controller.applyForGrant(form);
		System.out.println("grant application no : " + grantApplicationNo);
	}
}
