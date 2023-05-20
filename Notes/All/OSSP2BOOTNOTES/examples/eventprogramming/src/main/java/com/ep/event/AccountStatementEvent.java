package com.ep.event;

import java.time.LocalDate;

import org.springframework.context.ApplicationEvent;

public class AccountStatementEvent extends ApplicationEvent {
	private LocalDate fromDate;
	private LocalDate toDate;
	private String emailAddress;

	public AccountStatementEvent(Object source) {
		super(source);
	}

	public LocalDate getFromDate() {
		return fromDate;
	}

	public void setFromDate(LocalDate fromDate) {
		this.fromDate = fromDate;
	}

	public LocalDate getToDate() {
		return toDate;
	}

	public void setToDate(LocalDate toDate) {
		this.toDate = toDate;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	@Override
	public String toString() {
		return "AccountStatementEvent [fromDate=" + fromDate + ", toDate=" + toDate + ", emailAddress=" + emailAddress
				+ "]";
	}

}
