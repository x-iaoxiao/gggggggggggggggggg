package lianxi;

import java.util.Scanner;

public class Lx3_8 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
//����һ����� �ж��ǲ�������
		System.out.println("������һ����ݣ�");
		Scanner sc=new Scanner(System.in);
		int year=sc.nextInt();
//		if(year%4!=0||year%100==0&&year)
		if((year%4==0&&year%100!=0)||(year%400==0))
		{System.out.println(year+"������");}
		else {System.out.println(year+"�꣺��������");}
	}

}
