package com.xworkz.jdbc.scam;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateScamYearByName {

	public static void main(String[] args) {
		String username = "root";// step1 loading and registering
		String password = "snm@1996";
		String url = "jdbc:mysql://localhost:3306/sunita";
		Connection connection = null;
		try {
			Connection connect = DriverManager.getConnection(url, username, password);
			String updateSql = "update scam_table set s_year=2090 where s_name='IPL Scam' ";
			Statement state = connect.createStatement();
			state.execute(updateSql);
			System.out.println(connect);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
