package com.swr.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder(builderMethodName = "of")
public class Ticket {
	String pnrNo;
	String source;
	String destination;
	String[] berthsAlloted;
	String coach;
	String status;

}
