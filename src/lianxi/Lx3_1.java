package lianxi;

import java.util.Scanner;

public class Lx3_1 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
        //������ڻ����ʮ��  ������10%
		//����10����ڻ����20��  ����ʮ�����7.5% 
		//����20�� ����40��  ����20��Ĳ�����5%
		//����40�� ����60��  ����40��Ĳ�����3%
		//����60�� ����100�� ����60�����1.5%
		//����100��        ����100�����1%
		//���=������*�ٷֱ�
		System.out.println("������������");
		Scanner sc = new Scanner(System.in);
		double n = sc.nextInt();//��ȡ������
		double nn=n;
		double a=0 ;//��ɱ���
		int b=0;//����switch��ֵ
		double money=0.0;//���
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
		System.out.println("��������Ϊ��"+nn+",Ӧ�÷��ŵĽ���Ϊ��"+money);
	}

}
