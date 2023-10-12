package com.tns.dayeight.interfaces.implementinginheritance;

public class BankImpl implements Bank {

	@Override
	public void deposit(Account account, double amount) {
		if(amount > DEPOSIT_LIMIT)
			System.out.println("Deposit not Possible....exceeds Deposit limit");
		else 
			account.setBalance(account.getBalance()+amount);
		System.out.println("Deposited "+ amount +"in to account "+ account.getAccNo());
	}
	
	@Override
	public void withdraw (Account account, double amount) {
		
		if(account.getBalance()-amount >= MIN_BALANCE) {
			account.setBalance(account.getBalance()-amount);
			System.out.println("Withdraw "+ amount + "from account"+account.getBalance());
		}
		else {
			System.out.println("Insufficient Balance in account..");
		}
	}
}
