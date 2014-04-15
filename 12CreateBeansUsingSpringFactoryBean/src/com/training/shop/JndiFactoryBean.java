package com.training.shop;

import javax.naming.InitialContext;

import org.springframework.beans.factory.config.AbstractFactoryBean;

public class JndiFactoryBean extends AbstractFactoryBean {
	
	private String jndiName;

	public String getJndiName() {
		return jndiName;
	}

	public void setJndiName(String jndiName) {
		this.jndiName = jndiName;
	}

	@Override
	protected Object createInstance() throws Exception {
		
		return new InitialContext().lookup(jndiName);
	}

	@Override
	public Class getObjectType() {
		// TODO Auto-generated method stub
		return new Object().getClass();
	}

	

}
