package com.training.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Arrays;



public class LoggingHandler implements InvocationHandler {
	private Object target;
	
	public LoggingHandler(Object target) {
		this.target=target;
	
	}

	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		System.out.println("The method " + method.getName() + "() begins with "
				+ Arrays.toString(args));
		Object result = method.invoke(target, args);
		// Log the method ending with the returning result.
		System.out.println("The method " + method.getName() + "() ends with " + result);
		return result;
	}

}
