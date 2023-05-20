package com.jbvspringmvc.validator;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.jbvspringmvc.form.OpenAccountForm;

@Component
public class OpenAccountFormValidator implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		return clazz.isAssignableFrom(OpenAccountForm.class);
	}

	@Override
	public void validate(Object target, Errors errors) {
		OpenAccountForm form = (OpenAccountForm) target;

		if (errors.hasFieldErrors("mobileNo") == false) {
			// make a db call to verify the mobileNo already registered into account table
			// or not
			if (form.getMobileNo().equals("9999911111")) {
				errors.rejectValue("mobileNo", "mobileNo.alreadyRegistered");
			}
		}
	}

}
