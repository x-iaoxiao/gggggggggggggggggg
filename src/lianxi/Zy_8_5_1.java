package lianxi;

import java.util.Scanner;

public class Zy_8_5_1 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		 System.out.println("���������ı���");
		Scanner sc=new Scanner(System.in);
      double money=sc.nextInt();
   for(int i=0;i<5;i++) {
	   money=money*(1+0.003);
   }
   System.out.println("5��֮��ı���Ϊ"+money);
	}

}
