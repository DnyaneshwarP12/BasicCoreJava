package com.tns.dayeight.abstraction;

public class AbstractDemo {

	public static void main(String[] args) {
		
		Square sq= new Square();
		Rectangle rc = new Rectangle();
		sq.calArea();
		sq.show();
		
		rc.calArea();
		rc.show();
		
		System.out.println("..................");
		
		Shape sh;
		
		sh= new Square(12.5f);
		sh.calArea();
		sh.show();
		
		sh= new Rectangle(10, 20);
		sh.calArea();
		sh.show();
		
	}

}
