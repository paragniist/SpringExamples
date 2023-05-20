package com.aa.beans;

import java.lang.reflect.Method;

import org.springframework.aop.support.DynamicMethodMatcherPointcut;

public class LoggingDynamicPointcut extends DynamicMethodMatcherPointcut {

	@Override
	public boolean matches(Method method, Class<?> targetClass, Object... args) {
		if (targetClass == Calculator.class && method.getName().equals("add")) {
			if ((Integer) args[0] > 100 && (Integer) args[1] > 100) {
				return true;
			}
		}
		return false;
	}

}
