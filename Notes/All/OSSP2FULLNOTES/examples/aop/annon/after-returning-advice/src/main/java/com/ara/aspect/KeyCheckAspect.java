package com.ara.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class KeyCheckAspect {
	@AfterReturning(value = "within(com.ara.beans.*)", returning = "ret")
	public void validate(JoinPoint jp, Object ret) {
		if ((Integer) ret <= 50) {
			throw new IllegalArgumentException("weak key generated");
		}
	}
}
