package com.training.springmvc;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

public class ReservationQueryController extends AbstractController {
	
	public ReservationService reservationService;

	public void setReservationService(ReservationService reservationService) {
		this.reservationService = reservationService;
	}

	protected ModelAndView handleRequestInternal(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		
		Map<String,Object> model= new HashMap<String, Object>();	
		String courtName=request.getParameter("courtName");
		if(courtName!=null){
			model.put("courtName",courtName);
			model.put("reservations", reservationService.query(courtName));
		}
		return new ModelAndView("reservationList",model);
	}

}
