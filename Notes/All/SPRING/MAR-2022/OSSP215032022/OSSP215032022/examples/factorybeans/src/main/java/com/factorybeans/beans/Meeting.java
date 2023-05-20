package com.factorybeans.beans;

import java.util.Arrays;
import java.util.Calendar;

public class Meeting {
	private String subject;
	private String[] participants;
	private Calendar meetingTime;

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public void setParticipants(String[] participants) {
		this.participants = participants;
	}

	public void setMeetingTime(Calendar meetingTime) {
		this.meetingTime = meetingTime;
	}

	@Override
	public String toString() {
		return "Meeting [subject=" + subject + ", participants=" + Arrays.toString(participants) + ", meetingTime="
				+ meetingTime.getTime() + "]";
	}

}
