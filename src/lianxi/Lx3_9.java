package lianxi;

import java.util.Scanner;

public class Lx3_9 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
        //����һ��0-100�ķ���
		//����0-100 ��ӡ������Ч
		//���ݵȼ���ӡ
		//
		System.out.println("������һ������");
		Scanner sc=new Scanner(System.in);
		int s=sc.nextInt();
		if(s>100||s<0)
		{System.out.println("������Ч");}
		else if(s>=90)
		{System.out.println("A");}
		else if(s>=80)
		{System.out.println("B");}
		else if(s>=70)
		{System.out.println("C");}
		else if(s>=60)
		{System.out.println("D");}
		else 
		{System.out.println("E");}
		
	}

}
