package com.tyss.empwebapp.dao;

import com.tyss.empwebapp.dto.EmployeeInfo;
//this interface contains all the operation which needs to interact with DB
public interface EmployeeDAO {

	public EmployeeInfo auth(int id, String password);

	public EmployeeInfo search(int id);

	public boolean changePassword(int id, String password);
	
	public boolean registerEmployee(EmployeeInfo info);

}// EmployeeDAO
