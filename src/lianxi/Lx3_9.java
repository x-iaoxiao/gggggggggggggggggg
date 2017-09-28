package lianxi;

import java.util.Scanner;

public class Lx3_9 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
        //输入一个0-100的分数
		//不在0-100 打印分数无效
		//根据等级打印
		//
		System.out.println("请输入一个分数");
		Scanner sc=new Scanner(System.in);
		int s=sc.nextInt();
		if(s>100||s<0)
		{System.out.println("分数无效");}
		else if(s>=90)
		{System.out.println("A");}
		else if(s>=80)
		{System.out.println("B");}
		else if(s>=70)
		{System.out.println("C");}
		else if(s>=60)
		{System.out.println("D");}
		else 
		{System.out.println("E");}
		
	}

}
