package com.factorybeans.beans;

import java.util.Calendar;

import org.springframework.beans.factory.FactoryBean;

public class CalendarFactoryBean implements FactoryBean<Calendar> {
	private int day;
	private int month;
	private int year;
	private int hours;
	private int minutes;

	public CalendarFactoryBean(int day, int month, int year, int hours, int minutes) {
		this.day = day;
		this.month = month;
		this.year = year;
		this.hours = hours;
		this.minutes = minutes;
	}

	@Override
	public Calendar getObject() throws Exception {
		Calendar calendar = null;
		
		System.out.println("getObject()");
		calendar = Calendar.getInstance();
		calendar.set(year, month, day, hours, minutes);
		return calendar;
	}

	@Override
	public Class<?> getObjectType() {
		System.out.println("getObjectType()");
		return Calendar.class;
	}

	@Override
	public boolean isSingleton() {
		System.out.println("isSingleton()");
		return false;
	}

}
