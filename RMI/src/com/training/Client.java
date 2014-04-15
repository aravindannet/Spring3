package com.training;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

public class Client {

	public static void main(String[] args) throws MalformedURLException, RemoteException, NotBoundException {
		Hello hello=(Hello)Naming.lookup("rmi://localhost/helloservice");
		System.out.println(hello.sayHello("Siva"));

	}

}
