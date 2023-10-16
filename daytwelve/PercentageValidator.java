package com.tns.daytwelve;

import java.util.Scanner;

public class PercentageValidator {

	
	static float acceptNumber() {
		Scanner sc = new Scanner (System.in);
		
		while(!sc.hasNextFloat()) {
			System.out.println("Invalid input, please enter");
			sc.next();
		}
		int n = sc.nextInt();
		sc.close();
		return n;
		
	}
	
	static void isvalidPercentage(float per ) throws ArithmeticException{
		if(per >= 0 && per <= 100) {
			System.out.println("Valid Percentage " +per);
		}
		else
		{
			throw new ArithmeticException("Percentage should between 0 and 100");
		}
	}
}
