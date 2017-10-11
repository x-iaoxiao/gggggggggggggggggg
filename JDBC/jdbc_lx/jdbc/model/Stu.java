package jdbc.model;

public class Stu {

	private int sid;
	private String sname;
	private int sage;
	
	public Stu() {}
	public Stu(int sid,String sname,int age) {
		this.sid=sid;
		this.sname=sname;
		this.sage=age;
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
	public int getSage() {
		return sage;
	}
	public void setSage(int sage) {
		this.sage = sage;
	}
	@Override
	public String toString() {
		return "Stu [sid=" + sid + ", sname=" + sname + ", sage=" + sage + "]";
	}
	
	
}
