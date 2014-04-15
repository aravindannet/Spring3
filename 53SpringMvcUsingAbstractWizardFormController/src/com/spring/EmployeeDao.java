package com.spring;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.simple.ParameterizedRowMapper;
import org.springframework.jdbc.core.simple.SimpleJdbcDaoSupport;



public class EmployeeDao extends SimpleJdbcDaoSupport{
	
	public List<Employee> getEmployeeDetails(String empName){
		return	getSimpleJdbcTemplate().query("select * from employee where name= ?", new ParameterizedRowMapper<Employee>(){

				public Employee mapRow(ResultSet rs, int arg1) throws SQLException {
					Employee e= new Employee();
					e.setName(rs.getString(1));e.setEid(rs.getInt(2));e.setSalary(rs.getInt(3));
					e.setCity(rs.getString(4));e.setCountry(rs.getString(5));
					return e;
				}
				
			}, empName);
		
	}
	
	public void addEmployee(Employee employee){
		getSimpleJdbcTemplate().update("insert into employee values(?,?,?,?,?)", employee.getName(),employee.getEid(),employee.getSalary(),employee.getCity(),employee.getCountry());
		
	}
	public void editEmployee(Employee employee){
		getSimpleJdbcTemplate().update("update employee set eid=?,salary=?,city=?,country=? where name=? ", employee.getEid(),employee.getSalary(),employee.getCity(),employee.getCountry(),employee.getName());
		System.out.println("In editEmployee");
	}
	

}
