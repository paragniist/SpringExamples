package com.annotation5.xmlstereotype2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

// source code
@Component
public class Job {
	@Value("#{applicationProperties.jobNo}")
	private int jobNo;
	@Value("#{applicationProperties.jobTitle}")
	private String jobTitle;
	@Autowired
	private Company company;

	@Override
	public String toString() {
		return "Job [jobNo=" + jobNo + ", jobTitle=" + jobTitle + ", company=" + company + "]";
	}

}
