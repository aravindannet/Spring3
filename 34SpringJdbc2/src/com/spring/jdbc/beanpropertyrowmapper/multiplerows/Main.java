package com.spring.jdbc.beanpropertyrowmapper.multiplerows;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context= new ClassPathXmlApplicationContext("beanpropertyrowmappermultiplerows.xml");
		VehicleDao vehicleDao=(VehicleDao)context.getBean("vehicleDao");
		
		List<Vehicle> vehicles=vehicleDao.findAll();
		
		for(Vehicle vehicle :vehicles){
			System.out.println(vehicle.getColor());
		}
	
		

	}

}
