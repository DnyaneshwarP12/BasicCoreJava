package com.tns.daysix.finalvariable;



public class FInalMethodClass {
	
	FInalMethodClass(){
		System.out.println("This is Default Constructor");
		
	}
	
	final int a=100;
	
	//final method
	
	final void show() {
		System.out.println("Value of a :"+a);
	}
}
