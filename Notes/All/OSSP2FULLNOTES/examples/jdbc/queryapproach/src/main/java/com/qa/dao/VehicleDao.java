package com.qa.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.qa.bo.VehicleBo;

@Repository
public class VehicleDao {
	private final String SQL_NO_OF_VEHICLES = "select count(1) from vehicles";
	private final String SQL_MAX_LEASE_AMOUNT = "select max(lease_amount) from vehicles";
	private final String SQL_GET_MODEL_NM_BY_VEHCILE_NO = "select model_nm from vehicles where vehicle_no = ?";
	private final String SQL_GET_VEHICLE_BY_VEHICLE_NO = "select vehicle_no, model_nm, manufacturer, color, lease_amount from vehicles where vehicle_no = ?";
	private final String SQL_GET_VEHICLES_BY_MODEL_NM = "select vehicle_no, model_nm, manufacturer, color, lease_amount from vehicles where model_nm like ?";
	private final String SQL_GET_VEHICLES_BY_MANUFACTURER = "select vehicle_no, model_nm, lease_amount from vehicles where manufacturer like ?";
	private final String SQL_INSERT_VEHICLE = "insert into vehicles(vehicle_no, model_nm, manufacturer, registration_no, color, fuel_type, lease_amount) values(?,?,?,?,?,?,?)";

	@Autowired
	private JdbcTemplate jdbcTemplate;

	public int getNoOfVehicles() {
		return jdbcTemplate.queryForObject(SQL_NO_OF_VEHICLES, Integer.class);
		/**
		 * if our sql query is returning one-single value as an outcome then we need to
		 * use queryForObject(sql, returnType)
		 * 
		 */
	}

	public float maxLeaseAmount() {
		return jdbcTemplate.queryForObject(SQL_MAX_LEASE_AMOUNT, Float.class);
	}

	public String findModelName(int vehicleNo) {
		return jdbcTemplate.queryForObject(SQL_GET_MODEL_NM_BY_VEHCILE_NO, String.class, vehicleNo);
	}

	public VehicleBo getVehicle(int vehicleNo) {
		return jdbcTemplate.queryForObject(SQL_GET_VEHICLE_BY_VEHICLE_NO, new VehicleBoRowMapper(), vehicleNo);
	}

	public List<VehicleBo> getVehicles(String modelName) {
		return jdbcTemplate.query(SQL_GET_VEHICLES_BY_MODEL_NM, new VehicleBoRowMapper(), "%" + modelName + "%");
	}

	public List<Map<String, Object>> getVehiclesByManufacturer(String manufacturer) {
		return jdbcTemplate.queryForList(SQL_GET_VEHICLES_BY_MANUFACTURER, manufacturer);
	}

	public int saveVehicle(VehicleBo bo) {
		return jdbcTemplate.update(SQL_INSERT_VEHICLE, bo.getVehicleNo(), bo.getModelName(), bo.getManufacturer(),
				bo.getRegistrationNo(), bo.getColor(), bo.getFuelType(), bo.getLeaseAmount());
	}

	private final class VehicleBoRowMapper implements RowMapper<VehicleBo> {
		@Override
		public VehicleBo mapRow(ResultSet rs, int rowNum) throws SQLException {
			VehicleBo bo = null;

			bo = new VehicleBo();
			bo.setVehicleNo(rs.getInt(1));
			bo.setModelName(rs.getString(2));
			bo.setManufacturer(rs.getString(3));
			bo.setColor(rs.getString(4));
			bo.setLeaseAmount(rs.getFloat(5));

			return bo;
		}
	}
}
