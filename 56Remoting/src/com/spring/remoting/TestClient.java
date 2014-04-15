package com.spring.remoting;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class TestClient {

	public static void main(String[] args) {
		BeanFactory factory= new ClassPathXmlApplicationContext("remotingclient.xml");
		Hello hello=(Hello)factory.getBean("helloService");
		System.out.println(hello.sayHello());

	}

}
