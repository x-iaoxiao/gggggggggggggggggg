package lianxi;

import java.util.Scanner;

public class Lx3_7 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
        //�ж�һ�������Ƿ��ܱ�5��6ͬʱ��������ӡ�ܱ�5��6������
		//ֻ�ܱ�5 ����    �ܱ�5����
		//ֻ�ܱ�5 ����   �ܱ�6����
		//���ܱ�5��6����        ���ܱ�5��6����    
		System.out.println("������һ��������");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		if(num%5==0&&num%6==0)
		{System.out.println(" �ܱ�5��6����");}
		else if(num%6==0)
		{System.out.println(" �ܱ�6����");}
		else if(num%5==0)
		{System.out.println(" �ܱ�5����");}
		else {System.out.println("���ܱ�5��6����");}
		
		
	}

}
