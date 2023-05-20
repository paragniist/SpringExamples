package com.cdi.beans;

import java.util.Set;

public class Store {
	private int storeNo;
	private String storeName;
	private String location;
	private Set<Staff> staff;

	public Store(int storeNo) {
		this.storeNo = storeNo;
	}

	public void setStoreName(String storeName) {
		this.storeName = storeName;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public void setStaff(Set<Staff> staff) {
		this.staff = staff;
	}

	@Override
	public String toString() {
		return "Store [storeNo=" + storeNo + ", storeName=" + storeName + ", location=" + location + ", staff=" + staff
				+ "]";
	}

}
