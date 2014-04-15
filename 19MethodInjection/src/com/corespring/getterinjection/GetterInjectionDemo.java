package com.corespring.getterinjection;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class GetterInjectionDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		BeanFactory factory= new ClassPathXmlApplicationContext("gettermethodinjection.xml");
		Instrumentalist performer=(Instrumentalist)factory.getBean("guitarist");
		performer.perform();

	}

}
