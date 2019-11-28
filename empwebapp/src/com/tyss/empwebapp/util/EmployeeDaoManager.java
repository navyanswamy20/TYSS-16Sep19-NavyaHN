package com.tyss.empwebapp.util;

import com.tyss.empwebapp.dao.EmployeeDAO;
import com.tyss.empwebapp.dao.EmployeeDAOJdbcImpl;

public class EmployeeDaoManager {
	private EmployeeDaoManager() {
	}

	public static EmployeeDAO getEmployeeDAO() {
		return new EmployeeDAOJdbcImpl();
	}
}
