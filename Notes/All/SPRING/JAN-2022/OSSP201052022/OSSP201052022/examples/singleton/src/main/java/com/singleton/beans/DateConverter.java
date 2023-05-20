package com.singleton.beans;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateConverter {
	private static DateConverter instance;

	private DateConverter() {
		// no-op
	}

	public static DateConverter getInstance() {
		if (instance == null) {
			instance = new DateConverter();
		}
		return instance;
	}

	public Date toDate(String sDate, String pattern) throws ParseException {
		Date date = null;
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		date = sdf.parse(sDate);
		return date;
	}

	public String fromDate(Date date, String format) {
		String sDate = null;
		SimpleDateFormat sdf = new SimpleDateFormat(format);
		sDate = sdf.format(date);
		return sDate;
	}
}
