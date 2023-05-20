package com.ara.beans;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;

import com.ara.exception.WeakKeyException;

public class KeyCheckAdvice implements AfterReturningAdvice {

	@Override
	public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
		if ((Integer) returnValue <= 50) {
			throw new WeakKeyException("weak key: " + returnValue + " generated, so discarding");
		}
	}

}
