package com.ep.listener;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import com.ep.event.AccountStatementEvent;

@Component
public class AccountStatementListener {
	@EventListener
	public void processStatementEvent(AccountStatementEvent event) {
		System.out.println("received : " + event);
	}
}
