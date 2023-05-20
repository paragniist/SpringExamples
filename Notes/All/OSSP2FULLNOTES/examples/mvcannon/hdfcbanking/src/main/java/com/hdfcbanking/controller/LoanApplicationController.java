package com.hdfcbanking.controller;

import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.servlet.ModelAndView;

import com.hdfcbanking.exception.LoanNotSupportedException;
import com.hdfcbanking.form.ApplicationInfoGroup;
import com.hdfcbanking.form.LoanApplicationForm;
import com.hdfcbanking.form.LoanInfoGroup;
import com.hdfcbanking.service.NetbankingService;

@Controller
@RequestMapping("/loanApplication")
@SessionAttributes({ "loanApplicationForm" })
public class LoanApplicationController {
	@Autowired
	private NetbankingService netbankingService;
	

	@GetMapping("/applicant-info.htm")
	public String showApplicationInfoFormPage(ModelMap model) {
		LoanApplicationForm form = new LoanApplicationForm();
		model.addAttribute("loanApplicationForm", form);
		return "applicant-info";
	}

	@PostMapping("/applicant-info.htm")
	public String processApplicantInfoAndShowApplyLoanFormPage(
			@ModelAttribute("loanApplicationForm") @Validated(ApplicationInfoGroup.class) LoanApplicationForm loanApplicationForm,
			BindingResult errors, ModelMap model) {

		if (errors.hasErrors()) {
			return "applicant-info";
		}

		return "apply-loan";
	}

	@PostMapping("/apply-loan.htm")
	public String applyLoan(
			@ModelAttribute("loanApplicationForm") @Validated(LoanInfoGroup.class) LoanApplicationForm loanApplicationForm,
			BindingResult errors, ModelMap model, SessionStatus sessionStatus) {

		if (errors.hasErrors()) {
			return "apply-loan";
		}

		System.out.println(loanApplicationForm);
		String referenceNo = netbankingService.applyLoan(loanApplicationForm);
		model.addAttribute("referenceNo", referenceNo);

		sessionStatus.setComplete();
		return "loan-application-confirmation";
	}

}
