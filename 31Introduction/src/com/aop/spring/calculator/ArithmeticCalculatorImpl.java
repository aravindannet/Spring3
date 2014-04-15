package com.aop.spring.calculator;


public class ArithmeticCalculatorImpl implements ArithmeticCalculator {

	public double add(double a, double b) {
		double result = a + b;
		System.out.println(a + " + " + b + " = " + result);
		return result;
	}

	public double div(double a, double b) {
		double result = a / b;
		System.out.println(a + " / " + b + " = " + result);
		return result;
	}

	public double mul(double a, double b) {
		double result = a * b;
		System.out.println(a + " * " + b + " = " + result);
		return result;
	}

	
	public double sub(double a, double b) {
		double result = a - b;
		System.out.println(a + " - " + b + " = " + result);
		return result;
	}

}
