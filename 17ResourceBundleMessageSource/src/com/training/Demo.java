package com.training;

import java.io.IOException;
import java.util.Date;
import java.util.Locale;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.ResourceBundleMessageSource;

public class Demo {

	public static void main(String[] args) throws IOException {
		ApplicationContext context= new ClassPathXmlApplicationContext("resourcebundle.xml");
		System.out.println(context.getMessage("test", new Object[]{"Siva",new Date()}, Locale.getDefault()));
		
	}

}
