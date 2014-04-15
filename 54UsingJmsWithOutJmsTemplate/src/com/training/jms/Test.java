package com.training.jms;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context= new ClassPathXmlApplicationContext("jms.xml");
		MessageSender sender=(MessageSender)context.getBean("messageSender");
		MessageReceiver receiver=(MessageReceiver)context.getBean("messageReceiver");
		sender.send();
		receiver.receive();

	}

}
