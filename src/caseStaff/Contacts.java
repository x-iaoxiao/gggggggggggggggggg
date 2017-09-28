package caseStaff;
//联系方式类
public class Contacts {
     
	String phoneNumber;//电话
	
	String qq;//QQ
	
	e_Mail mail;//邮箱
	
	public Contacts() {}
	
	public Contacts(String phonenumber,String qq,e_Mail mail) {
		
		this.phoneNumber=phoneNumber;
		
		this.qq=qq;
		
		this.mail=mail;
		
	}
public Contacts(String phonenumber) {
		
		
		this.phoneNumber=phonenumber;
		
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getQq() {
		return qq;
	}

	public void setQq(String qq) {
		this.qq = qq;
	}

	public e_Mail getMail() {
		return mail;
	}

	public void setMail(e_Mail mail) {
		this.mail = mail;
	}
	
}
