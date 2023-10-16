//program to demonstrate try catch block
package com.tns.dayeleven.trycatch;

public class TryCatchExample {

	static void performDivision(int x, int y) {
		System.out.println("I am in method");
		int z;
		try {
			
			System.out.println("I am in try block ");
			z=x/y;
			System.out.println("Result of Z :"+z);
		}catch(ArithmeticException e) {
			System.out.println("I am in catch block "+ e.getMessage());
		}
	}
}
