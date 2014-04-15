package com.training.jms;

import java.util.Hashtable;

import javax.jms.Destination;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.Queue;
import javax.jms.QueueConnection;
import javax.jms.QueueConnectionFactory;
import javax.jms.QueueReceiver;
import javax.jms.QueueSession;
import javax.jms.Session;
import javax.jms.TextMessage;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import org.springframework.jms.core.JmsTemplate;

public class MessageReceiver {
	
	private JmsTemplate jmsTemplate;
	private Destination destination;
	
	public void setJmsTemplate(JmsTemplate jmsTemplate) {
		this.jmsTemplate = jmsTemplate;
	}

	public void setDestination(Destination destination) {
		this.destination = destination;
	}

	public  void receive() {
		
		try{
		Message message = jmsTemplate.receive(destination);
	      if (message != null) {
	        if (message instanceof TextMessage) {
	          TextMessage textMessage = (TextMessage) message; 
	          System.out.println("Received Message ----->"+textMessage.getText()); 
	        } 
	      } 
		}catch (Exception e) {
			e.printStackTrace();
		}
		
	  } 


	

}
