package com.sdp.helper;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class AppFactory {
	private static Properties props;
	static {
		try {
			props = new Properties();
			props.load(AppFactory.class.getClassLoader().getResourceAsStream("appClasses.properties"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static Object createObject(String lclassname) throws FileNotFoundException, IOException,
			ClassNotFoundException, InstantiationException, IllegalAccessException {
		// Properties props = null;
		String fqnClass = null;
		Class<?> clazz = null;
		Object obj = null;

		// props = new Properties();
		/**
		 * props.load(new FileInputStream(new File(
		 * "D:\\work\\master\\spring\\20211023\\core\\strategydp\\src\\main\\resources\\appClasses.properties")));
		 **/
		/*
		 * InputStream in =
		 * AppFactory.class.getClassLoader().getResourceAsStream("appClasses.properties"
		 * ); props.load(in);
		 */

		fqnClass = props.getProperty(lclassname);
		clazz = Class.forName(fqnClass);
		obj = clazz.newInstance();

		return obj;
	}
}
