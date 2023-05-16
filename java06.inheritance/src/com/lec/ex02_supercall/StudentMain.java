package com.lec.ex02_supercall;

public class StudentMain {

	public static void main(String[] args) {
		
		Student student = new Student("홍길동", "951230-1234567", 1000);
		System.out.println(student);
		
		Student student2 = new Student();
		student2.name = "손흥민";
		student2.ssn = "900504-1234567";
		student2.studentNo = 2000;
		System.out.println(student2);
		

	}

}
