package com.ba.beans;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

import com.ba.exception.BadCredentialsException;
import com.ba.helper.AuthenticationManager;

public class SecurityCheckAdvice implements MethodBeforeAdvice {
	@Override
	public void before(Method method, Object[] args, Object target) throws Throwable {
		AuthenticationManager authenticationManager = null;

		authenticationManager = AuthenticationManager.getInstance();
		if (authenticationManager.authenticate() == false) {
			throw new BadCredentialsException("invalid un/pwd");
		}
	}
}
