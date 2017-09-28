package caseStaff;
//岗位信息类
public class Role {

	String name;//名字
	String num;//编号
	
	public Role() {}
	public Role(String name) {
		
		this.name=name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNum() {
		return num;
	}
	public void setNum(String num) {
		this.num = num;
	}
}
