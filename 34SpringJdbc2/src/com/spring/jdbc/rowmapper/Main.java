package com.spring.jdbc.rowmapper;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context= new ClassPathXmlApplicationContext("rowcallbackhandler.xml");
		VehicleDao vehicleDao=(VehicleDao)context.getBean("vehicleDao");
		
		Vehicle vehicle=vehicleDao.findByVehicleNo("3");
		System.out.println("Vehicle Color is "+vehicle.getColor());
	
		

	}

}
