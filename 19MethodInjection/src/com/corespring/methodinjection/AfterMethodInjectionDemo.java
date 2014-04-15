package com.corespring.methodinjection;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class AfterMethodInjectionDemo {

	public static void main(String[] args) {
		BeanFactory factory= new ClassPathXmlApplicationContext("aftermethodinjection.xml");
		Performer magician= (Performer)factory.getBean("magician");
		magician.perform();

	}

}
