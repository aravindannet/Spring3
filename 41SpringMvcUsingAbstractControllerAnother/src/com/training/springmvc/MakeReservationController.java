package com.training.springmvc;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

public class MakeReservationController extends AbstractController {
	
	private ReservationDao reservationDao;

	public void setReservationDao(ReservationDao reservationDao) {
		this.reservationDao = reservationDao;
	}

	protected ModelAndView handleRequestInternal(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
			String courtName=request.getParameter("courtName");
			String pDate=request.getParameter("date");
			int time=Integer.parseInt(request.getParameter("hour"));
			SimpleDateFormat sdf= new SimpleDateFormat("yyyy-MM-dd");
			Date date=sdf.parse(pDate);
			Reservation reservation= new Reservation(courtName,date,time);
			reservationDao.insert(reservation);
		return new ModelAndView("redirect:reservationSuccess.htm");
					
	}

}
