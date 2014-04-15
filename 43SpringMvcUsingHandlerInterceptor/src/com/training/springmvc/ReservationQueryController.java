package com.training.springmvc;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.BeanNameUrlHandlerMapping;
import org.springframework.web.servlet.mvc.AbstractController;

public class ReservationQueryController extends AbstractController {
	
	public ReservationService reservationService;

	public void setReservationService(ReservationService reservationService) {
		this.reservationService = reservationService;
	}

	protected ModelAndView handleRequestInternal(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		
		
		
		return new ModelAndView("reservationList","reservations",reservationService.queryAll());
	}

}
