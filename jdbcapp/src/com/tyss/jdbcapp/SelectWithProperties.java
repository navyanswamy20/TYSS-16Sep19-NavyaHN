package com.tyss.jdbcapp;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Properties;

public class SelectWithProperties {
	public static void main(String[] args) {
		Connection conn = null;
		Statement stmt = null;
		ResultSet res = null;
		FileReader reader = null;
		
		try {
			reader = new FileReader("db.properties");
			Properties prop = new Properties();
			prop.load(reader);
			
			//step 1 load the driver
			//Driver driver = new Driver();
			//DriverManager.registerDriver(driver);
			Class.forName(prop.getProperty("driver-class-name"));
			
			//step 2 get the connection
			
			//String url = "jdbc:mysql://localhost:3306/ust_ty_db";
			//conn = DriverManager.getConnection(url,"root","root");
			
			String url = prop.getProperty("url");
			conn = DriverManager.getConnection(url,prop);
			
			//step-3 issue sql query
			
			stmt = conn.createStatement();
			String sql = prop.getProperty("select-query");
			res = stmt.executeQuery(sql);
			
			//step-4 read the result
			while(res.next()) {
				int id = res.getInt("id");
				String name = res.getString("name");
				int sal = res.getInt("sal");
				String gender = res.getString("gender");

				System.out.println("id is = "+id);
				System.out.println("name is = "+name);
				System.out.println("salary is = "+sal);
				System.out.println("gender is = "+gender);


			}
		}catch(Exception e) {
			e.printStackTrace();
		} finally {
			//step-5 close all jdbc connection
			try {
				if(conn != null) {
					conn.close();
				}
				if(stmt != null) {
					stmt.close();
				}
				if(res != null) {
					res.close();
				} if(reader != null) {
					reader.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}



	}
}
