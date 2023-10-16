package com.tns.tnsif.daythirteen;

public class RunnableDemo {

	public static void main(String agrs []) {
		
		UsingRunnable ur = new UsingRunnable(10,20, "Hello");
		
		Runnable runnable = new Runnable() {
			
			@Override
			public void run()
			{
				System.out.println("Runnable with Anonymous class ");
			}
		};
		
		Thread t1 = new Thread (ur);
		t1.start();
	}
}
