package com.xworkz.jdbc.scam;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ScamTester {

	public static void main(String[] args) {
		String username = "root";// step1 loading and registering
		String password = "snm@1996";
		String url = "jdbc:mysql://localhost:3306/sunita";
		String fqnOfDriverImpl = "com.mysql.cj.jdbc.Driver";
		Connection connection = null;
		try {
			Class.forName(fqnOfDriverImpl);
			connection = DriverManager.getConnection(url, username, password);

			String querry1 = "insert into scam_table values(1,'2G Spectrum Scam','Telecommunication',2008,'A Raja','India',1.78,'Telecommunication Scam')";
			String querry2 = "insert into scam_table values(2,'IPL Scam','BCCI',2013,'Arun Jaitley and Jyotiraditya Scindia','Pune',3.75,'IPL Scam')";
			String querry3 = "insert into scam_table values(3,'Hawala Scandal','Banking',1996,'N K Jain','India',1.8,'Money transfer based on owner')";
			String querry4 = "insert into scam_table values(4,'Chopper Scam','Helicaptors',2013,'Santosh Bagrodia, Satish Bagrodia','Italy',3.8,'VVIP helicopter deal')";
			String querry5 = "insert into scam_table values(5,'Railgate Scam','Indian Railway Board',2012,' Pawan Kumar Bansal','India',7,'with the help of  telephonic conversations ')";
			String querry6 = "insert into scam_table values(6,'Tatra truck scam','Bharat Earth Movers Ltd (BEML)',2011,'VK Singh','India',14,' purchase of components for Tatra trucks')";
			String querry7 = "insert into scam_table values(7,'Stock market scam','Trading',2010,'Ketan Parekh','India',8,'involved in circular trading ')";
			String querry8 = "insert into scam_table values(8,'cash-for-votes scandal','Election',2008,'Soniya Gandhi','India',2,'to pursue the Indo-US nuclear deal ')";
			String querry9 = "insert into scam_table values(9,'Bellary mining scam','Mining leases',2006,'Reddy brothers','Bellary',16.0,'xchange for issuing mining leases ')";
			String querry10 = "insert into scam_table values(10,'Saradha Group chit fund scam','Financial',2013,' Debjani Mukhopadhdhay ','West Bengal.',15.3,'variety of collective investment schemes')";
			String querry11 = "insert into scam_table values(11,'Coal scam','corruption',2000,' Abhishek Banerjee ','Bengal.',40,'imprisonment in a coal block ')";
			String querry12 = "insert into scam_table values(12,'Antrix Devas scam','Scientific',2011,'G Madhavan Nair','Bengal.',14.8,'build the satellites without disclosing fact')";
			String querry13 = "insert into scam_table values(13,' Fodder scam','fictitious livestock',1996,'Jagannath Mishra','India',950,'medicines and animal husbandry equipment')";
			Statement state = connection.createStatement();
			
			
			
			
			
			state.execute(querry1);
			state.execute(querry2);
			state.execute(querry3);
			state.execute(querry4);
			state.execute(querry5);
			state.execute(querry6);
			state.execute(querry7);
			state.execute(querry8);
			state.execute(querry9);
			state.execute(querry10);
			state.execute(querry11);
			state.execute(querry12);
			state.execute(querry13);
			System.out.println(connection);
		} catch (SQLException | ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
