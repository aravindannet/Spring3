package com.training;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DemoForPosition {

	public static void main(String[] args) {
		ApplicationContext context= new ClassPathXmlApplicationContext("constructorinjectionambiguityusingindexattribute.xml");
		SequenceGeneratorForIndex sequenceGenerator=(SequenceGeneratorForIndex)context.getBean("sequenceGeneratorwithindex");
		System.out.println(sequenceGenerator.getSequence());
		System.out.println(sequenceGenerator.getSequence());

	}

}
