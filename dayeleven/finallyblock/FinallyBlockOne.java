package com.tns.dayeleven.finallyblock;

public class FinallyBlockOne {

	public static void divide(int a, int b) {
		try {
			System.out.println(".....with try block......");
			int result = a/b;
			System.out.println("Result :"+result);
		}catch(ArithmeticException ae) {
			System.out.println("Arithmetic exception caught:"+ae.getMessage());
		}finally {
			System.out.println("Finally block .......");
		}
		
		System.out.println("Statement ");
	}
	
	
}
