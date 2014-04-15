package com.training.springmvc;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;
import org.springframework.web.servlet.mvc.Controller;

public class WelcomeController extends AbstractController {
	
	public WelcomeController() {
		System.out.println("=============Inside WelcomeController()===============");
	}

	protected ModelAndView handleRequestInternal(HttpServletRequest arg0,
			HttpServletResponse arg1) throws Exception {
		Date date= new Date();
		return new ModelAndView("welcome","todaydate",date);
	}

}
