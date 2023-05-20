package com.ata.aspect;

import org.aspectj.lang.JoinPoint;

public class GlobalExceptionLoggingAspect {
	public void logException(JoinPoint jp, IllegalArgumentException iae) {
		System.out.println(jp.getSignature().getName() + " has throw exception with message :" + iae.getMessage());
	}
}
