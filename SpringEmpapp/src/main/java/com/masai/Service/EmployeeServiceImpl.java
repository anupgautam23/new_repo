package com.masai.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.Dao.EmployeeRepo;
import com.masai.Exceptions.EmployeeException;
import com.masai.Model.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService{

	@Autowired
	private EmployeeRepo  dao ; 
	
	
	@Override
	public boolean saveEmployee(Employee emp)  {
	
		
		return  dao.insertEmployeeDetails(emp);
		
		
	}

	@Override
	public List getAllEmployee() {
		
		return dao.getAllEmployeeDetails();
	}

	@Override
	public Employee getEmployeeById(int empId) throws EmployeeException {
		Employee emps =null ; 
		
		emps = dao.findEmployee(empId);
		
		if(emps==null) {
			throw new EmployeeException("no employee found");
		}else {
			System.out.println("employee detail is ");
			System.out.println(emps);
		}
		
		return emps;
	}

	@Override
	public String deleteEmployeeById(int empId) throws EmployeeException {

		String message ="" ;
		
		message = dao.deleteEmployeeDetailsById(empId);
		
		if(message=="") {
			throw new EmployeeException("no employee found");
		}else {
			System.out.println(message);
		}
		return message;
	}

}
