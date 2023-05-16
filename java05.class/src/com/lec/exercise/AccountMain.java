package com.lec.exercise;

public class AccountMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Account account = new Account();
		
		account.setBalance(500000);
		System.out.println("잔고 = " + account.getBalance());
		
		account.setBalance(5000000);
		System.out.println("잔고 = " + account.getBalance());
		
		account.setBalance(-500000);
		System.out.println("잔고 = " + account.getBalance());
		
		account.setBalance(500000);
		System.out.println("잔고 = " + account.getBalance());
		
		

	}

}
