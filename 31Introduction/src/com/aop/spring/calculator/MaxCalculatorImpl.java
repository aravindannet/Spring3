package com.aop.spring.calculator;

public class MaxCalculatorImpl implements MaxCalculator {

	public double max(double a, double b) {
		double result=(a>=b)?a:b;
		System.out.println("Max("+a+","+b+") ="+result);
		return result;
	}

}
