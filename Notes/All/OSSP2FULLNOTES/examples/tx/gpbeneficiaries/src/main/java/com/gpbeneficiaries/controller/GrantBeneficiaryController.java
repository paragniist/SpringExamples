package com.gpbeneficiaries.controller;

import org.springframework.stereotype.Controller;

import com.gpbeneficiaries.form.GrantApplicationForm;
import com.gpbeneficiaries.service.GrantService;

@Controller
public class GrantBeneficiaryController {
	private GrantService grantService;

	public GrantBeneficiaryController(GrantService grantService) {
		this.grantService = grantService;
	}

	public int applyForGrant(GrantApplicationForm grantApplicationForm) {
		int grantApplicationNo = 0;

		grantApplicationNo = grantService.applyForGrant(grantApplicationForm);

		return grantApplicationNo;
	}
}
