package com.spring.jdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context= new ClassPathXmlApplicationContext("springjdbc.xml");
		VehicleDao vehicleDao=(VehicleDao)context.getBean("vehicleDao");
		Vehicle vehicle= new Vehicle();
		vehicle.setVehicleNo("2");
		vehicle.setColor("White");	
		vehicle.setWheel(3);
		vehicle.setSeat(2);
		vehicleDao.insert(vehicle);
		System.out.println(" Vehicle is Inserted");
		/*Vehicle vehicle=vehicleDao.findByVehicleNo("2");
		System.out.println("Vehicle Color is "+vehicle.getColor());*/
	
		

	}

}
