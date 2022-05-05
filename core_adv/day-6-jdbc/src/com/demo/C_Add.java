package com.demo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.*;
public class C_Add {

	public static void main(String[] args) {
		
		Connection connection=ConnectionFactory.getConnection();
		//Statement (prefromace issue, SQL injection problem) vs PrepareStatement(faster and no sql injection problem)
		
		try {
			PreparedStatement pstmt=connection.
					prepareStatement("insert into emp(name,salary, dept) values (?,?,?)");//placeholder
			pstmt.setString(1, "neeta");
			pstmt.setDouble(2, 2000000);
			pstmt.setString(3, "mkt");
			
		 int noOfRows=	pstmt.executeUpdate();
		 System.out.println(noOfRows);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
