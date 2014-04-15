package com.training.springmvc;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.web.bind.ServletRequestDataBinder;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;
import org.springframework.web.servlet.mvc.SimpleFormController;

public class MakeReservationController extends SimpleFormController {
	
	private ReservationDao reservationDao;
	
	public MakeReservationController() {
		setCommandClass(Reservation.class);
		setCommandName("reservation");
		setFormView("askReservationDetails");
		setSuccessView("redirect:reservationSuccess.htm");
		setValidator(new ReservationValidator());
	}

	public void setReservationDao(ReservationDao reservationDao) {
		this.reservationDao = reservationDao;
	}
	
	protected Map referenceData(HttpServletRequest request) throws Exception {
		Map map=new HashMap<String,List<String>>();
		List<String> courtNames= new ArrayList<String>();
		courtNames.add("A");
		courtNames.add("B");
		courtNames.add("C");
		map.put("courtNames", courtNames);
		return map;
	}
	
	protected Object formBackingObject(HttpServletRequest request)
			throws Exception {
		Reservation reservation=(Reservation)super.formBackingObject(request);
		reservation.setPlayer(new Player());
		return reservation;
	}
	
	protected void initBinder(HttpServletRequest request,
			ServletRequestDataBinder binder) throws Exception {
		super.initBinder(request, binder);
		DateFormat dateFormat= new SimpleDateFormat("yyyy-MM-dd");
		binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat,false));
	}
	
	protected ModelAndView onSubmit(Object command) throws Exception {
		Reservation reservation=(Reservation)command;
		reservationDao.insert(reservation);
		return new ModelAndView(getSuccessView());
	}
   
	

}
