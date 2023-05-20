package com.ql.processor;
import com.fd.analyzer.*;

public class LoanManager {
	TrustAnalyzer trustAnalyzer;
	public boolean approveLoan(String loanNo, String uniqueIdentityNo) {
		trustAnalyzer = new TrustAnalyzer();
		int trustLevel = trustAnalyzer.getTrustLevel(uniqueIdentityNo);
		if(trustLevel >= 60) {
			return true;
		}
		return false;
	}
}