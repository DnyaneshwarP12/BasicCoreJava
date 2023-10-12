package com.tns.dayten;

import java.util.Arrays;

public class ArrayClassDemo {

	public static void main(String[] args) {

		int intArr[] = {10,7,20,100,30,40,78,89};
		
		
		System.out.println("Array is: "+ Arrays.toString(intArr));
		
		Arrays.sort(intArr);
		
		System.out.println("................After sorting.............");
		System.out.println("Array is :"+ Arrays.toString(intArr));
		
		
		int intkey =20;
		
		//print the key and corresponding index
		
		System.out.println(intkey + "found at index ="+Arrays.binarySearch(intArr, intkey));
		System.out.println(intkey + "found at index =" +Arrays.binarySearch(intArr, 1, 3, intkey));
		
		//Get the second array
		int intArray2[]= {10,20,30,40};
		
		System.out.println("Second array "+Arrays.toString(intArray2));
		
		
		//to compare both arrays
		if(Arrays.equals(intArr, intArray2))
			System.out.println("Both arrays are equal ");
		else
			System.out.println("Both arrays arenot equal");
		
		//create a new array with a specified length
		
		System.out.println("\n New Arrays by copyOf :\n");
		
		int intArr3[]= Arrays.copyOf(intArray2, 4);
		
		System.out.println("Integer Array: "+Arrays.toString(intArr3));
		
		//to fill the arrays with key 200
		
		Arrays.fill(intArr3, intkey);
		System.out.println("Integer Array on filling 200: "+Arrays.toString(intArr3));
		
		
		
	}

}
