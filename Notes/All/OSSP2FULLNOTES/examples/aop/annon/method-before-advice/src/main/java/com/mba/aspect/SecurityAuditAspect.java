package com.mba.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.mba.security.helper.AuthenticationManager;

@Component
@Aspect
public class SecurityAuditAspect {
	@Autowired
	private AuthenticationManager authenticationManager;

	@Before("within(com.mba.beans.*)")
	public void audit(JoinPoint jp) {
		System.out.println(authenticationManager.getLoggedInUser() + " called method :" + jp.getSignature().getName());
	}

	@Before("within(com.mba.beans.*)")
	public void checkSecurity() throws IllegalAccessException {
		if (authenticationManager.authenticate() == false) {
			throw new IllegalAccessException("invalid un/pwd");
		}
	}
}
