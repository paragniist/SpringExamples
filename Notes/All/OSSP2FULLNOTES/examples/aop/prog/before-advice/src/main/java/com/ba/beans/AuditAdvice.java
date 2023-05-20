package com.ba.beans;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

import com.ba.helper.AuthenticationManager;

public class AuditAdvice implements MethodBeforeAdvice {
	@Override
	public void before(Method method, Object[] args, Object target) throws Throwable {
		AuthenticationManager authenticationManager = null;

		authenticationManager = AuthenticationManager.getInstance();
		System.out.print(authenticationManager.getLoggedInUser() + " has called " + method.getName() + "(");
		for (int i = 0; i < args.length; i++) {
			if (i == 0) {
				System.out.print(args[i]);
				continue;
			}
			System.out.print("," + args[i]);
		}
		System.out.println(") using object: " + target.getClass().getName());
		args[0] = (Long) args[0] + 1;

		if ((Long) args[0] <= 0) {
			throw new IllegalArgumentException("invalid loan no");
		}
	}
}
