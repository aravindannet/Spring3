package com.training.springmvc;

import java.util.List;

public interface ReservationService {
	
	public List<Reservation> query(String courtName);

}
