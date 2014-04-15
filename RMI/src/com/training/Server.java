package com.training;

import java.net.MalformedURLException;
import java.rmi.AlreadyBoundException;
import java.rmi.Naming;
import java.rmi.RemoteException;

public class Server {


	public static void main(String[] args) throws RemoteException, MalformedURLException, AlreadyBoundException {
		HelloImpl hello= new HelloImpl();
		Naming.bind("helloservice", hello);
		

	}

}
