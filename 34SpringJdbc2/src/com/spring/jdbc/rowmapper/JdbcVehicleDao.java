package com.spring.jdbc.rowmapper;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowCallbackHandler;





public class JdbcVehicleDao implements VehicleDao {
	
	private DataSource dataSource;

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}
	

	public Vehicle findByVehicleNo(String vehicleNo) {
		String sql="select * from VEHICLE where VEHICLE_NO=?";
		JdbcTemplate jdbcTemplate= new JdbcTemplate(dataSource);
		Vehicle vehicle=(Vehicle)jdbcTemplate.queryForObject(sql,new Object[]{vehicleNo},
						new VehicleRowMapper());
		return vehicle;
	}



	public void insert(Vehicle vehicle) {
		
	}
	public void delete(Vehicle vehicle) {
	}



	public void update(Vehicle vehicle) {

	}



}
