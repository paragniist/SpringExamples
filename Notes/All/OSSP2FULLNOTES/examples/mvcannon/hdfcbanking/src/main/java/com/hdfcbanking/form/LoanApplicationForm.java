package com.hdfcbanking.form;

import java.util.Date;

import javax.validation.constraints.Email;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Past;
import javax.validation.constraints.Positive;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;

@Data
public class LoanApplicationForm {
	@NotBlank(groups = { ApplicationInfoGroup.class })
	private String applicantName;
	@NotBlank(groups = { ApplicationInfoGroup.class })
	private String mobileNo;
	@Email(groups = { ApplicationInfoGroup.class })
	private String emailAddress;
	@Past(groups = { ApplicationInfoGroup.class })
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	private Date dob;
	@NotBlank(groups = { ApplicationInfoGroup.class })
	private String gender;
	@NotBlank(groups = { ApplicationInfoGroup.class })
	private String identificationType;
	@NotBlank(groups = { ApplicationInfoGroup.class })
	private String identificationValue;
	@NotBlank(groups = { LoanInfoGroup.class })
	private String occupation;
	@NotBlank(groups = { LoanInfoGroup.class })
	private String company;
	@Min(value = 10000, groups = { LoanInfoGroup.class })
	private double grossSalary;
	@Positive(groups = { LoanInfoGroup.class })
	private int experience;
	@NotBlank(groups = { LoanInfoGroup.class })
	private String loanType;
	@Positive(groups = { LoanInfoGroup.class })
	private double loanAmount;
	@Positive(groups = { LoanInfoGroup.class })
	private int tenure;

}
