package sc;

public class Test {

	public static void main(String[] args) {
		//产品
		Product p1=new Product("1","达利园法师软面包","香橙味","15只",9.98);
		Product p2=new Product("2","冰露","","550*12瓶",5.5);
		Product p3=new Product("3","桃李口袋三明治面包","草莓味","95克",4.5);
		//收货地址01
		String add1_add="天津东丽空港经济区西八道致馨公寓1311";
		String add1_name="田野";
		String add1_tel="15735104385";
		Address add1=new Address(add1_add,add1_name,add1_tel);
		//收货地址02
		String add2_add="山西省太原市山西大学积美1";
		String add2_name="常潇";
		String add2_tel="15735104420";
		Address add2=new Address(add2_add,add2_name,add2_tel);
		//客户01
		String c1_id="1544247482@qq.com";
		String c1_name="常潇";
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
		//购物车
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
