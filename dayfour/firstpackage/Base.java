package com.tns.dayfour.firstpackage;

public class Base {
	int varDefault=10;
	public int varPublic=20;
	private int varPrivate=30;
	protected int varProtected=40;
	
	void methodDefault() {
		
		System.out.println("Defualt access Base class");
		System.out.println("Default variable:"+varDefault);
	}
	
	public void methodPublic() {
		
		System.out.println("Private acces Base class");
		System.out.println("Private variable:"+varPublic);
	}
	
	public void methodPrivate() {
		
		System.out.println("Private access Base class");
		System.out.println("Private Variable:"+varPrivate);
	}
	
	protected void methodProtected() {
		
		System.out.println("Private access Base class");
		System.out.println("Private Variable:"+varProtected);
	}
}
