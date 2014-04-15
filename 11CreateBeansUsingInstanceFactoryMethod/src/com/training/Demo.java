package com.training;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {

	public static void main(String[] args) {
		ApplicationContext context= new ClassPathXmlApplicationContext("instancefactorymethod.xml");
		Product battery=(Product)context.getBean("aaa");
		Product disc=(Product)context.getBean("cdrw");
		System.out.println(battery.getName());
		System.out.println(disc.getName());
	}

}
