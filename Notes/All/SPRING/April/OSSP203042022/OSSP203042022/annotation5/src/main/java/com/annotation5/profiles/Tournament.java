package com.annotation5.profiles;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

// source code
@Component
public class Tournament {
	@Value("${tournamentName}")
	private String tournamentName;
	@Autowired
	private Team team;

	@Override
	public String toString() {
		return "Tournament [tournamentName=" + tournamentName + ", team=" + team + "]";
	}

}
