package com.tns.dayeight.interfaces.implementinginheritance;

public class BankApplication {

	public static void main(String[] args) {
		
		Bank bank = new BankImpl ();
		
		Account acc = new Account(12344, "akhil",15500);
		
		bank.deposit(acc, 2000);
		
		System.out.println(acc);
		
		bank.withdraw(acc, 500);
		
		System.out.println(acc);

	}

}
