package com.sdp.beans;

public class HTMLMessageFormatterImpl implements IMessageFormatter {
	@Override
	public String formatMessage(String message) {
		return "<html><body>" + message + "</body></html>";
	}

}
