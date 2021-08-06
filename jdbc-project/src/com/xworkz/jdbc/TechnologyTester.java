package com.xworkz.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class TechnologyTester {

	public static void main(String[] args) {
		String username = "root";// step1 loading and registering
		String password = "snm@1996";
		String url = "jdbc:mysql://localhost:3306/sunita";
		String fqnOfDriverImpl = "com.mysql.cj.jdbc.Driver";
		Connection connection = null;
		try {
			Class.forName(fqnOfDriverImpl);
			connection = DriverManager.getConnection(url, username, password);
			String querry = "insert into Technology_Table values(4,'Web Technology','Software','Jousiah Bussing')";//creating connection 2nd step

			Statement statement = connection.createStatement();// to create statement 3rd step of jdbc
			statement.execute(querry);// 4th step of jdbc
			System.out.println(connection);

		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException E) {
			E.printStackTrace();
		} finally {
			try {
				connection.close();// to come out from database
			} catch (SQLException e) {
				e.printStackTrace();
			}

		}

	}
}
