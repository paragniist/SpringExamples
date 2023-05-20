package com.ucdi.beans;

import java.util.List;

public class Contract {
	private int contractNo;
	private String title;
	private List<String> works;

	public void setContractNo(int contractNo) {
		this.contractNo = contractNo;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setWorks(List<String> works) {
		this.works = works;
	}

	@Override
	public String toString() {
		return "Contract [contractNo=" + contractNo + ", title=" + title + ", works=" + works + ", worksType : "
				+ works.getClass().getCanonicalName() + "]";
	}

}
