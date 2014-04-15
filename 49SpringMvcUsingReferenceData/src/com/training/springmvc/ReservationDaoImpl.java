package com.training.springmvc;

import java.sql.Date;
import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.simple.ParameterizedBeanPropertyRowMapper;
import org.springframework.jdbc.core.simple.ParameterizedRowMapper;
import org.springframework.jdbc.core.simple.SimpleJdbcDaoSupport;

public class ReservationDaoImpl  extends SimpleJdbcDaoSupport implements ReservationDao {
	

	public List<Reservation> findAll() {
		String sql= "select * from Reservation";
		List<Reservation> reservations=getSimpleJdbcTemplate().query(sql,ParameterizedBeanPropertyRowMapper.newInstance(Reservation.class));
		return reservations;
	}

	public void insert(Reservation reservation) {
	String sql="insert into ReservationAnother(courtname,date,hour,playername,phone) values(?,?,?,?,?)";
	getSimpleJdbcTemplate().update(sql,reservation.getCourtName(),
			new Date(reservation.getDate().getTime()),reservation.getHour(),
			reservation.getPlayer().getName(),reservation.getPlayer().getPhone());
	
	}

}
