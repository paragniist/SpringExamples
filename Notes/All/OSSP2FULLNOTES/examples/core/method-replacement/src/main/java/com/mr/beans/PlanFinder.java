package com.mr.beans;

import java.util.Arrays;
import java.util.List;

public class PlanFinder {
	public List<String> findPlans(String ageGroup, int copay, int coverageType, boolean cashless) {
		// write the logic for computing the plans for the given inputs
		return Arrays.asList(new String[] { "plan1", "plan2" });
	}

	public List<String> findPlans(String ageGroup, int copay, int coverageType, boolean cashless, int county) {
		return Arrays.asList(new String[] { "plan5", "plan6", "plan9" });
	}
}
