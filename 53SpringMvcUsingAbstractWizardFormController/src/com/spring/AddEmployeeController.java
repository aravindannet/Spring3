package com.spring;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.validation.BindException;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractWizardFormController;

public class AddEmployeeController extends AbstractWizardFormController {
	EmployeeDao  employeeDao;

	public EmployeeDao getEmployeeDao() {
		return employeeDao;
	}

	public void setEmployeeDao(EmployeeDao employeeDao) {
		this.employeeDao = employeeDao;
	}

	public AddEmployeeController() {
		setCommandClass(Employee.class);
		setCommandName("employee");
	}
	@Override
	protected ModelAndView processFinish(HttpServletRequest request,
			HttpServletResponse response, Object command, BindException errors)
			throws Exception {
		Employee employee=(Employee)command;
		employeeDao.addEmployee(employee);
		return new ModelAndView(getPages()[getPages().length-1],"employee",employee);
	}
	
	protected ModelAndView processCancel(HttpServletRequest request,
			HttpServletResponse response, Object command, BindException errors)
			throws Exception {
			return new ModelAndView("cancel");
			}

}
