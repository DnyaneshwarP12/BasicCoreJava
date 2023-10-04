package com.tns.dayfive.multilevelinheritance;

public class MultiLevelInheritance {

	public static void main(String[] args) {
		
		City city=new City();
		city.setcityname("Akola");
		city.setArea(250.2f);
		city.setstatename("Maharashtra");
		city.setlanguage("Marathi");
		city.setcountryname("India");
		city.setcapital("Mumbai");
		
		System.out.println(city);
	}
	
	

}
