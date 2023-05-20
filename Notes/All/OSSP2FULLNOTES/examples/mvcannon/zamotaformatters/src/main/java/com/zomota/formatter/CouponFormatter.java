package com.zomota.formatter;

import java.text.ParseException;
import java.util.Locale;

import org.springframework.format.Formatter;

import com.zomota.form.Coupon;

public class CouponFormatter implements Formatter<Coupon> {
	private String type;

	public CouponFormatter(String type) {
		this.type = type;
	}

	@Override
	public String print(Coupon object, Locale locale) {
		return object.getReferal() + object.getOfferType() + object.getAppliedTo();
	}

	@Override
	public Coupon parse(String text, Locale locale) throws ParseException {
		String referal = null;
		String offerType = null;
		String appliedTo = null;
		Coupon coupon = null;

		if (text == null || text.trim().length() == 0) {
			throw new ParseException("coupon is blank", 0);
		}

		if (type.equals("referal")) {
			if (text.trim().length() != 13) {
				throw new ParseException("coupon is not a valid referal code", 0);
			}
			referal = text.substring(0, 5);
			offerType = text.substring(5, 10);
			appliedTo = text.substring(10, 13);
		} else if (type.equals("partner")) {
			if (text.trim().length() != 9) {
				throw new ParseException("coupon is not a valid partner code", 0);
			}
			referal = text.substring(0, 3);
			offerType = text.substring(3, 7);
			appliedTo = text.substring(7, 9);
		}
		coupon = new Coupon();
		coupon.setReferal(referal);
		coupon.setOfferType(offerType);
		coupon.setAppliedTo(appliedTo);

		return coupon;
	}

}
