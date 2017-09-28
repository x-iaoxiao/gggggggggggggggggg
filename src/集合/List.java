package 集合;

import java.util.ArrayList;
import java.util.Date;
public class List {

	public static void main(String[] args) {
		
		/*ArrayList arraylist1=new ArrayList();
		arraylist1.add("刘若英");
		arraylist1.add("1.漂洋过海来看你");*/
//		System.out.println(arraylist1.size());
//		System.out.println(arraylist1);
		java.util.List list = new ArrayList(5);
		list.add("1");     //   1 =  new Integer(1) 
		list.add("2");
		list.add(new Date());
//		list.add(new Stu(1,"tom"));
		
		//printList(list);
	}
}
