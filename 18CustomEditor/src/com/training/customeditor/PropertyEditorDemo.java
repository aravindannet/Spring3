package com.training.customeditor;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;



public class PropertyEditorDemo {

	public static void main(String[] args) {
		BeanFactory factory= new ClassPathXmlApplicationContext("customeditor.xml");
		
		Contact contact=(Contact)factory.getBean("contact");
		PhoneNumber phone=contact.getPhone();
		System.out.println("Number is "+phone.getNumber());

	}

}
