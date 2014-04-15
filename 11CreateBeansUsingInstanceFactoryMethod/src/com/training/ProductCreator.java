package com.training;

import java.util.Map;

public class ProductCreator {
	
	private Map<String,Product> products;
	
	public void setProducts(Map<String, Product> products) {
		this.products = products;
	}

	public  Product createProduct(String productId){
		if("aaa".equals(productId)){
			return new Battery("AAA",2.5);
		}else if("cdrw".equals(productId)){
			return new Disc("CD-RW",1.5);
		}
		throw new IllegalArgumentException("Unknown Product");
	}

}
