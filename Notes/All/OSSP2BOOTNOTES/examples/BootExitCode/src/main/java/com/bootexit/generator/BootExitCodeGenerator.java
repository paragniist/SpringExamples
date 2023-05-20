package com.bootexit.generator;

import org.springframework.boot.ExitCodeGenerator;
import org.springframework.stereotype.Component;

@Component
public class BootExitCodeGenerator implements ExitCodeGenerator {

	@Override
	public int getExitCode() {
		return 10;
	}

}
