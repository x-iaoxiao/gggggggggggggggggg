package lianxi;

import java.util.Scanner;
public class Lx3_13 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
        //��for while do ѭ����1-100
		//֮�������ܱ�3 �����������ĺ�
		//
		//
	     
		int sum=0;
		System.out.println("��ѡ��ʵ��");
		System.out.println("1.for");
		System.out.println("2.while");
		System.out.println("3.do-while");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		switch(n)
		{
		case 1 :
		{
			for(int i=0;i<=100;i++)
			{
				if(i%3==0)sum+=i;
			}
			System.out.println(sum);
			break;
		}
		case 2 :
		{ 
			int i=0;
			while(i<=100)
			{
				if(i%3==0) {sum+=i;}
		            i++;
				
			}
			System.out.println(sum);
			break;
		}
		case 3 :
		{
		  int i=0;
		  do {
				if(i%3==0){sum+=i;}
					i++;
					
					
			 }while(i<=100);
			System.out.println(sum);
			break;
		}
		}
		
	}

}
