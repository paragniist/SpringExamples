package com.zomota.form;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Coupon {
	private String referal;
	private String offerType;
	private String appliedTo;

	@Override
	public String toString() {
		return referal + offerType + appliedTo;
	}

}
