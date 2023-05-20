package com.annotation5.profiles;

// no source code
public class Team {
	private int teamNo;
	private String teamName;

	void setTeamNo(int teamNo) {
		this.teamNo = teamNo;
	}

	void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	@Override
	public String toString() {
		return "Team [teamNo=" + teamNo + ", teamName=" + teamName + "]";
	}

}
