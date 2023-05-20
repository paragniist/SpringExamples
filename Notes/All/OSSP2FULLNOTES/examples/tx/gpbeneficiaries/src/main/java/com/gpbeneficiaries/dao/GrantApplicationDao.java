package com.gpbeneficiaries.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

import com.gpbeneficiaries.bo.GrantApplicationBo;

@Repository
public class GrantApplicationDao {
	private final String SQL_SAVE_GRANT_APPLICATION = "insert into grant_application(beneficiary_no, grant_type, applied_dt, tenure, interest_rate, grant_amount) values(?,?,?,?,?,?)";

	private JdbcTemplate jdbcTemplate;

	public GrantApplicationDao(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public int saveGrantApplication(final GrantApplicationBo grantApplicationBo) {
		int grantApplicationNo = 0;
		KeyHolder kh = null;

		kh = new GeneratedKeyHolder();
		jdbcTemplate.update(new PreparedStatementCreator() {
			@Override
			public PreparedStatement createPreparedStatement(Connection con) throws SQLException {
				PreparedStatement pstmt = null;
				pstmt = con.prepareStatement(SQL_SAVE_GRANT_APPLICATION, new String[] { "grant_application_no" });
				pstmt.setInt(1, grantApplicationBo.getBeneficiaryNo());
				pstmt.setString(2, grantApplicationBo.getGrantType());
				pstmt.setDate(3, new java.sql.Date(grantApplicationBo.getAppliedDate().getTime()));
				pstmt.setInt(4, grantApplicationBo.getTenure());
				pstmt.setFloat(5, grantApplicationBo.getInterestRate());
				pstmt.setFloat(6, grantApplicationBo.getGrantAmount());

				return pstmt;
			}
		}, kh);

		grantApplicationNo = kh.getKey().intValue();
		return grantApplicationNo;
	}

}
