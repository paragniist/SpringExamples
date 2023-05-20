package com.ahi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class OurMissionController {

	@RequestMapping("/our-mission.htm")
	public String showOurMissionPage() {
		return "our-mission";
	}
}
