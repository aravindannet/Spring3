package com.training.withtransactiousingtransactiontemplate;

import java.sql.SQLException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) throws SQLException {
		ApplicationContext context= new ClassPathXmlApplicationContext("withtransactionusingtransactiontemplate.xml");
		BookShop bookshop=(BookShop)context.getBean("bookShop");
		bookshop.purchase("0001", "user1");
		
		

	}
}
