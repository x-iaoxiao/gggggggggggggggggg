package com.domain;

import java.sql.Timestamp;

import com.annotation.Column;
import com.annotation.ID;

public class Stu {

	@ID
	@Column(name = "SID")
	private int sid;
	@Column(name = "SNAME")
	private String sname;
	@Column(name = "AGE")
	private int age;
	@Column(name = "HIRE")
	private Timestamp hire;

	@Override
	public String toString() {
		return "Stu [sid=" + sid + ", sname=" + sname + ", age=" + age + ", hire=" + hire + "]";
	}

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Timestamp getHire() {
		return hire;
	}

	public void setHire(Timestamp hire) {
		this.hire = hire;
	}

}
