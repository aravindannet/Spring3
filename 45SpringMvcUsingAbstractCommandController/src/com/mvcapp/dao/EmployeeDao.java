package com.mvcapp.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.simple.ParameterizedRowMapper;
import org.springframework.jdbc.core.simple.SimpleJdbcDaoSupport;

import com.mvcapp.Employee;

public class EmployeeDao extends SimpleJdbcDaoSupport{
	

	
	public void addEmployee(Employee employee){
		getSimpleJdbcTemplate().update("insert into employee values(?,?,?,?,?)", employee.getName(),employee.getEid(),employee.getSalary(),employee.getCity(),employee.getCountry());
		
	}
	

}
