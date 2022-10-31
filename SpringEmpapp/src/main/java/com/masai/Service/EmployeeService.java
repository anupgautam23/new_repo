package com.masai.Service;

import java.util.List;

import com.masai.Exceptions.EmployeeException;
import com.masai.Model.Employee;

public interface EmployeeService {

	
	public boolean saveEmployee(Employee emp);
	public List getAllEmployee();
	public Employee getEmployeeById(int empId)throws EmployeeException;
	public String deleteEmployeeById(int empId)throws EmployeeException;
}
