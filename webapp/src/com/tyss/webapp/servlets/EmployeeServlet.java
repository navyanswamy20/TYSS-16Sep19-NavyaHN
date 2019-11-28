package com.tyss.webapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mysql.jdbc.Driver;

public class EmployeeServlet extends HttpServlet {

	Connection conn = null;
    PreparedStatement pstmt = null;
	ResultSet rs = null;
	String[] args;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter out = resp.getWriter();
		String id = req.getParameter("id");
		out.print("<h1> Display the record </h1>");
		out.print("<table border='1'><tr><th>ID</th><th>Name</th><th>Salary</th><th>Gender</th></tr>");
		try {
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}
		String url =  "jdbc:mysql://localhost:3305/ust_ty_db?user=root&password=root";
		Connection conn = DriverManager.getConnection(url);
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery("select * from employee_info where id ="+id+"");
		while(rs.next()) {
			out.print("<tr><td>");
			out.print(rs.getInt(1));
			out.print("</td>");
			out.print("<td>");
			out.print(rs.getString(2));
			out.print("</td>");
			out.print("<td>");
			out.print(rs.getInt(3));
			out.print("</td>");
			out.print("<td>");
			out.print(rs.getString(4));
			out.print("</td>");
			
		}
		
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
		out.print("</table>");
	}
	
	
	
}

