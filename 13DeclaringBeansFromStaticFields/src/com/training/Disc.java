package com.training;

public class Disc extends Product {
	private int capacity;
	public Disc() {
		// TODO Auto-generated constructor stub
	}
	public Disc(String name, double price) {
		super(name, price);
		// TODO Auto-generated constructor stub
	}
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

}
