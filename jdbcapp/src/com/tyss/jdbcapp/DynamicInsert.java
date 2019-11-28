package com.tyss.jdbcapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class DynamicInsert {
public static void main(String[] args) {
	Connection conn = null;
	PreparedStatement pstmt = null;
	try {
		//step-1
//		Driver driver = new Driver();
//		DriverManager.registerDriver(driver);
		Class.forName("com.mysql.jdbc.Driver");
		
		//step-2
		String dbUrl = "jdbc:mysql://localhost:3306/ust_ty_db?user=root&password=root";
		conn = DriverManager.getConnection(dbUrl);
		
		//step3
		String query = "insert into employee_info values(?,?,?,?)";
		pstmt = conn.prepareStatement(query);
		
		String empid = args[0];
		int id = Integer.parseInt(empid);
		pstmt.setInt(1, id);
		
		String name = args[1];
		pstmt.setString(2, name);
		
		String sal = args[2];
		int salary = Integer.parseInt(sal);
		pstmt.setInt(3, salary);
		
		String gender = args[3];
		pstmt.setString(4, gender);
		
		
		int count = pstmt.executeUpdate();
		//step-4
		System.out.println(count + " Rows inserted");

	}catch (Exception e) {
		e.printStackTrace();
	} finally {
		try {
			//step-5
			if(conn != null) {
				conn.close();
			}if(pstmt != null) {
				pstmt.close();
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
}//main end
}//ExecuteInsert end
