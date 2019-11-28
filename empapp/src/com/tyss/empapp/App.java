package com.tyss.empapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.List;
import java.util.Scanner;

import com.tyss.empapp.dao.EmployeeDAO;
import com.tyss.empapp.dao.EmployeeDAOImpl;
import com.tyss.empapp.dto.EmployeeBean;
import com.tyss.empapp.util.EmployeeManager;
  
public class App {
	public static void main(String[] args) {
		System.out.println("press 1 to get all employee data");
		System.out.println("press 2 to insert all employee data");
		System.out.println("press 3 update all employee data");
		System.out.println("press 4 to delete all employee data");
		System.out.println("press 5 to search single employee data");

		Scanner sc = new Scanner(System.in);
		int ch = sc.nextInt();
		switch (ch) {
		case 1:
			EmployeeDAO dao = EmployeeManager.getEmployeeDAO();
			List<EmployeeBean> result = dao.getAllEmployeeData();

			for (EmployeeBean bean : result) {
				System.out.println("id:" + bean.getId());
				System.out.println("name: " + bean.getName());
				System.out.println("salary: " + bean.getSal());
				System.out.println("gender: " + bean.getGender());
			}
			break;

		case 2:
			break;
		case 3:
			break;
		case 4:
			break;

		case 5:
			EmployeeDAO dao5 = EmployeeManager.getEmployeeDAO();
			int id = sc.nextInt();
			EmployeeBean bean = dao5.searchEmployeeData(id);
			if (bean != null) {
				System.out.println("id:" + bean.getId());
				System.out.println("name: " + bean.getName());
				System.out.println("salary: " + bean.getSal());
				System.out.println("gender: " + bean.getGender());
			} else {
				System.out.println("no data found!!!!");
			}
			break;

		}// switch

	}// main
}// app
