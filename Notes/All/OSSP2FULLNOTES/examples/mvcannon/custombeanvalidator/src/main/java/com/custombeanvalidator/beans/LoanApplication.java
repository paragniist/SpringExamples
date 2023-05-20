package com.custombeanvalidator.beans;

import custombeanvalidator.validator.AgricultureGroup;
import custombeanvalidator.validator.AutomobileGroup;
import custombeanvalidator.validator.GoldLoanGroup;
import custombeanvalidator.validator.HomeLoanGroup;
import custombeanvalidator.validator.LoanType;
import custombeanvalidator.validator.Severity;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@Builder
@Getter
@ToString
public class LoanApplication {
	@Positive(message = "loanApplicationNo should be non-zero positive number")
	private int loanApplicationNo;
	@NotBlank(message = "applicantName cannot be blank")
	private String applicantName;
	@LoanType(message = "loanType should be one of these values: [home,automobile,agriculture,gold loan]")
	private String loanType;
	@Min(value = 12, message = "tenure should be a minimum of 12 in months")
	@Max(value = 600, message = "tenure cannot exceed a maximum of 600 months")
	private int tenure;
	@Min(value = 10000, message = "loanAmount should be a minimum of 10000 INR")
	@Max(value = 999999999, message = "loanAmount cannot exceed 999999999 INR")
	private double loanAmount;
	@Email(message = "emailAddress is not valid")
	private String emailAddress;
	@NotBlank(message = "contactNo cannot be blank")
	private String contactNo;

	@NotBlank(message = "cropType cannot be blank", groups = { AgricultureGroup.class })
	private String cropType;
	@Positive(message = "acres should be non-zero positive number", groups = { AgricultureGroup.class }, payload = {
			Severity.FATAL.class })
	@Min(value = 5, message = "minimum 5 acres land only eligible for loan", groups = {
			AgricultureGroup.class }, payload = { Severity.ERROR.class })
	@Max(value = 20, message = "maximum 25 acres land only eligible for loan", groups = {
			AgricultureGroup.class }, payload = { Severity.ERROR.class })
	private int acres;

	@NotBlank(message = "vehicleType cannot be blank", groups = { AutomobileGroup.class })
	private String vehicleType;
	@NotBlank(message = "manufacturer cannot be blank", groups = { AutomobileGroup.class })
	private String manufacturer;

	@Positive(message = "grams should be non-zero positive integer", groups = { GoldLoanGroup.class })
	private int grams;
	@NotBlank(message = "purity cannot be blank", groups = { GoldLoanGroup.class })
	private String purity;

	@NotBlank(message = "propertyType cannot be blank", groups = { HomeLoanGroup.class })
	private String propertyType;
	@Positive(message = "sqYards should be non-zero positive integer", groups = { HomeLoanGroup.class })
	private int sqYards;

}
