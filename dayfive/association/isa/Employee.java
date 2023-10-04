package com.tns.dayfive.association.isa;

public class Employee {
	private String name;
	private int EmpId;
	private String dept;
	
	public Employee() {
		super();
	}

	public Employee(String name, int empId, String dept) {
		super();
		this.name = name;
		this.EmpId = empId;
		this.dept = dept;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getEmpId() {
		return EmpId;
	}

	public void setEmpId(int empId) {
		EmpId = empId;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", EmpId=" + EmpId + ", dept=" + dept + "]";
	}
	
	
}
