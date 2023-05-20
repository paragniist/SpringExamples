package com.hdfcbanking.service;

import java.util.UUID;

import org.springframework.stereotype.Service;

import com.hdfcbanking.exception.LoanNotSupportedException;
import com.hdfcbanking.exception.NotEligibleException;
import com.hdfcbanking.form.LoanApplicationForm;

@Service
public class NetbankingService {
	public String applyLoan(LoanApplicationForm loanApplicationForm) {

		if (loanApplicationForm.getLoanType().equals("house")) {
			throw new LoanNotSupportedException("home loans are not issued as per RBI guidelines");
		}
		if (loanApplicationForm.getExperience() < 10) {
			throw new NotEligibleException();
		}

		return UUID.randomUUID().toString().substring(0, 7);
	}
}
