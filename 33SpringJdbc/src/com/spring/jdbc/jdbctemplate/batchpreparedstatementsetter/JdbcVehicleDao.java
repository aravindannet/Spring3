package com.spring.jdbc.jdbctemplate.batchpreparedstatementsetter;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.BatchPreparedStatementSetter;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.simple.SimpleJdbcTemplate;

public class JdbcVehicleDao implements VehicleDao {
	
	private DataSource dataSource;

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}
	
	public void insertBatch( final List<Vehicle> vehicles) {
		String sql="Insert into Vehicle (VEHICLE_NO,COLOR,WHEEL,SEAT) VALUES (?,?,?,?)";
		JdbcTemplate jdbcTemplate= new JdbcTemplate(dataSource);
		
		
		jdbcTemplate.batchUpdate(sql,new BatchPreparedStatementSetter(){

			public int getBatchSize() {
				return vehicles.size();
			}

			public void setValues(PreparedStatement ps, int i)
					throws SQLException {
				Vehicle vehicle=vehicles.get(i);
				ps.setString(1, vehicle.getVehicleNo());
				ps.setString(2,vehicle.getColor());
				ps.setInt(3,vehicle.getWheel());
				ps.setInt(4,vehicle.getSeat());	
			}
			
		});
		
	}

	public void insert(Vehicle vehicle) {
		
	}
	public Vehicle findByVehicleNo(String vehicleNo) {
		
		return null;
	}

	public void delete(Vehicle vehicle) {
	}



	public void update(Vehicle vehicle) {

	}



}
