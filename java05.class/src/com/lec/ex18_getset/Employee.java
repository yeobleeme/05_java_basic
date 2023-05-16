package com.lec.ex18_getset;

import java.util.Date;

// DTO, Model, Entity ...
public class Employee {
	
	private int empno;
	private String ename;
	private Date hiredate;
	private int sal;
	private int deptno;
	private boolean adult;
	private String ssn;
	private boolean disease;
	private boolean admin;
	
	
	public Employee() {
		
	}
	
	
	public Employee(int empno, String ename, Date hiredate, int sal, int deptno, boolean adult, String ssn) {
		this.empno = empno;
		this.ename = ename;
		this.hiredate = hiredate;
		this.sal = sal;
		this.deptno = deptno;
		this.adult = adult;
		this.ssn = ssn;
	}
	
	


	public int getEmpno() {
		return empno;
	}
	public void setEmpno(int empno) {
		this.empno = empno;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public Date getHiredate() {
		return hiredate;
	}
	public void setHiredate(Date hiredate) {
		this.hiredate = hiredate;
	}
	public int getSal() {
		return sal;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}
	public int getDeptno() {
		return deptno;
	}
	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}
	public boolean isAdult() {
		return adult;
	}
	public void setAdult(boolean adult) {
		this.adult = adult;
	}
	public String getSsn() {
		return ssn;
	}
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	public boolean isDisease() {
		return disease;
	}
	public void setDisease(boolean disease) {
		this.disease = disease;
	}
	public boolean isAdmin() {
		return admin;
	}
	public void setAdmin(boolean admin) {
		this.admin = admin;
	}


	@Override
	public String toString() {
		return "Employee [empno=" + empno + ", ename=" + ename + ", hiredate=" + hiredate + ", sal=" + sal + ", deptno="
				+ deptno + ", adult=" + adult + ", ssn=" + ssn + "]";
	}
	
	

}
