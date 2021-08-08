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
		Connection connection = null;
		try {

			connection = DriverManager.getConnection(url, username, password);

			String querry1 = "insert into new_table values(1,'2G Spectrum Scam','Telecommunication',2008,'A Raja','India',1.78,'It was said to be the biggest scam in the history of Independent India')";
			String querry2 = "insert into new_table values(2,'IPL Scam','BCCI',2013,'Arun Jaitley and Jyotiraditya Scindia','Pune',3.75,'To take the place of the clouded human lens, a precisely engineered artificial lens created')";
			String querry3 = "insert into new_table values(3,'Hawala Scandal','Banking',1996,'N K Jain','India',1.8,' scam was an Indian political and financial scandal involving payments allegedly sent by politicians')";
			String querry4 = "insert into new_table values(4,'Chopper Scam','Helicaptors',2013,'Santosh Bagrodia, Satish Bagrodia','Italy',3.8,'scam is a corruption case where it has been alleged that bribes were paid to middlemen')";
			String querry5 = "insert into new_table values(5,'Railgate Scam','Indian Railway Board',2012,' Pawan Kumar Bansal','India',7,'It was reported that Kumar had superseded two seniors to be promoted to the Indian Railway Board')";
			String querry6 = "insert into new_table values(6,'Tatra truck scam','Bharat Earth Movers Ltd (BEML)',2011,'VK Singh','India',14,' The allegation is that the Tatra trucks were sold at a very high cost through an unusual routes')";
			String querry7 = "insert into new_table values(7,'Stock market scam','Trading',2010,'Ketan Parekh','India',8,'scam in the Indian stock market which made the entire securities system collapse. ')";
			String querry8 = "insert into new_table values(8,'cash-for-votes scandal','Election',2008,'Soniya Gandhi','India',2,'This scam was an Indian political scandal allegedly masterminded by then Opposition Party')";
			String querry9 = "insert into new_table values(9,'Bellary mining scam','Mining leases',2006,'Reddy brothers','Bellary',16.0,'The Supreme Court of India, which banned mining in Bellary in 2011')";
			String querry10 = "insert into new_table values(10,'Saradha Group chit fund scam','Financial',2013,' Debjani Mukhopadhdhay ','West Bengal.',15.3,'major financial scam scandal caused by the collapse of a Ponzi scheme run by Saradha Group, ')";
			String querry11 = "insert into new_table values(11,'Coal scam','corruption',2000,' Abhishek Banerjee ','Bengal.',40,'Minister of State for Coal in the A B Vajpayee government in 1999, for his alleged involvement')";
			String querry12 = "insert into new_table values(12,'Antrix Devas scam','Scientific',2011,'G Madhavan Nair','Bengal.',14.8,'India lost its arbitration case in an international tribunal against Bengaluru-based Devas ')";
			String querry13 = "insert into new_table values(13,' Fodder scam','fictitious livestock',1996,'Jagannath Mishra','India',950,'The Scam was a corruption scandal that involved the embezzlement of about 9.4 billion')";
			String querry14 = "insert into new_table values(14,'Rafale scam','Corruption',2021,'Sachin Vaze','Mumbai',100,'scam allegedly acted as an agent for Dassault Aviation in sale of Rafale jets to India')";
			String querry15 = "insert into new_table values(15,'Gold Smuggling','Consignment',2020,'Sachin Vaze','Dubai',16,'diplomatic baggage from Dubai which turned out to be a consignment carrying illegal gold')";
			String querry16 = "insert into new_table values(16,'CommonWealth gameScam','Games',2011,'Suresh Kalmadi','India',35,'farmer chairman of commonwealth games got arrested')";
			String querry17 = "insert into new_table values(17,'Satyam Scam','Industry',2016,'Ramaling Raja','India',42,'The Indias fourth largest IT company losts stagering of 10000 crore in market')";
			String querry18 = "insert into new_table values(18,'Bofors Scam','Industry',2016,'RajivGandhi','India',42,'initiated by Indian National Congress politicians and implicating the Rajiv Gandhi')";
			String querry19 = "insert into new_table values(19,'Insurance Scam','Financial',1980,'XYZ','US',40,'Insurance fraud is perpetrated against or by an insurance company for the purpose of financial gain')";
			String querry20 = "insert into new_table values(20,'Signs of a Prize Scam','Financial',1980,'Scammers','India',40,'Theres absolutely no reason to ever give your bank account or credit card number to claim')";

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
			state.execute(querry14);
			state.execute(querry15);
			state.execute(querry16);
			state.execute(querry17);
			state.execute(querry18);
			state.execute(querry19);
			state.execute(querry20);
			System.out.println(connection);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
