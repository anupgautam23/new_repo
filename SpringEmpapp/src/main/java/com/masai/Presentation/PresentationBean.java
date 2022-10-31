package com.masai.Presentation;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.masai.Model.Employee;
import com.masai.Service.EmployeeService;

@Controller(value = "present")
public class PresentationBean {
	
	@Autowired
	private EmployeeService empService; //dependency
	
	public void insertEmployee(){
	//take the input from the user (Employee Details without empId, empId should be
	//generated automatically)and call the saveEmployee method on the
	//empService object.
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter Name ");
		String name= sc.next();
	
		System.out.println("Enter address ");
		String adress= sc.next();
		
		System.out.println("Enter Salary");
		int salary = sc.nextInt();
		
		Employee emp = new Employee(salary, name, adress, salary);
		
		 boolean result =  empService.saveEmployee(emp);
		if(result==true) {
			System.out.println("inserted successfully");
		}else {
			System.out.println("some error");
		}
	}
	public void printAllEmployee(){
	//call the getAllEmployee method on the empService object and print all the
	//employee details.
	}
	public void searchEmployee(){
	// take the empId from the user and call the getEmployeeById method on the
	//empService obj. And print the appropriate details.
	}
	public void deleteEmployee(){
	// take the empId from the user and call the deleteEmployeeById method on the
	//empService obj. And print the appropriate details.
	}

}
