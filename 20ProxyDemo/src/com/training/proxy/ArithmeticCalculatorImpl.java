package com.training.proxy;



public class ArithmeticCalculatorImpl implements ArithmeticCalculator {
	//Logger logger=Logger.getLogger(ArithmeticCalculatorImpl.class);

	public double add(double a, double b) {
		//validate(a);
		//validate(b);
		//logger.info("The method add() begins with " + a + ", " + b);
		double result=a+b;
		//logger.info("The method add() ends with " + result);
		return result;
	}

	public double divide(double a, double b) {
		//validate(a);
		//validate(b);
		//logger.info("The method divide() begins with " + a + ", " + b);
		double result=a/b;
		//logger.info("The method divide() ends with " + result);
		return result;
	}

	public double multiply(double a, double b) {
		//validate(a);
		//validate(b);
	//	logger.info("The method multiply() begins with " + a + ", " + b);
		double result=a*b;
		//logger.info("The method divide() ends with " + result);
		return result;
	}

	public double subtract(double a, double b) {
		//validate(a);
		//validate(b);
//		logger.info("The method subtract() begins with " + a + ", " + b);
		double result=a-b;
	//	logger.info("The method divide() ends with " + result);
		return result;
	}
	
	public void validate(double a){
		if(a<0){
			throw new IllegalArgumentException();
		}
	}

}
