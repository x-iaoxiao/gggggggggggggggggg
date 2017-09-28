package lianxi;

import java.util.Scanner;

public class Lx3_11 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
        //一个不超过五位的正整数
		//求他是几位数
		//并打印出每一位数字
		//
		//12345
		 System.out.println("请输入一个五位以内的整数：");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int count=0;
//		int g=0;
//		int s=0;
//		int b=0;
//		int q=0;
		int w=0;
		for(int i=0;i<5;i++)
		{
			if(num!=0)
			{
				w=num%10;
			    num/=10;
			    System.out.println(w);
			    count++;
			}
			else break;
//			 System.out.println("这是一个"+count+"位数");
		}
		 System.out.println("这是一个"+count+"位数");
	}

}
