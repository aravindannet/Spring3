package com.training;

import java.io.IOException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {

	public static void main(String[] args) throws IOException {
		ApplicationContext context= new ClassPathXmlApplicationContext("postprocessor.xml");
		Cashier cashier=(Cashier)context.getBean("cashier1");
		cashier.checkOut();
		
	}

}
