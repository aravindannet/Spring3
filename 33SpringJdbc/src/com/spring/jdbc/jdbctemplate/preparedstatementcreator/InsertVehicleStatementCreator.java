package com.spring.jdbc.jdbctemplate.preparedstatementcreator;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.springframework.jdbc.core.PreparedStatementCreator;

public class InsertVehicleStatementCreator implements PreparedStatementCreator {
	
	private Vehicle vehicle;

	public InsertVehicleStatementCreator(Vehicle vehicle) {
		this.vehicle = vehicle;
	}

	public PreparedStatement createPreparedStatement(Connection connection)
			throws SQLException {
		String sql="Insert into Vehicle (VEHICLE_NO,COLOR,WHEEL,SEAT) VALUES (?,?,?,?)";
		PreparedStatement ps=connection.prepareStatement(sql);
		ps.setString(1,vehicle.getVehicleNo());
		ps.setString(2,vehicle.getColor());
		ps.setInt(3,vehicle.getWheel());
		ps.setInt(4,vehicle.getSeat());
		return ps;
	}

}
