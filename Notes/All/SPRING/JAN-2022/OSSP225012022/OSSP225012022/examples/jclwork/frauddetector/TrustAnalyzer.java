package com.fd.analyzer;
public class TrustAnalyzer {
	public int getTrustLevel(String uniqueIdentityNo) {
		System.out.println("TrustAnalyzer is loaded by: " + this.getClass().getClassLoader().getClass().getName());
		return 89;
	}
}