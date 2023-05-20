package com.mba.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.mba.beans.LoanManager;
import com.mba.config.MBAConfig;
import com.mba.security.helper.AuthenticationManager;

public class MBATest {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(MBAConfig.class);
		LoanManager lm = context.getBean("loanManager", LoanManager.class);
		AuthenticationManager authenticationManager = context.getBean(AuthenticationManager.class);
		authenticationManager.login("john", "welcome1");
		boolean loanStatus = lm.approveLoan(983L);
		System.out.println("loan status : " + loanStatus);
		authenticationManager.logout();
	}
}
