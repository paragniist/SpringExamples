package com.profiles.annotaion;
//no sourcecode
public class Motor {
	private int hp;
	private FuelTank fuelTank;
	public void setHp(int hp) {
		this.hp = hp;
	}
	public void setFuelTank(FuelTank fuelTank) {
		this.fuelTank = fuelTank;
	}
	@Override
	public String toString() {
		return "Motor [hp=" + hp + ", fuelTank=" + fuelTank + "]";
	}
	
	
}
