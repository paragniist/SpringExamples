package com.aa.aspect;

import org.aspectj.lang.ProceedingJoinPoint;

import com.aa.helper.Cache;

public class CacheAspect {
	private Cache cache;

	public Object applyCache(ProceedingJoinPoint pjp) throws Throwable {
		Object ret = null;
		String methodName = null;
		Object[] args = null;
		String key = null;

		methodName = pjp.getSignature().getName();
		args = pjp.getArgs();
		key = methodName + "(";
		for (int i = 0; i < args.length; i++) {
			if (i == 0) {
				key += args[i];
				continue;
			}
			key += "," + args[i];
		}
		key += ")";
		if (cache.containsKey(key) == true) {
			return cache.get(key);
		}
		ret = pjp.proceed();
		cache.put(key, ret);

		return ret;
	}

	public void setCache(Cache cache) {
		this.cache = cache;
	}

}
