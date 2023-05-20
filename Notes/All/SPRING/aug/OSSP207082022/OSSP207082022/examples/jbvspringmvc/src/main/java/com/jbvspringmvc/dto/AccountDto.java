package com.jbvspringmvc.dto;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class AccountDto {
	private String accountNo;
	private String accountHolderName;
	private double balance;
	private String status;

}
