package com.domain;

public class Stu {

//	private String sname;
//	private int sage;
//	private String sno;
//	private String ssex;
//	private String dept;
//	public Stu() {}
//	public Stu(String Sname,int Sage,String Sno,String Ssex,String Dept) {
//		this.sname=Sname;
//		this.sage=Sage;
//		this.sno=Sno;
//		this.ssex=Ssex;
//		this.dept=Dept;
//	}
//	public String getSname() {
//		return sname;
//	}
//	public void setSname(String sname) {
//		this.sname = sname;
//	}
//	public int getSage() {
//		return sage;
//	}
//	public void setSage(int sage) {
//		this.sage = sage;
//	}
//	public String getSno() {
//		return sno;
//	}
//	public void setSno(String sno) {
//		this.sno = sno;
//	}
//	public String getSsex() {
//		return ssex;
//	}
//	public void setSsex(String ssex) {
//		this.ssex = ssex;
//	}
//	public String getDept() {
//		return dept;
//	}
//	public void setDept(String dept) {
//		this.dept = dept;
//	}
//	@Override
//	public String toString() {
//		return "Stu [sname=" + sname + ", sage=" + sage + ", sno=" + sno + ", ssex=" + ssex + ", dept=" + dept + "]";
//	}
	
	private int id;
	private String name;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Stu [id=" + id + ", name=" + name + "]";
	}
	
	
}
