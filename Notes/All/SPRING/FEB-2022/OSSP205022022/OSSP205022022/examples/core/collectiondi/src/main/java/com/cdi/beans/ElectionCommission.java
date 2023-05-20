package com.cdi.beans;

import java.util.Map;

public class ElectionCommission {
	private Map<String, Person> electrolList;

	public void setElectrolList(Map<String, Person> electrolList) {
		this.electrolList = electrolList;
	}

	@Override
	public String toString() {
		return "ElectionCommission [electrolList=" + electrolList + "]";
	}

}
