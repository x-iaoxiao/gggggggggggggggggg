package com.neuedu.entity;

public class Emp {
	
	private int empno;
	private String ename;
	private int salary;
	private String job;
	private int deptno;
	
	public Emp() {
		super();
	}
	
	public Emp(int empno, String ename, int salary, String job, int deptno) {
		super();
		this.empno = empno;
		this.ename = ename;
		this.salary = salary;
		this.job = job;
		this.deptno = deptno;
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
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public int getDeptno() {
		return deptno;
	}
	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}
	
}
