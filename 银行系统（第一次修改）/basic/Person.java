package basic;

//个人信息类

public class Person {
	
	String id;//身份证号
	
	String name;//姓名
	
	String tel;//电话
	
	String addr;//地址
	
	String role;//职业
	
	public Person() {}
	
	public Person(String id,String name,String tel,String addr,String role) {
		
		this.id=id;
		this.name=name;
		this.tel=tel;
		this.addr=addr;
		this.role=role;
		
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id=id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	
	
	@Override
	public String toString() {
		
		return "Person [id=" + id + ", name=" + name + ", tel=" + tel + ", addr=" + addr + ", role=" + role + "]";
		
	}
	
	
}

