package com.model;

import com.annotation.Column;
import com.annotation.ID;

public class Teacher {
	
	@ID
	@Column(name="TID")
	private long tid;
	@Column(name="TNAME")
	private String tname;
	@Column(name="PWD")
	private String pwd;
	@Column(name="SAL")
	private double sal;
	
	
	public Teacher() {
	}
	
	
	public Teacher(long tid, String tname, String pwd, double sal) {
		super();
		this.tid = tid;
		this.tname = tname;
		this.pwd = pwd;
		this.sal = sal;
	}
	public long getTid() {
		return tid;
	}
	public void setTid(long tid) {
		this.tid = tid;
	}
	public String getTname() {
		return tname;
	}
	public void setTname(String tname) {
		this.tname = tname;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public double getSal() {
		return sal;
	}
	public void setSal(double sal) {
		this.sal = sal;
	}


	@Override
	public String toString() {
		return "Teacher [tid=" + tid + ", tname=" + tname + ", pwd=" + pwd + ", sal=" + sal + "]";
	}
	
	
	
	

}
