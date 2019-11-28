package com.tyss.jdbcapp;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Properties;

public class DynamicInsertWithProperties {
	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		FileReader reader = null;
		try {
			reader = new FileReader("db.properties");
			Properties prop = new Properties();
			prop.load(reader);
			//step-1
//			Driver driver = new Driver();
//			DriverManager.registerDriver(driver);
			Class.forName(prop.getProperty("driver-class-name"));
			
			//step-2
			String dbUrl = prop.getProperty("url");
			conn = DriverManager.getConnection(dbUrl,prop);
			
			//step3
			String sql = prop.getProperty("insert-query");
			pstmt = conn.prepareStatement(sql);
			
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
				} if(reader != null) {
					reader.close();
				}
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}//main end
	}//ExecuteInsert end
