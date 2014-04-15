package com.training.jms;

import java.util.Hashtable;

import javax.jms.Destination;
import javax.jms.JMSException;
import javax.jms.Message;
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

import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;

public class MessageSender {

	private JmsTemplate jmsTemplate;
	private Destination destination;
	
	public void setJmsTemplate(JmsTemplate jmsTemplate) {
		this.jmsTemplate = jmsTemplate;
	}

	public void setDestination(Destination destination) {
		this.destination = destination;
	}

	public  void send() {
		jmsTemplate.send(destination, new MessageCreator(){

			public Message createMessage(Session session) throws JMSException {
					TextMessage message = session.createTextMessage(); 
			      message.setText("This is a TextMessage"); 
			      
				return message;
			}
			
		});
		
		 
		  } 


	

}
