package com.tns.dayten;

//import com.tns.dayeight.markerinterface.Student;

public class ArrayOfObjectsDemo {

	public static void main(String[] args) {
		
		//Declares an array of integers
		
		Student[] arr;
		arr = new Student[5];
		
		arr[0]= new Student(1, "kumar");
		arr[1]= new Student(2, "Ajay");
		arr[2]= new Student(3, "Vishal");
		arr[3]= new Student(4, "vaibhav");
		arr[4]= new Student(5, "vijay");
		
		for (int i=0; i< arr.length; i++)
			System.out.println("Elements at "+ i+" : "+arr[i].getRollNo()+" "+arr[i].getname());

	}

}
