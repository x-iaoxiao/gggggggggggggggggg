package caseStaff;
//���Գ���
public class Test {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������

		
		//����һ�ݸ�����Ϣ
		PersonalInformation cx=new PersonalInformation("����",16,'Ů',"1462141502");
		PersonalInformation ty=new PersonalInformation("��Ұ",26,'��',"1462141535");
		PersonalInformation cy=new PersonalInformation("��Խ",13,'Ů',"1462141530");
		//����һ����˾
		Conpany shanxiuniverdity=new Conpany("shanxiuniversity");
		//����һ����ϵ��ʽ
		Contacts contacts_cx_phone=new Contacts("15735104420");
		Contacts contacts_ty_phone=new Contacts("15735104385");
		Contacts contacts_cy_phone=new Contacts("15735104400");
		//����һ������
		Department class_three=new Department("����");
		//����һ��ְλ
		Role student=new Role("ѧ��");
		//����һ��нˮ
		Salary salary=new Salary(0);
		//����һ����ַ
		Address address_cx=new Address("����1");
		Address address_ty=new Address("����2");
		Address address_cy=new Address("����");
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
