package com.ql.main;
import com.ql.processor.*;

public class QuickLoanApplication {
	public static void main(String[] args) {
		LoanManager loanManager = new LoanManager();
		boolean loanStatus = loanManager.approveLoan("LN09383", "UI02993");
		System.out.println("loan approved? : " + loanStatus);
	}
}