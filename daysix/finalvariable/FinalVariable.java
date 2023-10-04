package com.tns.daysix.finalvariable;

public class FinalVariable {

	//final int x;  // final instance variable must be initialized
	
	final int x=1000;
	
	// Declare a static black final variable
	
	//final static int y;
	
	// Declare And initialize static final variable
	
	final static int  y=200;
	
	void change() {
		//x= 3000;  // final variable can't 
		//y=4000;
		
	}

	@Override
	public String toString() {
		return "FinalVariable [x=" + x + ", y" +y+" ]";
	}
	
	static {
		//y = 2000;
		 
	}
	
	
}
