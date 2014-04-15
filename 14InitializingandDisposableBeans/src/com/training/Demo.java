package com.training;

import java.io.IOException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {

	public static void main(String[] args) throws IOException {
		AbstractApplicationContext context= new ClassPathXmlApplicationContext("lifecycleusingxml.xml");
		context.registerShutdownHook();
		Cashier cashier=(Cashier)context.getBean("cashier1");
		cashier.checkOut();
		
	}

}
