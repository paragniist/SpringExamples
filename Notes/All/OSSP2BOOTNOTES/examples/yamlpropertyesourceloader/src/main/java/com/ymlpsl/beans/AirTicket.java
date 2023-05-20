package com.ymlpsl.beans;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "airticket")
public class AirTicket {
	private String pnrNo;
	private String source;
	private String destination;
	private String flightNo;
	private double price;

	public String getPnrNo() {
		return pnrNo;
	}

	public void setPnrNo(String pnrNo) {
		this.pnrNo = pnrNo;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public String getFlightNo() {
		return flightNo;
	}

	public void setFlightNo(String flightNo) {
		this.flightNo = flightNo;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "AirTicket [pnrNo=" + pnrNo + ", source=" + source + ", destination=" + destination + ", flightNo="
				+ flightNo + ", price=" + price + "]";
	}

}
