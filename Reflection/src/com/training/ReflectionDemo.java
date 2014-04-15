package com.training;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class ReflectionDemo {

	public static void main(String[] args) throws Exception {
		Class c=User.class;
		User u=(User)c.newInstance();
		Constructor constructor=c.getConstructor(int.class,String.class);
		User u1=(User)constructor.newInstance(1,"Hi");
		Method m=c.getMethod("getName",null);
		System.out.println(m.invoke(u1, null));

	}

}
