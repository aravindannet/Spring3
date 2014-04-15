package com.training;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetDemo {

	public static void main(String[] args) {
		ApplicationContext context= new ClassPathXmlApplicationContext("wiringrset.xml");
		SequenceGeneratorWithSet sequenceGenerator=(SequenceGeneratorWithSet)context.getBean("sequenceGenerator");
		System.out.println(sequenceGenerator.getSequence());
		System.out.println(sequenceGenerator.getSequence());

	}

}
