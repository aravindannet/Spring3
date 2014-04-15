package com.aop.spring.calculator;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Main {
	public static void main(String[] args) {

			ApplicationContext context =new ClassPathXmlApplicationContext("introduction.xml");
			ArithmeticCalculator arithmeticCalculator =
			(ArithmeticCalculator) context.getBean("arithmeticCalculator");
			
			MinCalculator minCalculator=(MinCalculator)arithmeticCalculator;
			minCalculator.min(4,5);
			MaxCalculator maxCalculator=(MaxCalculator)arithmeticCalculator;
			maxCalculator.max(6, 7);

			
			


			}

	}