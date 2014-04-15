package com.spring.hessianremoting;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class ServiceStarter {

	public static void main(String[] args) {
		BeanFactory factory= new ClassPathXmlApplicationContext("remotingservice.xml");

	}

}
