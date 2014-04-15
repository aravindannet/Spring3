
package com.aop.spring.calculator;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Main {
	public static void main(String[] args) {

			ApplicationContext context =new ClassPathXmlApplicationContext("aspectsinxml.xml");
			ArithmeticCalculator arithmeticCalculator =(ArithmeticCalculator) context.getBean("arithmeticCalculator");
			
			arithmeticCalculator.add(1, 2);
			arithmeticCalculator.sub(4, 3);
			arithmeticCalculator.mul(2, 3);
			arithmeticCalculator.div(4, 2);
		



			}

	}