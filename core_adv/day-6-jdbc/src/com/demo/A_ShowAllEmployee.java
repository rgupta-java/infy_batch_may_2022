package com.demo;

import java.sql.*;// for jdbc

public class A_ShowAllEmployee {

	public static void main(String[] args) {
		// load the driver(used to comm bw java app to database)
		try {
			Class.forName("com.mysql.jdbc.Driver");// this is dynamic class loading
			System.out.println("driver is loaded");
		} catch (ClassNotFoundException ex) {
			System.out.println("driver loading is not working");
		}

		// connection object ip+port
		Connection connection = null;
		Statement stmt = null;
		ResultSet rs = null;
		try {
			connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/infy2?useSSL=false",
					"root", "root");
			stmt = connection.createStatement();
			rs = stmt.executeQuery("select * from emp");// executeQuery(select) vs executeUpdate(CUD)

			// till all records not finished, print one by one
			while (rs.next()) {
				System.out.println(
						rs.getInt(1) + ":" +
				        rs.getString(2) + ": "
					   + ": " + rs.getDouble(3) + ":" + rs.getString(4));
			}

		} catch (SQLException ex) {
			System.out.println("some error occure");
			ex.printStackTrace();
		}finally {
			try {
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
