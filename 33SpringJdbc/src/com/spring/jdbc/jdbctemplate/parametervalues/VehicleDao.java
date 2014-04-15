package com.spring.jdbc.jdbctemplate.parametervalues;

public interface VehicleDao {
	
	public void insert(Vehicle vehicle);
	public void update(Vehicle vehicle);
	public void delete(Vehicle vehicle);
	public Vehicle findByVehicleNo(String vehicleNo);

}
