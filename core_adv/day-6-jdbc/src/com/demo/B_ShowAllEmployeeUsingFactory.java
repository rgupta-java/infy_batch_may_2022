package com.demo;

import java.sql.*;// for jdbc

public class B_ShowAllEmployeeUsingFactory {

	public static void main(String[] args) {
		
		Connection connection = null;
		Statement stmt = null;
		ResultSet rs = null;
		try {
			connection = ConnectionFactory.getConnection();
			
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
