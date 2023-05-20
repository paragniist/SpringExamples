package com.annotation5.lookup;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class SuzkiEngineImpl implements IEngine {

	@Override
	public void start() {
		System.out.println("Suzki engine started");
	}

}
