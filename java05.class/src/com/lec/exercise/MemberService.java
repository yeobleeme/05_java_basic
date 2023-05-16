package com.lec.exercise;

public class MemberService {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		MemberService ms = new MemberService();
		
		boolean result = ms.login("hong", "12345");
		
		if(result) {
			System.out.println("로그인 되었습니다.");
			ms.logout("hong");
		} else {
			System.out.println("올바르지 않은 id / password 입니다.");
		}

		
	}
	
	
	

	public boolean login(String id, String password) {
		if(id.equals("hong") && password.equals("12345")) {
			return true;
		}
		return false;
	}
	
	public void logout(String id) {
		if(id.equals("hong")) {
			System.out.println("로그아웃 되었습니다.");
		}
	}


	}

