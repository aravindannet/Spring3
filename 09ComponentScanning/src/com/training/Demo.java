package com.training;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {

	public static void main(String[] args) {
		ApplicationContext context= new ClassPathXmlApplicationContext("componentscan.xml");
		SequenceGenerator sequenceGenerator=(SequenceGenerator)context.getBean("sequenceGenerator");
		System.out.println(sequenceGenerator.getSequence());
		System.out.println(sequenceGenerator.getSequence());

	}

}
