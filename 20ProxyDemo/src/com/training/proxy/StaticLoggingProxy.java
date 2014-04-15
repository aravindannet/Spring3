package com.training.proxy;

import java.lang.reflect.Method;

public class StaticLoggingProxy implements ArithmeticCalculator {
	ArithmeticCalculator calculator=new ArithmeticCalculatorImpl();
	LoggingHandler handler= new LoggingHandler(calculator);
	public double add(double a, double b) {
		Class calculatorClass=calculator.getClass();
		Object returnValue=null;
		try {
			Method method=calculatorClass.getMethod("add",double.class,double.class);
			returnValue=handler.invoke(this, method, new Double[]{a,b});
			
		} catch (Throwable e) {
			e.printStackTrace();
		}
		return ((Double)returnValue).doubleValue();
	}

	public double divide(double a, double b) {
		Class calculatorClass=calculator.getClass();
		Object returnValue=null;
		try {
			Method method=calculatorClass.getMethod("divide",double.class,double.class);
			returnValue=handler.invoke(this, method, new Double[]{a,b});
			
		} catch (Throwable e) {
			e.printStackTrace();
		}
		return ((Double)returnValue).doubleValue();
	}

	public double multiply(double a, double b) {
		Class calculatorClass=calculator.getClass();
		Object returnValue=null;
		try {
			Method method=calculatorClass.getMethod("multiply",double.class,double.class);
			returnValue=handler.invoke(this, method, new Double[]{a,b});
			
		} catch (Throwable e) {
			e.printStackTrace();
		}
		return ((Double)returnValue).doubleValue();
	}

	public double subtract(double a, double b) {
		Class calculatorClass=calculator.getClass();
		Object returnValue=null;
		try {
			Method method=calculatorClass.getMethod("subtract",double.class,double.class);
			returnValue=handler.invoke(this, method, new Double[]{a,b});
			
		} catch (Throwable e) {
			e.printStackTrace();
		}
		return ((Double)returnValue).doubleValue();
	}

}
