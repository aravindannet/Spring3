package com.spring.jdbc.jdbctemplate.parametervalues;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context= new ClassPathXmlApplicationContext("parametervalues.xml");
		VehicleDao vehicleDao=(VehicleDao)context.getBean("vehicleDao");
		Vehicle vehicle= new Vehicle();
		vehicle.setVehicleNo("5");
		vehicle.setColor("violet");	
		vehicle.setWheel(2);
		vehicle.setSeat(4);
		vehicleDao.insert(vehicle);
		System.out.println(" Vehicle is Inserted");
		/*Vehicle vehicle=vehicleDao.findByVehicleNo("2");
		System.out.println("Vehicle Color is "+vehicle.getColor());*/
	
		

	}

}
