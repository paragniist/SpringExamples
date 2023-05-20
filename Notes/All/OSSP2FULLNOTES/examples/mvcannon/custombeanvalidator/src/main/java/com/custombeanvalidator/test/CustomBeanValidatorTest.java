package com.custombeanvalidator.test;

import java.util.Set;

import com.custombeanvalidator.beans.LoanApplication;

import custombeanvalidator.validator.AgricultureGroup;
import custombeanvalidator.validator.GoldLoanGroup;
import custombeanvalidator.validator.Severity;
import jakarta.validation.ConstraintViolation;
import jakarta.validation.Path.Node;
import jakarta.validation.Payload;
import jakarta.validation.Validation;
import jakarta.validation.Validator;
import jakarta.validation.ValidatorFactory;

public class CustomBeanValidatorTest {
	public static void main(String[] args) {
		ValidatorFactory validatorFactory = Validation.buildDefaultValidatorFactory();
		Validator validator = validatorFactory.getValidator();
		LoanApplication loanApplication = LoanApplication.builder().loanApplicationNo(-1).applicantName("Fox")
				.loanType("agriculture").acres(0).tenure(10).emailAddress("fox@gmail.com").loanAmount(1000)
				.contactNo("938938944").build();

		Set<ConstraintViolation<LoanApplication>> constraintViolations = validator.validate(loanApplication,
				AgricultureGroup.class);
		constraintViolations.forEach(constraintViolation -> {
			Set<Class<? extends Payload>> payloads = constraintViolation.getConstraintDescriptor().getPayload();
			for (Class<? extends Payload> payload : payloads) {
				if (payload == Severity.FATAL.class) {
					System.out.println(constraintViolation.getConstraintDescriptor().getAnnotation().annotationType().getName());
					for (Node node : constraintViolation.getPropertyPath()) {
						System.out.println(node.getName());
					}
				}
			}
		});
	}
}
