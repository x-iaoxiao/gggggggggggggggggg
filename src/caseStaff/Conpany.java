package caseStaff;

import javax.xml.crypto.Data;

//公司类
public class Conpany {

	String name;//公司名称
	
	Data registerTime;//注册时间
	
	String founder;//创始人
	
	Staff[] staffs;
	
	Address address;//公司地址
	
	Department[] department;//公司所拥有的部门
	
	

	public Conpany() {
	
		this.name=null;
		
		this.founder=null;
		}

	public Conpany(String name,Data registerTime,String founder,Staff[] staffs ) {
		
		this.name=name;
		
		this.registerTime=registerTime;
		
		this.founder=founder;
		this.staffs=staffs;
		
	}
   public Conpany(String name) {
		
		this.name=name;
	}
	public String getName() {
		
		return name;
	}

	public void setName(String name) {
		
		this.name = name;
	}

	public Data getRegisterTime() {
		
		return registerTime;
	}

	public void setRegisterTime(Data registerTime) {
		
		this.registerTime = registerTime;
	}

	public String getFounder() {
		
		return founder;
	}

	public void setFounder(String founder) {
		
		this.founder = founder;
		
	}
	public Staff[] getStaffs() {
		return staffs;
	}

	public void setStaffs(Staff[] staffs) {
		this.staffs = staffs;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Department[] getDepartment() {
		return department;
	}

	public void setDepartment(Department[] department) {
		this.department = department;
	}
	public void showall() {
		
	}
}
