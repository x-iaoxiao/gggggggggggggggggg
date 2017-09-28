package caseStaff;
//职员类
public class Staff {

	 PersonalInformation person;
     Conpany conpany;
     Contacts contacts;
//     e_Mail mail;
     Department depart;
     Role role;
     Salary salary;
     Address address;
     Staff superior;//上司
     Staff[] understrappers;//下属
     //第一个构造函数
     public Staff() {}
     // 第二个构造函数
     public Staff( PersonalInformation person,Conpany conpany, Contacts contacts,Department depart,Role role,Salary salary,Address address) {
    	 
    	 this.person=person;
    	 this.conpany=conpany;
    	 this.contacts=contacts;
    	 this.depart=depart;
    	 this.role=role;
    	 this.salary=salary;
    	 this.address=address;
//    	 this.understrappers=understrappers;
     }
     //构造函数03，用于初始化含有person,conpany,contacts,depart,role,salary,address,understrappers属性的情况
      public Staff( PersonalInformation person,Conpany conpany, Contacts contacts,Department depart,Role role,Salary salary,Address address,Staff[] understrappers) {
    	 
    	 this.person=person;
    	 this.conpany=conpany;
    	 this.contacts=contacts;
    	 this.depart=depart;
    	 this.role=role;
    	 this.salary=salary;
    	 this.address=address;
    	 this.understrappers=understrappers;
     }
     public PersonalInformation getPerson() {
		return person;
	}
	public void setPerson(PersonalInformation person) {
		this.person = person;
	}
	public Conpany getConpany() {
		return conpany;
	}
	public void setConpany(Conpany conpany) {
		this.conpany = conpany;
	}
	public Contacts getContacts() {
		return contacts;
	}
	public void setContacts(Contacts contacts) {
		this.contacts = contacts;
	}
//	public e_Mail getMail(e_Mail mail) {
//		return mail;
//	}
//	public void setMail(e_Mail mail) {
//		this.Mail = mail;
//	}
	public Department getDepart() {
		return depart;
	}
	public void setDepart(Department depart) {
		this.depart = depart;
	}
	public Role getRole() {
		return role;
	}
	public void setRole(Role role) {
		this.role = role;
	}
	public Salary getSalary() {
		return salary;
	}
	public void setSalary(Salary salary) {
		this.salary = salary;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public Staff getSuperior() {
		return superior;
	}
	public void setSuperior(Staff superior) {
		this.superior = superior;
	}
	public Staff[] getUnderstrappers() {
		return understrappers;
	}
	public void setUnderstrappers(Staff[] understrappers) {
		this.understrappers = understrappers;
	}
     
	
}
