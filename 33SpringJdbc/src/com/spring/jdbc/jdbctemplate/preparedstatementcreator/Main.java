package com.spring.jdbc.jdbctemplate.preparedstatementcreator;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context= new ClassPathXmlApplicationContext("preparedstatementsetter.xml");
		VehicleDao vehicleDao=(VehicleDao)context.getBean("vehicleDao");
		Vehicle vehicle= new Vehicle();
		vehicle.setVehicleNo("4");
		vehicle.setColor("Green");	
		vehicle.setWheel(6);
		vehicle.setSeat(3);
		vehicleDao.insert(vehicle);
		System.out.println(" Vehicle is Inserted");
		/*Vehicle vehicle=vehicleDao.findByVehicleNo("2");
		System.out.println("Vehicle Color is "+vehicle.getColor());*/
	
		

	}

}
