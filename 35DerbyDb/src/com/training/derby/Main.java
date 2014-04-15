package com.training.derby;

import java.sql.SQLException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {


	public static void main(String[] args) throws SQLException {
		ApplicationContext context= new ClassPathXmlApplicationContext("derby.xml");
		CreateTable tableCreator=(CreateTable)context.getBean("tableCreator");
		
		//tableCreator.drop();
		//tableCreator.create();
		//tableCreator.insert();
		tableCreator.display();
		

	}
}
