package com.caannon.dao;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.caannon.bo.ProductBo;

@Repository
public class ProductDao {
	private final String GET_PRODUCTS = "select product_no, product_nm, description, price from product";
	@Autowired
	private JdbcTemplate jdbcTemplate;

	public List<ProductBo> getAllProducts() {
		return jdbcTemplate.execute((Statement stmt) -> {
			ResultSet rs = null;
			ProductBo bo = null;
			List<ProductBo> productBos = null;

			productBos = new ArrayList<ProductBo>();
			rs = stmt.executeQuery(GET_PRODUCTS);
			while (rs.next()) {
				bo = new ProductBo();
				bo.setProductNo(rs.getInt(1));
				bo.setProductName(rs.getString(2));
				bo.setDescription(rs.getString(3));
				bo.setPrice(rs.getFloat(4));
				productBos.add(bo);
			}

			return productBos;
		});
	}

}
