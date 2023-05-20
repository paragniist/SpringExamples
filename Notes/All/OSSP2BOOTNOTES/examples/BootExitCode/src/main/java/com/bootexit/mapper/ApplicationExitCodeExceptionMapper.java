package com.bootexit.mapper;

import org.springframework.boot.ExitCodeExceptionMapper;
import org.springframework.stereotype.Component;

@Component
public class ApplicationExitCodeExceptionMapper implements ExitCodeExceptionMapper {

	@Override
	public int getExitCode(Throwable exception) {
		if (exception.getCause() instanceof NullPointerException) {
			return 100;
		}
		return 0;
	}

}
