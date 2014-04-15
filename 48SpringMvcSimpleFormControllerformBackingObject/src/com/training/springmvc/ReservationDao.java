package com.training.springmvc;

import java.util.List;

public interface ReservationDao {
	
	public  List<Reservation> findAll();
	public void insert(Reservation reservation);
	

}
