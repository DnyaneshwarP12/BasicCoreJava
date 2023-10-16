package com.tns.daytwelve;

import java.io.IOException;

public class CheckedExceptionDemo {

	public static void main(String args []) {
		
		try {
			
			String str = CheckedException.acceptText();
			System.out.println("Your String is "+str);
			
		}catch(IOException e) {
			System.out.println("An error occured while reading input"+ e.getMessage());
		}
	}
}
