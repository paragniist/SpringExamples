package com.cdi.beans;

import java.util.List;

public class Parcel {
	private String awbNo;
	private String source;
	private String destination;
	private List<String> goods;

	public Parcel(String awbNo) {
		this.awbNo = awbNo;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public void setGoods(List<String> goods) {
		this.goods = goods;
	}

	@Override
	public String toString() {
		return "Parcel [awbNo=" + awbNo + ", source=" + source + ", destination=" + destination + ", goods=" + goods
				+ "]";
	}

}
