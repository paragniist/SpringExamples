package com.corebanking.service;
public class AccountService {
	public double getAccountBalance(String accountNo) {
		System.out.println("AccountService is loaded by : " + this.getClass().getClassLoader().getClass().getName());
		return 230;
	}
}