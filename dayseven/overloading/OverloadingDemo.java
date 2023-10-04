package com.tns.dayseven.overloading;

public class OverloadingDemo {

	public static void main(String[] args) {
		
		System.out.println(".........Constructor Overloading...........");
		Point p =new Point();
		System.out.println(p);
		
		Point p1 = new Point (15.5f);
		System.out.println(p1);
		
		Point p2= new Point(15.6f, 20.7f);
		System.out.println(p2);
		
		System.out.println(".............method Overloading...........");
		System.out.println("Addition of two Intgers :" +MethodOverloading.addition(10,20));
		System.out.println("Addition of two float :"+MethodOverloading.addition(10.0f, 11.1f));
		System.out.println("Addition of one int and one float :"+MethodOverloading.addition(10, 15.5f));
		System.out.println("Addition of one float and one int :"+MethodOverloading.addition(15.5f,10));
		System.out.println("Addition of two String is :"+MethodOverloading.addition("COETA","Akola"));

	}

}
