package com.bootjdbc.dao;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.bootjdbc.bo.PassengerBo;

import lombok.AllArgsConstructor;

@Repository
@AllArgsConstructor
public class PassengerDao {
	private final String SQL_GET_PASSENGERS = "select passenger_no, fullname, age, gender from passenger";

	private final JdbcTemplate jdbcTemplate;

	public List<PassengerBo> getPassengers() {
		return jdbcTemplate.query(SQL_GET_PASSENGERS, (rs, rowNum) -> {
			PassengerBo bo = PassengerBo.of(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getString(4));
			return bo;
		});
	}

}
