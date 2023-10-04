package com.tns.daysix.finalvariable;


final class FinalClass{
	void show() {
		System.out.println("Final class Can not be inherited");
		
	}
}

//class FinalChildClass extends FinalClass{
	
//}
public class FinalClassDemo {

	public static void main(String[] args) {
		
		
		FinalClass f1 = new FinalClass();
		f1.show();
	}

}
