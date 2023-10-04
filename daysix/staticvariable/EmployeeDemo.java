package com.tns.daysix.staticvariable;

public class EmployeeDemo {

	public static void main(String[] args) {
		Employee e=new Employee("MAnish",100);
		System.out.println(e);
		
		System.out.println(Employee.companyname);
		
		e=new Employee("Kumar", 200);
		System.out.println(e);
	}

	
} 
