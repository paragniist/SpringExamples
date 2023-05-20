package com.aa.beans;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class LoggingAdvice implements MethodInterceptor {
	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable {
		String methodName = null;
		Object[] args = null;

		methodName = invocation.getMethod().getName();
		args = invocation.getArguments();

		System.out.print("entered into " + methodName + "(");
		for (int i = 0; i < args.length; i++) {
			if (i == 0) {
				System.out.print(args[i]);
				continue;
			}
			System.out.print("," + args[i]);
		}
		System.out.println(")");

		args[0] = (Integer) args[0] + 1;
		args[1] = (Integer) args[1] + 1;

		Object ret = invocation.proceed();
		System.out.println("existing from " + methodName + " with ret : " + ret);
		ret = (Integer) ret + 1;

		return ret;
	}
}
