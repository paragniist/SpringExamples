package com.sdp.beans;

public class MessageWriter {
	private IMessageFormatter messageFormatter;

	public void writeMessage(String message) {
		String cMessage = null;

		// messageFormatter = new HTMLMessageFormatterImpl();
		// messageFormatter = MessageFormatterFactory.createMessageFormatter("pdf");
		cMessage = messageFormatter.formatMessage(message);
		System.out.println(cMessage);
	}

	public void setMessageFormatter(IMessageFormatter messageFormatter) {
		this.messageFormatter = messageFormatter;
	}

}
