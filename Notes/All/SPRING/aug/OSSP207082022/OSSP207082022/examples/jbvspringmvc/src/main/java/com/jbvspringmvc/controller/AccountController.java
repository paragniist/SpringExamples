package com.jbvspringmvc.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jbvspringmvc.dto.AccountDto;
import com.jbvspringmvc.form.OpenAccountForm;
import com.jbvspringmvc.validator.OpenAccountFormValidator;

@Controller
@RequestMapping("/account")
public class AccountController {
	@Autowired
	private OpenAccountFormValidator openAccountFormValidator;

	@InitBinder
	public void initBinder(WebDataBinder binder) {
		binder.addValidators(openAccountFormValidator);
	}

	@GetMapping("/new.htm")
	public String showOpenAccountForm(ModelMap model) {
		OpenAccountForm form = new OpenAccountForm();
		model.addAttribute("openAccountForm", form);
		return "open-account";
	}

	@PostMapping("/new.htm")
	public String openAccount(@ModelAttribute("openAccountForm") @Valid OpenAccountForm openAccountForm,
			BindingResult errors, ModelMap model) {
		AccountDto accountDto = null;

		if (errors.hasErrors()) {
			return "open-account";
		}
		accountDto = AccountDto.builder().accountNo("Ac93838")
				.accountHolderName(openAccountForm.getFirstName() + " " + openAccountForm.getLastName()).balance(1000)
				.status("active").build();
		model.addAttribute("account", accountDto);
		return "account-details";
	}
}
