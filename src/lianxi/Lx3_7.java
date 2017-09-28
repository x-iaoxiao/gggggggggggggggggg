package lianxi;

import java.util.Scanner;

public class Lx3_7 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
        //判断一个数字是否能被5和6同时整除（打印能被5和6整除）
		//只能被5 整除    能被5整除
		//只能被5 整除   能被6整除
		//不能被5或6整除        不能被5或6整除    
		System.out.println("请输入一个整数：");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		if(num%5==0&&num%6==0)
		{System.out.println(" 能被5和6整除");}
		else if(num%6==0)
		{System.out.println(" 能被6整除");}
		else if(num%5==0)
		{System.out.println(" 能被5整除");}
		else {System.out.println("不能被5或6整除");}
		
		
	}

}
