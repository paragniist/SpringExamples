package com.npjt.dao;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import com.npjt.bo.CustomerBo;

@Repository
public class CustomerDao {
	private final String SQL_COUNT_CUSTOMERS_BY_GENDER = "select count(1) from customer where gender=:gender";
	private final String SQL_UPD_CUSTOMER_BY_CUSTOMER_NO = "update customer set customer_nm=:customerName, dob=:dob where customer_no = :customerNo";
	private final String SQL_INS_CUSTOMER = "insert into customer(customer_no, customer_nm, gender, dob) values(:customerNo, :customerName, :gender, :dob)";

	private NamedParameterJdbcTemplate npJdbcTemplate;

	public CustomerDao(NamedParameterJdbcTemplate npJdbcTemplate) {
		this.npJdbcTemplate = npJdbcTemplate;
	}

	public int getCustomerCountByGender(String gender) {
		Map<String, Object> paramMap = null;

		paramMap = new HashMap<String, Object>();
		paramMap.put("gender", gender);
		return npJdbcTemplate.queryForObject(SQL_COUNT_CUSTOMERS_BY_GENDER, paramMap, Integer.class);
	}

	public int updateCustomer(int customerNo, String customerName, Date dob) {
		MapSqlParameterSource paramSource = new MapSqlParameterSource();
		paramSource.addValue("customerNo", customerNo);
		paramSource.addValue("customerName", customerName);
		paramSource.addValue("dob", dob);
		return npJdbcTemplate.update(SQL_UPD_CUSTOMER_BY_CUSTOMER_NO, paramSource);
	}

	public int saveCustomer(CustomerBo bo) {
		BeanPropertySqlParameterSource paramSource = new BeanPropertySqlParameterSource(bo);
		return npJdbcTemplate.update(SQL_INS_CUSTOMER, paramSource);
	}
}
