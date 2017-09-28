package lianxi;

import java.util.Scanner;

public class Lx3_12 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根

		//计算邮局汇费
		//小于100 汇费1元
		//100-5000 汇费1%
		//大于5000  汇费50
		//可输入汇款金额
		System.out.println("请输入汇款金额");
		Scanner sc=new Scanner(System.in);
		double money=sc.nextDouble();
		double m=0;
		int n;
		if(money>=5000) { n=3;}
		else if(money<=100) {n=1;}
		else {n=2;}
		switch(n)
		{
		case 1 :
			m=1;
			System.out.println("汇费为："+m);
			break;
		case 2 :
			m=money*0.01;
			System.out.println("汇费为："+m);
			break;
		case 3 :
			m=50;
			System.out.println("汇费为："+m);
			break;
		}
		
	}

}
