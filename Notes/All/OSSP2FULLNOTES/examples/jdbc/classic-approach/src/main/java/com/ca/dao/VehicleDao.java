package com.ca.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCallback;
import org.springframework.jdbc.core.PreparedStatementCreator;

import com.ca.bo.VehicleBo;

public class VehicleDao {
	private final String SQL_GET_VEHICLES_BY_MODEL_NM = "select vehicle_no, model_nm, manufacturer, registration_no, color, lease_amount from vehicles where model_nm like ?";

	private JdbcTemplate jdbcTemplate;

	public VehicleDao(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public List<VehicleBo> getVehiclesByModelName(String modelName) {
		return jdbcTemplate.execute(new GetVehiclesByModelNamePreparedStatementCreator(modelName),
				new GetVehiclesByModelNameCallback());
	}

	private final class GetVehiclesByModelNamePreparedStatementCreator implements PreparedStatementCreator {
		private String modelName;

		public GetVehiclesByModelNamePreparedStatementCreator(String modelName) {
			this.modelName = modelName;
		}

		@Override
		public PreparedStatement createPreparedStatement(Connection con) throws SQLException {
			PreparedStatement pstmt = null;

			pstmt = con.prepareStatement(SQL_GET_VEHICLES_BY_MODEL_NM);
			pstmt.setString(1, "%" + modelName + "%");

			return pstmt;
		}
	}

	private final class GetVehiclesByModelNameCallback implements PreparedStatementCallback<List<VehicleBo>> {
		@Override
		public List<VehicleBo> doInPreparedStatement(PreparedStatement pstmt) throws SQLException, DataAccessException {
			ResultSet rs = null;
			VehicleBo bo = null;
			List<VehicleBo> vehicleBos = null;

			vehicleBos = new ArrayList<VehicleBo>();
			rs = pstmt.executeQuery();
			while (rs.next()) {
				bo = new VehicleBo();
				bo.setVehicleNo(rs.getInt(1));
				bo.setModelName(rs.getString(2));
				bo.setManufacturer(rs.getString(3));
				bo.setRegistrationNo(rs.getString(4));
				bo.setColor(rs.getString(5));
				bo.setLeaseAmount(rs.getFloat(6));
				vehicleBos.add(bo);
			}

			return vehicleBos;
		}
	}
}
