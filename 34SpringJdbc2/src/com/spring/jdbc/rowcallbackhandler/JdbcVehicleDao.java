package com.spring.jdbc.rowcallbackhandler;

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
		final Vehicle vehicle= new Vehicle();
		JdbcTemplate jdbcTemplate= new JdbcTemplate(dataSource);
		jdbcTemplate.query(sql,new Object[]{vehicleNo},new RowCallbackHandler(){

			public void processRow(ResultSet rs) throws SQLException {
				vehicle.setVehicleNo(rs.getString(1));
				vehicle.setColor(rs.getString(2));
				vehicle.setWheel(rs.getInt(3));
				vehicle.setSeat(rs.getInt(4));
			}
			
		});
		return vehicle;
	}

	




	public void insert(Vehicle vehicle) {
		
	}
	public void delete(Vehicle vehicle) {
	}



	public void update(Vehicle vehicle) {

	}



}
