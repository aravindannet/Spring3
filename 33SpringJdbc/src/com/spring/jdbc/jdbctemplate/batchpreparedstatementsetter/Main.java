package com.spring.jdbc.jdbctemplate.batchpreparedstatementsetter;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context= new ClassPathXmlApplicationContext("batchpreparedstatementsetter.xml");
		VehicleDao vehicleDao=(VehicleDao)context.getBean("vehicleDao");
		Vehicle vehicle1= new Vehicle();
		vehicle1.setVehicleNo("6");
		vehicle1.setColor("White");	
		vehicle1.setWheel(3);
		vehicle1.setSeat(2);
		Vehicle vehicle2= new Vehicle();
		vehicle2.setVehicleNo("7");
		vehicle2.setColor("White");	
		vehicle2.setWheel(3);
		vehicle2.setSeat(2);
		List<Vehicle> vehicles= new ArrayList<Vehicle>();
		vehicles.add(vehicle1);
		vehicles.add(vehicle2);
		vehicleDao.insertBatch(vehicles);
		System.out.println(" Vehicles is Inserted");
		/*Vehicle vehicle=vehicleDao.findByVehicleNo("2");
		System.out.println("Vehicle Color is "+vehicle.getColor());*/
	
		

	}

}
