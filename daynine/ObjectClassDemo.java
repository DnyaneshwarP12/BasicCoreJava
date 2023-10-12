package com.tns.daynine;

class sample{
	
	
}
class Demo{
	
	public Demo() {
		
		System.out.println("In constructor");
	}
	
	protected void finalize() throws Throwable{
		
		System.out.println("In finalize");
	}
}
public class ObjectClassDemo {

	public static void main(String agrs[]) {
		
		sample s= new sample();
		sample s1= new sample();
		System.out.println(s.getClass().getName());
		System.out.println(s.hashCode());
		System.out.println(s1.hashCode());
		
		Demo d = new Demo();
		System.out.println(d.hashCode());
		
		d= null;
		
		System.gc();
	}
}
