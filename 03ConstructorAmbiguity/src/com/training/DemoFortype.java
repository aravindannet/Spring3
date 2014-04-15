package com.training;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DemoFortype {

	public static void main(String[] args) {
		ApplicationContext context= new ClassPathXmlApplicationContext("constructorinjectionambiguityusingtypeattribute.xml");
		SequenceGeneratorForTypeAmbiguity sequenceGenerator=(SequenceGeneratorForTypeAmbiguity)context.getBean("sequenceGenerator");
		System.out.println(sequenceGenerator.getSequence());
		System.out.println(sequenceGenerator.getSequence());

	}

}
