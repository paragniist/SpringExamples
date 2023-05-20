package com.ara.aspect;

import org.aspectj.lang.JoinPoint;

public class KeyCheckAspect {
	public void validate(JoinPoint jp, Object ret) {
		if ((Integer) ret <= 50) {
			throw new IllegalArgumentException("weak key generated exception");
		}
	}
}
