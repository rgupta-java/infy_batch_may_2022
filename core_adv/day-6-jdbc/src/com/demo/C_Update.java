package com.demo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.*;
public class C_Update {

	public static void main(String[] args) {
		
		Connection connection=ConnectionFactory.getConnection();
		//Statement (prefromace issue, SQL injection problem) vs PrepareStatement(faster and no sql injection problem)
		
		//batch processing : using batch u can do mutiple insertion at time time
		//tx mgt ACID concepts
		
		try {
			PreparedStatement pstmt=connection.
					prepareStatement("update emp set salary=? where id=?");//placeholder
			pstmt.setDouble(1, 9000000);
			pstmt.setInt(2, 1);
			
		 int noOfRows=	pstmt.executeUpdate();
		 System.out.println(noOfRows);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
