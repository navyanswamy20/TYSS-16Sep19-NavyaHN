package com.tyss.jdbcapp;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Driver;

public class InsertQuery {


	public static void main(String[] args) {

		Connection conn = null;
		//ResultSet rs = null; only for select query
		Statement stmt = null;

		try {
			//step-1
			Driver driver = new Driver();
			DriverManager.registerDriver(driver);
			
			//step-2
			String dbUrl = "jdbc:mysql://localhost:3306/ust_ty_db?user=root&password=root";
			conn = DriverManager.getConnection(dbUrl);
			
			//step3
			String query = "insert into employee_info values(9,'swamy',25000,'m')";
			stmt = conn.createStatement();
			int count = stmt.executeUpdate(query);
			//step-4
			System.out.println(count + " Rows inserted");

		}catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				//step-5
				if(conn != null) {
					conn.close();
				}if(stmt != null) {
					stmt.close();
				}
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
	}//main end
}//ExecuteInsert end
