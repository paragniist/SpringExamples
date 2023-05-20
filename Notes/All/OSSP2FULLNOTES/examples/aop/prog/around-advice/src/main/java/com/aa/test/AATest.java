package com.aa.test;

import org.springframework.aop.framework.ProxyFactory;
import org.springframework.aop.support.DefaultPointcutAdvisor;

import com.aa.beans.Calculator;
import com.aa.beans.LoggingAdvice;
import com.aa.beans.LoggingDynamicPointcut;
import com.aa.beans.LoggingStaticPointcut;

public class AATest {
	public static void main(String[] args) {
		ProxyFactory pf = new ProxyFactory();
		pf.setTarget(new Calculator());
		// pf.addAdvice(new CacheAdvice());
		// pf.addAdvice(new LoggingAdvice());
		// DefaultPointcutAdvisor advisor = new DefaultPointcutAdvisor(new
		// LoggingStaticPointcut(), new LoggingAdvice());
		DefaultPointcutAdvisor advisor = new DefaultPointcutAdvisor(new LoggingDynamicPointcut(), new LoggingAdvice());
		pf.addAdvisor(advisor);

		Calculator proxy = (Calculator) pf.getProxy();
		// Calculator proxy = new Calculator();
		int sum = proxy.add(101, 201);
		System.out.println("sum : " + sum);

		int substract = proxy.substract(10, 20);
		System.out.println("substract : " + substract);

		int multiply = proxy.multiply(10, 20);
		System.out.println("multiply : " + multiply);
	}
}
