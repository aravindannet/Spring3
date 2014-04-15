package com.training;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MapDemo {

	public static void main(String[] args) {
		ApplicationContext context= new ClassPathXmlApplicationContext("wiringmap.xml");
		SequenceGeneratorWithMap sequenceGenerator=(SequenceGeneratorWithMap)context.getBean("sequenceGenerator");
		System.out.println(sequenceGenerator.getSequence());
		System.out.println(sequenceGenerator.getSequence());

	}

}
