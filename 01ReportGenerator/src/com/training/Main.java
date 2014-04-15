package com.training;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class Main {

	public static void main(String[] args) {
		BeanFactory factory= new XmlBeanFactory(new ClassPathResource("injection.xml"));
		ReportService reportService=(ReportService)factory.getBean("reportService");
		reportService.generateAnnualReport(null);
	}

}
