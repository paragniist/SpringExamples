package com.dependson.beans;

import java.io.IOException;
import java.util.Properties;

public class CityRIPropsAccessorImpl implements IAccessor {
	private String key;

	@Override
	public void setKey(String key) {
		this.key = key;
	}

	@Override
	public String getKey() {
		return key;
	}

	@Override
	public Object getData() throws IOException {
		Properties props = null;

		props = new Properties();
		props.load(this.getClass().getClassLoader().getResourceAsStream("city-ri.properties"));

		return props;
	}

}
