package lianxi;

import java.util.Scanner;

public class Lx3_12 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������

		//�����ʾֻ��
		//С��100 ���1Ԫ
		//100-5000 ���1%
		//����5000  ���50
		//����������
		System.out.println("����������");
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
			System.out.println("���Ϊ��"+m);
			break;
		case 2 :
			m=money*0.01;
			System.out.println("���Ϊ��"+m);
			break;
		case 3 :
			m=50;
			System.out.println("���Ϊ��"+m);
			break;
		}
		
	}

}
