package com.sdp.test;

import java.io.FileNotFoundException;
import java.io.IOException;

import com.sdp.beans.IMessageFormatter;
import com.sdp.beans.MessageWriter;
import com.sdp.helper.AppFactory;

public class SDPTest {
	public static void main(String[] args) throws FileNotFoundException, ClassNotFoundException, InstantiationException,
			IllegalAccessException, IOException {
		MessageWriter messageWriter = (MessageWriter) AppFactory.createObject("messageWriter.class");
		IMessageFormatter messageFormatter = (IMessageFormatter) AppFactory.createObject("messageFormatter.class");
		messageWriter.setMessageFormatter(messageFormatter);

		messageWriter.writeMessage("Welcome to Strategy Design Pattern");
	}
}
