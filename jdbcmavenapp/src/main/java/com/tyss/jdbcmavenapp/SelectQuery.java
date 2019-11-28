package com.tyss.jdbcmavenapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectQuery {
	public static void main(String[] args) {
		Connection conn = null;
		Statement stmt = null;
		ResultSet res = null;
		try {
			//step 1 load the driver
			//Driver driver = new Driver();
			//DriverManager.registerDriver(driver);
			Class.forName("com.mysql.jdbc.Driver");
			
			//step 2 get the connection
			
			//String url = "jdbc:mysql://localhost:3306/ust_ty_db";
			//conn = DriverManager.getConnection(url,"root","root");
			
			String url = "jdbc:mysql://localhost:3306/ust_ty_db?user=root&password=root";
			conn = DriverManager.getConnection(url);
			
			//step-3 issue sql query
			
			stmt = conn.createStatement();
			String sql = "select * from employee_info";
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
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}



	}
}
