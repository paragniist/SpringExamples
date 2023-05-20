package com.beanautowiring.beans;

public class Salesorder {
	private Distributor distributor;
	private TransportType transportType;

	/*
	 * public void setDistributor(Distributor distributor) {
	 * System.out.println("setDistributor(Distributor distributor)");
	 * this.distributor = distributor; }
	 */
	public Salesorder(TransportType transportType) {
		System.out.println("Salesorder(TransportType transportType)");
		this.transportType = transportType;
	}

	public Salesorder(Distributor distributor) {
		System.out.println("Salesorder(Distributor distributor)");
		this.distributor = distributor;
	}

	/*
	 * public Salesorder(Distributor distributor, TransportType transportType) {
	 * System.out.
	 * println("Salesorder(Distributor distributor, TransportType transportType)");
	 * this.distributor = distributor; this.transportType = transportType; }
	 */
	@Override
	public String toString() {
		return "Salesorder [distributor=" + distributor + ", transportType=" + transportType + "]";
	}

}
