package com.spring.jdbc.beanpropertyrowmapper.multiplerows;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowCallbackHandler;





public class JdbcVehicleDao implements VehicleDao {
	
	private DataSource dataSource;

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}


	public List<Vehicle> findAll() {
		String sql="select * from VEHICLE ";
		JdbcTemplate jdbcTemplate= new JdbcTemplate(dataSource);
		
		List<Vehicle> vehicles=jdbcTemplate.query(sql,new BeanPropertyRowMapper(Vehicle.class));
		return vehicles;
	
	}

	public Vehicle findByVehicleNo(String vehicleNo) {
		String sql="select * from VEHICLE where VEHICLE_NO=?";
		JdbcTemplate jdbcTemplate= new JdbcTemplate(dataSource);
		
		Vehicle vehicle=(Vehicle)jdbcTemplate.queryForObject(sql,new Object[]{vehicleNo},
						 new BeanPropertyRowMapper(Vehicle.class));
		return vehicle;
	}



	public void insert(Vehicle vehicle) {
		
	}
	public void delete(Vehicle vehicle) {
	}



	public void update(Vehicle vehicle) {

	}




}
