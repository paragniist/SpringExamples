package com.acw.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MeetingController {
	
	@RequestMapping("/meeting.htm")
	public String showMeetingPage() {
		return "meeting";
	}
}
