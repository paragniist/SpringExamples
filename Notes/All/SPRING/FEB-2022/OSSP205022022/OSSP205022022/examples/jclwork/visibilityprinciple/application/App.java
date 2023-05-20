package com.application.main;
import com.corebanking.service.*;

public class App {
	public static void main(String[] args) {		
		System.out.println("App is loaded by : " + App.class.getClassLoader().getClass().getName());
		AccountService accountService = new AccountService();
		double balance = accountService.getAccountBalance("ac0393");
		System.out.println("balance :" + balance);
	}
}