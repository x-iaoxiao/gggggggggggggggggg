package sc;

public class Test {

	public static void main(String[] args) {
		//��Ʒ
		Product p1=new Product("1","����԰��ʦ�����","���ζ","15ֻ",9.98);
		Product p2=new Product("2","��¶","","550*12ƿ",5.5);
		Product p3=new Product("3","����ڴ����������","��ݮζ","95��",4.5);
		//�ջ���ַ01
		String add1_add="������ո۾��������˵���ܰ��Ԣ1311";
		String add1_name="��Ұ";
		String add1_tel="15735104385";
		Address add1=new Address(add1_add,add1_name,add1_tel);
		//�ջ���ַ02
		String add2_add="ɽ��ʡ̫ԭ��ɽ����ѧ����1";
		String add2_name="����";
		String add2_tel="15735104420";
		Address add2=new Address(add2_add,add2_name,add2_tel);
		//�ͻ�01
		String c1_id="1544247482@qq.com";
		String c1_name="����";
		Personal_information c1_person=new Personal_information(c1_name);
		Customer c1=new Customer(c1_person,c1_id);
		//itme1
		Item item1=new Item(p1,5);
		//itme2
		Item item2=new Item(p2,3);
		//item3
		Item item3=new Item(p3,2);
		//items
		Item[] items= {item1,item2};
////////////////////////////////////////////////////////////////////////////////////
		//���ﳵ
		Shopping_car car=new Shopping_car(items);
//		System.out.println(p1.toString());
//		System.out.println(p2.toString());
//		car.addItem(item1);
//		car.addItem(item2);
//		System.out.println(item1.toString());
//		System.out.println(item2.toString());

		car.addItem(item3);
		car.addItem(item2);
		car.show();
	}

}
