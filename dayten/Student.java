package com.tns.dayten;

public final class Student {

	private int rollNo;
	private String name;
	
	Student(int rollNo, String name){
		this.rollNo=rollNo;
		this.name=name;
		
	}
	
	public int getRollNo() {
		return rollNo;
	}
	
	public void setRollNo(int rollNo) {
		this.rollNo=rollNo;
	}
	
	public String getname() {
		return name;
	}
	
	public void setname(String name) {
		this.name=name;
	}
}
