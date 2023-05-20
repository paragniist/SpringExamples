package com.beanlifecycle.beans;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Rectangle implements InitializingBean, DisposableBean {
	private double length;
	private double breadth;
	private double area;

	public Rectangle(double length) {
		this.length = length;
	}

	public void setBreadth(double breadth) {
		this.breadth = breadth;
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("afterPropertiesSet()");
		this.area = this.length * this.breadth;
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("destroy()");
		this.area = 0;
	}

	@Override
	public String toString() {
		return "Rectangle [length=" + length + ", breadth=" + breadth + ", area=" + area + "]";
	}

	public void init() {
		System.out.println("Rectangle initialized...");
		this.area = this.length * this.breadth;
	}

	public void release() {
		System.out.println("Rectangle destroyed...");
		this.area = 0;
	}

}
