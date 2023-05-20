package com.sbr.api;

import java.util.UUID;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.swr.dto.PlanJourney;
import com.swr.dto.Ticket;

@RestController
@RequestMapping("/train")
public class TrainApiController {

	@PostMapping(value = "/book", consumes = { MediaType.APPLICATION_JSON_VALUE }, produces = {
			MediaType.APPLICATION_JSON_VALUE })
	public Ticket bookTicket(@RequestBody PlanJourney planJourney) {
		Ticket ticket = null;

		ticket = Ticket.of().source(planJourney.getSource()).destination(planJourney.getDestination())
				.pnrNo(UUID.randomUUID().toString()).status("CNF").berthsAlloted(new String[] { "S1 12", "S1 13" })
				.build();

		return ticket;
	}
}
