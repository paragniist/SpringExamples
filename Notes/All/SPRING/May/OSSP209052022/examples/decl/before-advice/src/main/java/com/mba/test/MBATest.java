package com.mba.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mba.beans.LoanManager;
import com.mba.security.helper.AuthenticationManager;

public class MBATest {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/mba/common/application-context.xml");
		LoanManager loanManager = context.getBean("loanManager", LoanManager.class);
		AuthenticationManager authenticationManager = context.getBean("authenticationManager",
				AuthenticationManager.class);
		authenticationManager.login("philip", "welcome1");
		boolean loanStatus = loanManager.approveLoan(93893L);
		System.out.println("loan status : " + loanStatus);
		authenticationManager.logout();
	}
}











