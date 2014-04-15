package com.aop.spring.calculator;

public class MinCalculatorImpl implements MinCalculator {

	public double min(double a, double b) {
		double result=(a<=b)?a:b;
		System.out.println("Min("+a+","+b+") ="+result);
		return result;
	}

}
