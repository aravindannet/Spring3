package com.training.springmvc;

import java.util.ArrayList;
import java.util.List;

public class ReservationServiceImpl implements ReservationService {
	
	private ReservationDao reservationDao;

	public ReservationDao getReservationDao() {
		return reservationDao;
	}
	
	 

	public void setReservationDao(ReservationDao reservationDao) {
		this.reservationDao = reservationDao;
	}

	public List<Reservation> queryAll() {
		List<Reservation> reservations=reservationDao.findAll();
		return reservations;
	}

}
