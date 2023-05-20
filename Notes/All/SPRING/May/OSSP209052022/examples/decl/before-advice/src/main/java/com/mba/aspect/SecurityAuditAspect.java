package com.mba.aspect;

import org.aspectj.lang.JoinPoint;

import com.mba.exception.BadCredentialsException;
import com.mba.security.helper.AuthenticationManager;

public class SecurityAuditAspect {
	private AuthenticationManager authenticationManager;

	public SecurityAuditAspect(AuthenticationManager authenticationManager) {
		this.authenticationManager = authenticationManager;
	}

	public void audit(JoinPoint jp) {
		String methodName = null;
		Object[] args = null;

		methodName = jp.getSignature().getName();
		args = jp.getArgs();

		// audit the method execution
		System.out.print(authenticationManager.getLoggedInUser() + " has called " + methodName + "(");
		for (int i = 0; i < args.length; i++) {
			if (i == 0) {
				System.out.print(args[i]);
				continue;
			}
			System.out.print("," + args[i]);
		}
		System.out.println(")");
	}

	public void applySecurity() {
		if (authenticationManager.authenticate() == false) {
			throw new BadCredentialsException("invalid un/pwd");
		}
	}
}
