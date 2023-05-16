package com.lec.ex05_user;

public class AccountMain {

	public static void main(String[] args) throws 잔액부족 {
		
		Account account = new Account();
		
		account.예금(100);
		System.out.println("잔액 = " + account.getBalance());
		
		account.출금(220);
		System.out.println("잔액 = " + account.getBalance());
		
//		throw new 잔액부족("잔액이 부족합니다.");

	}

}
