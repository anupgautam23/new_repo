package com.masai.UseCase;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Controller;
import org.w3c.dom.html.HTMLPreElement;

import com.masai.Model.Employee;
import com.masai.Presentation.PresentationBean;
import com.masai.Service.EmployeeService;


public class InsertEmployee {
	
		
	
	
	public static void main(String[] args) {
		
		ApplicationContext ctx = new AnnotationConfigApplicationContext(com.masai.Config.AppConfig.class);
		PresentationBean obj  =  ctx.getBean("present",PresentationBean.class);
		obj.insertEmployee();

	}

}
