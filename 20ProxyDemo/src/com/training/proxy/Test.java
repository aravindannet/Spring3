package com.training.proxy;

import java.lang.reflect.Proxy;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ArithmeticCalculatorImpl impl=new ArithmeticCalculatorImpl();
		
		ArithmeticCalculator arithmeticCalculator;//=(ArithmeticCalculator);
			
			Object loggingProxy=Proxy.newProxyInstance(impl.getClass().getClassLoader(), impl.getClass().getInterfaces(), 
					new LoggingHandler(impl));//new StaticLoggingProxy();//new ArithmeticCalculatorImpl();
			
		arithmeticCalculator=(ArithmeticCalculator)	loggingProxy;
		//Object validationProxy=Proxy.newProxyInstance(arithmeticCalculator.getClass().getClassLoader(), arithmeticCalculator.getClass().getInterfaces(), 
			//	new ValidatingHandler(arithmeticCalculator));
		//arithmeticCalculator=(ArithmeticCalculator)validationProxy;
		arithmeticCalculator.add(5,4);
		arithmeticCalculator.divide(6,3);
		arithmeticCalculator.subtract(4,2);
		arithmeticCalculator.multiply(3,4);
		//UnitCalculator unitCalculator= new UnitCalculatorImpl();
		//unitCalculator.kilogramToPound(1);
		//unitCalculator.kilometerToMile(1);

	}

}
