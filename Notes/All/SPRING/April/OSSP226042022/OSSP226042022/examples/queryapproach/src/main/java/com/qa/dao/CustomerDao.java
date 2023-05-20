package com.qa.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

import com.qa.bo.CustomerBo;
import com.qa.bo.CustomerLeaseBo;
import com.qa.bo.VehicleBo;

@Repository
public class CustomerDao {
	private final String SQL_INSERT_CUSTOMER = "insert into customer(customer_nm, dob, gender) values(?,?,?)";
	private final String SQL_GET_CUSTOMERS_SORT_BY = "select customer_no, customer_nm, dob, gender from customer order by customer_nm asc";
	private final String SQL_GET_CUSTOMER_LEASED_VEHICLES = "select c.customer_no, c.customer_nm, c.dob, c.gender, v.vehicle_no, v.model_nm, v.manufacturer, v.registration_no, v.color, v.fuel_type, v.lease_amount from customer c inner join vehicle_lease vh on c.customer_no = vh.customer_no inner join vehicles v on vh.vehicle_no = v.vehicle_no";

	@Autowired
	private JdbcTemplate jdbcTemplate;

	public int saveCustomer(final CustomerBo bo) {
		int customerNo = 0;
		KeyHolder kh = null;

		kh = new GeneratedKeyHolder();
		jdbcTemplate.update((con) -> {
			PreparedStatement pstmt = null;

			pstmt = con.prepareStatement(SQL_INSERT_CUSTOMER, new String[] { "customer_no" });
			pstmt.setString(1, bo.getCustomerName());
			pstmt.setDate(2, new java.sql.Date(bo.getDob().getTime()));
			pstmt.setString(3, bo.getGender());

			return pstmt;
		}, kh);

		customerNo = kh.getKey().intValue();

		return customerNo;
	}

	public List<CustomerBo> getCustomerByPagination(final int pageNo, final int pageSize, final String sortColumn) {
		List<CustomerBo> bos = null;

		bos = jdbcTemplate.query(SQL_GET_CUSTOMERS_SORT_BY, new CustomerResultSetExtractor(pageNo, pageSize));

		return bos;
	}

	public List<CustomerLeaseBo> getCustomerWithLeasedVehicles() {
		return jdbcTemplate.query(SQL_GET_CUSTOMER_LEASED_VEHICLES, new CustomerLeaseResultSetExtractor());
	}

	private final class CustomerLeaseResultSetExtractor implements ResultSetExtractor<List<CustomerLeaseBo>> {
		@Override
		public List<CustomerLeaseBo> extractData(ResultSet rs) throws SQLException, DataAccessException {
			Map<Integer, CustomerLeaseBo> customerLeasedMap = null;
			List<CustomerLeaseBo> customerLeaseBos = null;
			CustomerLeaseBo cbo = null;
			VehicleBo vbo = null;
			int customerNo = 0;

			customerLeasedMap = new HashMap<Integer, CustomerLeaseBo>();
			while (rs.next()) {
				customerNo = rs.getInt(1);
				if (customerLeasedMap.containsKey(customerNo) == false) {
					cbo = new CustomerLeaseBo();
					cbo.setCustomerNo(rs.getInt(1));
					cbo.setCustomerName(rs.getString(2));
					cbo.setDob(rs.getDate(3));
					cbo.setGender(rs.getString(4));

					Set<VehicleBo> leasedVehicles = new HashSet<VehicleBo>();
					cbo.setLeasedVehicles(leasedVehicles);
					customerLeasedMap.put(customerNo, cbo);
				}
				cbo = customerLeasedMap.get(customerNo);
				vbo = new VehicleBo();
				vbo.setVehicleNo(rs.getInt(5));
				vbo.setModelName(rs.getString(6));
				vbo.setManufacturer(rs.getString(7));
				vbo.setRegistrationNo(rs.getString(8));
				vbo.setColor(rs.getString(9));
				vbo.setFuelType(rs.getString(10));
				vbo.setLeaseAmount(rs.getFloat(11));
				cbo.getLeasedVehicles().add(vbo);
			}

			customerLeaseBos = customerLeasedMap.values().stream().toList();
			return customerLeaseBos;
		}
	}

	private final class CustomerResultSetExtractor implements ResultSetExtractor<List<CustomerBo>> {
		private int pageNo;
		private int pageSize;

		public CustomerResultSetExtractor(int pageNo, int pageSize) {
			this.pageNo = pageNo;
			this.pageSize = pageSize;
		}

		@Override
		public List<CustomerBo> extractData(ResultSet rs) throws SQLException, DataAccessException {
			List<CustomerBo> bos = null;
			CustomerBo bo = null;
			int startIndex = 0;
			int endIndex = 0;
			int index = 1;

			bos = new ArrayList<CustomerBo>();
			startIndex = (pageNo - 1) * pageSize + 1;
			endIndex = pageNo * pageSize;

			while (rs.next() && index <= endIndex) {
				if (index >= startIndex && index <= endIndex) {
					bo = new CustomerBo();
					bo.setCustomerNo(rs.getInt(1));
					bo.setCustomerName(rs.getString(2));
					bo.setDob(rs.getDate(3));
					bo.setGender(rs.getString(4));

					bos.add(bo);
				}
				index++;
			}

			return bos;
		}

	}

}
