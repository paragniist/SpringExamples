package com.dependson.beans;

public interface IAccessor {
	void setKey(String key);

	String getKey();

	Object getData() throws Exception;
}
