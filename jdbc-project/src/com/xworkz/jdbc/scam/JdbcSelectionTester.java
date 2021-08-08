package com.xworkz.jdbc.scam;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.HashSet;
import java.util.Set;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.xworkz.jdbc.constants.JdbcConstants;

public class JdbcSelectionTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try (Connection connection = DriverManager.getConnection(JdbcConstants.URL, JdbcConstants.USERNAME,
				JdbcConstants.PASSWORD)) {
			String query = "select*from new_table where s_year<2000";

			Statement state = connection.createStatement();
			state.execute(query);
			ResultSet set = state.getResultSet();
			ScamDTO dto = null;

			Set<ScamDTO> dt = new HashSet<ScamDTO>();
			while (set.next()) {
				ScamDTO d = new ScamDTO();
				d.setYear(set.getInt("s_year"));
				int id = set.getInt("s_id");
				String name = set.getString("s_name");
				String type = set.getString("s_type");
				int amount = set.getInt("s_amount");
				String by = set.getString("s_by");
				String location = set.getString("s_location");
				String descr = set.getString("s_description");
				int year = set.getInt("s_year");

				System.out.println(name);

				dto = new ScamDTO(id, name, type, by, amount, location, year, descr);
				System.out.println(dto);
				System.out.println(dto.hashCode());
				dt.add(d);

			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
}
