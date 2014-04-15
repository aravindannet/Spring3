package com.mvcapp;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.validation.BindException;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractCommandController;

import com.mvcapp.dao.EmployeeDao;

public class AddEmployeeController extends AbstractCommandController{
	EmployeeDao employeeDao;

	
	
	public EmployeeDao getEmployeeDao() {
		
		return employeeDao;
	}
	public void setEmployeeDao(EmployeeDao employeeDao) {
		this.employeeDao = employeeDao;
	}
	protected ModelAndView handle(HttpServletRequest request, HttpServletResponse response, Object command, BindException errors) throws Exception {
		
		Employee employee=(Employee)command;
		employeeDao.addEmployee(employee);
		return new ModelAndView("displaySuccess","employee",employee);
	}

}
