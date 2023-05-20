package com.ba.test;

import org.springframework.aop.framework.ProxyFactory;

import com.ba.beans.AuditAdvice;
import com.ba.beans.LoanManager;
import com.ba.beans.SecurityCheckAdvice;
import com.ba.helper.AuthenticationManager;

public class BATest {
	public static void main(String[] args) {
		AuthenticationManager authenticationManager = null;
		ProxyFactory pf = new ProxyFactory();
		pf.setTarget(new LoanManager());
		pf.addAdvice(new AuditAdvice());
		pf.addAdvice(new SecurityCheckAdvice());
		
		authenticationManager = AuthenticationManager.getInstance();
		authenticationManager.login("blake", "welcome1");
		LoanManager proxy = (LoanManager) pf.getProxy();
		boolean loanStatus = proxy.approveLoan(939);
		System.out.println("loan status : " + loanStatus);
		authenticationManager.logout();
	}
}
