package com.hdfcbanking.exception;

public class LoanNotSupportedException extends RuntimeException {

	public LoanNotSupportedException(String message) {
		super(message);
	}

	public LoanNotSupportedException(Throwable cause) {
		super(cause);
	}

}
