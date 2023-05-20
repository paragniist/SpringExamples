package com.zomota.formatter;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import org.springframework.format.AnnotationFormatterFactory;
import org.springframework.format.Parser;
import org.springframework.format.Printer;

import com.zomota.form.Coupon;
import com.zomota.formatter.annotation.CouponCode;

public class CouponCodeAnnotationFormatterFactory implements AnnotationFormatterFactory<CouponCode> {

	@Override
	public Set<Class<?>> getFieldTypes() {
		return new HashSet<Class<?>>(Arrays.asList(new Class<?>[] { Coupon.class }));
	}

	@Override
	public Printer<?> getPrinter(CouponCode annotation, Class<?> fieldType) {
		CouponFormatter couponFormatter = new CouponFormatter(annotation.type());
		return couponFormatter;
	}

	@Override
	public Parser<?> getParser(CouponCode annotation, Class<?> fieldType) {
		CouponFormatter couponFormatter = new CouponFormatter(annotation.type());
		return couponFormatter;
	}

}
