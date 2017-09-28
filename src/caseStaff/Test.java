package caseStaff;
//测试程序
public class Test {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根

		
		//创建一份个人信息
		PersonalInformation cx=new PersonalInformation("常潇",16,'女',"1462141502");
		PersonalInformation ty=new PersonalInformation("田野",26,'男',"1462141535");
		PersonalInformation cy=new PersonalInformation("常越",13,'女',"1462141530");
		//创建一所公司
		Conpany shanxiuniverdity=new Conpany("shanxiuniversity");
		//创建一份联系方式
		Contacts contacts_cx_phone=new Contacts("15735104420");
		Contacts contacts_ty_phone=new Contacts("15735104385");
		Contacts contacts_cy_phone=new Contacts("15735104400");
		//创建一个部门
		Department class_three=new Department("大三");
		//创建一个职位
		Role student=new Role("学生");
		//创建一份薪水
		Salary salary=new Salary(0);
		//创建一个地址
		Address address_cx=new Address("积美1");
		Address address_ty=new Address("明德2");
		Address address_cy=new Address("清徐");
		//
//		Staff[] cx_up= {cy,ty};
		//
		//Staff[] down;
		//
		//Staff ty=new Staff();
		//
		
		Staff sty=new Staff(ty,shanxiuniverdity,contacts_ty_phone,class_three,student,salary,address_ty);
		Staff scy=new Staff(cy,shanxiuniverdity,contacts_cy_phone,class_three,student,salary,address_cy);
		Staff[] cx_up= {scy,sty};
		Staff scx=new Staff(cx,shanxiuniverdity,contacts_cx_phone,class_three,student,salary,address_cx,cx_up);
		scx.person.showAll();
		sty.person.showAll();
		scy.person.showAll();
		System.out.println(scx.getUnderstrappers()[0].getPerson().getName());
	}

}
