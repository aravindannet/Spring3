package com.youtube;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Start {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("youtube.xml");
		Reservation reserve = (Reservation) context.getBean("reservation");
		reserve.getTicket();
		
	}

}
