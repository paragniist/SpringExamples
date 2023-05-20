package com.aa.beans;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

import com.aa.helper.Cache;

public class CacheAdvice implements MethodInterceptor {
	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable {
		String methodName = null;
		Object[] args = null;
		Cache cache = null;
		String key = null;

		cache = Cache.getInstance();
		methodName = invocation.getMethod().getName();
		args = invocation.getArguments();
		key = methodName + "(";
		for (int i = 0; i < args.length; i++) {
			if (i == 0) {
				key += args[i];
				continue;
			}
			key += "," + args[i];
		}
		key += ")";
		if (cache.containsKey(key)) {
			return cache.get(key);
		}
		Object ret = invocation.proceed();
		cache.put(key, ret);
		return ret;
	}
}
