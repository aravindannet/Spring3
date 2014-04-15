package com.training.springmvc;

import java.util.ArrayList;
import java.util.List;

public class ReservationServiceImpl implements ReservationService {
	
	private ReservationDao reservationDao;

	public ReservationDao getReservationDao() {
		return reservationDao;
	}
	
	List<Reservation> reservations;

	public void init(){
		reservations=reservationDao.findAll();
	}
	public void setReservationDao(ReservationDao reservationDao) {
		this.reservationDao = reservationDao;
	}

	public List<Reservation> query(String courtName) {
		List<Reservation> result=new ArrayList<Reservation>();
		for(Reservation reservation:reservations){
			if(reservation.getCourtName().equals(courtName)){
				result.add(reservation);
			}
		}
		return result;
	}

}
