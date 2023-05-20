package com.goair2.controller;

import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.goair2.dto.TripDto;
import com.goair2.service.TripService;

import lombok.AllArgsConstructor;

@Controller
@RequestMapping("/trip")
@AllArgsConstructor
public class TripController {
	private final TripService tripService;

	@GetMapping("/available")
	public String showAvailableTrips(Model model) {
		List<TripDto> tripDtos = tripService.getAvailableTrips(new Date());
		model.addAttribute("trips", tripDtos);
		return "available-trips";
	}
}
