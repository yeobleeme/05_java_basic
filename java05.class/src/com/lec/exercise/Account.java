package com.lec.exercise;

public class Account {
	
	private int balance = 0;
	
	static final int MIN_BALANCE = 0;
	static final int MAX_BALANCE = 1000000;
	
	
	public void setBalance(int balance) {
		if(balance >= MIN_BALANCE && balance <= MAX_BALANCE) {
			this.balance = balance;
		} 
		else if(balance < MIN_BALANCE) {
			this.balance = MIN_BALANCE;
		} else if(balance > MAX_BALANCE) {
			this.balance = MAX_BALANCE;
		}
	}
	
	public int getBalance() {
		return this.balance;
	}

}
