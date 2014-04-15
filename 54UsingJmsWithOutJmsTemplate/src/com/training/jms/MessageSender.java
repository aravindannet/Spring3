package com.training.jms;

import java.util.Hashtable;

import javax.jms.JMSException;
import javax.jms.Queue;
import javax.jms.QueueConnection;
import javax.jms.QueueConnectionFactory;
import javax.jms.QueueSender;
import javax.jms.QueueSession;
import javax.jms.Session;
import javax.jms.TextMessage;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

public class MessageSender {

	public  void send() {
		 QueueConnection queueConnection = null; 

		    try {
		    	Hashtable map= new Hashtable();
				map.put(Context.INITIAL_CONTEXT_FACTORY, "org.jnp.interfaces.NamingContextFactory");
				map.put(Context.PROVIDER_URL,"localhost");
				map.put(Context.URL_PKG_PREFIXES, "org.jboss.naming:org.jnp.interfaces");      
				
		      Context context = new InitialContext(map); 
		      QueueConnectionFactory queueConnectionFactory = 
		        (QueueConnectionFactory) context.lookup("QueueConnectionFactory"); 
		      String queueName = "queue/testQueue"; 
		      Queue queue = (Queue) context.lookup(queueName); 
		      queueConnection = 
		      queueConnectionFactory.createQueueConnection(); 
		      QueueSession queueSession = 
		        queueConnection.createQueueSession(false, Session.AUTO_ACKNOWLEDGE); 
		      QueueSender queueSender = queueSession.createSender(queue); 
		      TextMessage message = queueSession.createTextMessage(); 
		      message.setText("This is a TextMessage"); 
		      queueSender.send(message); 
		      System.out.println("Message sent."); 
		    } 
		    catch (NamingException e) {
		    	e.printStackTrace();
		      System.out.println("Naming Exception"); 
		    } 
		    catch (JMSException e) {
		      System.out.println("JMS Exception"); 
		    } 
		    finally {
		      if (queueConnection != null) {
		        try {
		          queueConnection.close(); 
		        } 
		        catch (JMSException e) {} 
		      } 
		    } 
		  } 


	

}
