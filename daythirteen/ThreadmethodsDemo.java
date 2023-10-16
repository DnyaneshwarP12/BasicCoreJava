package com.tns.tnsif.daythirteen;

public class ThreadmethodsDemo {

	public static void main(String[] args) {
		
		ChildThread t1 = new ChildThread(2, "first");
		ChildThread t2 = new ChildThread(3, "second");
		ChildThread t3 = new ChildThread(3, "third");
		
		t1.start();
		t2.start();
		t3.start();
		Thread.currentThread().setName("Parent Thread ");
		Thread.currentThread().setPriority(Thread.NORM_PRIORITY);
		
		System.out.println("Current thread: "+ Thread.currentThread());
		
		try {
			
			t1.join();
			t2.join(300);
		}catch(InterruptedException e) {
			
			Thread.currentThread().interrupt();
			System.err.println("Thread interruptd : "+e.getMessage());
		}
		
		System.out.println(".....................end main.............");
	}

}
