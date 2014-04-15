package com.spring.jdbc.jdbctemplate.parametervalues;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementSetter;

public class JdbcVehicleDao implements VehicleDao {
	
	private DataSource dataSource;

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}

	public void insert(final Vehicle vehicle) {
		String sql="Insert into Vehicle (VEHICLE_NO,COLOR,WHEEL,SEAT) VALUES (?,?,?,?)";
		JdbcTemplate jdbcTemplate= new JdbcTemplate(dataSource);
		jdbcTemplate.update(sql,new Object[]{vehicle.getVehicleNo(),vehicle.getColor(),
				vehicle.getWheel(),vehicle.getSeat()});

	}
	

	public Vehicle findByVehicleNo(String vehicleNo) {
		String sql="select * from VEHICLE where VEHICLE_NO=?";
		Connection connection=null;
		Vehicle vehicle=null;
		
		try {
			connection=dataSource.getConnection();
			PreparedStatement pStmt=connection.prepareStatement(sql);
			pStmt.setString(1,vehicleNo);	
			
			ResultSet rs=pStmt.executeQuery();
			if(rs.next()){
				vehicle= new Vehicle();
				vehicle.setVehicleNo(rs.getString(1));
				vehicle.setColor(rs.getString(2));
				vehicle.setWheel(rs.getInt(3));
				vehicle.setSeat(rs.getInt(4));
			}
			pStmt.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return vehicle;
	}

	public void delete(Vehicle vehicle) {
		// TODO Auto-generated method stub

	}



	public void update(Vehicle vehicle) {
		// TODO Auto-generated method stub

	}

}
