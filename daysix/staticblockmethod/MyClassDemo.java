package com.tns.daysix.staticblockmethod;

public class MyClassDemo {

	public static void main(String[] args) {
		MyClass obj = new MyClass();
		System.out.println(obj);
		
		MyClass.display();
		
		
		MyClass obj1=new MyClass();
		System.out.println(obj1);
		MyClass.display();
		
		MyClass obj2=new MyClass();
		System.out.println(obj2);
		MyClass.display();
		
		
	}

}
