package com.travelgo.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TravelGoService {
	public static void main(String[] args) throws SQLException, ClassNotFoundException {

		Class.forName("com.mysql.cj.jdbc.Driver");
		try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hibdb", "root", "root");
				Statement stmt = con.createStatement();) {
			ResultSet rs = stmt.executeQuery("select * from account");
			while (rs.next()) {
				System.out.println("account no : " + rs.getInt("account_no") + " account holder name: "
						+ rs.getString("account_holder_nm"));
			}

		} catch (SQLException e) {
			e.printStackTrace();
			throw e;
		}
	}
}
