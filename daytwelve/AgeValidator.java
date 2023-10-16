package com.tns.daytwelve;

public class AgeValidator {

	static void validataAge(int age) throws InvalidAgeException{
		
		if(age < 18) {
			throw new InvalidAgeException("Invalid age, you are not elogble to vote.");
		}
	}
}
