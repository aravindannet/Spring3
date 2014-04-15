package com.aop.spring.calculator;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.DeclareParents;

@Aspect
public class CalculatorIntroduction {

	@DeclareParents(value="com.aop.spring.calculator.ArithmeticCalculatorImpl",
		defaultImpl=MaxCalculatorImpl.class)
	public MaxCalculator maxCalculator;
	
	@DeclareParents(value="com.aop.spring.calculator.ArithmeticCalculatorImpl",
			defaultImpl=MinCalculatorImpl.class)
	public MinCalculator minCalculator;
}
