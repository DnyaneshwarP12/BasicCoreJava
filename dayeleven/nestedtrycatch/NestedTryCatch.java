//program to demonstrate nested try catch
package com.tns.dayeleven.nestedtrycatch;

public class NestedTryCatch {

	public static void check() {
		String str = "TNSIFBANGALORE";
		int slen = str.length();
		System.out.println("String length :"+slen);
		
		String anotherstring = "COETA";
		int y=6;
		try {
			
			//inner try block
			try {
				System.out.println(str.charAt(y));
				
			}catch(StringIndexOutOfBoundsException ex) {
				
				
				System.out.println("Index is out of bounds " +ex.getMessage());
			
			}
			System.out.println("String length :"+anotherstring.length());
		
		}catch(NullPointerException npe) {
			
			System.out.println("Exception is thrown "+ npe.getMessage());
		}
		
	}
}
