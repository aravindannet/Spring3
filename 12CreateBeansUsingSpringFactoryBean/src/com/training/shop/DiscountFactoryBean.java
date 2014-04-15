package com.training.shop;

import org.springframework.beans.factory.config.AbstractFactoryBean;

public class DiscountFactoryBean extends AbstractFactoryBean {
	
	private Product product;
	private double discount;

	public void setProduct(Product product) {
		this.product = product;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}

	@Override
	protected Object createInstance() throws Exception {
		product.setPrice(product.getPrice()*(1-discount));
		return product;
	}

	@Override
	public Class getObjectType() {
		// TODO Auto-generated method stub
		return product.getClass();
	}

}
