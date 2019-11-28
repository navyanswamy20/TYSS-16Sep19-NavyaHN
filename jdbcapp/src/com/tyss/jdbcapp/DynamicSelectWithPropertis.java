package com.tyss.jdbcapp;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Properties;

public class DynamicSelectWithPropertis {
	public static void main(String[] args) {
		
	
	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	FileReader reader = null;
	
	
	try {//1
		reader = new FileReader("db.properties");
		Properties prop = new Properties();
		prop.load(reader);
//		Driver driver = new Driver();
//		DriverManager.registerDriver(driver);
		Class.forName(prop.getProperty("driver-class-name"));
		//2
		String dbUrl = prop.getProperty("url");
		conn =DriverManager.getConnection(dbUrl,prop);
		//3
		String sql = prop.getProperty("select-query-where");
		pstmt = conn.prepareStatement(sql);
		String empid = args[0];
		int id = Integer.parseInt(empid);
		pstmt.setInt(1,id);
		
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
			} if(reader != null) {
				reader.close();
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}//main end
}//ExecuteInsert end
