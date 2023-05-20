package com.up.main;
import com.up.products.*;

public class Spindle {
	public static void main(String[] args) throws Exception {
		ClassLoader cl = Spindle.class.getClassLoader();
		System.out.println("Spindle is loaded by : " + cl.getClass().getName());
		ClassLoader cl2 = cl.getParent();
		System.out.println("cl.getParent() :" + cl2.getClass().getName());
		ClassLoader cl3 = cl2.getParent();
		System.out.println("cl2.getParent() : "+  cl3);
		
		Claypot cp = new Claypot();
		System.out.println("Claypot cp object is loaded by : " +cp.getClass().getClassLoader().getClass().getName());
		
		Class clazz = Class.forName("com.up.products.Claypot", true, cl);//re-load using sys/app classloader
		System.out.println("Claypot clazz ref is loaded by :" + clazz.getClassLoader().getClass().getName());		
	}
}