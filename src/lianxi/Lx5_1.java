package lianxi;

import java.util.Scanner;

public class Lx5_1 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
      //��дһ��������������n�Ľ׳ˣ�����5�Ľ׳���1*2*3*4*5�� [������]
	     System.out.println("����һ�����������Ľ׳ˣ�");
	     Scanner sc=new Scanner(System.in);
	     int n=sc.nextInt();
	     int nn= Function1(n);
	     System.out.println(n+"�Ľ׳ˣ�"+nn);
	}
	public static int Function1(int x) {
		int y=1;
		for(int i=1;i<=x;i++)y*=i;
		return y;
	}

}
