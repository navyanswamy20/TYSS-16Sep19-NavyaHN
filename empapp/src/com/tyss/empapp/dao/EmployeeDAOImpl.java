package com.tyss.empapp.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.tyss.empapp.dto.EmployeeBean;

public class EmployeeDAOImpl implements EmployeeDAO {
//	private final static String SELECT_SQL = "select * from employee";
//	private final static String INSERT_SQL = "insert into employee values(?,?,?,?)";
//	private final static String DELETE_SQL = "delete from employee where id=?";
//	private final static String SEARCH_SQL = "select * from employee where id=?";
//	private final static String UPDATE_SQL = "update employee set name=? where id=?";
	public List<EmployeeBean> getAllEmployeeData() {

		String url = "jdbc:mysql://localhost:3306/ust_ty_db?user=root&password=root";
		String sql = "select * from employee_info";
		Connection conn =null;
		Statement stmt= null;
		ResultSet rs = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(url);
			
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			
			ArrayList<EmployeeBean>result = new ArrayList<>();
			while(rs.next()) {
				EmployeeBean bean = new EmployeeBean();
				int id = rs.getInt("id");
				bean.setId(id);
				String name = rs.getString("name");
				bean.setName(name);
				int sal = rs.getInt("sal");
				bean.setSal(sal);
				String gender = rs.getString("gender");
				bean.setGender(gender);
				
				result.add(bean);		
				}//while
			return result;

		} catch (Exception e) {
			e.printStackTrace();
			return null;
		} finally {
			try {

				if(conn != null) {
					conn.close();
				} if(rs != null) {
					rs.close();
				} if(stmt != null) {
					stmt.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}//try-finally
	}//getAllEmployeeData
	
	public EmployeeBean searchEmployeeData(int id) {
		String url = "jdbc:mysql://localhost:3306/ust_ty_db?user=root&password=root";
		String sql = "select * from employee_info where id =?";
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			conn = DriverManager.getConnection(url);
			
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, id);
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				EmployeeBean bean = new EmployeeBean();
				bean.setId(rs.getInt("id"));
				bean.setName(rs.getString("name"));
				bean.setSal(rs.getInt("sal"));
				bean.setGender(rs.getString("gender"));
				return bean;
				
			} else {
				return null;
			}
			
		} catch (Exception e) {
			e.printStackTrace();
			
			return null;
			
		} finally {
			try {
				if(conn != null) {
					conn.close();
				} if(rs != null) {
					rs.close();
				} if(pstmt != null) {
					pstmt.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}//searchEmployeeData
}	//EmployeeDAOImpl

