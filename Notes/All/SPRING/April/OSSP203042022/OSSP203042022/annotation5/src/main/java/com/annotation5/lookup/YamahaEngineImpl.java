package com.annotation5.lookup;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class YamahaEngineImpl implements IEngine {

	@Override
	public void start() {
		System.out.println("yamaha engine started : " + this.hashCode());
	}

}
