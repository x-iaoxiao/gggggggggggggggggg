package caseStaff;

import javax.xml.crypto.Data;

//��˾��
public class Conpany {

	String name;//��˾����
	
	Data registerTime;//ע��ʱ��
	
	String founder;//��ʼ��
	
	Staff[] staffs;
	
	Address address;//��˾��ַ
	
	Department[] department;//��˾��ӵ�еĲ���
	
	

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
