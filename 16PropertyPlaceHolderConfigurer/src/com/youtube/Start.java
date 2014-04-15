package com.youtube;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Start {

	public static void main(String[] args) {
	    	System.out.println("Initialising the original factory 1");
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("youtube.xml");
		System.out.println("Initialising the original factory 2");
		context.registerShutdownHook();
		Reservation reserve = (Reservation) context.getBean("reservation");
		reserve.getTicket();
		
		
	}

}
