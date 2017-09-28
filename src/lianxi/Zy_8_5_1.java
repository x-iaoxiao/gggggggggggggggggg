package lianxi;

import java.util.Scanner;

public class Zy_8_5_1 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		 System.out.println("请输入您的本金");
		Scanner sc=new Scanner(System.in);
      double money=sc.nextInt();
   for(int i=0;i<5;i++) {
	   money=money*(1+0.003);
   }
   System.out.println("5年之后的本金为"+money);
	}

}
