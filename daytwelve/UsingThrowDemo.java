package com.tns.daytwelve;

import java.util.Scanner;

public class UsingThrowDemo {

	public static void main(String[] args) {
		
		StudentInfo obj = new StudentInfo();
		obj.setRollNo(101);
		obj.setName("Dnyaneshwar1");
		obj.setPer(78);
		obj.show();

		System.out.println("ENter name and age ");
		Scanner sc = new Scanner (System.in);
		VoterInfo obj1 = new VoterInfo();
		obj1.setName(sc.next());
		obj1.setAge(sc.nextInt());
		
		if(obj1.getAge()!=0)
			System.out.println(obj1);
	}

}
