package lianxi;

import java.util.Scanner;

public class Lx3_2 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
        //给定一个成绩a使用switch结构求出它的等级
		//A   90-100
		//B   80-89
		//C   70-79
		//D   60-69
		//E   0-59
		Scanner sc = new Scanner(System.in);
		System.out.println("请输出a的值");
		int a=sc.nextInt();
		int n=a/10;
		switch(n)
		{
		case 0 :
		case 1 :
		case 2 :
		case 3 :
		case 4 :
		case 5 :
			System.out.println("a="+a+",它的等级为E");break;
		case 6 :
			System.out.println("a="+a+",它的等级为D");break;
		case 7 :
			System.out.println("a="+a+",它的等级为C");break;
		case 8 :
			System.out.println("a="+a+",它的等级为B");break;
		case 9 :
		case 10 :
			System.out.println("a="+a+",它的等级为A");break;
			
		}
		
		
	}

}
