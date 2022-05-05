package com.demo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.*;
public class C_Delete {

	public static void main(String[] args) {
		
		Connection connection=ConnectionFactory.getConnection();
		//Statement (prefromace issue, SQL injection problem) vs PrepareStatement(faster and no sql injection problem)
		
		try {
			PreparedStatement pstmt=connection.
					prepareStatement("delete from emp where id=?");//placeholder
			pstmt.setInt(1, 4);
			
			
		 int noOfRows=	pstmt.executeUpdate();
		 
		 System.out.println(noOfRows);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
