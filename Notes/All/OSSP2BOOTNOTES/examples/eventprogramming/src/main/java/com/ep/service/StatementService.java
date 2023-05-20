package com.ep.service;

import java.time.LocalDate;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.stereotype.Component;

import com.ep.event.AccountStatementEvent;

@Component
public class StatementService implements ApplicationEventPublisherAware {
	private ApplicationEventPublisher applicationEventPublisher;

	public void emailStatement(LocalDate fromDate, LocalDate toDate, String emailAddress) {
		AccountStatementEvent event = new AccountStatementEvent(this);
		event.setFromDate(fromDate);
		event.setToDate(toDate);
		event.setEmailAddress(emailAddress);
		applicationEventPublisher.publishEvent(event);
	}

	@Override
	public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
		this.applicationEventPublisher = applicationEventPublisher;
	}

}
