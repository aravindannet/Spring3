package com.training.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class ValidatingHandler implements InvocationHandler {
	private Object target=null;
	public ValidatingHandler(Object target) {
		this.target=target;
	}

	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		for(int i=0;i<args.length;i++	){
			validate((Double)args[0]);
		}
		
		return method.invoke(target, args);
	}
	
	public void validate(double a){
		System.out.println("Validating "+a);
		if(a<0){
			throw new IllegalArgumentException();
		}
	}

}
