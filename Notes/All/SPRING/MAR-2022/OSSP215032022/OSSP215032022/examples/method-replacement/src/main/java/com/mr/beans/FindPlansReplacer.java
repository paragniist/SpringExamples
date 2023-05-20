package com.mr.beans;

import java.lang.reflect.Method;
import java.util.Arrays;

import org.springframework.beans.factory.support.MethodReplacer;

public class FindPlansReplacer implements MethodReplacer {
	@Override
	public Object reimplement(Object obj, Method method, Object[] args) throws Throwable {
		if (method.getName().equals("findPlans")) {
			String ageGroup = (String) args[0];
			int copay = (Integer) args[1];
			int coverageType = (Integer) args[2];
			boolean cashless = (Boolean) args[3];

			System.out.println(
					method.getName() + "(" + ageGroup + "," + copay + "," + coverageType + "," + cashless + ")");
			return Arrays.asList(new String[] { "plan3", "plan4" });
		}
		return null;
	}

}
