package lianxi;

import java.util.Scanner;

public class Lx5_1 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
      //编写一个方法，求整数n的阶乘，例如5的阶乘是1*2*3*4*5。 [必做题]
	     System.out.println("输入一个数，求他的阶乘：");
	     Scanner sc=new Scanner(System.in);
	     int n=sc.nextInt();
	     int nn= Function1(n);
	     System.out.println(n+"的阶乘："+nn);
	}
	public static int Function1(int x) {
		int y=1;
		for(int i=1;i<=x;i++)y*=i;
		return y;
	}

}
