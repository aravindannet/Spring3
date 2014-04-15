package com.spring.hibernate;

import hello.Message;

import java.util.List;

import org.springframework.orm.hibernate3.HibernateTemplate;

public class HibernateDao implements Dao {
	
	HibernateTemplate hibernateTemplate;

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

	public void insert() {
		Message message=new Message();
		message.setId(new Long(5));
		message.setText("Helllllooooooooo ");
		hibernateTemplate.save(message);
	}

	public List query() {
	//	hibernateTemplate.getSessionFactory().openSession();
		//Message m=(Message)hibernateTemplate.load(Message.class, new Long(1));
		//System.out.println(m);
		return hibernateTemplate.find("from hello.Message");
	}

}
