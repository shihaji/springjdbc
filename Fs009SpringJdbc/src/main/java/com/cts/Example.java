package com.cts;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Example {

	public static void main(String[] args) {
		
		ApplicationContext ctx=new AnnotationConfigApplicationContext(AppConfig.class);
		
		EmployeeDao employeeDao=ctx.getBean(EmployeeDao.class);
		
			
		
		
	//	employeeDao.insertEmployeSimply(new Employee(3333,"abnc",50000));
		
		System.out.println(employeeDao.showAllEmp());
		
		

	}

}
