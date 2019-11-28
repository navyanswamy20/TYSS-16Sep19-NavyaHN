package com.tyss.jdbcapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class DynamicSelect {
public static void main(String[] args) {
	Connection conn = null;
	PreparedStatement pstmt = null;
	String url = "jdbc:mysql://localhost:3306/ust_ty_db?user=root&password=root";
	String sql = "select * from employee_info where id=?";
	ResultSet rs = null;
	
	
	try {//1
//		Driver driver = new Driver();
//		DriverManager.registerDriver(driver);
		Class.forName("com.mysql.jdbc.Driver");
		//2
		conn =DriverManager.getConnection(url);
		//3
		pstmt = conn.prepareStatement(sql);
		String empid = args[0];
		int id = Integer.parseInt(empid);
		pstmt.setInt(1, id);
		
		rs = pstmt.executeQuery();
		
		//4
		if(rs.next()) {
			int id1 = rs.getInt("id");
			int sal = rs.getInt("sal");
			String name = rs.getString("name");
			String gender = rs.getString("gender");
			
			System.out.println("id is = "+id1);
			System.out.println("name is = "+name);
			System.out.println("salary is = "+sal);
			System.out.println("gender is = "+gender);

		}
	} catch(Exception e) {
		e.printStackTrace();
	} finally {
		try {
			//step-5
			if(conn != null) {
				conn.close();
			}if(pstmt != null) {
				pstmt.close();
			}if(rs != null) {
				rs.close();
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
}//main end
}//ExecuteInsert end
