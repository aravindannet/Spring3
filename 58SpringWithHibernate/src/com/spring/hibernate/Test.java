package com.spring.hibernate;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.dialect.MySQL5Dialect;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;


public class Test {

	public static void main(String[] args) {
		//BeanFactory factory=new XmlBeanFactory(new FileSystemResource("D:\\spring\\SpringAppWs\\HibernateSpring\\src\\com\\spring\\hibernate\\hibernateannotations.xml"));
		//Dao dao=(Dao)factory.getBean("testDao");
		//dao.insert();
		//new MySQL5Dialect
		//System.out.println(dao.query());
		//System.out.println("Inserted  successfully");
		
		ApplicationContext context= new ClassPathXmlApplicationContext("hibernatespringtest.xml");
		Dao dao=(Dao)context.getBean("testDao");
		dao.insert();

	}

}
