package com.ep.listener;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

import com.ep.event.AccountStatementEvent;

@Component
public class StatementListener implements ApplicationListener<AccountStatementEvent> {
	@Override
	public void onApplicationEvent(AccountStatementEvent event) {
		System.out.println("received : " + event);
	}
}
