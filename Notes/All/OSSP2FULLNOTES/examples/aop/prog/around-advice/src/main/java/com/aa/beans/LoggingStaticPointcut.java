package com.aa.beans;

import java.lang.reflect.Method;

import org.springframework.aop.support.StaticMethodMatcherPointcut;

public class LoggingStaticPointcut extends StaticMethodMatcherPointcut {

	@Override
	public boolean matches(Method method, Class<?> targetClass) {
		if (targetClass == Calculator.class
				&& (method.getName().equals("add") || method.getName().equals("substract"))) {
			return true;
		}
		return false;
	}

}
