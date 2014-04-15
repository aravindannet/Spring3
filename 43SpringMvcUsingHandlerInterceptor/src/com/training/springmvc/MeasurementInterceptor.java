package com.training.springmvc;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

public class MeasurementInterceptor implements HandlerInterceptor {
	
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response,
			Object handler) throws Exception {
		
		long startTime=System.currentTimeMillis();
		request.setAttribute("startTime", startTime);
		System.out.println(" Start time is "+startTime);
		return true;
	}
	
	public void postHandle(HttpServletRequest request, HttpServletResponse response,
			Object handler, ModelAndView mav) throws Exception {
			long startTime=(Long)request.getAttribute("startTime");
			request.removeAttribute("startTime");
			long endTime=System.currentTimeMillis();
			System.out.println("Ending Time is "+endTime);
			mav.addObject("handlingTime",startTime-endTime);

	}

	public void afterCompletion(HttpServletRequest arg0,
			HttpServletResponse arg1, Object arg2, Exception arg3)
			throws Exception {
			System.out.println(" In After Completion....."+System.currentTimeMillis());

	}





}
