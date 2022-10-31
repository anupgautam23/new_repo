package com.masai.Dao;

import java.util.List;

import com.masai.Model.Employee;

public interface EmployeeRepo {
	
	public boolean insertEmployeeDetails(Employee emp);
	public List getAllEmployeeDetails();
	public Employee findEmployee(int empId);
	public String deleteEmployeeDetailsById(int empId);

}
