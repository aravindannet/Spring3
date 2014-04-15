package com.training.proxy;



public class UnitCalculatorImpl implements UnitCalculator {
	//Logger logger=Logger.getLogger(ArithmeticCalculatorImpl.class);
	public double kilogramToPound(double kilogram) {
		validate(kilogram);
		System.out.println("The method kilogramToPound() begins with " + kilogram);
		double pound = kilogram * 2.2;
		System.out.println("The method kilogramToPound() ends with " + pound);
		return pound;
	}

	public double kilometerToMile(double kilometer) {
		validate(kilometer);
		System.out.println("The method kilometerToMile() begins with " + kilometer);
		double mile = kilometer * 0.62;
		System.out.println("The method kilometerToMile() ends with " + mile);
		return mile;
	}
	public void validate(double a){
		if(a<0){
			throw new IllegalArgumentException();
		}
	}
}
