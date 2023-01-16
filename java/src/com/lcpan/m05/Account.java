package com.lcpan.m05;

public class Account {
	
	
	String accountNo;
	double balance;
	
	public Account(String accountNo , double balance ) {
		this.accountNo = accountNo;
		this.balance = balance;
		
	}
	
	public void accData() {
		System.out.println("帳號:"+accountNo);
		System.out.println("餘額值:"+balance);


		
	}

	public static void main(String[] args) {

		
		Account a = new Account("124654",50000.0);
		a.accData();
	}

}
