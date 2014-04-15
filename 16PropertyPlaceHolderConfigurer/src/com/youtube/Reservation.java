package com.youtube;

import java.util.Random;
import java.util.Scanner;

public class Reservation {
	
	private Mode train;;
	private Mode bus;
	
	public Mode getTrain() {
		return train;
	}
	public void setTrain(Mode train) {
		this.train = train;
	}
	public Mode getBus() {
		return bus;
	}	
	public void setBus(Mode bus) {
		this.bus = bus;
	}
	
	public void getTicket()
	{
		System.out.println("What do you want to book? Bus or Train? Type it");
		Scanner scan = new Scanner(System.in);
		String str = scan.next();
		
		if(str.equalsIgnoreCase("Train"))
		{
			System.out.println(getTrain().getName() +" reservation is "+ new Random().nextInt());
		}
		if(str.equalsIgnoreCase("Bus"))
		{
			System.out.println(getBus().getName() +" reservation is "+ new Random().nextInt());
		}
		
	}
	
	
	public void init()
	{
		System.out.println("Started");
	}
	
	public void cleanUp()
	{
		System.out.println("Destroyed");
	}
	

}
