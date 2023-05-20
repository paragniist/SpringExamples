package com.zomota.validator;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.zomota.form.BookTableForm;

@Component
public class BookTableFormValidator implements Validator {
	private final List<String> coupons = Arrays.asList(new String[] { "ZMTOF10NW", "ZMTOF40AN", "ZMTSUMRAN" });

	@Override
	public boolean supports(Class<?> clazz) {
		return clazz.isAssignableFrom(BookTableForm.class);
	}

	@Override
	public void validate(Object target, Errors errors) {
		if (target instanceof BookTableForm) {
			BookTableForm form = (BookTableForm) target;

			// goto database and check for coupon code exists or not
			if (errors.hasFieldErrors("coupon") == false) {
				if (coupons.stream().anyMatch(couponCode -> {
					return couponCode.equals(form.getCoupon().toString());
				}) == false) {
					errors.rejectValue("coupon", "coupon.notValid");
				}
			}
		}
	}

}
