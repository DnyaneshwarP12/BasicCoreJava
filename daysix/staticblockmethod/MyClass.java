package com.tns.daysix.staticblockmethod;

public class MyClass {
	private int section;
	private static int srNo;
	
	static {
		System.out.println(".......within static block......");
		srNo = 1000;
		
	}
	MyClass(){
		System.out.println("..........within Default Constructor.........");
		srNo++;
		section++;
	}
	
	@Override
	public String toString() {
		return "MyClass [ Serial No "+srNo+",section=" + section + "]";
	}
	
	static void display() {
		//System.out.prinltn("Section :" +section);
		System.out.println("Serial No "+srNo);
	}
	
}
