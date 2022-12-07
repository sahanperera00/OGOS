package com.oop.utility;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectDB {
	private static String url = "jdbc:mysql://localhost:3306/ogos";
	private static String username = "root";
	private static String password = "Mpw550600#";
	private static Connection con;
	
	public static Connection getConnection() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection(url, username, password);
			
			if(con != null) {
				System.out.println("Database Connetion is Successful!");
			}else {
				System.out.println("Database Connetion is not Successful!");
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		return con;
	}
}