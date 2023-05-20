package com.sdp.helper;

import com.sdp.beans.HTMLMessageFormatterImpl;
import com.sdp.beans.IMessageFormatter;
import com.sdp.beans.PDFMessageFormatterImpl;

public class MessageFormatterFactory {
	public static IMessageFormatter createMessageFormatter(String type) {
		IMessageFormatter messageFormatter = null;

		if (type.equals("html")) {
			messageFormatter = new HTMLMessageFormatterImpl();
		} else if (type.equals("pdf")) {
			messageFormatter = new PDFMessageFormatterImpl();
		}
		return messageFormatter;
	}
}
