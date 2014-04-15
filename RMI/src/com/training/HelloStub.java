package com.training;

import java.rmi.RemoteException;
import java.util.HashMap;

public class HelloStub  implements Hello{

	public String sayHello(String name) throws RemoteException {
		HashMap map= new HashMap();
		map.put("methodName", "sayHello");
		map.put("parameters", new Object[]{name});
		//this map is serialized and sent to The thread on server side
		return null;
	}

}
