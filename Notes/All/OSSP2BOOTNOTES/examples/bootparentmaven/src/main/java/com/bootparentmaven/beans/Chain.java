package com.bootparentmaven.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Chain {
	@Value("${chainType}")
	private String chainType;
	@Value("${length}")
	private int length;

	@Override
	public String toString() {
		return "Chain [chainType=" + chainType + ", length=" + length + "]";
	}

}
