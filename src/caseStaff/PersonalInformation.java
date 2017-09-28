package caseStaff;
//个人信息类
public class PersonalInformation {

	String name;
	
	int age;
	
	char sex;
	
	String id;
	
	public PersonalInformation() {
		
		this.name=null;
		
		this.age=0;
		
		this.sex='\u0000';
		
		this.id=null;
		
	}
   public PersonalInformation(String name,int age,char sex,String id) {
		
		this.name=name;
		
		this.age=age;
		
		this.sex=sex;
		
		this.id=id;
		
	}
	
	public void setName(String name) {
		
		this.name=name;
		
	}
	
	public String getName() {
		
		return this.name;
		
	}
	
	public void setAge(int age) {
		
		this.age=age;
		
	}
	
	public int getAge() {
		
	    return	this.age;
	    
	}
	
	public void setSex(char sex) {
		
		this.sex=sex;
		
	}
	
	public char getSex() {
		
		return this.sex;
		
	}
	
	public void setId(String id) {
		
		this.id=id;
		
	}
	
	public String getId() {
		
		return this.id;
		
	}
	public void showAll() {
		System.out.println(this.name+"\t"+this.age+"\t"+this.sex+"\t"+this.id);
	}
}
