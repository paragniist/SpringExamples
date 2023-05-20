package com.cp.beans;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "policy")
public class Policy {
	private int policyNo;
	private String policyHolderName;
	private int tenure;
	private String planName;
	private double insurredAmount;
	private String planType;

	public int getPolicyNo() {
		return policyNo;
	}

	public void setPolicyNo(int policyNo) {
		this.policyNo = policyNo;
	}

	public String getPolicyHolderName() {
		return policyHolderName;
	}

	public void setPolicyHolderName(String policyHolderName) {
		this.policyHolderName = policyHolderName;
	}

	public int getTenure() {
		return tenure;
	}

	public void setTenure(int tenure) {
		this.tenure = tenure;
	}

	public String getPlanName() {
		return planName;
	}

	public void setPlanName(String planName) {
		this.planName = planName;
	}

	public double getInsurredAmount() {
		return insurredAmount;
	}

	public void setInsurredAmount(double insurredAmount) {
		this.insurredAmount = insurredAmount;
	}

	public String getPlanType() {
		return planType;
	}

	public void setPlanType(String planType) {
		this.planType = planType;
	}

	@Override
	public String toString() {
		return "Policy [policyNo=" + policyNo + ", policyHolderName=" + policyHolderName + ", tenure=" + tenure
				+ ", planName=" + planName + ", insurredAmount=" + insurredAmount + ", planType=" + planType + "]";
	}

}
