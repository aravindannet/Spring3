package com.spring.jdbc.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class VehicleRowMapper implements RowMapper {

	public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
		Vehicle vehicle= new Vehicle();
		vehicle.setVehicleNo(rs.getString(1));
		vehicle.setColor(rs.getString(2));
		vehicle.setWheel(rs.getInt(3));
		vehicle.setSeat(rs.getInt(4));
		return vehicle;
	}

}
