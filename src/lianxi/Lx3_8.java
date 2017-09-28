package lianxi;

import java.util.Scanner;

public class Lx3_8 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
//输入一个年份 判断是不是闰年
		System.out.println("请输入一个年份：");
		Scanner sc=new Scanner(System.in);
		int year=sc.nextInt();
//		if(year%4!=0||year%100==0&&year)
		if((year%4==0&&year%100!=0)||(year%400==0))
		{System.out.println(year+"是闰年");}
		else {System.out.println(year+"年：不是闰年");}
	}

}
