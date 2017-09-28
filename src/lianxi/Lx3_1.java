package lianxi;

import java.util.Scanner;

public class Lx3_1 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
        //利润低于或等于十万  奖金提10%
		//高于10万低于或等于20万  高于十万的提7.5% 
		//高于20万 低于40万  高于20万的部分提5%
		//高于40万 低于60万  高于40万的部分提3%
		//高于60万 低于100万 高于60万的提1.5%
		//高于100万        高于100万的提1%
		//提成=月利润*百分比
		System.out.println("请输入月利润");
		Scanner sc = new Scanner(System.in);
		double n = sc.nextInt();//获取月利润
		double nn=n;
		double a=0 ;//提成比例
		int b=0;//进入switch的值
		double money=0.0;//提成
		if(n >= 100) {b = 0;}
		else if(n >= 60) {b = 1;}
		else if(n >= 40) {b = 2;}
		else if(n >= 20) {b = 3;}
		else if(n >= 10) {b = 4;}
		else {b = 5;}
		switch(b) {
		case 0:
			a=0.01;
			money+=(n-100)*a;
			n-=(n-100);
		case 1 :
			a = 0.015;
		    money+=(n-60)*a;
		    n-=(n-60);
		case 2 :
			a = 0.03;
		    money+=(n-40)*a;
		    n-=(n-40);
		case 3 :
			a=0.05;
		    money+=(n-20)*a;
		    n-=(n-20);
		case 4 :	
			a=0.075;
		    money+=(n-10)*a;
		    n-=(n-10);
		case 5 :
			a=0.1;
		    money+=n*a;
		}
		System.out.println("当月利润为："+nn+",应该发放的奖金为："+money);
	}

}
