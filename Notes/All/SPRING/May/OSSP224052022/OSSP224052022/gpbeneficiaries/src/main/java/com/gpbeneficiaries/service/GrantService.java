package com.gpbeneficiaries.service;

import java.util.Date;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.gpbeneficiaries.bo.BeneficiaryBo;
import com.gpbeneficiaries.bo.GrantApplicationBo;
import com.gpbeneficiaries.dao.BeneficiaryDao;
import com.gpbeneficiaries.dao.GrantApplicationDao;
import com.gpbeneficiaries.form.GrantApplicationForm;

@Service
public class GrantService {
	private BeneficiaryDao beneficiaryDao;
	private GrantApplicationDao grantApplicationDao;

	public GrantService(BeneficiaryDao beneficiaryDao, GrantApplicationDao grantApplicationDao) {
		this.beneficiaryDao = beneficiaryDao;
		this.grantApplicationDao = grantApplicationDao;
	}

	@Transactional(readOnly = false)
	public int applyForGrant(GrantApplicationForm grantApplicationForm) {
		int beneficiaryNo = 0;
		int grantApplicationNo = 0;
		BeneficiaryBo beneficiaryBo = null;
		GrantApplicationBo grantApplicationBo = null;

		beneficiaryBo = new BeneficiaryBo();
		beneficiaryBo.setBeneficiaryName(grantApplicationForm.getBeneficiaryName());
		beneficiaryBo.setDob(grantApplicationForm.getDob());
		beneficiaryBo.setGender(grantApplicationForm.getGender());
		beneficiaryBo.setAadharNo(grantApplicationForm.getAadharNo());
		beneficiaryBo.setMobileNo(grantApplicationForm.getMobileNo());
		beneficiaryBo.setEmailAddress(grantApplicationForm.getEmailAddress());

		beneficiaryNo = beneficiaryDao.saveBeneficiary(beneficiaryBo);

		grantApplicationBo = new GrantApplicationBo();
		grantApplicationBo.setBeneficiaryNo(beneficiaryNo);
		grantApplicationBo.setAppliedDate(new Date());
		grantApplicationBo.setGrantType(grantApplicationForm.getGrantType());
		grantApplicationBo.setTenure(grantApplicationForm.getTenure());
		grantApplicationBo.setGrantAmount(grantApplicationForm.getGrantAmount());
		if (grantApplicationForm.getGrantType().equals("crop")) {
			grantApplicationBo.setInterestRate(6.1f);
		} else if (grantApplicationForm.getGrantType().equals("fisheries")) {
			grantApplicationBo.setInterestRate(4.5f);
		}
		grantApplicationNo = grantApplicationDao.saveGrantApplication(grantApplicationBo);

		return grantApplicationNo;
	}
}
