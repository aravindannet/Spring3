package com.spring.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;





public class JdbcVehicleDao implements VehicleDao {
	
	private DataSource dataSource;

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}
	


	public void insert(Vehicle vehicle) {
		String sql="Insert into Vehicle (VEHICLE_NO,COLOR,WHEEL,SEAT) VALUES (?,?,?,?)";
		Connection connection=null;
		try {
			connection=dataSource.getConnection();
			PreparedStatement ps=connection.prepareStatement(sql);
			ps.setString(1, vehicle.getVehicleNo());
			ps.setString(2,vehicle.getColor());
			ps.setInt(3,vehicle.getWheel());
			ps.setInt(4,vehicle.getSeat());	
			ps.executeUpdate();
			ps.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
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
	}



	public void update(Vehicle vehicle) {

	}



}
