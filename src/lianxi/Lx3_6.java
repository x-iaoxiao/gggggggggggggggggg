package lianxi;

import java.util.Scanner;

public class Lx3_6 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
        //�ж�һ��������ֵ
		//1      X=1
		//5       X=1
		//10      X=1
		//����      X=none
		System.out.println("������һ������");
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		switch(x)
		{
		case 1 :System.out.println("X=1");break;
		case 10:System.out.println("X=10");break;
		case 5 :System.out.println("X=5");break;
		default:System.out.println("X=none");break;
		}
	}

}
