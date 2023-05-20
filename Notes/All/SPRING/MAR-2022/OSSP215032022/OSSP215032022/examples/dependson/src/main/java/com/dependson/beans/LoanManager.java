package com.dependson.beans;

import java.util.Properties;

public class LoanManager {
	private Cache cache;

	public double interestAmount(long principle, int tenure, String city) throws Exception {
		double interestAmount = 0.0;
		Properties props = null;
		float ri = 0;

		if (cache.containsKey("ri") == false) {
			throw new Exception("no data found in cache");
		}
		props = (Properties) cache.get("ri");
		if (props.containsKey(city) == false) {
			throw new Exception("city not found");
		}
		ri = Float.parseFloat(props.getProperty(city));
		interestAmount = (principle * tenure * ri) / 100;

		return interestAmount;
	}

	public void setCache(Cache cache) {
		this.cache = cache;
	}

}
