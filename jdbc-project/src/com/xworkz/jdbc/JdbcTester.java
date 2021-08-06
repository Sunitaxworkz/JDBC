package com.xworkz.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcTester {

	public static void main(String[] args) {
		String username = "root";
		String password = "snm@1996";
		String url = "jdbc:mysql://localhost:3306/xworkz";
		String fqnOfDriverImpl = "com.mysql.cj.jdbc.Driver";
		try {
			//DriverManager.getConnection(url, username, password);
			Connection connection = DriverManager.getConnection(url, username, password);
			System.out.println(connection);

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
}
