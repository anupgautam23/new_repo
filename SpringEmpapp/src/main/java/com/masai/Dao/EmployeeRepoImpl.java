package com.masai.Dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;


import com.masai.Model.Employee;
import com.masai.utility.EMUtil;

@Repository
public class EmployeeRepoImpl implements EmployeeRepo{

	@Override
	public boolean insertEmployeeDetails(Employee emp) {
		
		boolean flag = false;
		EntityManager em= EMUtil.provideEntityManager();
		
		
		em.getTransaction().begin();
		
		em.persist(emp);
		
		flag = true;
		em.getTransaction().commit();
		
		
		em.close();
		
		return flag;
		
	}

	@Override
	public List getAllEmployeeDetails() {
		
		EntityManager em= EMUtil.provideEntityManager();
		
		Query q= em.createQuery("from Employee");
		
		List<Employee> emps = q.getResultList();
		
		em.close();
		
		return emps;
	}

	@Override
	public Employee findEmployee(int empId) {
		Employee emp = null ; 
		
		EntityManager em =  EMUtil.provideEntityManager();
		emp = em.find(Employee.class, empId);		
	
		return emp;
	}

	@Override
	public String deleteEmployeeDetailsById(int empId) {
		String message = "";
		
		EntityManager em =  EMUtil.provideEntityManager();
		
		 Employee emp = em.find(Employee.class, empId);
		
		 
		 em.getTransaction().begin();
		 
		 em.remove(emp);
		 message = "Employee removed successfully " ;
		 em.getTransaction().commit();
		 
		 em.close();
		 
		return message;
	}

}
