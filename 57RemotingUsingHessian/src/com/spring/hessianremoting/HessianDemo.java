package com.spring.hessianremoting;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HessianDemo {

	
	public static void main(String[] args) {
		BeanFactory factory= new ClassPathXmlApplicationContext("remotingclient.xml");
		Hello hello=(Hello)factory.getBean("helloHessianService");
		System.out.println(hello.sayHello());

	}

}
