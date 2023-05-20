package com.ta.test;

import org.springframework.aop.framework.ProxyFactory;

import com.ta.beans.GlobalExceptionLoggingAdvice;
import com.ta.beans.Thrower;

public class TATest {
	public static void main(String[] args) {
		ProxyFactory pf= new ProxyFactory();
		pf.setTarget(new Thrower());
		pf.addAdvice(new GlobalExceptionLoggingAdvice());
		
		Thrower proxy = (Thrower) pf.getProxy();
		int i = proxy.willThrow(-1);
		System.out.println("i : " + i);
	}
}
