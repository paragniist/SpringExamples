package com.gpbeneficiaries.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

import com.gpbeneficiaries.bo.BeneficiaryBo;

@Repository
public class BeneficiaryDao {
	private final String SQL_SAVE_BENEFICIARY = "insert into beneficiary(beneficiary_nm, dob, gender, aadhar_no, mobile_no, email_address) values(?,?,?,?,?,?)";

	private JdbcTemplate jdbcTemplate;

	public BeneficiaryDao(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public int saveBeneficiary(final BeneficiaryBo beneficiaryBo) {
		int beneficiaryNo = 0;
		KeyHolder kh = null;

		kh = new GeneratedKeyHolder();
		jdbcTemplate.update(new PreparedStatementCreator() {
			@Override
			public PreparedStatement createPreparedStatement(Connection con) throws SQLException {
				PreparedStatement pstmt = null;
				pstmt = con.prepareStatement(SQL_SAVE_BENEFICIARY, new String[] { "beneficiary_no" });
				pstmt.setString(1, beneficiaryBo.getBeneficiaryName());
				pstmt.setDate(2, new java.sql.Date(beneficiaryBo.getDob().getTime()));
				pstmt.setString(3, beneficiaryBo.getGender());
				pstmt.setString(4, beneficiaryBo.getAadharNo());
				pstmt.setString(5, beneficiaryBo.getMobileNo());
				pstmt.setString(6, beneficiaryBo.getEmailAddress());

				return pstmt;
			}
		}, kh);
		beneficiaryNo = kh.getKey().intValue();
		return beneficiaryNo;
	}
}
